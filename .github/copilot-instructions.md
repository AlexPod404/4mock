# 4Mock - Spring Boot Mock Services

4Mock is a collection of 4 Spring Boot REST API mock services designed to simulate banking system APIs with preconfigured JSON responses and controlled delays. Each service runs on a different port and provides specific mock endpoints.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Bootstrap, Build, and Test the Repository
- **Prerequisites**: Java 17 and Maven 3.9+ are required and already available
- **Initial setup**: Clone and build all services:
  - `cd /home/runner/work/4mock/4mock`
  - `mvn clean compile` -- takes 19 seconds, includes dependency downloads. NEVER CANCEL. Set timeout to 60+ minutes.
  - `mvn test` -- takes 7 seconds (no actual tests defined). NEVER CANCEL. Set timeout to 30+ minutes.
  - `mvn clean package` -- takes 9 seconds, creates executable JARs. NEVER CANCEL. Set timeout to 30+ minutes.

### Run Services
- **Run all services from root**: `mvn spring-boot:run` (not recommended - runs only first module)
- **Run individual services**:
  - Client Card Service: `cd armsb_client_card && mvn spring-boot:run` (port 8010)
  - Clients Service: `cd armsb_clients && mvn spring-boot:run` (port 8001) 
  - CTI Service: `cd armsb_cti && mvn spring-boot:run` (port 8020)
  - Tasks Service: `cd armsb_tasks && mvn spring-boot:run` (port 8030)
- **Startup time**: Each service starts in 1-3 seconds
- **Run using JAR files**:
  - Build first: `mvn package`
  - `java -jar armsb_client_card/target/armsb_client_card-1.0.0.jar`
  - `java -jar armsb_clients/target/armsb_clients-1.0.0.jar`
  - `java -jar armsb_cti/target/armsb_cti-1.0.0.jar`
  - `java -jar armsb_tasks/target/armsb_tasks-1.0.0.jar`

## Validation
- **Always test endpoints after making changes** using curl or HTTP client
- **Basic health check for all services**:
  - `curl http://localhost:8001/getDelta` (expects: "Delta is: 100")
  - `curl http://localhost:8010/getDelta` (expects: "Delta is: 100")
  - `curl http://localhost:8020/getDelta` (expects: "Delta is: 100") 
  - `curl http://localhost:8030/getDelta` (expects: "Delta is: 100")
- **API response validation**: All mock APIs include 100ms delay (configurable via `/setDelta/{value}`)
- **Common test pattern**: `curl -X POST http://localhost:PORT/ENDPOINT -H "Content-Type: application/json" -d '{"test":"data"}'`

## Service Architecture

### Port Configuration
- **armsb_client_card**: Port 8010 - Client card services mock
- **armsb_clients**: Port 8001 - Client management services mock  
- **armsb_cti**: Port 8020 - Call center integration services mock
- **armsb_tasks**: Port 8030 - Task feed services mock

### Key API Endpoints by Service

#### armsb_clients (Port 8001)
- `/clients/srvgetclientlist` - Main client list endpoint (POST)
- `/clients/pprbClients` - PPRB client data (POST)  
- `/clients/ucpclients` - UCP client data (POST)
- `/sbpemployeeinfo/v1/employee` - Employee info (GET/POST)
- `/setDelta/{value}` - Configure response delay (GET)
- `/getDelta` - Get current delay setting (GET)

#### armsb_client_card (Port 8010)  
- `/clients/clientcard/getInfoClient` - Client card info (POST)
- `/clients/clientcard/updateAdditionalInfo` - Update client info (POST)
- `/teams/get` - Team data (POST)
- `/qliksense` - QLik Sense integration (POST)
- `/getDelta` - Get current delay setting (GET)

#### armsb_cti (Port 8020)
- `/cti/getCommunications` - Communications data (GET)
- `/cti/getClientPhones` - Client phone data (GET) 
- `/cti/call/init` - Initialize call (GET)
- `/employees/{id}/phones` - Employee phone lookup (GET)
- `/getDelta` - Get current delay setting (GET)

#### armsb_tasks (Port 8030)
- `/tasks/clients/getByTeamId` - Tasks by team (POST)
- `/tasks/clients/get` - Tasks by client (POST)
- `/tasks/get` - Task filtering (POST)
- `/sbpemployeeinfo/v1/employee` - Employee info (GET)
- `/getDelta` - Get current delay setting (GET)

## Common Tasks

### Repository Structure
```
├── pom.xml                    # Parent POM (created for build coordination)
├── armsb_client_card/         # Client card service (port 8010)
│   ├── pom.xml
│   └── src/main/java/sb1/stub/client_card/
├── armsb_clients/             # Clients service (port 8001)  
│   ├── pom.xml
│   └── src/main/java/sb1/stub/armsb_clients/
├── armsb_cti/                 # CTI service (port 8020)
│   ├── pom.xml
│   └── src/main/java/sb1/stub/client_cti/
└── armsb_tasks/               # Tasks service (port 8030)
    ├── pom.xml
    └── src/main/java/sb1/stub/armsb_tasks/
```

### Key Files to Modify
- **Controllers**: `src/main/java/*/dummy/webservice/WebController.java` - Define REST endpoints
- **Mock Data**: `src/main/java/*/dummy/data/hardcode/Jsons.java` - Hardcoded JSON responses
- **Configuration**: `src/main/resources/application.properties` - Port and service configuration
- **Main Apps**: `src/main/java/*/Application.java` - Spring Boot application entry points

### Adding New Endpoints
1. **Edit WebController.java** in the appropriate service directory
2. **Add mock data** in the corresponding Jsons.java file  
3. **Test locally** by running the service and calling the endpoint
4. **Response pattern**: All responses include `Thread.sleep(delta)` for realistic delay simulation

### Response Delay Configuration
- **Default delay**: 100ms per API call
- **Change globally**: `curl http://localhost:PORT/setDelta/500` (sets 500ms delay)
- **Check current**: `curl http://localhost:PORT/getDelta`
- **In code**: Modify the `static long delta = 100L;` variable in WebController.java

### Build Troubleshooting
- **Missing parent POM error**: The parent `pom.xml` at repository root is required for builds
- **Port conflicts**: Each service must run on its designated port (8001, 8010, 8020, 8030)
- **Dependency issues**: Run `mvn clean` to clear local repository cache if needed
- **Spring Boot version**: Services use Spring Boot 2.7.18 with Java 17

### Testing Scenarios
1. **Single service**: Start one service and test its specific endpoints
2. **Multiple services**: Run all 4 services simultaneously for integration testing
3. **Load testing**: Use `/setDelta/0` to remove artificial delays for performance testing
4. **API validation**: Check that JSON responses match expected hardcoded values

### Development Workflow
1. **Always build first**: `mvn clean package` before testing changes
2. **Run affected service**: Start only the service you're modifying  
3. **Test endpoint**: Use curl to validate request/response behavior
4. **Check logs**: Monitor console output for errors or unexpected behavior
5. **Validate delay**: Ensure responses include expected timing delays

All mock services return preconfigured JSON data based on request content matching patterns in the WebController logic. Response times include artificial delays to simulate real banking system behavior.