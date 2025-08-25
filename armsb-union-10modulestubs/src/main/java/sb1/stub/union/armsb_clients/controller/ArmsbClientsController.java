package sb1.stub.union.armsb_clients.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sb1.stub.union.common.model.ApiResponse;
import sb1.stub.union.common.service.MockManagementService;
import sb1.stub.union.armsb_clients.service.ArmsbClientsService;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/armsb_clients")
public class ArmsbClientsController {
    
    @Autowired
    private MockManagementService mockManagementService;
    
    @Autowired
    private ArmsbClientsService armsbClientsService;
    
    private static final String MOCK_ID = "armsb_clients";
    
    @GetMapping("/health")
    public ResponseEntity<?> health() {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body(ApiResponse.error(503, "Mock armsb_clients is disabled"));
        }
        
        return ResponseEntity.ok(ApiResponse.success("armsb_clients is healthy"));
    }
    
    @PostMapping("/data/process")
    public ResponseEntity<String> processData(@RequestBody String requestBody, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock armsb_clients is disabled\"}");
        }
        
        log.info("armsb_clients - processData called with request: {}", requestBody);
        
        try {
            Thread.sleep(120); // Different delays for each stub
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/data/process");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/info/{id}")
    public ResponseEntity<String> getInfo(@PathVariable String id, HttpServletRequest request) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock armsb_clients is disabled\"}");
        }
        
        log.info("armsb_clients - getInfo called with id: {}", id);
        
        String response = mockManagementService.getMockResponse(MOCK_ID, "/info/" + id);
        return ResponseEntity.ok(response);
    }
    
    @PutMapping("/update")
    public ResponseEntity<String> updateData(@RequestBody String requestBody) {
        if (!mockManagementService.isMockEnabled(MOCK_ID)) {
            return ResponseEntity.status(503).body("{\"error\": \"Mock armsb_clients is disabled\"}");
        }
        
        log.info("armsb_clients - updateData called");
        String response = mockManagementService.getMockResponse(MOCK_ID, "/update");
        return ResponseEntity.ok(response);
    }
}