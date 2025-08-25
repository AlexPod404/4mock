# ARMSB Union 10 Module Stubs

## Overview
A unified Spring Boot mock system that provides 10 independent mock modules (stub01-stub10) running on a single port. Built with Java 8 and Spring Boot 2.6.4, featuring comprehensive admin capabilities through Spring Boot Admin interface.

## Features
- ✅ **10 Independent Mock Modules** - Each with unique path prefixes (/stub01 to /stub10)
- ✅ **Single JAR Deployment** - One unified armsb-union-10modulestubs.jar file
- ✅ **Spring Boot Admin Integration** - Server and client in same JAR with web UI
- ✅ **Centralized Logging** - Online log viewing and dynamic level management
- ✅ **JSON Response Management** - Edit responses through admin UI with disk persistence
- ✅ **Actuator & Micrometer Metrics** - Comprehensive monitoring capabilities
- ✅ **Mock Control** - Hot enable/disable and restart individual mocks
- ✅ **HTTP/HTTPS Support** - Protocol switching via configuration
- ✅ **Basic Authentication** - Configurable admin/admin credentials
- ✅ **State Persistence** - Mock states saved to disk with recovery after restart
- ✅ **Docker Support** - OpenJDK 8 Alpine-based container
- ✅ **OpenShift Ready** - Production deployment configuration

## Quick Start

### Prerequisites
- Java 8+
- Maven 3.6+
- Docker (optional)

### Build and Run
```bash
# Clone and build
git clone <repository-url>
cd armsb-union-10modulestubs
mvn clean package -DskipTests

# Run locally
java -jar target/armsb-union-10modulestubs.jar

# Or with custom configuration
java -Dserver.port=9090 -Dadmin.username=admin -Dadmin.password=secret -jar target/armsb-union-10modulestubs.jar
```

The application will start on http://localhost:8080

### Docker Deployment
```bash
# Build Docker image
docker build -t armsb-union-10modulestubs .

# Run container
docker run -d -p 8080:8080 --name mock-system armsb-union-10modulestubs

# Run with custom environment
docker run -d -p 9090:8080 \
  -e ADMIN_USERNAME=admin \
  -e ADMIN_PASSWORD=secret \
  -e SPRING_PROFILES_ACTIVE=docker \
  --name mock-system armsb-union-10modulestubs
```

## Mock Endpoints

Each stub provides consistent endpoints with unique path prefixes:

### Stub01 (Client Management)
- `POST /stub01/clients/search` - Search clients
- `POST /stub01/orders/create` - Create orders
- `GET /stub01/status` - Get status
- `GET /stub01/health` - Health check

### Stub02-10 (Generic Data Operations)
- `POST /stub0X/data/process` - Process data
- `GET /stub0X/info/{id}` - Get information by ID
- `PUT /stub0X/update` - Update data
- `GET /stub0X/health` - Health check

### Example Usage
```bash
# Test stub01
curl -X POST http://localhost:8080/stub01/clients/search \
  -H "Content-Type: application/json" \
  -d '{"query": "john"}'

# Test stub02
curl -X POST http://localhost:8080/stub02/data/process \
  -H "Content-Type: application/json" \
  -d '{"data": "sample"}'

# Get info from stub03
curl http://localhost:8080/stub03/info/123
```

## Administration & Management

### Spring Boot Admin UI
Access the admin interface at: **http://localhost:8080**

Login credentials (configurable):
- Username: `admin`
- Password: `admin`

### Mock Management API
All management endpoints require authentication:

```bash
# Get all mock states
curl -u admin:admin http://localhost:8080/management/mocks

# Enable/disable specific mock
curl -u admin:admin -X POST http://localhost:8080/management/mocks/stub01/enable
curl -u admin:admin -X POST http://localhost:8080/management/mocks/stub01/disable

# Toggle mock state
curl -u admin:admin -X POST http://localhost:8080/management/mocks/stub01/toggle

# Get mock response
curl -u admin:admin "http://localhost:8080/management/mocks/stub01/response?endpoint=/clients/search"

# Save custom response
curl -u admin:admin -X POST \
  "http://localhost:8080/management/mocks/stub01/response?endpoint=/clients/search" \
  -H "Content-Type: application/json" \
  -d '{"custom": "response"}'
```

### Actuator Endpoints
Monitor and manage the application:

```bash
# Health check
curl http://localhost:8080/actuator/health

# Metrics
curl -u admin:admin http://localhost:8080/actuator/metrics

# Manage logging levels
curl -u admin:admin -X POST \
  http://localhost:8080/actuator/loggers/sb1.stub.union \
  -H "Content-Type: application/json" \
  -d '{"configuredLevel": "DEBUG"}'

# View logs
curl -u admin:admin http://localhost:8080/actuator/logfile
```

## Configuration

### Application Properties
Key configuration options in `application.yml`:

```yaml
server:
  port: 8080                    # Server port
  ssl:
    enabled: false              # Enable HTTPS

admin:
  username: admin               # Admin username
  password: admin               # Admin password

mock:
  state:
    file: mock-states.json      # State persistence file
  responses:
    dir: responses              # JSON responses directory

logging:
  level:
    root: INFO                  # Root logging level
    sb1.stub.union: INFO        # Application logging level
```

### Environment Variables
```bash
SERVER_PORT=8080
ADMIN_USERNAME=admin
ADMIN_PASSWORD=admin
MOCK_STATE_FILE=mock-states.json
MOCK_RESPONSES_DIR=responses
LOGGING_LEVEL_ROOT=INFO
```

