# ARMSB Union Module Stubs

Unified Spring Boot application that combines 4 existing mocks into a single JAR running on one port with separate context paths.

## Overview

This module unifies 4 separate Spring Boot mock applications:
- **Mock 1** (armsb_clients) - Client management services
- **Mock 2** (armsb_client_card) - Client card operations  
- **Mock 3** (armsb_cti) - CTI (Computer Telephony Integration) services
- **Mock 4** (armsb_tasks) - Task management operations

## Architecture

### Technology Stack
- **Spring Boot**: 2.6.4
- **Java**: 8 compatible
- **Maven**: Build tool
- **Port**: Single port (8080 by default)

### Context Path Strategy
Each mock preserves its original business logic and endpoints but is accessible through a unique context path:

| Mock | Context Path | Original Module | Purpose |
|------|-------------|-----------------|---------|
| Mock 1 | `/mock1/*` | armsb_clients | Client management endpoints |
| Mock 2 | `/mock2/*` | armsb_client_card | Client card operations |
| Mock 3 | `/mock3/*` | armsb_cti | CTI integration services |
| Mock 4 | `/mock4/*` | armsb_tasks | Task management services |

### Project Structure
```
armsb-union-modulestubs/
├── src/main/java/ru/company/
│   ├── UnionMocksApplication.java          # Main Spring Boot application
│   ├── mock1/                              # armsb_clients mock
│   │   └── dummy/
│   │       ├── webservice/Mock1WebController.java
│   │       └── data/hardcode/Jsons.java
│   ├── mock2/                              # armsb_client_card mock
│   │   └── dummy/
│   │       ├── webservice/Mock2WebController.java
│   │       └── data/hardcode/Jsons.java
│   ├── mock3/                              # armsb_cti mock
│   │   └── dummy/
│   │       ├── webservice/Mock3WebController.java
│   │       └── data/hardcode/Jsons.java
│   └── mock4/                              # armsb_tasks mock
│       └── dummy/
│           ├── webservice/Mock4WebController.java
│           └── data/hardcode/Jsons.java
├── src/main/resources/
│   └── application.yml                     # Configuration
├── pom.xml                                 # Maven dependencies
└── README.md                               # This file
```

## Key Features

### 1. Non-Destructive Integration
- **No endpoint merging**: Duplicate endpoints are preserved with different context paths
- **Original business logic**: Each mock retains its complete original functionality
- **Separate namespaces**: No conflicts between mocks

### 2. Single Deployment Unit
- **One JAR file**: All 4 mocks packaged together
- **Single port**: All services accessible on port 8080
- **Unified logging**: Consolidated logging for all mocks

### 3. Individual Mock Control
Each mock has independent:
- **Delta timing**: `/mock{N}/setDelta/{value}` and `/mock{N}/getDelta`
- **Business endpoints**: Original paths prefixed with context
- **Data responses**: Preserved JSON response structures

## Usage

### Building the Application
```bash
mvn clean package
```

### Running the Application
```bash
# Using Maven
mvn spring-boot:run

# Using JAR file
java -jar target/armsb-union-modulestubs-1.0.0.jar
```

### Example Endpoints

#### Mock 1 - Client Services
```bash
# Get client list
POST http://localhost:8080/mock1/clients/srvgetclientlist

# Search clients by last name  
POST http://localhost:8080/mock1/clients/srvgetclientlist/clients/searchByLastName

# Get mass mailing clients
POST http://localhost:8080/mock1/armsb/clients/v1/rest/getClientsForMassMailing
```

#### Mock 2 - Client Card Operations
```bash
# Get employee info
POST http://localhost:8080/mock2/sbpemployeeinfo/v1/employee

# Get client card from CRM
POST http://localhost:8080/mock2/clients/getClientCardFromCRMandEPK

# Create document structure
POST http://localhost:8080/mock2/services/create-structure
```

#### Mock 3 - CTI Services
```bash
# Get communications
POST http://localhost:8080/mock3/cti/getCommunications

# Get client phones
POST http://localhost:8080/mock3/cti/getClientPhones

# Initialize call
POST http://localhost:8080/mock3/cti/call/init
```

#### Mock 4 - Task Management
```bash
# Get tasks by filter
POST http://localhost:8080/mock4/tasks/getByFilter

# Get task templates
POST http://localhost:8080/mock4/templates/get

# Get task by ID
POST http://localhost:8080/mock4/tasks/getTaskById
```

#### Utility Endpoints (Available for all mocks)
```bash
# Set response delay (in milliseconds)
GET http://localhost:8080/mock1/setDelta/500

# Get current delay setting
GET http://localhost:8080/mock1/getDelta
```

## Configuration

The application uses `application.yml` for configuration:

```yaml
server:
  port: 8080

spring:
  application:
    name: armsb-union-modulestubs

logging:
  level:
    ru.company: INFO
    org.springframework: WARN
```

## Dependencies

- Spring Boot Starter Web
- Commons IO 2.6
- Lombok (compile-time)
- Apache Commons Lang3 3.1

## Compatibility

- **Java 8+**: Compiled with Java 8 compatibility
- **Spring Boot 2.6.4**: Stable Spring Boot version
- **Maven 3.6+**: For building the project

## Development Notes

### Design Principles
1. **Minimal Changes**: Original mock code preserved with only package and context path changes
2. **No Business Logic Mixing**: Each mock operates independently
3. **Conflict Avoidance**: Unique class names and context paths prevent Spring Bean conflicts
4. **Single Responsibility**: Each mock controller handles only its original endpoints

### Adding New Endpoints
To add new endpoints to any mock:
1. Add the endpoint to the appropriate `Mock{N}WebController.java`
2. Ensure the `@RequestMapping("/mock{N}")` class-level annotation is present
3. Add corresponding response data to the mock's `Jsons.java` class if needed

### Troubleshooting
- **Port Conflicts**: Change `server.port` in `application.yml`
- **Memory Issues**: Adjust JVM heap size when running the JAR
- **Context Path Issues**: Ensure all endpoints include the correct `/mock{N}/` prefix

---

*This unified mock application allows testing all 4 services simultaneously while maintaining their individual characteristics and avoiding endpoint conflicts.*