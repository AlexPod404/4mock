# armsb-union-4modulestubs

Unified Spring Boot 2.6.4 project that combines four mock services into a single JAR application.

## Overview

This project combines the following four mock services:
- **armsb_clients** → `/clients/**` endpoints
- **armsb_cti** → `/cti/**` endpoints  
- **armsb_tasks** → `/tasks/**` endpoints
- **armsb_client_card** → `/clientcard/**` endpoints

## Requirements

- Java 8 (JDK 1.8)
- Maven 3.6+

## Building

```bash
mvn clean package
```

This produces a single JAR file: `target/armsb-union-4modulestubs-1.0.0.jar`

## Running

```bash
java -jar target/armsb-union-4modulestubs-1.0.0.jar
```

The application starts on port **8080** by default.

## Endpoints

### Clients Module (`/clients/**`)
- `GET /clients/getDelta` - Get current delay value
- `GET /clients/setDelta/{value}` - Set delay value
- `POST /clients/srvgetclientlist` - Get client list
- `POST /clients/armsb/v1/rest/getClientsForMassMailing` - Get clients for mass mailing
- `POST /clients/tasks/get` - Get tasks (legacy endpoint from clients module)
- And other client-related endpoints...

### CTI Module (`/cti/**`)
- `GET /cti/getDelta` - Get current delay value  
- `GET /cti/setDelta/{value}` - Set delay value
- `GET /cti/getCommunications` - Get communications
- `GET /cti/getClientPhones` - Get client phones
- `GET /cti/call/init` - Initialize call
- `GET /cti/setNotification` - Set notification
- And other CTI-related endpoints...

### Tasks Module (`/tasks/**`)
- `GET /tasks/getDelta` - Get current delay value
- `GET /tasks/setDelta/{value}` - Set delay value  
- `POST /tasks/` - Main tasks endpoint
- `POST /tasks/getByFilter` - Get tasks by filter
- `GET /tasks/getFilters` - Get available filters
- `GET /tasks/marking/getById` - Get marking by ID
- And other task-related endpoints...

### Client Card Module (`/clientcard/**`)
- `GET /clientcard/getDelta` - Get current delay value
- `GET /clientcard/setDelta/{value}` - Set delay value
- `POST /clientcard/getClientCardFromCRMandEPK` - Get client card from CRM and EPK
- `POST /clientcard/services/create-structure` - Create structure
- `GET /clientcard/teams/get` - Get teams
- And other client card-related endpoints...

## Architecture

The project maintains the original structure and logic of each mock service:
- Each module has its own package structure under `sb1.stub.{module}`
- Each module has its own `Jsons` class with hardcoded responses
- Each module has its own `WebController` class (renamed to avoid conflicts)
- All modules use the same delay mechanism configurable via `/setDelta` endpoints

## Configuration

The application uses `application.properties` for configuration:
- `server.port=8080` - Default port (can be overridden with `--server.port=XXXX`)

## Notes

- All four mock services run simultaneously in the same JVM
- Endpoint conflicts are avoided through root path isolation
- Original business logic and response structures are preserved
- Individual module dependencies are maintained where needed