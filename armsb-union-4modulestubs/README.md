# ARMSB Union 4 Module Stubs

<p align="center">
  <b>Объединенная заглушка для четырех ARMSB сервисов</b>
</p>

## Описание

Единое Spring Boot приложение, объединяющее четыре отдельных мока:
1. **Mock1** (/mock1) - Карточка клиента (CI03259032) - порт 8010 → /mock1/*
2. **Mock2** (/mock2) - АРМ СБ1. Клиенты (CI02750597) - порт 8001 → /mock2/*  
3. **Mock3** (/mock3) - CTI (CI03239703) - порт 8020 → /mock3/*
4. **Mock4** (/mock4) - Лента задач (CI02750599) - порт 8030 → /mock4/*

## Технические характеристики

- **Java**: 1.8 (JDK 1.8)
- **Spring Boot**: 2.6.4
- **Порт**: 8080 (единый для всех моков)
- **JAR**: armsb-union-4modulestubs.jar

## Запуск

```bash
# Сборка
mvn clean package

# Запуск
java -jar target/armsb-union-4modulestubs.jar

# Альтернативный запуск через Maven
mvn spring-boot:run
```

## Структура endpoints

### Mock1 (Client Card) - /mock1/*
- `GET /mock1/getDelta` - получить текущую задержку
- `POST /mock1/setDelta/{delta}` - установить задержку  
- `POST /mock1/teams/get` - получить команды
- `POST /mock1/clients/getClientCardFromCRMandEPK` - получить карточку клиента
- `POST /mock1/services/create-structure` - создать структуру (ECM)
- И другие endpoints...

### Mock2 (Clients) - /mock2/*
- `GET /mock2/getDelta` - получить текущую задержку
- `POST /mock2/setDelta/{delta}` - установить задержку
- `POST /mock2/clients/srvgetclientlist` - список клиентов
- `POST /mock2/clients/pprbBhepService` - PPRB BHEP сервис
- `POST /mock2/clients/ucpclients` - UCP клиенты
- И другие endpoints...

### Mock3 (CTI) - /mock3/*
- `GET /mock3/getDelta` - получить текущую задержку  
- `POST /mock3/setDelta/{delta}` - установить задержку
- `GET /mock3/cti/getCommunications` - получить коммуникации
- `GET /mock3/cti/getClientPhones` - получить телефоны клиента
- `GET /mock3/cti/call/init` - инициализация звонка
- И другие endpoints...

### Mock4 (Tasks) - /mock4/*
- `GET /mock4/getDelta` - получить текущую задержку
- `POST /mock4/setDelta/{delta}` - установить задержку  
- `POST /mock4/tasks/teams/get` - получить команды задач
- `POST /mock4/tasks/getByFilter` - получить задачи по фильтру
- `POST /mock4/tasks/marking/check` - проверка маркировки
- И другие endpoints...

## Изоляция

Каждый мок изолирован в отдельном пакете:
- `sb1.stub.union.mock1.*` - client_card функциональность
- `sb1.stub.union.mock2.*` - clients функциональность  
- `sb1.stub.union.mock3.*` - cti функциональность
- `sb1.stub.union.mock4.*` - tasks функциональность

Конфликты между одинаковыми endpoints разрешены через path-префиксы.

## Примеры использования

```bash
# Тест задержки для mock1
curl http://localhost:8080/mock1/getDelta

# Получить команды в mock1 
curl -X POST -H "Content-Type: application/json" -d '{}' http://localhost:8080/mock1/teams/get

# Получить коммуникации CTI в mock3
curl http://localhost:8080/mock3/cti/getCommunications

# Получить клиентов UCP в mock2
curl -X POST -H "Content-Type: application/json" -d '{"ucpIds":[123,456]}' http://localhost:8080/mock2/clients/ucpclients
```

Ответы приходят с настраиваемой задержкой (по умолчанию 100ms).