package sb1.stub.client_card.dummy.data.hardcode;

public class Jsons {
    public static String errorRequest() {
        return "{\n" +
                "    \"status\": \"Error\"\n" +
                "    \"comment\": \"Need signature in request. Требуется сигнатура в запросе\"\n" +
                "}";
    }

    public static String getSbpContextInit() {
        return "{\n" +
                "    \"success\": true,\n" +
                "    \"body\": {\n" +
                "        \"sbpcontext_token\": \"12345678\"\n" +
                "    }\n" +
                "}";
    }

    public static String getClientCard_new() {
        return "{\n" +
                "  \"status\" : {\n" +
                "    \"code\" : 0,\n" +
                "    \"message\" : \"не найдено ни одной команды по указанному номеру ВСП\"\n" +
                "  },\n" +
                "  \"data\" : [ {\n" +
                "    \"version\" : 3,\n" +
                "    \"channel\" : \"PREMIER\",\n" +
                "    \"ossCode\" : \"52168009\",\n" +
                "    \n" +
                "    \"fosCode\" : \"NASHR\",\n" +
                "    \"fosElementId\" : \"2ca43483-5eee-4c8e-a8dc-1c63d2a0d289\",\n" +
                "    \"groupCode\" : \"61519609\",\n" +
                "    \"divisionCode\" : \"38\",\n" +
                "    \"parentGroupCode\" : \"61519609\",\n" +
                "    \"fosType\" : \"BIZ\",\n" +
                "    \"isFosHead\" : false,\n" +
                "    \"changedBy\" : \"Sidoroff\",\n" +
                "    \"employeeNumber\" : \"1041992\"\n" +
                "  } ]\n" +
                "}";
    }

    public static String getClientCardFromCRM() {
        return "{\n" +
                "    \"data\": {\n" +
                "        \"teams\": [\n" +
                "            {\n" +
                "                \"divisionCode\": \"38903800566\",\n" +
                "                \"kmCode\": \"3890380566301\",\n" +
                "                \"id\": \"01d7de4c-dd9a-44e7-a276-975fbc1a0f7a\",\n" +
                "                \"status\": \"ACTIVE\",\n" +
                "                \"channel\": \"VIP\",\n" +
                "                \"link\": {\n" +
                "                    \"name\": \"MAIN\",\n" +
                "                    \"description\": \"Основная\",\n" +
                "                    \"id\": \"a1b7c331-db3f-4830-b676-a95f299a6d76\"\n" +
                "                },\n" +
                "                \"type\": \"DEF\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"criteria\": {\n" +
                "            \"id\": \"8051b304-73a4-4907-abad-82b4eafece39\",\n" +
                "            \"date\": \"2024-05-06T17:09:18.257999+03:00\",\n" +
                "            \"changedBy\": \"00232890|Шмидт Алексей Рук\"\n" +
                "        },\n" +
                "        \"segment\": \"3\",\n" +
                "        \"sourceId\": \"9c638c89-1e5f-4f16-8686-e52efc38bcf0\",\n" +
                "        \"epkId\": \"1522386767666076272\",\n" +
                "        \"version\": 3,\n" +
                "        \"status\": \"ACTIVE\",\n" +
                "        \"engagement\": {},\n" +
                "        \"balance\": {},\n" +
                "        \"changedBy\": \"00232890|Шмидт Алексей Рук\",\n" +
                "        \"lastChangeDate\": \"2024-05-06T17:09:18.258912+03:00\",\n" +
                "        \"createDate\": \"2022-11-23T12:27:24.053416+03:00\",\n" +
                "        \"isDead\": false\n" +
                "    },\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    }\n" +
                "}";
    }

