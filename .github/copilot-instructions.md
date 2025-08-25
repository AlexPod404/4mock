# 4mock Spring Boot API Mock Services

4mock is a collection of 4 Spring Boot microservices that provide mock/stub implementations for banking system APIs. Each service returns pre-configured JSON responses with 1-second delays to simulate real system behavior.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Services Overview

- **armsb_client_card** (port 8010) - Client card service mock  
- **armsb_clients** (port 8001) - Clients service mock
- **armsb_cti** (port 8020) - CTI (Call Technology Integration) service mock
- **armsb_tasks** (port 8030) - Tasks service mock

## Working Effectively

### Bootstrap and Build
- Java 17 and Maven 3.9+ are required and available in the environment
- Build all modules: `mvn clean compile` -- takes 21 seconds. NEVER CANCEL. Set timeout to 60+ minutes.
- Package all modules: `mvn clean package -DskipTests` -- takes 21 seconds. NEVER CANCEL. Set timeout to 60+ minutes.
- Install all modules: `mvn clean install -DskipTests` -- takes 7 seconds. NEVER CANCEL. Set timeout to 30+ minutes.

### Run Tests
- `mvn test` -- takes 2 seconds. NEVER CANCEL. Set timeout to 30+ minutes.
- No actual test classes exist in the modules, but the command validates compilation

### Run Individual Services
You can run each service individually using either method:

**Method 1: Using JAR files (recommended for production-like testing)**
```bash
# Build first if not already done
mvn clean package -DskipTests

# Run each service (startup time: 2-7 seconds each)
java -jar armsb_client_card/target/armsb_client_card-1.0.0.jar &  # port 8010
java -jar armsb_clients/target/armsb_clients-1.0.0.jar &         # port 8001  
java -jar armsb_cti/target/armsb_cti-1.0.0.jar &                 # port 8020
java -jar armsb_tasks/target/armsb_tasks-1.0.0.jar &             # port 8030
```

**Method 2: Using Spring Boot Maven plugin (recommended for development)**
```bash
# In separate terminals, run:
cd armsb_client_card && mvn spring-boot:run    # port 8010, startup ~1 second
cd armsb_clients && mvn spring-boot:run        # port 8001, startup ~1 second  
cd armsb_cti && mvn spring-boot:run            # port 8020, startup ~1 second
cd armsb_tasks && mvn spring-boot:run          # port 8030, startup ~1 second
```

### Stop Services
- Use Ctrl+C to stop individual services
- Kill background JAR processes: `pkill -f "armsb_.*\.jar"` or `jobs` then `kill %1 %2 %3 %4`

## Validation

### CRITICAL: Always validate changes with complete end-to-end scenario testing
After making any changes, ALWAYS run through complete validation scenarios:

1. **Build Validation**: `mvn clean package -DskipTests` must complete successfully
2. **Service Startup Validation**: All 4 services must start without errors
3. **Endpoint Validation**: Test at least one endpoint per service to ensure JSON responses
4. **Response Time Validation**: Confirm 1-second delays are working (responses should take ~1 second)

### Manual Validation Commands
```bash
# Test armsb_client_card (port 8010)
curl -X POST "http://localhost:8010/clients/getClientCardFromCRMandEPK" \
     -H "Content-Type: application/json" -d '{"test":"data"}' --max-time 5

# Test armsb_clients (port 8001) 
curl -X POST "http://localhost:8001/clients/srvgetclientlist" \
     -H "Content-Type: application/json" -d '{"test":"data"}' --max-time 5

# Test armsb_cti (port 8020)
curl -X GET "http://localhost:8020/cti/getCommunications" \
     -H "Content-Type: application/json" --max-time 5

# Test armsb_tasks (port 8030)
curl -X POST "http://localhost:8030/tasks/positions/get" \
     -H "Content-Type: application/json" -d '{}' --max-time 5
```

All endpoints should return JSON responses after approximately 1 second delay.

