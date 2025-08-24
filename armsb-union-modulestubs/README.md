# ARMSB Union Module Stubs

Unified Spring Boot application that combines four ARMSB mock services into a single application.

## Overview

This project merges the following four mock services:
- **armsb_client_card** → accessible under `/clientcard` prefix
- **armsb_clients** → accessible under `/clients` prefix  
- **armsb_cti** → accessible under `/cti` prefix
- **armsb_tasks** → accessible under `/tasks` prefix

## Technical Details

- **Java Version**: 1.8
- **Spring Boot Version**: 2.6.4
- **Port**: 8080 (single port for all services)
- **Routing**: Prefix-based routing to separate different modules

## Project Structure

```
armsb-union-modulestubs/
├── src/main/java/sb1/stub/union/
│   ├── Application.java                    # Main Spring Boot application
│   ├── clientcard/                         # Client card module
│   │   └── dummy/
│   │       ├── webservice/
│   │       │   └── ClientCardController.java
│   │       └── data/hardcode/
│   │           └── Jsons.java
│   ├── clients/                            # Clients module  
│   │   └── dummy/
│   │       ├── webservice/
│   │       │   └── ClientsController.java
│   │       └── data/hardcode/
│   │           └── Jsons.java
│   ├── cti/                               # CTI module
│   │   └── dummy/
│   │       ├── webservice/
│   │       │   └── CtiController.java
│   │       └── data/hardcode/
│   │           └── Jsons.java
│   └── tasks/                             # Tasks module
│       └── dummy/
│           ├── webservice/
│           │   └── TasksController.java
│           └── data/hardcode/
│               └── Jsons.java
```

## Running the Application

### Prerequisites
- Java 8 or higher
- Maven 3.x

### Build and Run
```bash
# Build the project
mvn clean compile

# Run the application
mvn spring-boot:run

# Or build and run the JAR
mvn clean package
java -jar target/armsb-union-modulestubs-1.0.0.jar
```

The application will start on **port 8080**.

## Endpoint Access

All endpoints from the original modules are preserved with prefix routing:

### Client Card Module (`/clientcard`)
- `GET /clientcard/sbpemployeeinfo/v1/employee`
- `POST /clientcard/clients/getClientCardFromCRMandEPK`
- `POST /clientcard/services/create-structure`
- `POST /clientcard/positions/get`
- `GET /clientcard/teams/get`
- And all other original endpoints...

### Clients Module (`/clients`)
- `POST /clients/clients/srvgetclientlist` 
- `POST /clients/clients/teams/get`
- `POST /clients/tasks/get`
- `GET /clients/sbpemployeeinfo/v1/employee`
- And all other original endpoints...

### CTI Module (`/cti`)
- `GET /cti/cti/getCommunications`
- `GET /cti/cti/getClientPhones`
- `GET /cti/cti/call/init`
- `GET /cti/positions/get`
- `GET /cti/sbpemployeeinfo/v1/employee`
- And all other original endpoints...

### Tasks Module (`/tasks`)
- `GET /tasks/sbpemployeeinfo/v1/employee`
- `POST /tasks/tasks/clients/getByTeamId`
- `POST /tasks/tasks/positions/get`
- `GET /tasks/getGeneralCounters`
- `GET /tasks/getCountersByClients`
- And all other original endpoints...

## Configuration Management

Each module maintains its own delay configuration:

- `POST /clientcard/setDelta/{value}` - Set delay for client card module
- `POST /clients/setDelta/{value}` - Set delay for clients module  
- `POST /cti/setDelta/{value}` - Set delay for CTI module
- `POST /tasks/setDelta/{value}` - Set delay for tasks module

- `GET /clientcard/getDelta` - Get current delay for client card module
- `GET /clients/getDelta` - Get current delay for clients module
- `GET /cti/getDelta` - Get current delay for CTI module  
- `GET /tasks/getDelta` - Get current delay for tasks module

## Duplicate Endpoints

Some endpoints exist in multiple modules (e.g., `/sbpemployeeinfo/v1/employee`). These are preserved as separate endpoints under their respective prefixes, allowing each module to maintain its independent behavior and responses.

## Dependencies

- spring-boot-starter-web
- spring-boot-starter-test
- commons-io 2.6
- lombok
- commons-lang3 3.1

## Migration Notes

- All original endpoint logic and JSON responses are preserved exactly as they were
- Each module operates independently with its own static `delta` delay configuration
- No changes were made to the business logic or response formats
- Module separation is achieved through Spring's `@RequestMapping` prefixes