    public static String getClientCardFromCRM_ORIGINAL() {
        return "{\n" +
                "    \"headerInfo\": {\n" +
                "        \"rqUID\": \"188ab4c170e54447966f27a72fa7de1d\",\n" +
                "        \"rqTm\": \"02/17/2022 14:03:42\",\n" +
                "        \"spName\": \"urn:sbrfsystems:99-crm\",\n" +
                "        \"systemId\": \"urn:sbrfsystems:99-ufs-sr\",\n" +
                "        \"errorCode\": \"SUCCESS\",\n" +
                "        \"errorMessage\": \"Запрос успешно обработан\"\n" +
                "    },\n" +
                "    \"clientCardAccessInfo\": {\n" +
                "        \"employee\": {\n" +
                "            \"number\": \"01041992\",\n" +
                "            \"profileCode\": \"Руководитель VIP ВСП\",\n" +
                "            \"vspCode\": \"01780\",\n" +
                "            \"tbCode\": \"38\"\n" +
                "        },\n" +
                "        \"client\": {\n" +
                "            \"epkId\": \"091234567890\",\n" +
                "            \"vspCode\": \"01780\",\n" +
                "            \"segment\": \"VIP\",\n" +
                "            \"tbCode\": \"38\",\n" +
                "            \"activeCompanion\": false,\n" +
                "            \"serviceTeams\": [\n" +
                "                {\n" +
                "                    \"type\": \"Main\",\n" +
                "                    \"employees\": [\n" +
                "                        {\n" +
                //"                            \"number\": \"196743\",\n" +
                "                            \"number\": \"NOT_FOUND\",\n" +
                "                            \"profileCode\": \"Менеджер VIP ВСП\",\n" +
                "                            \"vspCode\": \"01780\",\n" +
                "                            \"tbCode\": \"38\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"number\": \"01041992\",\n" +
                "                            \"profileCode\": \"Руководитель VIP ВСП\",\n" +
                //"                            \"vspCode\": \"01780\",\n" +
                "                            \"vspCode\": \"NOT_FOUND\",\n" +
                "                            \"tbCode\": \"38\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"number\": \"107835\",\n" +
                "                            \"profileCode\": \"Менеджер VIP ВСП\",\n" +
                "                            \"vspCode\": \"01780\",\n" +
                "                            \"tbCode\": \"38\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

    public static String getClientCardFromEPK() {
        return "{\n" +
                "    \"data\": {\n" +
                "        \"teams\": [\n" +
                "            {\n" +
                "                \"divisionCode\": \"38903800566\",\n" +
                "                \"kmCode\": \"3890380566301\",\n" +
                "                \"id\": \"01d7de4c-dd9a-44e7-a276-975fbc1a0f7a\",\n" +
                "                \"status\": \"ACTIVE\",\n" +
                "                \"channel\": \"VIP\",\n" +
                "                \"link\": {\n" +
                "                    \"name\": \"MAIN\",\n" +
                "                    \"description\": \"Основная\",\n" +
                "                    \"id\": \"a1b7c331-db3f-4830-b676-a95f299a6d76\"\n" +
                "                },\n" +
                "                \"type\": \"DEF\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"criteria\": {\n" +
                "            \"id\": \"8051b304-73a4-4907-abad-82b4eafece39\",\n" +
                "            \"date\": \"2024-05-06T17:09:18.257999+03:00\",\n" +
                "            \"changedBy\": \"00232890|Шмидт Алексей Рук\"\n" +
                "        },\n" +
                "        \"segment\": \"3\",\n" +
                "        \"sourceId\": \"9c638c89-1e5f-4f16-8686-e52efc38bcf0\",\n" +
                "        \"epkId\": \"1448061542566812842\",\n" +
                "        \"version\": 3,\n" +
                "        \"status\": \"ACTIVE\",\n" +
                "        \"engagement\": {},\n" +
                "        \"balance\": {},\n" +
                "        \"changedBy\": \"00232890|Шмидт Алексей Рук\",\n" +
                "        \"lastChangeDate\": \"2024-05-06T17:09:18.258912+03:00\",\n" +
                "        \"createDate\": \"2022-11-23T12:27:24.053416+03:00\",\n" +
                "        \"isDead\": false\n" +
                "    },\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    }\n" +
                "}\n";
    }

    public static String getClientCardFromEPK_ORGIGINAL() {
        return "{\n" +
                "    \"individual\": {\n" +
                "        \"name\": {\n" +
                "            \"firstName\": \"АЛЕКСЕЙ\",\n" +
                "            \"secondName\": \"АЛЕКСЕЕВ\",\n" +
                "            \"middleName\": \"АЛЕКСЕЕВИЧ\"\n" +
                "        },\n" +
                "        \"birthDate\": \"01-01-1991\",\n" +
                "        \"gender\": 1,\n" +
                "        \"emigration\": [\n" +
                "            181\n" +
                "        ],\n" +
                "        \"document\": [\n" +
                "            {\n" +
                "                \"documentNumber\": \"773334570168\",\n" +
                "                \"documentType\": 52,\n" +
                "                \"documentStatus\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"documentSeries\": \"15 06\",\n" +
                "                \"documentNumber\": \"125114\",\n" +
                "                \"documentType\": 17,\n" +
                "                \"documentStatus\": 1,\n" +
                "                \"issuedByOrganization\": \"ОВД РАЙОНА СОКОЛИНАЯ ГОРА\",\n" +
                "                \"issuerCode\": \"537-772\",\n" +
                "                \"issuedDate\": \"09-07-2020\",\n" +
                "                \"plannedEndDate\": \"01-01-2035\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"countryResident\": 181,\n" +
                "        \"partyGroups\": [\n" +
                "            3\n" +
                "        ],\n" +
                "        \"placesOfWork\": [\n" +
                "            {\n" +
                "                \"position\": \"СПЕЦИАЛИСТ\",\n" +
                "                \"placeOfWorkName\": \"ОАО АИСТ\"\n" +
                "            }\n" +
                "        ],\n" +
//отключить для новой фичи
                "       \"satellites\": [\n" +
                "           {\n" +
                "               \"ucpIdSatellite\": \"1495666500509381686\"\n" +
                "           }\n" +
                "        ],\n" +
//
                "        \"phoneNumbers\": [\n" +
                "            {\n" +
                "                \"flagType\": [\n" +
                "                    14,\n" +
                "                    16,\n" +
                "                    54,\n" +
                "                    58\n" +
                "                ],\n" +
                "                \"contactStatusPhone\": 1,\n" +
                "                \"usageTypePhone\": 15,\n" +
                "                \"phoneNumber\": \"+79851428311\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"flagType\": [\n" +
                "                    52,\n" +
                "                    7,\n" +
                "                    58\n" +
                "                ],\n" +
                "                \"contactStatusPhone\": 1,\n" +
                "                \"usageTypePhone\": 15,\n" +
                "                \"phoneNumber\": \"+79060335420\",\n" +
                "                \"updateDateTime\": \"17-02-2021\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"email\": [\n" +
                "            {\n" +
                "                \"contactStatusEmail\": 1,\n" +
                "                \"usageTypeEmail\": 12,\n" +
                "                \"electronicAddress\": \"MAIL@MAIL.RU\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"addresses\": [\n" +
                "            {\n" +
                "                \"contactStatusAddress\": 1,\n" +
                "                \"usageTypeAddress\": 2,\n" +
                "                \"line2\": \"125009, РОССИЯ, МОСКВА Г, Г МОСКВА, УЛ ТВЕРСКАЯ, Д 18\",\n" +
                "                \"country\": 181,\n" +
                "                \"postIndex\": \"125009\",\n" +
                "                \"regionCode\": 17,\n" +
                "                \"city\": \"МОСКВА\",\n" +
                "                \"street\": \"ТВЕРСКАЯ\",\n" +
                "                \"house\": \"18\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"equivalents\": [\n" +
                "            {\n" +
                "                \"externalSystem\": 73,\n" +
                "                \"externalSystemClientId\": \"43080061\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"externalSystem\": 84,\n" +
                "                \"externalSystemClientId\": \"4461844680\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"status\": \"SUCCESS\"\n" +
                "}";
    }

    public static String getSatelliteFromEPK() {
        return "{\n" +
                "	\"individual\": {\n" +
                "		\"name\": {\n" +
                "			\"firstName\": \"ПЕТР\",\n" +
                "			\"secondName\": \"ИВАНОВ\",\n" +
                "			\"middleName\": \"ЕГОРОВИЧ\"\n" +
                "		},\n" +
                "		\"birthDate\": \"01-01-1960\",\n" +
                "		\"partiesRelated\": [\n" +
                "			{\n" +
                "				\"relationType\": 61,\n" +
                "				\"isVipVsp\": true,\n" +
                "				\"isConfirmedLink\": true\n" +
                "			},\n" +
                "			{\n" +
                "				\"relationType\": 45,\n" +
                "				\"isVipVsp\": true,\n" +
                "				\"isConfirmedLink\": true\n" +
                "			}\n" +
                "		]\n" +
                "	},\n" +
                "	\"status\": \"SUCCESS\"\n" +
                "}";
    }

    public static String getUpdateCard() {
        return "{\n" +
                "\"status\": \"SUCCESS\"\n" +
                "}";
    }

    public static String getAddDelSatellite() {
        return "{\n" +
                "	\"individual\": {\n" +
                "		\"name\": {\n" +
                "			\"firstName\": \"ТИМОФЕЙ\",\n" +
                "			\"secondName\": \"СОСИПАТРОВ\",\n" +
                "			\"middleName\": \"КУКРИНКИНОВИЧВИЧ\"\n" +
                "		},\n" +
                "		\"birthDate\": \"26-07-1995\",\n" +
                "		\"partyToPartyGroups\": [\n" +
                "			1\n" +
                "		],\n" +
                "		\"partiesRelated\": [\n" +
                "			{\n" +
                "				\"relationType\": 46,\n" +
                "				\"isVipVsp\": true,\n" +
                "				\"isConfirmedLink\": true\n" +
                "			},\n" +
                "			{\n" +
                "				\"relationType\": 61,\n" +
                "				\"isVipVsp\": true,\n" +
                "				\"isConfirmedLink\": false\n" +
                "			}\n" +
                "		]\n" +
                "	},\n" +
                "	\"status\": \"SUCCESS\"\n" +
                "}";
    }

    public static String getNotesUpdate() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"string\"\n" +
                "    },\n" +
                "    \"data\": {\n" +
                "            \"id\": \"1234567\",\n" +
                "            \"version\": 0\n" +
                "        }\n" +
                "}";
    }

