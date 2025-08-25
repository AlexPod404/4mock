package sb1.stub.union.stub01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sb1.stub.union.common.model.ApiResponse;
import sb1.stub.union.common.service.MockManagementService;
import sb1.stub.union.stub01.service.Stub01Service;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/stub01")
public class Stub01Controller {
    
    @Autowired
    private MockManagementService mockManagementService;
    
    @Autowired
    private Stub01Service stub01Service;
    
    private static final String MOCK_ID = "stub01";
    
    @GetMapping("/health")
    public ResponseEntity<?> health() {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body(ApiResponse.error(503, "Mock stub01 is disabled"));
        }
        
        return ResponseEntity.ok(ApiResponse.success("Stub01 is healthy"));
    }
    
    @PostMapping("/clients/search")
    public ResponseEntity<String> searchClients(@RequestBody String requestBody, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub01 is disabled\"}");
        }
        
        log.info("Stub01 - searchClients called with request: {}", requestBody);
        
        try {
            Thread.sleep(100); // Simulate processing delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/clients/search");
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/orders/create")
    public ResponseEntity<String> createOrder(@RequestBody String requestBody, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub01 is disabled\"}");
        }
        
        log.info("Stub01 - createOrder called with request: {}", requestBody);
        
        try {
            Thread.sleep(200); // Simulate processing delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/orders/create");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock stub01 is disabled\"}");
        }
        
        log.info("Stub01 - getStatus called");
        String response = mockManagementService.getMockResponse(MOCK_ID, "/status");
        return ResponseEntity.ok(response);
    }
}