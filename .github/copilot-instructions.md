# 4mock - Mock Services Collection

4mock is a collection of Spring Boot microservices that provide mock/stub implementations for various banking and client management APIs. The repository contains 4 separate services that simulate different system components with predefined JSON responses and 1-second delays.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Prerequisites and Setup
- Java 17 is required (available at `/usr/bin/java`)
- Maven 3.9+ is required (available at `/usr/bin/mvn`)
- All dependencies are downloaded automatically from Maven Central

### Building the Project
- **Build all modules**: `mvn clean compile` -- takes 20-21 seconds. NEVER CANCEL. Set timeout to 60+ minutes.
- **Package all services**: `mvn clean package` -- takes 20-21 seconds. NEVER CANCEL. Set timeout to 60+ minutes.
- **Build individual module**: `cd [module-name] && mvn clean compile`
- All builds are successful and produce executable JAR files in `target/` directories

### Running the Services
Each service starts independently on different ports:

- **Client Card Service** (port 8010): `cd armsb_client_card && java -jar target/armsb_client_card-1.0.0.jar`
- **Clients Service** (port 8001): `cd armsb_clients && java -jar target/armsb_clients-1.0.0.jar`
- **CTI Service** (port 8020): `cd armsb_cti && java -jar target/armsb_cti-1.0.0.jar`
- **Tasks Service** (port 8030): `cd armsb_tasks && java -jar target/armsb_tasks-1.0.0.jar`

**Startup time**: Each service starts in under 2 seconds. NEVER CANCEL startup - services will be ready quickly.

### Testing the Services
Run tests with: `mvn test` -- takes ~1 second (no actual tests exist, but command validates compilation)

## Service Details and API Endpoints

### armsb_client_card (Port 8010)
Mock service for client card management with endpoints like:
- `/teams/get` - Returns team information
- `/sbpemployeeinfo/v1/employee` - Employee information
- `/positions/get` - Position data
- `/clients/getClientCardFromCRMandEPK/rest/v1/context` - Client card context

### armsb_clients (Port 8001) 
Mock service for client data with endpoints like:
- `/clients/srvgetclientlist` - Client list service
- `/clients/srvgetclientlist/clients/searchByLastName` - Search clients by last name
- `/clients/pprbBhepService` - PPRB BHEP service
- `/clients/pprbClients/clients/getByTeamId` - Clients by team ID

### armsb_cti (Port 8020)
Mock CTI (Computer Telephony Integration) service with endpoints like:
- `/cti/getCommunications` - Get communications data
- `/cti/getClientPhones` - Get client phone numbers  
- `/cti/call/init` - Initialize call
- `/employees/{fullEmployeeNumber}/phones` - Employee phones

### armsb_tasks (Port 8030)
Mock task management service with endpoints like:
- `/tasks/clients/getByTeamId` - Get tasks by team ID
- `/tasks/clients/get` - Get task clients
- `/templates/get` - Get templates
- `/templates/getFilters` - Get template filters

## Validation Scenarios

### Always Test API Functionality After Changes
1. **Start a service**: Use the Java commands above to start any service
2. **Test API endpoint**: `curl -X POST http://localhost:[PORT]/[ENDPOINT] -H "Content-Type: application/json" -d '{"test": "data"}'`
3. **Verify response**: Confirm JSON response is returned with ~1 second delay
4. **Example working test**: `curl -X POST http://localhost:8010/teams/get -H "Content-Type: application/json" -d '{"test": "data"}'`

### Complete End-to-End Validation
After making changes, always validate:
1. Build succeeds: `mvn clean package`
2. Service starts: `java -jar target/[service-name].jar`
3. API responds: Test at least one endpoint with curl
4. Response format: Verify JSON structure matches expected mock data

## Project Structure and Key Files

### Repository Layout
```
/
├── armsb_client_card/     # Client card service (port 8010)
├── armsb_clients/         # Clients service (port 8001)  
├── armsb_cti/             # CTI service (port 8020)
├── armsb_tasks/           # Tasks service (port 8030)
└── pom.xml               # Parent POM (created to fix build)
```

### Each Module Contains
```
[module-name]/
├── pom.xml                           # Module POM file
├── src/main/java/sb1/stub/[package]/
│   ├── Application.java              # Spring Boot main class
│   └── dummy/
│       ├── data/hardcode/Jsons.java  # Hardcoded JSON responses (~5000+ lines)
│       └── webservice/WebController.java # REST endpoints (~200+ lines)
└── src/main/resources/
    └── application.properties        # Port configuration
```

### Important Files to Know
- **WebController.java**: Contains all REST endpoint mappings - modify here to add/change APIs
- **Jsons.java**: Contains all hardcoded JSON response data - modify here to change response content
- **Application.java**: Standard Spring Boot application entry point - rarely needs changes
- **application.properties**: Port configuration - change here to modify service ports

## Common Development Tasks

### Adding New API Endpoints
1. Add `@RequestMapping` method to appropriate `WebController.java`
2. Add corresponding JSON response method to `Jsons.java`
3. Rebuild: `mvn clean package`
4. Test: Start service and curl the new endpoint

### Modifying Response Data
1. Edit the appropriate method in `Jsons.java`
2. Rebuild: `mvn clean package`  
3. Test: Start service and verify new response

### Changing Service Ports
1. Edit `src/main/resources/application.properties`
2. Update `server.port=XXXX` value
3. Rebuild and restart service

## Build Validation Commands
- Always run `mvn clean compile` to verify code compiles after changes
- Always run `mvn test` (completes in ~1 second) 
- No linting or code quality tools are configured
- No additional validation steps are needed beyond successful compilation

## Critical Notes
- **NEVER CANCEL BUILDS**: Maven builds take 20-21 seconds. Always wait for completion.
- **Parent POM Required**: The root `pom.xml` file is essential - do not delete it
- **No Tests Exist**: `mvn test` runs successfully but no actual tests are implemented
- **Mock Responses**: All services return hardcoded JSON with 1-second artificial delays
- **Port Conflicts**: Ensure only one service runs per port to avoid conflicts
- **JSON Format**: All endpoints expect POST requests with JSON content-type headers