### Automated System Validation
You can validate the entire system using this comprehensive script:
```bash
#!/bin/bash
echo "Starting 4mock system validation..."

# Check JAR files exist
for service in armsb_client_card armsb_clients armsb_cti armsb_tasks; do
    if [[ ! -f "$service/target/$service-1.0.0.jar" ]]; then
        echo "✗ $service JAR missing - run: mvn clean package -DskipTests"
        exit 1
    fi
done

# Start all services
java -jar armsb_client_card/target/armsb_client_card-1.0.0.jar &
java -jar armsb_clients/target/armsb_clients-1.0.0.jar &
java -jar armsb_cti/target/armsb_cti-1.0.0.jar &
java -jar armsb_tasks/target/armsb_tasks-1.0.0.jar &

sleep 15  # Wait for startup

# Test all endpoints - each should respond in ~1 second
curl -s -X POST "http://localhost:8010/clients/getClientCardFromCRMandEPK" -H "Content-Type: application/json" -d '{"test":"data"}' --max-time 5 >/dev/null && echo "✓ client_card OK"
curl -s -X POST "http://localhost:8001/clients/srvgetclientlist" -H "Content-Type: application/json" -d '{"test":"data"}' --max-time 5 >/dev/null && echo "✓ clients OK"  
curl -s -X GET "http://localhost:8020/cti/getCommunications" --max-time 5 >/dev/null && echo "✓ cti OK"
curl -s -X POST "http://localhost:8030/tasks/positions/get" -H "Content-Type: application/json" -d '{}' --max-time 5 >/dev/null && echo "✓ tasks OK"

pkill -f "armsb_.*\.jar"  # Cleanup
echo "Validation complete!"
```

## Key Endpoints by Service

### armsb_client_card (port 8010)
- `POST /clients/getClientCardFromCRMandEPK` - Main client card endpoint

### armsb_clients (port 8001)  
- `POST /clients/srvgetclientlist` - Client list endpoint
- `POST /armsb/clients/v1/rest/getClientsForMassMailing` - Mass mailing clients
- `POST /tasks/get` - Tasks by filter

### armsb_cti (port 8020)
- `GET /cti/getCommunications` - Get communications
- `GET /cti/getClientPhones` - Get client phone numbers  
- `GET /cti/call/init` - Initialize call
- `GET /employees/{fullEmployeeNumber}/phones` - Employee address book

### armsb_tasks (port 8030)
- `POST /tasks/positions/get` - Get task positions
- `POST /tasks` - Main tasks endpoint
- `POST /tasks/teams/get` - Get teams
- `POST /tasks/marking/check` - Check marking
- `POST /tasks/teams/free` - Get free teams

## Critical Build Information

### TIMING EXPECTATIONS - NEVER CANCEL THESE OPERATIONS
- **Clean compile**: 21 seconds - Set timeout to 60+ minutes
- **Clean package**: 21 seconds - Set timeout to 60+ minutes  
- **Clean install**: 7 seconds - Set timeout to 30+ minutes
- **Test execution**: 2 seconds - Set timeout to 30+ minutes
- **Individual service startup**: 1-7 seconds each
- **Concurrent service startup**: 15 seconds total for all 4 services

### Dependencies
The project uses:
- Spring Boot 2.7.18
- Java 17
- Maven multi-module structure
- Lombok for boilerplate reduction
- Apache Commons (IO and Lang3)

### Common Issues
- **Build fails with "Non-resolvable parent POM"**: The parent `pom.xml` file is required in the repository root and has been provided
- **Port conflicts**: Ensure ports 8001, 8010, 8020, 8030 are available
- **Service won't start**: Check Java 17 is available with `java -version`
- **Slow responses**: This is expected - all endpoints include 1-second delays by design

## File Structure Reference
```
4mock/
├── pom.xml (parent POM)
├── armsb_client_card/ (port 8010)
│   ├── pom.xml
│   └── src/main/java/sb1/stub/client_card/
├── armsb_clients/ (port 8001)  
│   ├── pom.xml
│   └── src/main/java/sb1/stub/armsb_clients/
├── armsb_cti/ (port 8020)
│   ├── pom.xml  
│   └── src/main/java/sb1/stub/client_cti/
└── armsb_tasks/ (port 8030)
    ├── pom.xml
    └── src/main/java/sb1/stub/armsb_tasks/
```

Each module contains:
- `Application.java` - Spring Boot main class
- `dummy/webservice/WebController.java` - REST endpoints  
- `dummy/data/hardcode/Jsons.java` - Pre-configured JSON responses
- `src/main/resources/application.properties` - Port configuration