    public static String getNotesGet() {
        return "{\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"OK\"\n" +
                "	},\n" +
                "	\"data\": [\n" +
                "		{\n" +
                "			\"id\": \"8c75835a-b772-45ad-a947-42ecc6787557\",\n" +
                "			\"version\": 1,\n" +
                "			\"type\": \"PERSONAL\",\n" +
                "			\"label\": null,\n" +
                "			\"text\": \"курит кубинки Васяна Добавлена инфо 25.07 12:23 Проверка перед предпоказом htlfrnbh\",\n" +
                "			\"createDate\": \"2022-08-08T12:22:07.475289+03:00\",\n" +
                "			\"changedBy\": \"Главный Илья Борисович\",\n" +
                "			\"status\": \"ACTIVE\"\n" +
                "		},\n" +
                "		{\n" +
                "			\"id\": \"0c8e334b-5ba2-4725-a301-35a54a713209\",\n" +
                "			\"version\": 1,\n" +
                "			\"type\": \"PERSONAL\",\n" +
                "			\"label\": null,\n" +
                "			\"text\": \"курит кубинки Васяна Добавлена инфо 25.07 12:23 Проверка перед предпоказом\",\n" +
                "			\"createDate\": \"2022-08-08T12:14:04.463712+03:00\",\n" +
                "			\"changedBy\": \"JOB\",\n" +
                "			\"status\": \"ACTIVE\"\n" +
                "		},\n" +
                "		{\n" +
                "			\"id\": \"e5289db7-5a47-4b8b-9c30-6452ef01fac6\",\n" +
                "			\"version\": 1,\n" +
                "			\"type\": \"PERSONAL\",\n" +
                "			\"label\": null,\n" +
                "			\"text\": \"фывфыв\",\n" +
                "			\"createDate\": \"2022-08-08T12:13:51.464905+03:00\",\n" +
                "			\"changedBy\": \"Главный Илья Борисович\",\n" +
                "			\"status\": \"ACTIVE\"\n" +
                "		},\n" +
                "		{\n" +
                "			\"id\": \"0027e28b-59d4-4745-87e7-4b04ccb73f24\",\n" +
                "			\"version\": 1,\n" +
                "			\"type\": \"PERSONAL\",\n" +
                "			\"label\": null,\n" +
                "			\"text\": \"курит кубинки Васяна Добавлена инфо 25.07 12:23 Проверка перед предпоказом\",\n" +
                "			\"createDate\": \"2022-08-08T10:24:04.705555+03:00\",\n" +
                "			\"changedBy\": \"JOB\",\n" +
                "			\"status\": \"ACTIVE\"\n" +
                "		}\n" +
                "	]\n" +
                "}";
    }

    public static String getAdditionalInfo() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"string\"\n" +
                "    },\n" +
                "    \"data\": {\n" +
                "        \"segment\": 3,\n" +
                "        \"status\": \"ACTIVE\",\n" +
                "        \"note\": {\n" +
                "            \"createDate\": \"2022-08-08T12:22:07.475+03:00\",\n" +
                "            \"text\": \"курит кубинки Васяна Добавлена инфо 25.07 12:23\",\n" +
                "            \"changedBy\": \"Главный И. Б.\"\n" +
                "        },\n" +
                "        \"criteria\": {\n" +
                "            \"id\": \"8e3ca6ac-9ccc-48f9-b3fe-12ae91dc977c\"\n" +
                "        },\n" +
                "        \"teams\": [{\n" +
                "                \"id\": \"9c13e675-7760-47bd-b90e-5ba440c1fdb2\",\n" +
                "                \"kmCode\": \"3890381665300\",\n" +
                "                \"status\": \"ACTIVE\",\n" +
                "                \"divisionCode\": \"NOT_FOUND\",\n" +
                "                \"link\": {\n" +
                "                    \"id\": \"it_doesnt_matter\",\n" +
                "                    \"name\": \"MAIN\",\n" +
                "                    \"description\": \"Основная\"\n" +
                "                }\n" +
                "            },\n" +
                "        {\n" +
                "            \"id\": \"8e3ca6ac-9ccc-48f9-b3fe-12ae91dc977c\"\n" +
                "        },\n" +
                "        {\n" +
                "                \"id\": \"03a5812f-339a-4d43-a3c9-b5ee25d30027\",\n" +
                "                \"kmCode\": \"3890381665300\",\n" +
                "                \"status\": \"ACTIVE\",\n" +
                "                \"divisionCode\": \"NOT_FOUND\",\n" +
                "                \"link\": {\n" +
                "                    \"id\": \"it_doesnt_matter\",\n" +
                "                    \"name\": \"MAIN\",\n" +
                "                    \"description\": \"Основная\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    }

