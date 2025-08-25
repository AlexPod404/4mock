# 4mock - Banking API Mock Services

4mock is a multi-module Java Spring Boot project that provides mock services for banking system APIs. The project contains four independent Spring Boot applications that serve as stubs for different banking services, returning pre-configured JSON responses with 1-second delays.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Prerequisites and Dependencies
- Java 17 is required and available
- Maven 3.9+ is available at `/usr/bin/mvn`
- Parent pom.xml exists in repository root (created if missing)

### Bootstrap and Build
- **NEVER CANCEL BUILD COMMANDS** - Set timeout to 60+ seconds minimum
- Build from repository root: `cd /home/runner/work/4mock/4mock`
- Clean build: `mvn clean package` -- takes 22 seconds. **NEVER CANCEL**. Set timeout to 60+ seconds.
- Quick rebuild: `mvn package -q` -- takes 8 seconds when no changes
- Tests: `mvn test` -- takes 2 seconds. No actual tests exist (common for mock services).
- Clean: `mvn clean` -- takes 1-2 seconds

### Running Services
Each service runs on a different port and can be started independently or simultaneously:

#### Individual Service Startup (JAR Method)
```bash
# Build first
mvn clean package

# Client Card Service (port 8010)
java -jar armsb_client_card/target/armsb_client_card-1.0.0.jar

# Tasks Service (port 8030)  
java -jar armsb_tasks/target/armsb_tasks-1.0.0.jar

# Clients Service (port 8001)
java -jar armsb_clients/target/armsb_clients-1.0.0.jar

# CTI Service (port 8020)
java -jar armsb_cti/target/armsb_cti-1.0.0.jar
```

#### Individual Service Startup (Maven Plugin Method)
```bash
# From individual service directories
cd armsb_client_card && mvn spring-boot:run
cd armsb_tasks && mvn spring-boot:run  
cd armsb_clients && mvn spring-boot:run
cd armsb_cti && mvn spring-boot:run
```

Services start in 1-2 seconds and display Spring Boot banner with port information.

## Validation

### MANDATORY Manual Validation Steps
After making ANY changes to the codebase, **ALWAYS** run through these complete validation scenarios:

#### 1. Build Validation
```bash
cd /home/runner/work/4mock/4mock
mvn clean package
# Should complete in ~22 seconds with "BUILD SUCCESS"
```

#### 2. Service Startup Validation  
Start at least one service and verify it responds:
```bash
# Start service (use any of the four)
java -jar armsb_client_card/target/armsb_client_card-1.0.0.jar &
sleep 3

# Test basic connectivity
curl -s "http://localhost:8010/" | grep "404"
# Should return 404 error (expected for root path)
```

#### 3. API Endpoint Validation
Test actual API functionality with these validated endpoints:

**Client Card Service (8010):**
```bash
# Employee info endpoint
curl -s "http://localhost:8010/sbpemployeeinfo/v1/employee"
# Should return JSON with employeeInfoDto containing "Тестов", "Тест", "Рук"

# Client card endpoint with POST
curl -s -X POST "http://localhost:8010/clients/getClientCardFromCRMandEPK" \
  -H "Content-Type: application/json" -d '{"epkId": "12345"}'
# Should return JSON with statusInfo and data containing segment, status: "ACTIVE"
```

**Tasks Service (8030):**
```bash
curl -s "http://localhost:8030/sbpemployeeinfo/v1/employee"
# Should return same employee JSON structure
```

**Clients Service (8001):**
```bash
curl -s "http://localhost:8001/sbpemployeeinfo/v1/employee"  
# Should return same employee JSON structure
```

**CTI Service (8020):**
```bash
curl -s "http://localhost:8020/cti/getCommunications" \
  -H "Content-Type: application/json" -d '{}'
# Should return JSON with jsonrpc: "2.0" and result array
```

#### 4. Multi-Service Validation
Test that multiple services can run simultaneously:
```bash
# Start two services on different ports
java -jar armsb_client_card/target/armsb_client_card-1.0.0.jar &
java -jar armsb_tasks/target/armsb_tasks-1.0.0.jar &
sleep 5

# Test both respond
curl -s "http://localhost:8010/sbpemployeeinfo/v1/employee" | grep "success"
curl -s "http://localhost:8030/sbpemployeeinfo/v1/employee" | grep "success"
# Both should return JSON with "success": true
```