## JSON Response Management

### File Structure
JSON responses are stored in the `responses/` directory:
```
responses/
├── stub01__clients_search.json
├── stub01__orders_create.json
├── stub02__data_process.json
├── stub02__info_123.json
└── ...
```

### Response Format
```json
{
  "status": {
    "code": 0,
    "message": "Success message"
  },
  "timestamp": 1640995200000,
  "mockId": "stub01",
  "endpoint": "/clients/search",
  "data": {
    "key": "value"
  }
}
```

### Editing Responses
1. **Through Admin UI**: Access Spring Boot Admin → Applications → armsb-union-10modulestubs
2. **Direct File Edit**: Modify JSON files in `responses/` directory
3. **Management API**: Use POST `/management/mocks/{mockId}/response` endpoint

## OpenShift Deployment

### Deployment Configuration
Create deployment YAML:

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: armsb-union-mocks
spec:
  replicas: 1
  selector:
    matchLabels:
      app: armsb-union-mocks
  template:
    metadata:
      labels:
        app: armsb-union-mocks
    spec:
      containers:
      - name: mock-system
        image: armsb-union-10modulestubs:latest
        ports:
        - containerPort: 8080
        env:
        - name: ADMIN_USERNAME
          value: "admin"
        - name: ADMIN_PASSWORD
          valueFrom:
            secretKeyRef:
              name: mock-admin-secret
              key: password
        livenessProbe:
          httpGet:
            path: /actuator/health
            port: 8080
          initialDelaySeconds: 30
          periodSeconds: 10
        readinessProbe:
          httpGet:
            path: /actuator/health
            port: 8080
          initialDelaySeconds: 5
          periodSeconds: 5
---
apiVersion: v1
kind: Service
metadata:
  name: armsb-union-service
spec:
  selector:
    app: armsb-union-mocks
  ports:
  - port: 8080
    targetPort: 8080
  type: ClusterIP
```

### Secret for Admin Password
```bash
oc create secret generic mock-admin-secret --from-literal=password=your-secret-password
```

### Route Configuration
```bash
oc expose service armsb-union-service
```

## Monitoring & Logging

### Log Management
- **File Location**: `logs/armsb-union.log`
- **Rolling Policy**: Daily rotation, max 100MB per file, 30-day retention
- **Dynamic Levels**: Configurable through Actuator endpoints

### Metrics Collection
- **Prometheus**: Available at `/actuator/prometheus`
- **Custom Metrics**: Request counts, response times per stub
- **JVM Metrics**: Memory, threads, garbage collection

### Health Checks
- **Application**: `/actuator/health`
- **Individual Stubs**: `/stub01/health` to `/stub10/health`
- **Docker**: Built-in health check every 30 seconds

## Development & Customization

### Adding New Endpoints
1. Create controller method in appropriate stub controller
2. Add corresponding JSON response file
3. Update documentation

### Custom Business Logic
Each stub has its own service class for specialized logic:
```java
@Service
public class Stub01Service {
    public String processRequest(String requestBody) {
        // Custom business logic here
        return "processed result";
    }
}
```

### Mock State Persistence
States are automatically saved to `mock-states.json`:
```json
{
  "stub01": {
    "mockId": "stub01",
    "enabled": true,
    "lastModified": 1640995200000,
    "responseFilePath": null
  }
}
```

## Troubleshooting

### Common Issues

**Application Won't Start**
- Check Java version (requires 8+)
- Verify port 8080 availability
- Check logs in `logs/armsb-union.log`

**Mock Not Responding**
- Verify mock is enabled via `/management/mocks`
- Check response file exists in `responses/` directory
- Review application logs for errors

**Authentication Issues**
- Verify admin credentials in configuration
- Check Security configuration logs
- Ensure proper role assignment

### Debug Mode
Enable debug logging:
```bash
java -Dlogging.level.sb1.stub.union=DEBUG -jar target/armsb-union-10modulestubs.jar
```

### Support Commands
```bash
# View all endpoints
curl -u admin:admin http://localhost:8080/actuator/mappings

# Check configuration
curl -u admin:admin http://localhost:8080/actuator/configprops

# Environment info
curl -u admin:admin http://localhost:8080/actuator/env
```

## Architecture

### Project Structure
```
src/
├── main/java/sb1/stub/union/
│   ├── Application.java                 # Main Spring Boot application
│   ├── common/
│   │   ├── config/SecurityConfig.java   # Security configuration
│   │   ├── controller/MockManagement... # Management API
│   │   ├── model/ApiResponse.java       # Common models
│   │   └── service/MockManagement...    # Core services
│   └── stub01-stub10/
│       ├── controller/                  # Stub controllers
│       └── service/                     # Stub services
└── main/resources/
    ├── application.yml                  # Main configuration
    └── logback-spring.xml              # Logging configuration
```

### Technology Stack
- **Java**: 8
- **Spring Boot**: 2.6.4
- **Spring Boot Admin**: 2.6.2
- **Spring Security**: Basic Authentication
- **Actuator**: Monitoring endpoints
- **Micrometer**: Metrics collection
- **Logback**: Centralized logging
- **Jackson**: JSON processing
- **Maven**: Build management
- **Docker**: Containerization

## License
This project is licensed under the MIT License - see the LICENSE file for details.

---

For additional support or questions, please refer to the project documentation or create an issue in the repository.