    public static String getTeamsGet() {
        return "{\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"\"\n" +
                "	},\n" +
                "	\"data\": [\n" +
                "		{\n" +
                "			\"id\": \"9c13e675-7760-47bd-b90e-5ba440c1fdb2\",\n" +
                "			\"kmCode\": \"3890381665300\",\n" +
                "			\"status\": \"ACTIVE\",\n" +
                "			\"positions\": [\n" +
                "				{\n" +
                "					\"employeeNumber\": \"1234767\",\n" +
                "					\"status\": \"ACTIVE\",\n" +
                "					\"divisionCode\": \"38\"\n" +
                "				}\n" +
                "			]\n" +
                "		},\n" +
                "		{\n" +
                "			\"id\": \"03a5812f-339a-4d43-a3c9-b5ee25d30027\",\n" +
                "			\"kmCode\": \"3890381665300\",\n" +
                "			\"status\": \"ACTIVE\",\n" +
                "			\"positions\": [\n" +
                "				{\n" +
                "					\"employeeNumber\": \"01235067\",\n" +
                "					\"status\": \"ACTIVE\",\n" +
                "					\"divisionCode\": \"38\"\n" +
                "				}\n" +
                "			 ]\n" +
                "	     }\n" +
                "	]\n" +
                "}";
    }

    public static String getUpdateAdditionalInfo_ORIGINAL() {
        return "{\n" +
                "\"status\": \"SUCCESS\"\n" +
                "}";
    }

    public static String getUpdateAdditionalInfo() {
        return "{\n" +
                "  \"statusInfo\": {\n" +
                "    \"code\": 0,\n" +
                "    \"message\": \"string\"\n" +
                "  },\n" +
                "  \"data\": {\n" +
                "    \"id\": \"1365344737333390800\",\n" +
                "    \"version\": 258\n" +
                "  }\n" +
                "}";
    }

    public static String getMarkingTeam() {
        return "{\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"OK\"\n" +
                "	},\n" +
                "	\"data\": [\n" +
                "		{\n" +
                "			\"id\": \"a10945a4-cfde-4531-acdb-d10f04a97d3b\",\n" +
                "			\"version\": 1,\n" +
                "			\"kmCode\": \"3890381665301\",\n" +
                "			\"channelOwner\": \"VIP\",\n" +
                "			\"divisionCodeOwner\": \"38903801665\",\n" +
                "			\"type\": \"DEF\",\n" +
                "			\"status\": \"ACTIVE\",\n" +
                "			\"positions\": [\n" +
                "				{\n" +
                "					\"staffUnitId\": \"2844e5b9-5c67-4af8-b80f-353185673c60\",\n" +
                "					\"version\": 4,\n" +
                "					\"channel\": \"VIP\",\n" +
                "					\"ossCode\": \"30715948\",\n" +
                "					\"ossPositionCode\": \"20000195\",\n" +
                "					\"fosCode\": \"53004028\",\n" +
                "					\"fosElementId\": \"a27ebcd6-8d83-4106-bf2a-c700b6276eaa\",\n" +
                "					\"groupCode\": \"53004026\",\n" +
                "					\"divisionCode\": \"38903801665\",\n" +
                "					\"parentGroupCode\": \"53004026\",\n" +
                "					\"fosType\": \"BIZ\",\n" +
                "					\"businessRole\": \"КМ\",\n" +
                "					\"isFosHead\": false,\n" +
                "					\"employeeNumber\": \"00431982\",\n" +
                "					\"status\": \"ACTIVE\",\n" +
                "					\"linkId\": \"661b006d-4d3f-4b9e-8f7c-4d7d356e01f6\"\n" +
                "				}\n" +
                "			]\n" +
                "		}\n" +
                "	]\n" +
                "}";
    }

    public static String getInfoClient_ORIGINAL() {
        return "{\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"OK\"\n" +
                "	},\n" +
                "	\"data\": [\n" +
                "		{\n" +
                "			\"id\": \"9c13e675-7760-47bd-b90e-5ba440c1fdb2\",\n" +
                "			\"version\": 13,\n" +
                "			\"kmCode\": \"3890380566304\",\n" +
                "			\"channelOwner\": \"VIP\",\n" +
                "			\"divisionCodeOwner\": \"38903800566\",\n" +
                "			\"type\": \"DEF\",\n" +
                "			\"status\": \"ACTIVE\",\n" +
                "			\"positions\": [\n" +
                "				{\n" +
                "					\"staffUnitId\": \"be6ca478-ae35-4762-a201-f786336a9a32\",\n" +
                "					\"version\": 5,\n" +
                "					\"channel\": \"VIP\",\n" +
                "					\"ossCode\": \"34389397\",\n" +
                "					\"ossPositionCode\": \"20000195\",\n" +
                "					\"fosCode\": \"3\",\n" +
                "					\"fosElementId\": \"21f97ba7-893f-4819-8983-32c2f54abe54\",\n" +
                "					\"groupCode\": \" \",\n" +
                "					\"divisionCode\": \"38903800566\",\n" +
                "					\"parentGroupCode\": \" \",\n" +
                "					\"fosType\": \"BIZ\",\n" +
                "					\"businessRole\": \"КМ\",\n" +
                "					\"isFosHead\": false,\n" +
                "					\"employeeNumber\": \"12345678\",\n" +
                "					\"status\": \"ACTIVE\",\n" +
                "					\"linkId\": \"10b221fd-9a22-4b2c-b9e7-dee0be9be4b3\"\n" +
                "				}\n" +
                "			]\n" +
                "		}\n" +
                "	]\n" +
                "}";
    }

