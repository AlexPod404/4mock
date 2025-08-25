package sb1.stub.union.stub09.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sb1.stub.union.common.model.ApiResponse;
import sb1.stub.union.common.service.MockManagementService;
import sb1.stub.union.stub09.service.Stub09Service;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/stub09")
public class Stub09Controller {
    
    @Autowired
    private MockManagementService mockManagementService;
    
    @Autowired
    private Stub09Service stub09Service;
    
    private static final String MOCK_ID = "stub09";
    
    @GetMapping("/health")
    public ResponseEntity<?> health() {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body(ApiResponse.error(503, "Mock stub09 is disabled"));
        }
        
        return ResponseEntity.ok(ApiResponse.success("stub09 is healthy"));
    }
    
    @PostMapping("/data/process")
    public ResponseEntity<String> processData(@RequestBody String requestBody, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub09 is disabled\"}");
        }
        
        log.info("stub09 - processData called with request: {}", requestBody);
        
        try {
            Thread.sleep(190); // Different delays for each stub
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/data/process");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/info/{id}")
    public ResponseEntity<String> getInfo(@PathVariable String id, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub09 is disabled\"}");
        }
        
        log.info("stub09 - getInfo called with id: {}", id);
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/info/" + id);
        return ResponseEntity.ok(response);
    }
    
    @PutMapping("/update")
    public ResponseEntity<String> updateData(@RequestBody String requestBody) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub09 is disabled\"}");
        }
        
        log.info("stub09 - updateData called");
        String response = mockManagementService.getMockResponse(MOCK_ID, "/update");
        return ResponseEntity.ok(response);
    }
}