# ARMSB Union Module Stubs

Унифицированный модуль заглушек, объединяющий функциональность из четырех отдельных модулей:
- `armsb_client_card`
- `armsb_clients` 
- `armsb_cti`
- `armsb_tasks`

## Архитектура

Все модули объединены в одно Spring Boot приложение с единым портом 8080 и маршрутизацией по префиксам:

- **`/clientcard`** - эндпоинты из модуля `armsb_client_card`
- **`/clients`** - эндпоинты из модуля `armsb_clients`
- **`/cti`** - эндпоинты из модуля `armsb_cti`  
- **`/tasks`** - эндпоинты из модуля `armsb_tasks`

## Структура проекта

```
armsb-union-modulestubs/
├── src/main/java/sb1/stub/union/
│   ├── Application.java                    # Главный класс приложения
│   ├── clientcard/
│   │   ├── controller/
│   │   │   └── ClientCardController.java   # Контроллер с префиксом /clientcard
│   │   └── data/
│   │       └── Jsons.java                  # JSON-данные для заглушек clientcard
│   ├── clients/
│   │   ├── controller/
│   │   │   └── ClientsController.java      # Контроллер с префиксом /clients
│   │   └── data/
│   │       └── Jsons.java                  # JSON-данные для заглушек clients
│   ├── cti/
│   │   ├── controller/
│   │   │   └── CtiController.java          # Контроллер с префиксом /cti
│   │   └── data/
│   │       └── Jsons.java                  # JSON-данные для заглушек cti
│   └── tasks/
│       ├── controller/
│       │   └── TasksController.java        # Контроллер с префиксом /tasks
│       └── data/
│           └── Jsons.java                  # JSON-данные для заглушек tasks
├── src/main/resources/
│   └── application.properties              # server.port=8080
└── pom.xml                                 # Объединенные зависимости
```

## Требования

- **JDK 1.8**
- **Spring Boot 2.6.4**
- **Maven 3.x**

## Сборка и запуск

### Сборка проекта

```bash
mvn clean compile
```

### Запуск приложения

```bash
mvn spring-boot:run
```

Приложение запустится на порту **8080**.

### Создание JAR-файла

```bash
mvn clean package
java -jar target/armsb-union-modulestubs-1.0.0.jar
```

## Эндпоинты

### Client Card модуль (/clientcard)

- `GET /clientcard/sbpemployeeinfo/v1/employee`
- `POST /clientcard/positions/get`
- `POST /clientcard/clients/getClientCardFromCRMandEPK/rest/v1/context`
- `POST /clientcard/employee/com.sbt.bpspe.core.json.rpc.api.Employee`
- `POST /clientcard/send`
- `POST /clientcard/getCompanies`
- `POST /clientcard/getInfoByCompanyId`
- `POST /clientcard/teams/get`
- `POST /clientcard/clients/getClientCardFromCRMandEPK`
- `POST /clientcard/services/create-structure`
- `POST /clientcard/sbolpro/netscanbh/v1/file/setRegionConfig`
- `GET /clientcard/setDelta/{delta}` - установка задержки
- `GET /clientcard/getDelta` - получение текущей задержки

### Clients модуль (/clients)

- `POST /clients/srvgetclientlist`
- `POST /clients/armsb/clients/v1/rest/getClientsForMassMailing`
- `POST /clients/tasks/get`
- `POST /clients/srvgetclientlist/clients/searchByLastName`
- `POST /clients/pprbBhepService`
- `POST /clients/pprbClients/clients/getByTeamId`
- `POST /clients/teams/get`
- `POST /clients/ucpclients/clients/get`
- `POST /clients/employee/com.sbt.bpspe.core.json.rpc.api.Employee`
- `POST /clients/pprbClients`
- `POST /clients/ucpclients`
- `GET /clients/sbpemployeeinfo/v1/employee`
- `GET /clients/setDelta/{delta}` - установка задержки
- `GET /clients/getDelta` - получение текущей задержки

### CTI модуль (/cti)

- `GET /cti/getCommunications`
- `GET /cti/getClientPhones`
- `GET /cti/call/init`
- `GET /cti/employees/{fullEmployeeNumber}/phones`
- `GET /cti/sbpemployeeinfo/v1/employee`
- `GET /cti/positions/get`
- `GET /cti/setNotification`
- `GET /cti/pprbNotification`
- `GET /cti/setDelta/{delta}` - установка задержки
- `GET /cti/getDelta` - получение текущей задержки

### Tasks модуль (/tasks)

- `GET /tasks/sbpemployeeinfo/v1/employee`
- `POST /tasks/clients/getByTeamId`
- `POST /tasks/clients/get`
- `POST /tasks/templates/get`
- `POST /tasks/templates/getFilters`
- `POST /tasks/templates/update`
- `POST /tasks/getByFilter`
- `POST /tasks/getTaskById`
- `POST /tasks/offers`
- `POST /tasks/getFilters`
- `POST /tasks/marking/getById`
- `POST /tasks/data-dictionary-service/rest/pm/ver.4.0/getRows`
- `POST /tasks/values/get`
- `POST /tasks/values/update`
- `POST /tasks/getGeneralCounters`
- `POST /tasks/getCountersByClients`
- `POST /tasks/positions/get`
- `POST /tasks` - основной эндпоинт для различных операций
- `POST /tasks/teams/get`
- `POST /tasks/marking/check`
- `POST /tasks/teams/free`
- `POST /tasks/marking/getByClient`
- `GET /tasks/setDelta/{delta}` - установка задержки
- `GET /tasks/getDelta` - получение текущей задержки

## Конфигурация задержки

Каждый модуль поддерживает настройку задержки ответов:

- **Установка задержки:** `GET /{module}/setDelta/{milliseconds}`
- **Получение задержки:** `GET /{module}/getDelta`

Где `{module}` может быть: `clientcard`, `clients`, `cti`, `tasks`

Пример:
```bash
curl http://localhost:8080/clients/setDelta/500  # установить задержку 500мс для модуля clients
curl http://localhost:8080/tasks/getDelta        # получить текущую задержку модуля tasks
```

## Особенности

1. **Независимость модулей** - каждый модуль работает независимо, даже при наличии одинаковых путей
2. **Сохранена логика** - вся бизнес-логика из оригинальных модулей сохранена без изменений
3. **Единая точка входа** - все заглушки доступны через один порт 8080
4. **Маршрутизация по префиксам** - четкое разделение по функциональным областям

## Миграция с отдельных модулей

При переходе с отдельных модулей на объединенный:

1. **armsb_client_card** (порт 8010) → **armsb-union-modulestubs** (порт 8080) + префикс `/clientcard`
2. **armsb_clients** (порт 8001) → **armsb-union-modulestubs** (порт 8080) + префикс `/clients`  
3. **armsb_cti** (порт 8020) → **armsb-union-modulestubs** (порт 8080) + префикс `/cti`
4. **armsb_tasks** (порт 8030) → **armsb-union-modulestubs** (порт 8080) + префикс `/tasks`

Примеры:
- `http://localhost:8010/teams/get` → `http://localhost:8080/clientcard/teams/get`
- `http://localhost:8001/clients/teams/get` → `http://localhost:8080/clients/teams/get`
- `http://localhost:8020/cti/getCommunications` → `http://localhost:8080/cti/getCommunications`
- `http://localhost:8030/tasks/getByFilter` → `http://localhost:8080/tasks/getByFilter`