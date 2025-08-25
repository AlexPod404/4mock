# 4Mock - Banking API Mock Services

4Mock is a Spring Boot-based collection of mock servers that simulate banking API services. It provides stubs for four different banking system components, returning pre-configured JSON responses with simulated delays.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Bootstrap, Build, and Test Repository:
- Ensure Java 17+ is available: `java -version`
- Ensure Maven 3.6+ is available: `mvn -version` 
- Build all services: `mvn clean compile` -- takes 7 seconds for incremental builds, 15-20 seconds for first-time builds with fresh dependencies. NEVER CANCEL. Set timeout to 120+ seconds for fresh builds.
- Package all services: `mvn clean package` -- takes 12-15 seconds. NEVER CANCEL. Set timeout to 120+ seconds.
- Run tests: `mvn test` -- takes 2 seconds (no actual tests exist). NEVER CANCEL. Set timeout to 30+ seconds.

### Build and Runtime Details:
- **CRITICAL**: All build commands may take longer on first run due to Maven dependency downloads
- **Compilation Time**: Clean compile takes 7 seconds (incremental), 15-20 seconds (fresh dependencies)
- **Package Time**: Clean package takes 12-15 seconds  
- **Test Time**: 2 seconds (no tests to run)
- **Application Startup**: Each service starts in ~1 second

### Run Services:
Start individual services using Spring Boot Maven plugin:

- **Client Card Service** (Port 8010): `cd armsb_client_card && mvn spring-boot:run`
- **CTI Service** (Port 8020): `cd armsb_cti && mvn spring-boot:run`
- **Clients Service** (Port 8001): `cd armsb_clients && mvn spring-boot:run` 
- **Tasks Service** (Port 8030): `cd armsb_tasks && mvn spring-boot:run`

Each service starts quickly (~1 second) and shows Spring Boot ASCII art when ready.

## Validation

- ALWAYS test API endpoints after making changes to ensure services respond correctly
- All endpoints return hardcoded JSON responses with ~100ms delays
- Services return 404 for undefined endpoints - this is expected behavior
- Use curl to test endpoints: `curl -X POST http://localhost:[PORT]/[ENDPOINT] -H "Content-Type: application/json" -d '{"test":"data"}'`

### Manual Testing Scenarios:
After making changes, ALWAYS validate with these scenarios:

1. **Build Validation**: Run `mvn clean package` to ensure all modules compile
2. **Service Startup**: Start one service with `mvn spring-boot:run` and verify it shows "Started Application" message
3. **API Response Test**: Test at least one endpoint per modified service using curl
4. **Response Format**: Verify JSON responses are properly formatted and include expected delays

### Sample API Tests:
```bash
# Client Card Service (Port 8010)
curl -X POST http://localhost:8010/positions/get -H "Content-Type: application/json" -d '{"test":"data"}'

# CTI Service (Port 8020) 
curl -s http://localhost:8020/cti/getCommunications

# Clients Service (Port 8001)
curl -X POST http://localhost:8001/clients/srvgetclientlist -H "Content-Type: application/json" -d '{"test":"ARMSB_CLIENTS"}'

# Tasks Service (Port 8030)
curl -X POST http://localhost:8030/templates/get -H "Content-Type: application/json" -d '{"test":"data"}'
```

## Service Details

### armsb_client_card (Port 8010)
Mock for "Карточка клиента (CI03259032) - сервисы" - Client Card services
**Key Endpoints:**
- `/sbpemployeeinfo/v1/employee` - Employee information  
- `/positions/get` - Client positions/roles
- `/clients/getClientCardFromCRMandEPK/rest/v1/context` - Client context
- `/employee/com.sbt.bpspe.core.json.rpc.api.Employee` - Employee RPC API

### armsb_cti (Port 8020)
Mock for "CTI (CI03239703)" - CTI communication services with 100-thread server
**Key Endpoints:**
- `/cti/getCommunications` - Get communications
- `/cti/getClientPhones` - Get client phone numbers  
- `/cti/call/init` - Initialize call
- `/employees/{fullEmployeeNumber}/phones` - Employee address book
- `/sbpemployeeinfo/v1/employee` - Employee information

### armsb_clients (Port 8001)
Mock for "АРМ СБ1. Клиенты (CI02750597) - сервисы" - Client management services
**Key Endpoints:**
- `/clients/srvgetclientlist` - Main client list service (handles multiple request types)
- `armsb/clients/v1/rest/getClientsForMassMailing` - Mass mailing clients
- `/tasks/get` - Get tasks
- `/clients/srvgetclientlist/clients/searchByLastName` - Search by last name
- `/clients/pprbBhepService` - PPRB BHEP service
- `/clients/pprbClients/clients/getByTeamId` - Get clients by team
- `/clients/teams/get` - Get teams
- `/clients/ucpclients/clients/get` - UCP clients

### armsb_tasks (Port 8030)
Mock for "Ленты задач (CI02750599)" - Task feed services  
**Key Endpoints:**
- `/sbpemployeeinfo/v1/employee` - Employee information
- `/tasks/clients/getByTeamId` - Get clients by team ID
- `/tasks/clients/get` - Get clients
- `/templates/get` - Get templates
- `/templates/getFilters` - Get template filters

## Common Tasks

### Repository Structure:
```
4mock/
├── pom.xml                    # Parent POM (created to enable builds)
├── armsb_client_card/         # Client Card Service (Port 8010)
│   ├── pom.xml
│   └── src/main/java/sb1/stub/client_card/
├── armsb_cti/                 # CTI Service (Port 8020)  
│   ├── pom.xml
│   └── src/main/java/sb1/stub/client_cti/
├── armsb_clients/             # Clients Service (Port 8001)
│   ├── pom.xml
│   └── src/main/java/sb1/stub/armsb_clients/
└── armsb_tasks/               # Tasks Service (Port 8030)
    ├── pom.xml
    └── src/main/java/sb1/stub/armsb_tasks/
```

### Key Files to Understand:
- **WebController.java** in each service: Contains @RequestMapping endpoints
- **Jsons.java** in each service: Contains hardcoded JSON response data
- **Application.java** in each service: Spring Boot main application class
- **application.properties**: Service configuration (ports, etc.)

### Technology Stack:
- **Java 17**: Required runtime
- **Maven 3.9+**: Build tool 
- **Spring Boot 2.7.18**: Web framework
- **Lombok**: Code generation (annotations like @SneakyThrows, @Slf4j)
- **Apache Commons**: Utility libraries (commons-io, commons-lang3)

### Response Behavior:
- All responses have ~100ms delay (`Thread.sleep(delta)` where delta=100L)
- Responses are hardcoded JSON strings from Jsons.java classes
- Different request body content triggers different response variants in some endpoints
- Services return proper HTTP status codes (404 for undefined endpoints)

### Development Notes:
- Each service is independent and can be built/run separately
- Services use deprecated Spring APIs (warnings expected during compilation)
- No actual database or external dependencies - all responses are hardcoded
- Services designed for load testing and integration testing scenarios
- All text/comments are in Russian language reflecting the banking domain