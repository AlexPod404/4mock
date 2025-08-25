package sb1.stub.union.stub08.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sb1.stub.union.common.model.ApiResponse;
import sb1.stub.union.common.service.MockManagementService;
import sb1.stub.union.stub08.service.Stub08Service;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/stub08")
public class Stub08Controller {
    
    @Autowired
    private MockManagementService mockManagementService;
    
    @Autowired
    private Stub08Service stub08Service;
    
    private static final String MOCK_ID = "stub08";
    
    @GetMapping("/health")
    public ResponseEntity<?> health() {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body(ApiResponse.error(503, "Mock stub08 is disabled"));
        }
        
        return ResponseEntity.ok(ApiResponse.success("stub08 is healthy"));
    }
    
    @PostMapping("/data/process")
    public ResponseEntity<String> processData(@RequestBody String requestBody, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub08 is disabled\"}");
        }
        
        log.info("stub08 - processData called with request: {}", requestBody);
        
        try {
            Thread.sleep(180); // Different delays for each stub
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/data/process");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/info/{id}")
    public ResponseEntity<String> getInfo(@PathVariable String id, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub08 is disabled\"}");
        }
        
        log.info("stub08 - getInfo called with id: {}", id);
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/info/" + id);
        return ResponseEntity.ok(response);
    }
    
    @PutMapping("/update")
    public ResponseEntity<String> updateData(@RequestBody String requestBody) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub08 is disabled\"}");
        }
        
        log.info("stub08 - updateData called");
        String response = mockManagementService.getMockResponse(MOCK_ID, "/update");
        return ResponseEntity.ok(response);
    }
}