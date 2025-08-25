package sb1.stub.union.assistant_sber_one.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sb1.stub.union.common.model.ApiResponse;
import sb1.stub.union.common.service.MockManagementService;
import sb1.stub.union.assistant_sber_one.service.AssistantSberOneService;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/assistant_sber_one")
public class AssistantSberOneController {
    
    @Autowired
    private MockManagementService mockManagementService;
    
    @Autowired
    private AssistantSberOneService assistantSberOneService;
    
    private static final String MOCK_ID = "assistant_sber_one";
    
    @GetMapping("/health")
    public ResponseEntity<?> health() {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body(ApiResponse.error(503, "Mock assistant_sber_one is disabled"));
        }
        
        return ResponseEntity.ok(ApiResponse.success("assistant_sber_one is healthy"));
    }
    
    @PostMapping("/data/process")
    public ResponseEntity<String> processData(@RequestBody String requestBody, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock assistant_sber_one is disabled\"}");
        }
        
        log.info("assistant_sber_one - processData called with request: {}", requestBody);
        
        try {
            Thread.sleep(150); // Different delays for each stub
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/data/process");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/info/{id}")
    public ResponseEntity<String> getInfo(@PathVariable String id, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock assistant_sber_one is disabled\"}");
        }
        
        log.info("assistant_sber_one - getInfo called with id: {}", id);
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/info/" + id);
        return ResponseEntity.ok(response);
    }
    
    @PutMapping("/update")
    public ResponseEntity<String> updateData(@RequestBody String requestBody) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock assistant_sber_one is disabled\"}");
        }
        
        log.info("assistant_sber_one - updateData called");
        String response = mockManagementService.getMockResponse(MOCK_ID, "/update");
        return ResponseEntity.ok(response);
    }
}