package sb1.stub.union.armsb_client_card.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sb1.stub.union.common.model.ApiResponse;
import sb1.stub.union.common.service.MockManagementService;
import sb1.stub.union.armsb_client_card.service.ArmsbClientCardService;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/armsb_client_card")
public class ArmsbClientCardController {
    
    @Autowired
    private MockManagementService mockManagementService;
    
    @Autowired
    private ArmsbClientCardService armsbClientCardService;
    
    private static final String MOCK_ID = "armsb_client_card";
    
    @GetMapping("/health")
    public ResponseEntity<?> health() {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body(ApiResponse.error(503, "Mock armsb_client_card is disabled"));
        }
        
        return ResponseEntity.ok(ApiResponse.success("ArmsbClientCard is healthy"));
    }
    
    @PostMapping("/clients/search")
    public ResponseEntity<String> searchClients(@RequestBody String requestBody, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock armsb_client_card is disabled\"}");
        }
        
        log.info("ArmsbClientCard - searchClients called with request: {}", requestBody);
        
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
            return ResponseEntity.status(503).body("{\"error\": \"Mock armsb_client_card is disabled\"}");
        }
        
        log.info("ArmsbClientCard - createOrder called with request: {}", requestBody);
        
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
            return ResponseEntity.status(503).body("{\"error\": \"Mock armsb_client_card is disabled\"}");
        }
        
        log.info("ArmsbClientCard - getStatus called");
        String response = mockManagementService.getMockResponse(MOCK_ID, "/status");
        return ResponseEntity.ok(response);
    }
}