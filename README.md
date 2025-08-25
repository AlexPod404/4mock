# ARMSB Union 10 Module Stubs

Данный проект содержит заглушки для модулей системы АРМ СБ1.

## Структура проекта

Проект переименован согласно требованиям и теперь содержит следующие 7 подмодулей:

### Основные модули (первые 7 stub-ов)

1. **armsb_client_card** (ранее stub01)
   - Порт: 8010
   - Назначение: Заглушка для "Карточка клиента (CI03259032) - сервисы"
   - Пакет: `sb1.stub.armsb_client_card`

2. **armsb_clients** (ранее stub02)
   - Порт: 8001
   - Назначение: Заглушка для "АРМ СБ1. Клиенты (CI02750597) - сервисы"
   - Пакет: `sb1.stub.armsb_clients`

3. **armsb_cti** (ранее stub03)
   - Порт: 8020
   - Назначение: Заглушка для CTI-сервисов
   - Пакет: `sb1.stub.armsb_cti`

4. **armsb_tasks** (ранее stub04)
   - Порт: 8030
   - Назначение: Заглушка для сервисов задач
   - Пакет: `sb1.stub.armsb_tasks`

5. **assistant_sber_one** (ранее stub05)
   - Порт: 8050
   - Назначение: Заглушка для "Assistant Sber One - сервисы"
   - Пакет: `sb1.stub.assistant_sber_one`

6. **armsb_calendar** (ранее stub06)
   - Порт: 8060
   - Назначение: Заглушка для "АРМ СБ1. Календарь - сервисы"
   - Пакет: `sb1.stub.armsb_calendar`

7. **armsb_core** (ранее stub07)
   - Порт: 8070
   - Назначение: Заглушка для "АРМ СБ1. Ядро - сервисы"
   - Пакет: `sb1.stub.armsb_core`

## Сборка проекта

### Предварительные требования
- Java 11 или выше
- Maven 3.6 или выше

### Команды для сборки

```bash
# Полная сборка всех модулей
mvn clean compile

# Сборка с созданием JAR файлов
mvn clean package -DskipTests

# Запуск отдельного модуля
cd <module_name>
mvn spring-boot:run

# Например, для запуска armsb_clients:
cd armsb_clients
mvn spring-boot:run
```

## Структура каждого модуля

Каждый модуль содержит стандартную структуру Spring Boot приложения:

```
module_name/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── sb1/
        │       └── stub/
        │           └── <module_package>/
        │               ├── Application.java
        │               └── dummy/
        │                   ├── data/
        │                   │   └── hardcode/
        │                   │       └── Jsons.java
        │                   └── webservice/
        │                       └── WebController.java
        └── resources/
            └── application.properties
```

## Изменения в рамках переименования

### Выполненные изменения:
1. ✅ Создан родительский pom.xml для управления зависимостями
2. ✅ Переименованы и исправлены пакеты в существующих модулях:
   - armsb_client_card: `sb1.stub.client_card` → `sb1.stub.armsb_client_card`
   - armsb_cti: `sb1.stub.client_cti` → `sb1.stub.armsb_cti`
3. ✅ Созданы недостающие модули:
   - assistant_sber_one
   - armsb_calendar
   - armsb_core
4. ✅ Обновлены все import statements и references
5. ✅ Настроены уникальные порты для каждого модуля
6. ✅ Проверена сборка и запуск всех модулей

### Функциональность
Каждый модуль предоставляет REST API endpoints с предконфигурированными JSON-ответами и настраиваемой задержкой ответа (по умолчанию 100ms).

Для изменения задержки используется endpoint:
```
POST /<module_context>/setDelta/{delta}
```

Где `{delta}` - время задержки в миллисекундах.

## Технические особенности
- Spring Boot 2.7.0
- Java 11
- Lombok для упрощения кода
- Apache Commons IO и Lang3
- Встроенный Tomcat сервер

## Запуск в production
Каждый модуль может быть запущен как standalone JAR:

```bash
java -jar target/<module_name>-1.0.0.jar
```

## Следующие шаги
Оставшиеся 3 stub-модуля (stub08, stub09, stub10) будут обработаны позднее согласно требованиям.