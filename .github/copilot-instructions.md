# 4Mock - Spring Boot Mock Services Repository

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Repository Structure
This repository contains 5 separate Spring Boot mock service applications:
- **armsb-union-10modulestubs** (port 8080) - Main unified mock system with 10 stub modules and Spring Boot Admin interface
- **armsb_client_card** (port 8010) - Client card mock service  
- **armsb_clients** (port 8001) - Clients mock service
- **armsb_cti** (port 8020) - CTI mock service
- **armsb_tasks** (port 8030) - Tasks mock service

### Prerequisites and Setup
- Java 8+ (tested with Java 17)
- Maven 3.6+
- Docker (optional)

### Building Applications

#### Main Application (armsb-union-10modulestubs)
```bash
cd armsb-union-10modulestubs
mvn clean package -DskipTests
# First build takes ~45 seconds (downloading dependencies). NEVER CANCEL - set timeout to 90+ seconds
# Subsequent builds take ~3-4 seconds with cached dependencies
```

#### Running Tests
```bash
cd armsb-union-10modulestubs  
mvn test
# Tests complete in ~2 seconds - no actual tests exist currently
```

#### Individual Services Build Fix
The individual services (armsb_client_card, armsb_clients, armsb_cti, armsb_tasks) reference a non-existent parent POM. To build them:
```bash
# Example for armsb_client_card - repeat pattern for other services
cd armsb_client_card
# Backup original pom.xml
cp pom.xml pom.xml.backup
# Create fixed pom.xml (replace parent reference)
cat > pom.xml << 'EOF'
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.4</version>
        <relativePath/>
    </parent>
    <groupId>sb1.stub</groupId>
    <artifactId>armsb_client_card</artifactId>
    <version>1.0.0</version>
    <name>armsb_client_card</name>
    <description>armsb_client_card</description>
    <properties>
        <java.version>1.8</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.6</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.1</version>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
EOF
mvn clean package -DskipTests
# First build takes ~4 seconds. NEVER CANCEL - set timeout to 60+ seconds
# Restore original pom if needed: mv pom.xml.backup pom.xml
```

### Running Applications

#### Main Application (Recommended)
```bash
cd armsb-union-10modulestubs
# Run directly
java -jar target/armsb-union-10modulestubs.jar
# Application starts in ~5 seconds on http://localhost:8080

# Or with custom configuration  
java -Dserver.port=9090 -Dadmin.username=admin -Dadmin.password=secret -jar target/armsb-union-10modulestubs.jar
```

#### Docker Deployment (Main Application)
```bash
cd armsb-union-10modulestubs
# Build Docker image
docker build -t armsb-union-10modulestubs .
# Build takes ~4 seconds. NEVER CANCEL - set timeout to 60+ seconds

# Run container
docker run -d -p 8080:8080 --name mock-system armsb-union-10modulestubs

# Run with custom environment
docker run -d -p 9090:8080 \
  -e ADMIN_USERNAME=admin \
  -e ADMIN_PASSWORD=secret \
  -e SPRING_PROFILES_ACTIVE=docker \
  --name mock-system armsb-union-10modulestubs

# Stop and cleanup
docker stop mock-system && docker rm mock-system
```

#### Individual Services
```bash
# After fixing pom.xml as shown above
cd armsb_client_card
java -jar target/armsb_client_card-1.0.0.jar
# Starts on http://localhost:8010

# Similarly for other services on their respective ports:
# armsb_clients: 8001
# armsb_cti: 8020  
# armsb_tasks: 8030
```

### Validation and Testing

#### Main Application Endpoints
```bash
# Health check (no auth required)
curl -s http://localhost:8080/actuator/health

# Admin endpoints (requires basic auth admin:admin)
curl -s -u admin:admin http://localhost:8080/actuator/info
curl -s -u admin:admin http://localhost:8080/management/mocks

# Mock endpoints (stub01 example)
curl -s -X POST http://localhost:8080/stub01/clients/search \
  -H "Content-Type: application/json" \
  -d '{"query": "john"}'

# Test stub02-10 similar patterns
curl -s -X POST http://localhost:8080/stub02/data/process \
  -H "Content-Type: application/json" \
  -d '{"data": "sample"}'

curl -s http://localhost:8080/stub03/info/123
```

#### Individual Service Endpoints
```bash
# Client card service (port 8010)
curl -s -X POST http://localhost:8010/positions/get \
  -H "Content-Type: application/json" \
  -d '{"test": "data"}'

curl -s http://localhost:8010/sbpemployeeinfo/v1/employee

# Set response delay
curl -s http://localhost:8010/setDelta/500
curl -s http://localhost:8010/getDelta
```

#### Spring Boot Admin Interface
Access http://localhost:8080 in browser with credentials admin:admin to view:
- Application monitoring
- Log file viewing
- Metrics and health information
- Dynamic configuration management

### Manual Validation Requirements
ALWAYS run through these validation scenarios after making changes:

1. **Main Application Validation**:
   - Build and start the main application
   - Test health endpoint: `curl -s http://localhost:8080/actuator/health`
   - Test at least 2 stub endpoints (stub01 and stub02)
   - Verify Spring Boot Admin interface is accessible
   - Test mock management API with authentication

2. **Individual Service Validation** (if modifying them):
   - Apply pom.xml fix as shown above
   - Build and start the service
   - Test at least one endpoint specific to that service
   - Verify service responds with expected JSON mock data
   - Test delay configuration if applicable

3. **Docker Validation**:
   - Build Docker image successfully
   - Run container and test health endpoint
   - Verify all endpoints work through Docker deployment

### Key Points for Development
- **CRITICAL**: All builds and tests have been validated - NEVER CANCEL running builds
- The main application (armsb-union-10modulestubs) is the primary deployment target
- Individual services can be built but require pom.xml parent reference fixes
- All services include 1-second response delays by design
- Mock responses are pre-configured JSON files with hardcoded data
- Admin credentials are admin:admin (configurable via environment variables)
- State persistence is handled automatically in the main application

### Common Tasks Reference

#### Repository Root Structure
```
.
├── armsb-union-10modulestubs/    # Main unified mock system
├── armsb_client_card/            # Client card mock (port 8010)  
├── armsb_clients/                # Clients mock (port 8001)
├── armsb_cti/                    # CTI mock (port 8020)
└── armsb_tasks/                  # Tasks mock (port 8030)
```

#### Main Application Key Files
```
armsb-union-10modulestubs/
├── src/main/java/sb1/stub/union/
│   ├── Application.java          # Main Spring Boot application
│   └── common/service/MockManagementService.java
├── src/main/resources/
│   └── application.yml           # Configuration file
├── Dockerfile                    # Docker build configuration
└── target/armsb-union-10modulestubs.jar  # Built application
```

### Build Time Expectations
- **Main application first build**: ~45 seconds with dependency downloads (NEVER CANCEL - use 90+ second timeouts)
- **Main application subsequent builds**: ~3-4 seconds (NEVER CANCEL - use 60+ second timeouts)
- **Individual service build**: ~3-4 seconds (NEVER CANCEL - use 60+ second timeouts)  
- **Docker image build**: ~1-4 seconds (NEVER CANCEL - use 60+ second timeouts)
- **Application startup**: ~4-5 seconds
- **Tests**: ~1-2 seconds (no actual tests exist currently)

Always build and validate your changes using the exact commands provided above before committing.