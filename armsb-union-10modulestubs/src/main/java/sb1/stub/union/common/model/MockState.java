package sb1.stub.union.common.model;

import lombok.Data;

@Data
public class MockState {
    private String mockId;
    private boolean enabled;
    private long lastModified;
    private String responseFilePath;
    
    public MockState() {
        this.lastModified = System.currentTimeMillis();
    }
    
    public MockState(String mockId, boolean enabled) {
        this();
        this.mockId = mockId;
        this.enabled = enabled;
    }
}