package sb1.stub.client_cti.dummy.data.hardcode;

public class Jsons {
    public static String errorRequest() {
        return "{\n" +
                "    \"status\": \"Error\"\n" +
                "    \"comment\": \"Need signature in request. Требуется сигнатура в запросе\"\n" +
                "}";
    }

    public static String getCommunications() {
        return "{\n" +
                "  \"jsonrpc\": \"2.0\",\n" +
                "  \"id\": 2.0,\n" +
                "  \"result\": [\n" +
                "    {\n" +
                "      \"employeeId\": \"351399f9-4886-47c2-bbf9-6098fbe1a1ed\",\n" +
                "      \"businessId\": \"ПАО Сбербанк РФ|00447008|eMailSigma\",\n" +
                "      \"code\": \"eMailSigma\",\n" +
                "      \"name\": \"email Sigma\",\n" +
                "      \"communicationString\": \"SBTSHCHNY-RP@SBERBANK.RU\",\n" +
                "      \"extraCommunicationString\": null,\n" +
                "      \"isFavorite\": false,\n" +
                "      \"isActive\": true,\n" +
                "      \"description\": null,\n" +
                "      \"lastChangeDate\": \"2021-11-11T12:06:53.588\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"employeeId\": \"351399f9-4886-47c2-bbf9-6098fbe1a1ed\",\n" +
                "      \"businessId\": \"ПАО Сбербанк РФ|00447008|eMailAlpha\",\n" +
                "      \"code\": \"eMailAlpha\",\n" +
                "      \"name\": \"email Alpha\",\n" +
                "      \"communicationString\": \"SBTSHCHNY-RP@OMEGA.SBRF.RU\",\n" +
                "      \"extraCommunicationString\": null,\n" +
                "      \"isFavorite\": false,\n" +
                "      \"isActive\": true,\n" +
                "      \"description\": null,\n" +
                "      \"lastChangeDate\": \"2021-11-11T12:06:53.588\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"employeeId\": \"351399f9-4886-47c2-bbf9-6098fbe1a1ed\",\n" +
                "      \"businessId\": \"ПАО Сбербанк РФ|00447008|CellPhone\",\n" +
                "      \"code\": \"CellPhone\",\n" +
                "      \"name\": \"Мобильный телефон\",\n" +
                "      \"communicationString\": \"+7 916 520 66 19\",\n" +
                "      \"extraCommunicationString\": null,\n" +
                "      \"isFavorite\": false,\n" +
                "      \"isActive\": true,\n" +
                "      \"description\": null,\n" +
                "      \"lastChangeDate\": \"2021-12-09T10:56:03.491\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

    public static String getClientPhones() {
        return "{\n" +
                "    \"phoneNumbers\": [\n" +
                "        {\n" +
                "            \"contactStatusPhone\": 1,\n" +
                "            \"usageTypePhone\": 14,\n" +
                "            \"phoneNumber\": \"+7 (980) 0905233\",\n" +
                "            \"updateDateTime\": \"31-05-2024\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"flagType\": [\n" +
                "                54,\n" +
                "                52,\n" +
                "                7,\n" +
                "                17,\n" +
                "                14,\n" +
                "                16\n" +
                "            ],\n" +
                "            \"contactStatusPhone\": 1,\n" +
                "            \"usageTypePhone\": 15,\n" +
                "            \"phoneNumber\": \"+7 (980) 0905233\",\n" +
                "            \"updateDateTime\": \"26-12-2024\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"contactStatusPhone\": 1,\n" +
                "            \"usageTypePhone\": 16,\n" +
                "            \"phoneNumber\": \"+7 (927) 6509387\",\n" +
                "            \"updateDateTime\": \"31-05-2024\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"SUCCESS\"\n" +
                "}";
    }

    public static String initCall() {
        return "{\n" +
                "  \"status\": \"success\",\n" +
                "  \"reason\": \"\"\n" +
                "}";
    }

    public static String addressBook() {
        return "[{\"type\":\"Mobile\",\"number\":null,\"isMain\":false,\"isHidden\":true,\"isVerified\":true},{\"type\":\"Inner\",\"number\":\"8-88888888\",\"isMain\":true,\"isHidden\":false,\"isVerified\":true},{\"type\":\"Other\",\"number\":\"89157777777\",\"isMain\":false,\"isHidden\":false,\"isVerified\":false}]";
    }

    public static String employee() {
        return "{\n" +
                "    \"success\": true,\n" +
                "    \"body\": {\n" +
                "        \"employeeInfoDto\": {\n" +
                "            \"lastName\": \"Тестов\",\n" +
                "            \"firstName\": \"Тест\",\n" +
                "            \"middleName\": \"Рук\",\n" +
                "            \"personalNumber\": \"01234767\",\n" +
                "            \"sudirGroups\": [\n" +
                "                \"EFS_VIP_HEAD\",\n" +
                "                \"EFS_VIP_CA\"\n" +
                "            ],\n" +
                "            \"channel\": \"WEB_SBOLPRO\",\n" +
                "            \"login\": \"shmidt-a-head2\",\n" +
                "            \"tbank\": \"038\",\n" +
                "            \"branch\": \"9038\",\n" +
                "            \"office\": \"1665\",\n" +
                "            \"subbranchCode\": \"38903801665\",\n" +
                "            \"branchName\": \"Доп.офис №9038/1665\",\n" +
                "            \"isWorkShift\": false,\n" +
                "            \"identifierSessionEmployee\": \"fd240c5d-5fc8-4242-9352-87e204b49b1c\",\n" +
                "            \"position\": \"Руководитель ВИП-ВСП\",\n" +
                "            \"sudirsegment\": \"ALPHA\",\n" +
                "            \"sessionId\": \"zmebAQ32SoWWUK5-2nWG_GCdhrW1B9cV_xZU4mxDdU5S0Lf37pLzLodgMuXOi2nR\",\n" +
                "            \"authToken\": \"Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJXTEY1ZXl3VXZ3WmZmVWJObGVDcGlpVWY3WENSQW5RUGRCQmFYNHRkZVBzIn0.eyJleHAiOjE3MzQzNjE3ODUsImlhdCI6MTczNDM0NTU4NiwiYXV0aF90aW1lIjoxNzM0MzQ1NTg1LCJqdGkiOiI5NzgwZGY5Mi03YmFjLTRiZGQtYTk1Mi01MWJhOGU1OTdiN2MiLCJpc3MiOiJodHRwczovL2lkcDAxLmF1dGgtYWxwaGEtaWZ0LmRlbHRhLnNicmYucnUvYXV0aC9yZWFsbXMvYWxwaGEiLCJhdWQiOiJDSTAzMTk0Mzk0Iiwic3ViIjoic2htaWR0LWEtaGVhZDIiLCJ0eXAiOiJJRCIsImF6cCI6IkNJMDMxOTQzOTQiLCJub25jZSI6IjVmNGQ4MWY5Y2ZkYjRhYzg2MjQ1OWE2YWU0NTIxOWJmIiwic2Vzc2lvbl9zdGF0ZSI6ImVmNDFkN2ViLTk3YzgtNDk0ZS1hMDI1LWNjNGIwM2VhZDI0ZCIsImF0X2hhc2giOiIyLURTaWtpQ0VFN0JnUURhRTFoV3FRIiwic2lkIjoiZWY0MWQ3ZWItOTdjOC00OTRlLWEwMjUtY2M0YjAzZWFkMjRkIiwiYnJhbmNoY29kZSI6IjkwMzgiLCJlbXBsb3llZW51bWJlciI6IjIzMjg5MCIsInN1YmJyYW5jaGNvZGUiOiIwNTY2IiwiZ3JvdXBzIjpbIkVGU19WSVBfSEVBRCJdLCJsYXN0ZmFpbGFjY2Vzc2RhdGUiOiIyMDI0LTEyLTE2VDA3OjIwOjAwIiwiZ2l2ZW5fbmFtZSI6ItCQ0LvQtdC60YHQtdC5IiwicGF0cm9ueW1pYyI6ItCg0KPQmjIiLCJsYXN0YWNjZXNzZGF0ZSI6IjIwMjQtMTItMTZUMTA6MzE6MDAiLCJidXNpbmVzc2NhdGVnb3J5IjoiMzg5MDM4MDA1NjYiLCJzYmVycGRpIjoiMTExMjg5MjQiLCJoY21jb2RlIjoiU0FQIiwiYWNjZXNzbGlzdCI6WyJkYzczYmUzOC02YjRmLTQ1ZjQtODA5OS1kZGJhZjc2MzBjNWIiLCJjNzM0ODU2Yi1kNjAyLTQ5MDYtYTg3OS1hNjBkYmJiYjA2MWUiXSwiZGVwYXJ0bWVudG51bWJlciI6IjEzODExNTY2IiwiZmFtaWx5X25hbWUiOiLQqNC80LjQtNGCIiwiZW1haWwiOiJhcnVrMnNobWlkdEBvbWVnYS5zYnJmLnJ1IiwidGJjb2RlIjoiMzgifQ.PaZAZYUlZVOpo36ipb5-iUJeYJ6pSgcWhOsVwh4JNDG9bjvfEhcS6V2foemdkjWxPDj5xOFVQ_IxBLQXE51jm8oJ_n9e6isv6Q3G3754_ha8Kv9ExLTErkCMxUVCycclahiJB2nqu59YuxYTkivicHHcnmbtnplk745OqlKc9Teu_WfiIFZRW3M5UBwo344-8-IBjrQL6h9fglizr9WMW6d2NQwFT5l83lhVyQuVR6awxIyKzSwpUmFXppMj2XeaictjhmAxd_ZdhQrSFg_shVTxk4botsRmtVJvhMT-cpxnfuFZmFZsfMkzptP2PUuKyjIH_8kAOMkMfzi0wE4F1A\",\n" +
                "            \"sudirSubbranchCode\": \"38903801665\",\n" +
                "            \"ipAddress\": \"10.6.210.110\"\n" +
                "        },\n" +
                "        \"vspInfoDto\": {\n" +
                "            \"isOneHand\": false,\n" +
                "            \"isVip\": false,\n" +
                "            \"vipType\": \"\",\n" +
                "            \"timeZone\": 3,\n" +
                "            \"subAddress\": \"г.Москва, Хорошевское шоссе, д. 27\",\n" +
                "            \"businessFormat\": \"БО, ,УВСП\",\n" +
                "            \"vspType\": \"mass\"\n" +
                "        },\n" +
                "        \"uovInfoDto\": {\n" +
                "            \"isOdOpen\": false,\n" +
                "            \"isZk\": false,\n" +
                "            \"operDay\": \"2024-12-16\",\n" +
                "            \"timeZone\": 3,\n" +
                "            \"tb\": 38,\n" +
                "            \"osb\": 9038,\n" +
                "            \"vsp\": 1665,\n" +
                "            \"divisionId\": \"38903801665\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

    public static String positionsGet() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    },\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"staffUnitId\": \"ea5a7b21-0cd9-4ca9-9b8d-8d0a4bf670a9\",\n" +
                "            \"version\": 10,\n" +
                "            \"channel\": \"VIP\",\n" +
                "            \"ossCode\": \"34389397\",\n" +
                "            \"ossPositionCode\": \"20000460\",\n" +
                "            \"fosCode\": \"3\",\n" +
                "            \"fosElementId\": \"21f97ba7-893f-4819-8983-32c2f54abe54\",\n" +
                "            \"groupCode\": \" \",\n" +
                "            \"divisionCode\": \"38903800566\",\n" +
                "            \"parentGroupCode\": \" \",\n" +
                "            \"fosType\": \"BIZ\",\n" +
                "            \"businessRole\": \"РУК\",\n" +
                "            \"employeeNumber\": \"00232890\",\n" +
                "            \"isFosHead\": true,\n" +
                "            \"changedBy\": \"FIX_03.03.2025\",\n" +
                "            \"status\": \"ACTIVE\",\n" +
                "            \"teamId\": [\n" +
                "                \"01d7de4c-dd9a-44e7-a276-975fbc1a0f7a\"\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String setNotification() {
        return "{\n" +
                "    \"status\": \"success\",\n" +
                "    \"states\": [\n" +
                "        {\n" +
                "            \"status_a\": {\n" +
                "                \"code\": 100,\n" +
                "                \"status\": \"Trying\"\n" +
                "            },\n" +
                "            \"status_b\": {\n" +
                "                \"code\": 0,\n" +
                "                \"status\": \"\"\n" +
                "            },\n" +
                "            \"uuid\": \"b36a8162-3747-47cf-8804-5b5c26d42056\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"status_a\": {\n" +
                "                \"code\": 200,\n" +
                "                \"status\": \"OK\"\n" +
                "            },\n" +
                "            \"status_b\": {\n" +
                "                \"code\": 100,\n" +
                "                \"status\": \"Trying\"\n" +
                "            },\n" +
                "            \"uuid\": \"b36a8162-3747-47cf-8804-5b5c26d42056\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"status_a\": {\n" +
                "                \"code\": 200,\n" +
                "                \"status\": \"OK\"\n" +
                "            },\n" +
                "            \"status_b\": {\n" +
                "                \"code\": 200,\n" +
                "                \"status\": \"OK\"\n" +
                "            },\n" +
                "            \"uuid\": \"b36a8162-3747-47cf-8804-5b5c26d42056\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String pprbNotification() {
        return "{\n" +
                "  \"rqTm\": \"2023-05-26T08:34:32.224+03:00\",\n" +
                "  \"rqUid\": \"20202ba24265445da9071e3e6413d28f\",\n" +
                "  \"timestamp\": \"2023-02-15T15:50:06.838+00:00\"\n" +
                "}";
    }

}
