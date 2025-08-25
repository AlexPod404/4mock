# 4mock - Spring Boot Mock Services
4mock is a collection of 4 Java Spring Boot applications that provide mock API services with hardcoded JSON responses. Each service simulates different parts of a banking/enterprise system with a 1-second delay on responses.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively
- Bootstrap, build, and test the repository:
  - Java 17 and Maven are already installed and configured
  - `mvn clean compile` -- takes 5 seconds. NEVER CANCEL. Set timeout to 60+ seconds.
  - `mvn clean package -DskipTests` -- takes 5 seconds to build all JAR files. NEVER CANCEL. Set timeout to 60+ seconds.
  - `mvn test` -- takes 3 seconds. NEVER CANCEL. Set timeout to 30+ seconds. (No actual tests exist, only Spring Boot context loading)

## Running the Mock Services
- **ALWAYS run the build step first** before attempting to start any service
- Each service runs on a different port and can be started independently or simultaneously
- Services start in ~2 seconds and respond immediately to API calls
- All services include a built-in 100ms delay (configurable via `/setDelta/{milliseconds}` endpoint)

### Running Individual Services:
- Client Card Service: `cd armsb_client_card && java -jar target/armsb_client_card-1.0.0.jar` (port 8010)
- Clients Service: `cd armsb_clients && java -jar target/armsb_clients-1.0.0.jar` (port 8001)
- CTI Service: `cd armsb_cti && java -jar target/armsb_cti-1.0.0.jar` (port 8020)
- Tasks Service: `cd armsb_tasks && java -jar target/armsb_tasks-1.0.0.jar` (port 8030)

### Running via Maven (alternative):
- Client Card Service: `cd armsb_client_card && mvn spring-boot:run`
- Clients Service: `cd armsb_clients && mvn spring-boot:run`
- CTI Service: `cd armsb_cti && mvn spring-boot:run`
- Tasks Service: `cd armsb_tasks && mvn spring-boot:run`

## Validation
- **ALWAYS manually validate any new code by testing actual API endpoints after making changes**
- Test basic connectivity: `curl -s http://localhost:PORT/` (returns 404 - this is expected)
- Test working endpoints that don't require POST data:
  - `curl -s http://localhost:8010/sbpemployeeinfo/v1/employee` (Client Card Service)
  - `curl -s http://localhost:8020/cti/getCommunications` (CTI Service, returns JSON)
  - `curl -s http://localhost:8030/sbpemployeeinfo/v1/employee` (Tasks Service)
- Most endpoints require POST requests with JSON data and return mock responses with Russian text
- All services support delay configuration via `GET /getDelta` and `POST /setDelta/{ms}`
- Services can run simultaneously without conflicts as they use different ports

## Project Structure
- **4 Spring Boot modules**: Each is an independent web service with mock endpoints
- **Parent POM**: Root `pom.xml` manages all 4 modules with shared dependencies
- **Hardcoded JSON responses**: Located in each module's `Jsons.java` class under `dummy/data/hardcode/`
- **Controllers**: Each module has a `WebController.java` with `@RequestMapping` annotations defining API endpoints
- **No databases**: All responses are hardcoded strings, no external dependencies required

## Service Details

### armsb_client_card (Port 8010)
Mock service for "Client Card" functionality.
Key endpoints: `/sbpemployeeinfo/v1/employee`, `/positions/get`, `/clients/getClientCardFromCRMandEPK`, `/teams/get`

### armsb_clients (Port 8001) 
Mock service for client management.
Key endpoints: `/clients/srvgetclientlist`, `/clients/pprbClients`, `/clients/teams/get`, `/employee/com.sbt.bpspe.core.json.rpc.api.Employee`

### armsb_cti (Port 8020)
Mock service for "CTI" (Computer Telephony Integration) with 100 threads.
Key endpoints: `/cti/getCommunications`, `/cti/getClientPhones`, `/cti/call/init`, `/cti/setNotification`

### armsb_tasks (Port 8030)
Mock service for "Task Feed" functionality.
Key endpoints: `/tasks/getByFilter`, `/tasks/getTaskById`, `/templates/get`, `/tasks/marking/check`, `/getGeneralCounters`

## Common Tasks

### Repository Root Structure
```
4mock/
├── pom.xml (parent)
├── armsb_client_card/
│   ├── pom.xml
│   ├── src/main/java/sb1/stub/client_card/
│   └── target/ (after build)
├── armsb_clients/
│   ├── pom.xml  
│   ├── src/main/java/sb1/stub/armsb_clients/
│   └── target/ (after build)
├── armsb_cti/
│   ├── pom.xml
│   ├── src/main/java/sb1/stub/client_cti/
│   └── target/ (after build)
└── armsb_tasks/
    ├── pom.xml
    ├── src/main/java/sb1/stub/armsb_tasks/  
    └── target/ (after build)
```

### Key Dependencies
- Spring Boot 2.7.14 (Web, Test)
- Lombok 1.18.28 (code generation)
- Commons IO 2.11.0 (utilities)
- Commons Lang3 3.12.0 (utilities)
- Java 17 runtime

### Build Artifacts
After successful build (`mvn clean package -DskipTests`):
- `armsb_client_card/target/armsb_client_card-1.0.0.jar`
- `armsb_clients/target/armsb_clients-1.0.0.jar`
- `armsb_cti/target/armsb_cti-1.0.0.jar`
- `armsb_tasks/target/armsb_tasks-1.0.0.jar`

### Adding New Mock Endpoints
1. Add new method to appropriate `WebController.java` with `@RequestMapping`
2. Add corresponding JSON response method to `Jsons.java`  
3. Rebuild: `mvn clean package -DskipTests`
4. Restart the affected service
5. Test the new endpoint with curl

### Modifying Mock Responses
1. Locate the appropriate `Jsons.java` file in `src/main/java/.../dummy/data/hardcode/`
2. Edit the static method that returns the JSON string
3. Rebuild and restart the affected service
4. Test that the response changed as expected

### Debugging
- Check application logs for startup issues (services log to console)
- Verify ports aren't already in use: `netstat -tulpn | grep 800[0-9]`
- Test basic connectivity before complex API calls
- Use `curl -v` for detailed HTTP debugging information
- All mock responses include Russian text - this is expected

### Performance Notes
- **Build time**: ~5 seconds for all modules
- **Startup time**: ~2 seconds per service  
- **Response time**: 100ms default delay (configurable)
- **Memory usage**: Each service uses ~200MB RAM
- **Concurrent services**: All 4 can run simultaneously without issues