    public static String getInfoClient() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    },\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": \"01d7de4c-dd9a-44e7-a276-975fbc1a0f7a\",\n" +
                "            \"version\": 13,\n" +
                "            \"kmCode\": \"3890380566301\",\n" +
                "            \"channelOwner\": \"VIP\",\n" +
                "            \"divisionCodeOwner\": \"38903800566\",\n" +
                "            \"type\": \"DEF\",\n" +
                "            \"status\": \"ACTIVE\",\n" +
                "            \"positions\": [\n" +
                "                {\n" +
                "                    \"staffUnitId\": \"ea5a7b21-0cd9-4ca9-9b8d-8d0a4bf670a9\",\n" +
                "                    \"version\": 9,\n" +
                "                    \"channel\": \"VIP\",\n" +
                "                    \"ossCode\": \"34389397\",\n" +
                "                    \"ossPositionCode\": \"20000460\",\n" +
                "                    \"fosCode\": \"3\",\n" +
                "                    \"fosElementId\": \"21f97ba7-893f-4819-8983-32c2f54abe54\",\n" +
                "                    \"groupCode\": \" \",\n" +
                "                    \"divisionCode\": \"38903800566\",\n" +
                "                    \"parentGroupCode\": \" \",\n" +
                "                    \"fosType\": \"BIZ\",\n" +
                "                    \"businessRole\": \"РУК\",\n" +
                "                    \"isFosHead\": true,\n" +
                "                    \"employeeNumber\": \"12345678\",\n" +
                "                    \"status\": \"ACTIVE\",\n" +
                "                    \"linkId\": \"553317b3-36de-4591-a25d-20eb1498f5cd\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"typeId\": \"2d20cc12-6858-4a90-a25b-00d7c65b83c1\",\n" +
                "                    \"typeName\": \"ADDITIONAL_INVEST\",\n" +
                "                    \"count\": 1\n" +
                "                },\n" +
                "                {\n" +
                "                    \"typeId\": \"ca086b2d-0695-4622-865c-6be1526b05ee\",\n" +
                "                    \"typeName\": \"MAIN\",\n" +
                "                    \"count\": 7\n" +
                "                },\n" +
                "                {\n" +
                "                    \"typeId\": \"e36c1526-a130-48bf-8b00-c0c12147d415\",\n" +
                "                    \"typeName\": \"POTENTIAL\",\n" +
                "                    \"count\": 1\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}\n";
    }

    public static String notifOfferAccept() {
        return "{\n" +
                "    \"packageId\": \"test packageId\",\n" +
                "    \"offerFeedbacks\": [\n" +
                "        {\n" +
                "            \"originalOperationId\": \"408798f77248495499dd6e3594b0afbf\"\n" +
                "        }\n" +
                "        \n" +
                "    ]\n" +
                "\n" +
                "}";
    }

    public static String notifOfferAccept2() {
        return "{\n" +
                "    \"status\": \"SUCCESS\"\n" +
                "}";
    }

    public static String sbpContextInit() {
        return "{\n" +
                "	\"success\": true,\n" +
                "	\"body\": {\n" +
                "		\"sbpcontext_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1ZnNTZXNzaW9uSWQiOiJ4UkV6bHpmNFNMYUxBTHdicFd1bEVSd1gxMGZUaVRzU0ZsbHRHTmE2WEJndnVsbW1jRHpfRUE3YnM5dDJCYUZhIiwiZXhwIjoxNjkwMTk5MjQ2OTU0fQ.1TEbV8mkmcxd3s6YUgtiTiDbsmGbWOoHZAo4ghMwJro\"\n" +
                "	},\n" +
                "	\"context\": null,\n" +
                "	\"messages\": [],\n" +
                "	\"error\": null,\n" +
                "	\"alerts\": null\n" +
                "}";
    }

    public static String qliksense() {
        return "{\n" +
                "	\"RqUID\": \"1cb8472f-1300-4cc7-a9f7-746f936368d8\",\n" +
                "	\"SPName\": \"urn:sbrfsystems:99-ufs-sr\",\n" +
                "	\"SystemId\": \"urn:sbrfsystems:99-rta\",\n" +
                "	\"RqTm\": \"2023-08-17T11:53:54.781Z\",\n" +
                "	\"SubSystemName\": \"CI03259032\",\n" +
                "	\"Status\": {\n" +
                "		\"statusCode\": 0\n" +
                "	},\n" +
                "	\"epk_id\": \"1225179677930972134\"\n" +
                "}";
    }

    public static String teamsLinkTypes() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    },\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": \"d5ab0589-70f3-4200-95ab-1d16c14a01c1\",\n" +
                "            \"version\": 1,\n" +
                "            \"name\": \"MAIN_INVEST\",\n" +
                "            \"description\": \"Основная инвестиционная\",\n" +
                "            \"isActive\": true,\n" +
                "            \"lastChangeDate\": \"2023-07-14T15:00:00+03:00\",\n" +
                "            \"changedBy\": \"system\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String getTypedTeams() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    },\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"code\": \"20010601\",\n" +
                "            \"masterName\": \"Территориальный финансовый советник\",\n" +
                "            \"name\": \"ФС\",\n" +
                "            \"order\": 80,\n" +
                "            \"needDefTeam\": true,\n" +
                "            \"createDate\": \"2023-08-07T17:58:02.019159+03:00\",\n" +
                "            \"changedBy\": \"Shmidt\",\n" +
                "            \"lastChangeDate\": \"2023-11-15T16:21:44.253991+03:00\",\n" +
                "            \"linkTypes\": [\n" +
                "                \"POTENTIAL\",\n" +
                "                \"MAIN_INVEST\",\n" +
                "                \"MAIN\"\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String getTypedTeams2() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    },\n" +
                "    \"data\": [{\n" +
                "            \"id\": \"e47346a1-7048-4576-9523-df395f214fc1\",\n" +
                "            \"version\": 1,\n" +
                "            \"kmCode\": \"4486150448351\",\n" +
                "            \"channelOwner\": \"VIP\",\n" +
                "            \"divisionCodeOwner\": \"44861500448\",\n" +
                "            \"type\": \"DEF\",\n" +
                "            \"status\": \"ACTIVE\",\n" +
                "            \"positions\": [{\n" +
                "                    \"staffUnitId\": \"9d55ee85-4911-4242-85da-a021c0907a1b\",\n" +
                "                    \"version\": 13,\n" +
                "                    \"channel\": \"VIP\",\n" +
                "                    \"ossCode\": \"36008063\",\n" +
                "                    \"ossPositionCode\": \"20010601\",\n" +
                "                    \"fosCode\": \"53015703\",\n" +
                "                    \"fosElementId\": \"2bc7f760-326f-448a-b231-18eed0be2e85\",\n" +
                "                    \"groupCode\": \"53014421\",\n" +
                "                    \"divisionCode\": \"44861500448\",\n" +
                "                    \"parentGroupCode\": \"53014402\",\n" +
                "                    \"fosType\": \"BIZ\",\n" +
                "                    \"businessRole\": \"ФС\",\n" +
                "                    \"isFosHead\": false,\n" +
                "                    \"employeeNumber\": \"00391430\",\n" +
                "                    \"status\": \"ACTIVE\",\n" +
                "                    \"linkId\": \"6452b354-b4db-4713-b872-96c61ca13168\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String getTypedTeams3() {
        return "{\n" +
                "    \"result\": [\n" +
                "        {\n" +
                "            \"communications\": [],\n" +
                "            \"employee\": {\n" +
                "                \"firstName\": \"Юлия\",\n" +
                "                \"middleName\": \"Эдуардовна\",\n" +
                "                \"lastName\": \"Романова\",\n" +
                "                \"birthday\": \"2000-01-01\",\n" +
                "                \"gender\": \"M\",\n" +
                "                \"businessId\": \"ПАО Сбербанк РФ|00391430\",\n" +
                "                \"lastChangeDate\": \"2023-09-18T09:13:05.655\",\n" +
                "                \"timeZone\": 3.0,\n" +
                "                \"employeeId\": \"3c0ce0a3-7e23-494e-af6c-3cf138e11bdf\",\n" +
                "                \"personalNumber\": \"00391430\",\n" +
                "                \"organizationId\": \"64d9bf8d-ee71-46aa-bded-55d5673636d2\",\n" +
                "                \"hired\": \"2013-02-18\",\n" +
                "                \"id\": \"3c0ce0a3-7e23-494e-af6c-3cf138e11bdf\",\n" +
                "                \"perNumSign\": false\n" +
                "            },\n" +
                "            \"beginDate\": \"2013-02-18\",\n" +
                "            \"staffUnit\": {\n" +
                "                \"id\": \"78c1eefc-d402-4b0f-8d3b-399cd346b800\",\n" +
                "                \"staffUnitId\": \"78c1eefc-d402-4b0f-8d3b-399cd346b800\",\n" +
                "                \"businessId\": \"ПАО Сбербанк РФ|10241226|30664161\",\n" +
                "                \"subdivisionId\": \"73caa29e-fe19-4417-9220-c643ffe3c934\",\n" +
                "                \"subdivision\": {\n" +
                "                    \"id\": \"73caa29e-fe19-4417-9220-c643ffe3c934\",\n" +
                "                    \"subdivisionId\": \"73caa29e-fe19-4417-9220-c643ffe3c934\",\n" +
                "                    \"businessId\": \"ПАО Сбербанк РФ|10241226\",\n" +
                "                    \"name\": \"DEPERS\",\n" +
                "                    \"shortName\": \"Организационно-кадровое управление\",\n" +
                "                    \"organizationId\": \"64d9bf8d-ee71-46aa-bded-55d5673636d2\",\n" +
                "                    \"externalCode\": \"10241226\",\n" +
                "                    \"beginDate\": \"2010-01-01\",\n" +
                "                    \"endDate\": \"9999-12-31\",\n" +
                "                    \"chiefEmployeeId\": \"39a36fd2-cc60-4bd8-944d-75b4bcf777c5\",\n" +
                "                    \"chiefPersonalNumber\": \"00391433\",\n" +
                "                    \"isAbolished\": false,\n" +
                "                    \"lastChangeDate\": \"2023-07-24T14:46:14.913\",\n" +
                "                    \"orgLevelCode\": \"02\",\n" +
                "                    \"orgLevelName\": \"Управление\",\n" +
                "                    \"beName\": \"Северо-Западный банк\",\n" +
                "                    \"beCode\": \"5500\"\n" +
                "                },\n" +
                "                \"beginDate\": \"2012-01-01\",\n" +
                "                \"endDate\": \"9999-12-31\",\n" +
                "                \"lastChangeDate\": \"2023-07-24T14:46:18.341\",\n" +
                "                \"name\": \"Сверка первичных данных(СумУч)\",\n" +
                "                \"code\": \"30664161\",\n" +
                "                \"isAbolished\": false\n" +
                "            },\n" +
                "            \"endDate\": \"9999-12-31\",\n" +
                "            \"businessId\": \"ПАО Сбербанк РФ|00391430|ПАО Сбербанк РФ|10241226|30664161|18.02.13\",\n" +
                "            \"lastChangeDate\": \"2023-07-24T14:46:20.75\",\n" +
                "            \"employeeId\": \"3c0ce0a3-7e23-494e-af6c-3cf138e11bdf\",\n" +
                "            \"id\": \"ed655873-1000-4474-9032-b7159bc479bb\",\n" +
                "            \"assignmentId\": \"ed655873-1000-4474-9032-b7159bc479bb\",\n" +
                "            \"staffUnitId\": \"78c1eefc-d402-4b0f-8d3b-399cd346b800\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"id\": \"2\",\n" +
                "    \"jsonrpc\": \"2.0\"\n" +
                "}";
    }

    public static String teams_addLink() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    },\n" +
                "    \"data\": {\n" +
                "        \"id\": \"cf623bd8-bd7f-4bb5-9055-8daea22ca7cc\",\n" +
                "        \"version\": 1\n" +
                "    }\n" +
                "}";
    }

    public static String teams_id() {
        return "{\n" +
                "    \"\": {\n" +
                "        \"data\": [{\n" +
                "                \"channelOwner\": \"VIP\",\n" +
                "                \"divisionCodeOwner\": \"38903801665\",\n" +
                "                \"id\": \"9c13e675-7760-47bd-b90e-5ba440c1fdb2\",\n" +
                "                \"kmCode\": \"3890381665300\",\n" +
                "                \"positions\": [{\n" +
                "                        \"businessRole\": \"КМ\",\n" +
                "                        \"channel\": \"VIP\",\n" +
                "                        \"divisionCode\": \"38903801665\",\n" +
                "                        \"employeeNumber\": \"1234767\",\n" +
                "                        \"fosCode\": \"53004028\",\n" +
                "                        \"fosElementId\": \"a27ebcd6-8d83-4106-bf2a-c700b6276eaa\",\n" +
                "                        \"fosType\": \"BIZ\",\n" +
                "                        \"groupCode\": \"53004026\",\n" +
                "                        \"isFosHead\": false,\n" +
                "                        \"linkId\": \"661b006d-4d3f-4b9e-8f7c-4d7d356e01f6\",\n" +
                "                        \"ossCode\": \"30715948\",\n" +
                "                        \"ossPositionCode\": \"20000195\",\n" +
                "                        \"parentGroupCode\": \"53004026\",\n" +
                "                        \"staffUnitId\": \"2844e5b9-5c67-4af8-b80f-353185673c60\",\n" +
                "                        \"status\": \"ACTIVE\",\n" +
                "                        \"version\": 4\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"status\": \"ACTIVE\",\n" +
                "                \"type\": \"DEF\",\n" +
                "                \"version\": 1\n" +
                "            }\n" +
                "        ],\n" +
                "        \"statusInfo\": {\n" +
                "            \"code\": 0,\n" +
                "            \"message\": \"OK\"\n" +
                "        }\n" +
                "    }\n" +
                "}\n";
    }

    public static String teams_unlinkTeam() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    }\n" +
                "}";
    }

    public static String send() {
        return "{\n" +
                "    \"unpreparedClientsAmount\": 0\n" +
                "}";
    }

    public static String forSend() {
        return "{\n" +
                "  \"jsonrpc\" : \"2.0\",\n" +
                "  \"id\" : \"2\",\n" +
                "  \"result\" : [ {\n" +
                "    \"employee\" : {\n" +
                "      \"id\" : \"b8916bd5-27cc-4366-b51a-04cb7906b02e\",\n" +
                "      \"employeeId\" : \"b8916bd5-27cc-4366-b51a-04cb7906b02e\",\n" +
                "      \"businessId\" : \"ПАО Сбербанк РФ|01009972\",\n" +
                "      \"ucpId\" : \"1127196837440803393\",\n" +
                "      \"organizationId\" : \"a0f0cd23-b51d-431c-b46b-a143b1c6a228\",\n" +
                "      \"personalNumber\" : \"1234767\",\n" +
                "      \"firstName\" : \"Ольга\",\n" +
                "      \"middleName\" : \"Ивановна\",\n" +
                "      \"lastName\" : \"Парилина\",\n" +
                "      \"birthday\" : \"2000-01-01\",\n" +
                "      \"isStudent\" : true,\n" +
                "      \"timeZone\" : 3,\n" +
                "      \"hired\" : \"2018-04-16\",\n" +
                "      \"fired\" : \"string\",\n" +
                "      \"gender\" : \"F\",\n" +
                "      \"location\" : \"Москва г., ул. Пятницкая, д. 74, корп. стр.5\",\n" +
                "      \"lastChangeDate\" : \"2022-03-15T02:08:34.996\",\n" +
                "      \"perNumSign\" : false,\n" +
                "      \"perNumSignValue\" : \"string\",\n" +
                "      \"fireReason\" : \"string\"\n" +
                "    },\n" +
                "    \"subdivision\" : {\n" +
                "      \"id\" : \"89a6cb6f-30c1-4b99-855b-b1ab69c77094\",\n" +
                "      \"subdivisionId\" : \"89a6cb6f-30c1-4b99-855b-b1ab69c77094\",\n" +
                "      \"businessId\" : \"ПАО Сбербанк РФ|10231701\",\n" +
                "      \"name\" : \"Специализированный по обслуживанию физических лиц дополнительный офис № 9038/01507\",\n" +
                "      \"shortName\" : \"С по ОФЛ ДО № 9038/01507\",\n" +
                "      \"organizationId\" : \"a0f0cd23-b51d-431c-b46b-a143b1c6a228\",\n" +
                "      \"externalCode\" : \"10231701\",\n" +
                "      \"departmentsIdMdmp\" : \"38903801507\",\n" +
                "      \"parentSubdivisionsIds\" : [ \"8833bbfd-3f4c-4a7e-9534-2d48c39f3669\" ],\n" +
                "      \"childSubdivisionsIds\" : [ \"string\" ],\n" +
                "      \"subdivisionUnits\" : \"string\",\n" +
                "      \"subdivisionFullPath\" : \"string\",\n" +
                "      \"beginDate\" : \"2016-03-01\",\n" +
                "      \"endDate\" : \"9999-12-31\",\n" +
                "      \"chiefEmployeeId\" : \"b7d7c614-6eeb-4a11-b7ec-b6ae6928225c\",\n" +
                "      \"chiefPersonalNumber\" : \"00035322\",\n" +
                "      \"location\" : \"Москва г., ул. Новокосинская, д. 36Б\",\n" +
                "      \"isAbolished\" : false,\n" +
                "      \"lastChangeDate\" : \"2022-04-01T10:48:10.737\",\n" +
                "      \"orgLevelCode\" : \"string\",\n" +
                "      \"orgLevelName\" : \"string\",\n" +
                "      \"orgTypeCode\" : \"00000005\",\n" +
                "      \"orgTypeName\" : \"Внутреннее структурное подразделение\",\n" +
                "      \"terbank\" : \"38.0\",\n" +
                "      \"branch\" : \"9038\",\n" +
                "      \"subbranch\" : \"01507\",\n" +
                "      \"osb\" : \"string\"\n" +
                "    },\n" +
                "    \"communications\" : [ {\n" +
                "      \"employeeId\" : \"474932b9-ae9c-4041-8829-a1ce14a5f9d2\",\n" +
                "      \"businessId\" : \"ПАО Сбербанк РФ|01658940|CityPhone\",\n" +
                "      \"code\" : \"CellPhone\",\n" +
                "      \"name\" : \"Мобильный телефон\",\n" +
                "      \"communicationString\" : \"+7 999 8888888\",\n" +
                "      \"extraCommunicationString\" : \"string\",\n" +
                "      \"isFavorite\" : true,\n" +
                "      \"isActive\" : false,\n" +
                "      \"description\" : \"телефон\",\n" +
                "      \"lastChangeDate\" : \"2020-04-15T11:45:49.573\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"employeeId\" : \"474932b9-ae9c-4041-8829-a1ce14a5f9d2\",\n" +
                "      \"businessId\" : \"ПАО Сбербанк РФ|01658940|CityPhone\",\n" +
                "      \"code\" : \"eMailAlpha\",\n" +
                "      \"name\" : \"email alpha\",\n" +
                "      \"communicationString\" : \"trudvsemochendline@sberbank.ru\",\n" +
                "      \"extraCommunicationString\" : \"string\",\n" +
                "      \"isFavorite\" : true,\n" +
                "      \"isActive\" : false,\n" +
                "      \"description\" : \"телефон\",\n" +
                "      \"lastChangeDate\" : \"2020-04-15T11:45:49.573\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"employeeId\" : \"474932b9-ae9c-4041-8829-a1ce14a5f9d2\",\n" +
                "      \"businessId\" : \"ПАО Сбербанк РФ|01658940|CityPhone\",\n" +
                "      \"code\" : \"eMailSigma-testnull\",\n" +
                "      \"name\" : \"eMail Sigma\",\n" +
                "      \"communicationString\" : \"verytveryverylongtestemail123dsnckjsdvsjbv1@sberbank.ru\",\n" +
                "      \"extraCommunicationString\" : \"string\",\n" +
                "      \"isFavorite\" : true,\n" +
                "      \"isActive\" : false,\n" +
                "      \"description\" : \"телефон\",\n" +
                "      \"lastChangeDate\" : \"2020-04-15T11:45:49.573\"\n" +
                "    } ]\n" +
                "  } ]\n" +
                "}";
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
    public static String createStructure() {
        return "{\n" +
                "\"folders\": [\n" +
                "{\n" +
                "\"id\": \"{8E874DB1-3F8A-4725-87AF-DC1BDFF73B94}\",\n" +
                "\"_class\": \"PBSWFolder\",\n" +
                "\"target\": \"/PBSW\",\n" +
                "\"template\": \"PBSW_EPKID_Folder\",\n" +
                "\"attrs\": [\n" +
                "{\n" +
                "\"attrStr\": {\n" +
                "\"key\": \"TemplateAttrs\",\n" +
                "\"value\": \"p_epk_id(STRING)=1143553330530794542|*\"\n" +
                "}\n" +
                "},\n" +
                "{\n" +
                "\"attrStr\": {\n" +
                "\"key\": \"FolderName\",\n" +
                "\"value\": \"1143553330530794542\"\n" +
                "}\n" +
                "},\n" +
                "{\n" +
                "\"attrStr\": {\n" +
                "\"key\": \"TemplateId\",\n" +
                "\"value\": \"PBSW_EPKID_Folder\"\n" +
                "}\n" +
                "}\n" +
                "],\n" +
                "\"result\": {\n" +
                "\"resultCode\": \"ECM:OBJECT_NOT_UNIQUE\",\n" +
                "\"failure\": {\n" +
                "\"errorCode\": \"E_NOT_UNIQUE\",\n" +
                "\"errorReason\": \"Папка с аналогичным названием уже существует\",\n" +
                "\"additionalProperties\": {}\n" +
                "},\n" +
                "\"additionalProperties\": {}\n" +
                "},\n" +
                "\"folders\": [],\n" +
                "\"additionalProperties\": {}\n" +
                "}\n" +
                "]\n" +
                "}";
    }
    public static String getCompanies() {
        return "{\n" +
                "  \"data\": {\n" +
                "    \"companies\": [\n" +
                "      {\n" +
                "        \"companyId\": \"2c8960b7-4413-4f01-80d1-c103df715523\",\n" +
                "        \"created\": \"2025-04-11T15:55:57.621870+03:00\",\n" +
                "        \"status\": \"Не доставлено\",\n" +
                "        \"createdBy\": \"447106|Счастьев Андрей Андреевич\",\n" +
                "        \"msgTypeName\": \"Временное замещение менеджера\",\n" +
                "        \"msgTotal\": 1,\n" +
                "        \"msgDelivered\": 0\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"statusInfo\": {\n" +
                "    \"code\": 0,\n" +
                "    \"message\": \"OK\"\n" +
                "  }\n" +
                "}";
    }
    public static String getInfoByCompanyId() {
        return "{\n" +
                "    \"data\": {\n" +
                "        \"company\": {\n" +
                "            \"companyId\": \"2c8960b7-4413-4f01-80d1-c103df715523\",\n" +
                "            \"created\": \"2025-04-11T15:55:57.621870+03:00\",\n" +
                "            \"status\": \"Не доставлено\",\n" +
                "            \"createdBy\": \"447106|Счастьев Андрей Андреевич\",\n" +
                "            \"msgTypeName\": \"Временное замещение менеджера\",\n" +
                "            \"msgTotal\": 1,\n" +
                "            \"msgDelivered\": 0,\n" +
                "            \"params\": \"title=Дата начала замещения|value=11.04.25;title=Дата окончания замещения|value=12.04.25;title=Имя фамилия замещающего сотрудника|value=Илья Главный;title=Телефон замещающего сотрудника|value=+74954308233\"\n" +
                "        },\n" +
                "        \"messages\": [\n" +
                "            {\n" +
                "                \"ucpId\": \"1143553330530794542\",\n" +
                "                \"mainTeamId\": \"5ca8195f-ffd2-4b3e-b68b-e86bed30088b\",\n" +
                "                \"mainEmployee\": \"00448144\",\n" +
                "                \"status\": \"СМС не отправлено\",\n" +
                "                \"deliveryStatus\": \"NOT_DELIVERED\",\n" +
                "                \"frontStatus\": \"СМС не доставлено\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    }\n" +
                "}";
    }

    public static String setRegionConfig() {
        return "{\"success\": true}";
    }
}