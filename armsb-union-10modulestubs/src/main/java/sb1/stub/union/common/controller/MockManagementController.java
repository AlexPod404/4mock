package sb1.stub.union.common.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sb1.stub.union.common.model.ApiResponse;
import sb1.stub.union.common.model.MockState;
import sb1.stub.union.common.service.MockManagementService;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/management")
public class MockManagementController {
    
    @Autowired
    private MockManagementService mockManagementService;
    
    @GetMapping("/mocks")
    public ResponseEntity<ApiResponse<Map<String, MockState>>> getAllMocks() {
        Map<String, MockState> mocks = mockManagementService.getAllMockStates();
        return ResponseEntity.ok(ApiResponse.success("Mock states retrieved", mocks));
    }
    
    @PostMapping("/mocks/{mockId}/enable")
    public ResponseEntity<ApiResponse<String>> enableMock(@PathVariable String mockId) {
        mockManagementService.enableMock(mockId);
        return ResponseEntity.ok(ApiResponse.success("Mock " + mockId + " enabled"));
    }
    
    @PostMapping("/mocks/{mockId}/disable")
    public ResponseEntity<ApiResponse<String>> disableMock(@PathVariable String mockId) {
        mockManagementService.disableMock(mockId);
        return ResponseEntity.ok(ApiResponse.success("Mock " + mockId + " disabled"));
    }
    
    @PostMapping("/mocks/{mockId}/toggle")
    public ResponseEntity<ApiResponse<String>> toggleMock(@PathVariable String mockId) {
        mockManagementService.toggleMock(mockId);
        boolean isEnabled = mockManagementService.isMockEnabled(mockId);
        String status = isEnabled ? "enabled" : "disabled";
        return ResponseEntity.ok(ApiResponse.success("Mock " + mockId + " " + status));
    }
    
    @GetMapping("/mocks/{mockId}/response")
    public ResponseEntity<String> getMockResponse(@PathVariable String mockId, 
                                                @RequestParam String endpoint) {
        String response = mockManagementService.getMockResponse(mockId, endpoint);
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/mocks/{mockId}/response")
    public ResponseEntity<ApiResponse<String>> saveMockResponse(@PathVariable String mockId,
                                                              @RequestParam String endpoint,
                                                              @RequestBody String response) {
        mockManagementService.saveResponse(mockId, endpoint, response);
        return ResponseEntity.ok(ApiResponse.success("Response saved for " + mockId + " endpoint " + endpoint));
    }
    
    @GetMapping("/system/health")
    public ResponseEntity<ApiResponse<String>> systemHealth() {
        return ResponseEntity.ok(ApiResponse.success("System is healthy"));
    }
    
    @PostMapping("/system/restart")
    public ResponseEntity<ApiResponse<String>> restartSystem() {
        // Note: In a real application, this would trigger a graceful restart
        log.info("System restart requested");
        return ResponseEntity.ok(ApiResponse.success("System restart initiated"));
    }
}