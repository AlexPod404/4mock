# 4mock - Java Spring Boot Mock Services
4mock is a collection of Java Spring Boot mock services that simulate various banking and enterprise systems. It consists of 5 main components: one unified multi-stub system and 4 individual service mocks, all designed to provide realistic API responses for testing and development.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively
- Prerequisites and setup:
  - Java 8+ required (project is Java 8 compatible, tested with Java 17)
  - Maven 3.6+ required (tested with Maven 3.9.11)  
  - Docker optional (for containerized deployment)
- Build all services:
  - `cd /path/to/4mock`
  - `mvn clean package -DskipTests` -- builds all services via parent POM, takes 45-50 seconds. NEVER CANCEL. Set timeout to 90+ minutes.
- Build individual services:
  - Main unified service: `cd armsb-union-10modulestubs && mvn clean package -DskipTests` -- takes 42 seconds first time, 3 seconds subsequent. NEVER CANCEL. Set timeout to 60+ minutes.
  - Individual services: `cd armsb_client_card && mvn clean package -DskipTests` -- takes 2-4 seconds each. NEVER CANCEL. Set timeout to 30+ minutes.
- Test suite:
  - `mvn test` -- completes instantly (no actual tests exist in codebase)
- Docker builds:
  - Main service: `cd armsb-union-10modulestubs && docker build -t armsb-union-10modulestubs .` -- takes 4-5 seconds. NEVER CANCEL. Set timeout to 30+ minutes.

## Running Services
- **Main unified service (armsb-union-10modulestubs)** - port 8080:
  - `java -jar armsb-union-10modulestubs/target/armsb-union-10modulestubs.jar`
  - Access admin UI: http://localhost:8080 (login: admin/admin)
  - Contains 10 independent mock stubs (stub01-stub10)
- **Individual services** - separate ports:
  - Client Card: `java -jar armsb_client_card/target/armsb_client_card-1.0.0.jar` (port 8010)
  - Clients: `java -jar armsb_clients/target/armsb_clients-1.0.0.jar` (port 8001)  
  - CTI: `java -jar armsb_cti/target/armsb_cti-1.0.0.jar` (port 8020)
  - Tasks: `java -jar armsb_tasks/target/armsb_tasks-1.0.0.jar` (port 8030)
- Docker deployment (main service):
  - `docker run -d -p 8080:8080 --name mock-system armsb-union-10modulestubs`
  - With custom config: `docker run -d -p 9090:8080 -e ADMIN_USERNAME=admin -e ADMIN_PASSWORD=secret --name mock-system armsb-union-10modulestubs`

## Validation
- **CRITICAL**: Always validate changes by running complete user scenarios, not just starting/stopping services.
- **Main service validation scenarios**:
  1. Health checks: `curl http://localhost:8080/actuator/health`
  2. Test stub endpoints: `curl -X POST http://localhost:8080/stub01/clients/search -H "Content-Type: application/json" -d '{"query": "john"}'`
  3. Admin interface: `curl -u admin:admin http://localhost:8080/management/mocks`
  4. Access web UI at http://localhost:8080 and verify Spring Boot Admin interface loads
- **Individual service validation**:
  1. Client Card service: `curl http://localhost:8010/getDelta` and `curl -X POST http://localhost:8010/positions/get -H "Content-Type: application/json" -d '{"test": "data"}'`
  2. Test responses contain valid JSON with expected structure
- Run validation steps after making ANY changes to ensure services remain operational.
- Always test both authenticated and non-authenticated endpoints.

## Common Tasks
The following are outputs from frequently run commands. Reference them instead of running bash commands to save time.

### Repository Structure
```
4mock/
├── armsb-union-10modulestubs/          # Main unified service with 10 stubs
│   ├── src/main/java/sb1/stub/union/   # Java source code
│   │   ├── Application.java            # Main Spring Boot app
│   │   ├── common/                     # Shared components
│   │   │   ├── config/SecurityConfig.java
│   │   │   ├── controller/MockManagement*
│   │   │   └── service/MockManagement*
│   │   └── stub01-stub10/              # Individual stub implementations
│   ├── src/main/resources/
│   │   └── application.yml             # Main configuration
│   ├── Dockerfile                      # Docker build file
│   ├── pom.xml                        # Maven build config
│   └── target/armsb-union-10modulestubs.jar # Built JAR (35MB)
├── armsb_client_card/                  # Client Card service (port 8010)
├── armsb_clients/                      # ARM SB1 Clients (port 8001) 
├── armsb_cti/                          # CTI service (port 8020)
├── armsb_tasks/                        # Task Feed service (port 8030)
└── pom.xml                            # Parent POM for individual services
```

### Key Service Endpoints
Main unified service (localhost:8080):
- Health: `/actuator/health`
- Admin UI: `/` (admin/admin)
- Management API: `/management/mocks` (requires auth)
- Stub endpoints: `/stub01/clients/search`, `/stub02/data/process`, etc.
- Spring Boot Admin: Comprehensive monitoring at root URL

Individual services use service-specific endpoints documented in their source code.

### Build Artifacts Sizes
```
armsb-union-10modulestubs.jar: 35MB
armsb_client_card-1.0.0.jar: ~20MB  
armsb_clients-1.0.0.jar: ~20MB
armsb_cti-1.0.0.jar: ~20MB
armsb_tasks-1.0.0.jar: ~20MB
```

### Technology Stack
- **Language**: Java 8+ (compatible with Java 17)
- **Framework**: Spring Boot 2.6.4
- **Build Tool**: Maven 3.6+
- **Security**: Spring Security with Basic Authentication
- **Admin**: Spring Boot Admin 2.6.2 with web UI
- **Monitoring**: Actuator endpoints, Micrometer metrics
- **Containerization**: Docker with OpenJDK 8 Alpine base

## Architecture Notes
- **Main service features**: 10 independent mock stubs, unified admin interface, state persistence, hot enable/disable of individual mocks
- **Individual services**: Simple REST APIs with hardcoded JSON responses and configurable delays
- **Authentication**: Admin endpoints use admin:admin credentials (configurable via environment variables)
- **Ports**: Main service (8080), Client Card (8010), Clients (8001), CTI (8020), Tasks (8030)
- **No linting tools**: No checkstyle, spotless, or other code quality tools are configured
- **No tests**: Test suite is empty (mvn test completes instantly)

## Troubleshooting
- **Build issues**: Ensure parent POM exists in repository root for individual services
- **Port conflicts**: Services use fixed ports - ensure they're available
- **Memory issues**: Main service JAR is 35MB; adjust JVM settings if needed: `java -Xmx512m -jar ...`
- **Docker issues**: Healthcheck depends on wget; container uses non-root user for security
- **Authentication**: Management endpoints require Basic Auth with admin:admin credentials

## Development Notes
- All responses include 1-second artificial delay for realistic testing
- Mock states are persisted to disk with recovery after restart
- JSON responses are hardcoded in Java classes (not external files)
- Services use deprecated APIs in some places (warnings during compilation are expected)
- Main service supports dynamic response management through admin UI