#### 5. Response Timing Validation
All API responses include a 100ms delay (not 1 second as documented in READMEs):
```bash
time curl -s "http://localhost:8010/sbpemployeeinfo/v1/employee" > /dev/null
# Should take ~0.1-0.2 seconds total
```

### Validation Requirements
- **ALWAYS** test actual API functionality, not just service startup
- **NEVER** skip validation because it takes time
- **ALWAYS** verify JSON response structure contains expected data
- **ALWAYS** test at least one POST endpoint with JSON body when making changes
- Services return realistic banking data in Russian language
- All responses have proper JSON structure with success/error indicators

## Common Tasks

### Project Structure
```
/home/runner/work/4mock/4mock/
├── pom.xml (parent aggregator)
├── armsb_client_card/ (port 8010) - Client Card service
├── armsb_tasks/ (port 8030) - Task Feed service  
├── armsb_clients/ (port 8001) - Clients service
└── armsb_cti/ (port 8020) - CTI service
```

### Service Details

**armsb_client_card (port 8010):** Mock for Client Card services (CI03259032)
- Key endpoints: `/sbpemployeeinfo/v1/employee`, `/clients/getClientCardFromCRMandEPK`, `/teams/get`
- Returns client card data, employee info, team data

**armsb_tasks (port 8030):** Mock for Task Feed services (CI02750599)  
- Key endpoints: `/sbpemployeeinfo/v1/employee`, `/tasks/clients/get`, `/templates/get`
- Returns task data, templates, employee info

**armsb_clients (port 8001):** Mock for ARM SB Clients services (CI02750597)
- Key endpoints: `/sbpemployeeinfo/v1/employee`, `/clients/srvgetclientlist`  
- Returns client lists, employee info

**armsb_cti (port 8020):** Mock for CTI services (CI03239703)
- Key endpoints: `/cti/getCommunications`, `/cti/getClientPhones`, `/cti/call/init`
- Returns communication data, phone numbers, call init responses

### Frequently Used Commands

#### Repository Root Listing
```bash
ls -la /home/runner/work/4mock/4mock/
# .git .gitattributes armsb_client_card armsb_clients armsb_cti armsb_tasks pom.xml
```

#### Service JAR Locations
After `mvn package`:
- `armsb_client_card/target/armsb_client_card-1.0.0.jar`
- `armsb_tasks/target/armsb_tasks-1.0.0.jar`  
- `armsb_clients/target/armsb_clients-1.0.0.jar`
- `armsb_cti/target/armsb_cti-1.0.0.jar`

#### Build Timing Reference
- `mvn clean package`: ~22 seconds (**NEVER CANCEL** - use 60+ second timeout)
- `mvn test`: ~2 seconds  
- `mvn clean`: ~1-2 seconds
- Individual service startup: ~1-2 seconds
- Service response time: ~100ms per request

### Troubleshooting

**Build fails with missing parent POM:**
- Verify `pom.xml` exists in repository root
- Parent should reference Spring Boot 2.7.18
- Contains modules: armsb_client_card, armsb_tasks, armsb_clients, armsb_cti

**Service won't start:**
- Check port availability (8001, 8010, 8020, 8030)
- Ensure JAR was built: `mvn package`
- Check Java 17 availability: `java -version`

**API returns 404:**
- Verify exact endpoint path (case-sensitive)
- Check service README.md for documented vs actual endpoints
- Some endpoints require POST with JSON body

**Services seem slow:**
- All responses include intentional 100ms delay
- This is normal behavior for simulation purposes

### Critical Notes
- **NEVER CANCEL** long-running Maven commands
- **ALWAYS** validate with actual API calls, not just startup
- Services use hardcoded JSON responses from `Jsons.java` classes  
- Response delays are coded as 100ms (delta = 100L), not 1 second as documented
- All services can run simultaneously on different ports
- No actual tests exist - `mvn test` will show "No tests to run"