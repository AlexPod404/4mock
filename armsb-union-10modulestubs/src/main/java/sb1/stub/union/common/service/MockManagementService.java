package sb1.stub.union.common.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sb1.stub.union.common.model.MockState;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class MockManagementService {
    
    private final Map<String, MockState> mockStates = new ConcurrentHashMap<>();
    private final ObjectMapper objectMapper = new ObjectMapper();
    
    @Value("${mock.state.file:mock-states.json}")
    private String stateFilePath;
    
    @Value("${mock.responses.dir:responses}")
    private String responsesDir;
    
    @PostConstruct
    public void init() {
        // Initialize renamed stubs (stub01-stub07 renamed to new names)
        mockStates.put("armsb_client_card", new MockState("armsb_client_card", true));
        mockStates.put("armsb_clients", new MockState("armsb_clients", true));
        mockStates.put("armsb_cti", new MockState("armsb_cti", true));
        mockStates.put("armsb_tasks", new MockState("armsb_tasks", true));
        mockStates.put("assistant_sber_one", new MockState("assistant_sber_one", true));
        mockStates.put("armsb_calendar", new MockState("armsb_calendar", true));
        mockStates.put("armsb-core", new MockState("armsb-core", true));
        
        // Initialize remaining stubs (stub08-stub10) with original names
        for (int i = 8; i <= 10; i++) {
            String mockId = String.format("stub%02d", i);
            mockStates.put(mockId, new MockState(mockId, true));
        }
        
        // Load state from disk if exists
        loadStateFromDisk();
        
        // Ensure responses directory exists
        createResponsesDirectory();
    }
    
    public boolean isMockEnabled(String mockId) {
        MockState state = mockStates.get(mockId);
        return state != null && state.isEnabled();
    }
    
    public void enableMock(String mockId) {
        MockState state = mockStates.get(mockId);
        if (state != null) {
            state.setEnabled(true);
            state.setLastModified(System.currentTimeMillis());
            saveStateToDisk();
            log.info("Mock {} enabled", mockId);
        }
    }
    
    public void disableMock(String mockId) {
        MockState state = mockStates.get(mockId);
        if (state != null) {
            state.setEnabled(false);
            state.setLastModified(System.currentTimeMillis());
            saveStateToDisk();
            log.info("Mock {} disabled", mockId);
        }
    }
    
    public Map<String, MockState> getAllMockStates() {
        return new HashMap<>(mockStates);
    }
    
    public void toggleMock(String mockId) {
        if (isMockEnabled(mockId)) {
            disableMock(mockId);
        } else {
            enableMock(mockId);
        }
    }
    
    public String getMockResponse(String mockId, String endpoint) {
        String fileName = mockId + "_" + endpoint.replace("/", "_") + ".json";
        String filePath = responsesDir + "/" + fileName;
        
        try {
            if (Files.exists(Paths.get(filePath))) {
                return new String(Files.readAllBytes(Paths.get(filePath)));
            }
        } catch (IOException e) {
            log.warn("Failed to read response file {}: {}", filePath, e.getMessage());
        }
        
        // Return default response if file doesn't exist
        return getDefaultResponse(mockId, endpoint);
    }
    
    public void saveResponse(String mockId, String endpoint, String response) {
        String fileName = mockId + "_" + endpoint.replace("/", "_") + ".json";
        String filePath = responsesDir + "/" + fileName;
        
        try {
            Files.write(Paths.get(filePath), response.getBytes());
            log.info("Saved response for {} endpoint {} to file {}", mockId, endpoint, fileName);
        } catch (IOException e) {
            log.error("Failed to save response file {}: {}", filePath, e.getMessage());
        }
    }
    
    private void loadStateFromDisk() {
        try {
            File stateFile = new File(stateFilePath);
            if (stateFile.exists()) {
                Map<String, MockState> diskStates = objectMapper.readValue(stateFile, 
                    objectMapper.getTypeFactory().constructMapType(HashMap.class, String.class, MockState.class));
                
                for (Map.Entry<String, MockState> entry : diskStates.entrySet()) {
                    mockStates.put(entry.getKey(), entry.getValue());
                }
                
                log.info("Loaded mock states from disk: {}", stateFilePath);
            }
        } catch (IOException e) {
            log.warn("Failed to load mock states from disk: {}", e.getMessage());
        }
    }
    
    private void saveStateToDisk() {
        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                      .writeValue(new File(stateFilePath), mockStates);
        } catch (IOException e) {
            log.error("Failed to save mock states to disk: {}", e.getMessage());
        }
    }
    
    private void createResponsesDirectory() {
        try {
            Files.createDirectories(Paths.get(responsesDir));
        } catch (IOException e) {
            log.error("Failed to create responses directory: {}", e.getMessage());
        }
    }
    
    private String getDefaultResponse(String mockId, String endpoint) {
        return "{\n" +
               "  \"status\": {\n" +
               "    \"code\": 0,\n" +
               "    \"message\": \"Default response from " + mockId + " for " + endpoint + "\"\n" +
               "  },\n" +
               "  \"timestamp\": " + System.currentTimeMillis() + ",\n" +
               "  \"mockId\": \"" + mockId + "\",\n" +
               "  \"endpoint\": \"" + endpoint + "\"\n" +
               "}";
    }
}