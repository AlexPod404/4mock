package sb1.stub.armsb_tasks.dummy.data.hardcode;

public class Jsons {
    public static String errorRequest() {
        return "{\n" +
                "    \"status\": \"Error\"\n" +
                "    \"comment\": \"Need signature in request. Требуется сигнатура в запросе\"\n" +
                "}";
    }

    public static String getFreeTeams() {
        return "{\"statusInfo\":{\"code\":0,\"message\":\"OK\"},\"data\":{\"id\":\"27d378d7-37b1-4300-93bd-a58baa9c1679\",\"kmCode\":\"1385920020499\",\"staffUnitId\":\"32637130-523b-11ee-9cd4-cb716f2d5a53\",\"employeeNumber\":\"00439599\"}}";
    }

    public static String getTeams() {
        return "{\n" +
                "  \"statusInfo\": {\n" +
                "    \"code\": 0,\n" +
                "    \"message\": \"OK\"\n" +
                "  },\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": \"9c13e675-7760-47bd-b90e-5ba440c1fdb2\",\n" +
                "      \"version\": 2,\n" +
                "      \"kmCode\": \"3890380566304\",\n" +
                "      \"channelOwner\": \"VIP\",\n" +
                "      \"divisionCodeOwner\": \"38903800566\",\n" +
                "      \"type\": \"DEF\",\n" +
                "      \"status\": \"ACTIVE\",\n" +
                "      \"positions\": [\n" +
                "        {\n" +
                "          \"staffUnitId\": \"be6ca478-ae35-4762-a201-f786336a9a32\",\n" +
                "          \"version\": 1,\n" +
                "          \"channel\": \"VIP\",\n" +
                "          \"ossCode\": \"34389397\",\n" +
                "          \"ossPositionCode\": \"20000195\",\n" +
                "          \"fosCode\": \"3\",\n" +
                "          \"fosElementId\": \"21f97ba7-893f-4819-8983-32c2f54abe54\",\n" +
                "          \"groupCode\": \" \",\n" +
                "          \"divisionCode\": \"38903800566\",\n" +
                "          \"parentGroupCode\": \" \",\n" +
                "          \"fosType\": \"BIZ\",\n" +
                "          \"businessRole\": \"КМ\",\n" +
                "          \"isFosHead\": false,\n" +
                "          \"employeeNumber\": \"00232892\",\n" +
                "          \"status\": \"ACTIVE\",\n" +
                "          \"linkId\": \"10b221fd-9a22-4b2c-b9e7-dee0be9be4b3\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

    public static String search() {
        return "{\n" +
                "    \"jsonrpc\": \"2.0\",\n" +
                "    \"id\": \"2\",\n" +
                "    \"result\": [\n" +
                "        {\n" +
                "            \"id\": \"88039bca-2f9a-40d2-8b79-b73c9af65ed8\",\n" +
                "            \"employeeId\": \"88039bca-2f9a-40d2-8b79-b73c9af65ed8\",\n" +
                "            \"businessId\": \"ПАО Сбербанк РФ|00448144\",\n" +
                "            \"ucpId\": null,\n" +
                "            \"organizationId\": \"64d9bf8d-ee71-46aa-bded-55d5673636d2\",\n" +
                "            \"personalNumber\": \"00448144\",\n" +
                "            \"firstName\": \"Илья\",\n" +
                "            \"middleName\": \"Борисович\",\n" +
                "            \"lastName\": \"Главный\",\n" +
                "            \"birthday\": \"1985-01-07\",\n" +
                "            \"isStudent\": null,\n" +
                "            \"timeZone\": 3,\n" +
                "            \"hired\": \"2020-06-26\",\n" +
                "            \"fired\": null,\n" +
                "            \"gender\": \"M\",\n" +
                "            \"location\": null,\n" +
                "            \"lastChangeDate\": \"2022-06-22T15:27:38.53\",\n" +
                "            \"perNumSign\": false,\n" +
                "            \"perNumSignValue\": null,\n" +
                "            \"fireReason\": null\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"91e24927-6ddf-4971-93a4-973b910c6729\",\n" +
                "            \"employeeId\": \"91e24927-6ddf-4971-93a4-973b910c6729\",\n" +
                "            \"businessId\": \"ПАО Сбербанк РФ|00431982\",\n" +
                "            \"ucpId\": null,\n" +
                "            \"organizationId\": \"64d9bf8d-ee71-46aa-bded-55d5673636d2\",\n" +
                "            \"personalNumber\": \"00431982\",\n" +
                "            \"firstName\": \"Илья\",\n" +
                "            \"middleName\": \"Александрович\",\n" +
                "            \"lastName\": \"Варламов\",\n" +
                "            \"birthday\": \"1965-10-12\",\n" +
                "            \"isStudent\": null,\n" +
                "            \"timeZone\": 3,\n" +
                "            \"hired\": \"2018-05-16\",\n" +
                "            \"fired\": null,\n" +
                "            \"gender\": \"M\",\n" +
                "            \"location\": null,\n" +
                "            \"lastChangeDate\": \"2022-06-22T15:27:38.548\",\n" +
                "            \"perNumSign\": false,\n" +
                "            \"perNumSignValue\": null,\n" +
                "            \"fireReason\": null\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String tasksByFilter(String result) {
        return "{\n" +
                "	\"status\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"success\"\n" +
                "	},\n" +
                "	\"tasksList\": [\n" +
                "		{\n" +
                "			\"id\": \"67bddf5e-0277-4bce-85ec-2f9c39424237\",\n" +
                "			\"version\": 1,\n" +
                "			\"taskId\": \"qwertyuiopasdfghjklzxcvbnmqwertyuiop\",\n" +
                "			\"status\": \"DONE\",\n" +
                "			\"teamId\": \"2d244bae-85b3-47e7-9fb1-e985491223ee\",\n" +
                "			\"product\": \"ОКОНЧАНИЕ СРОКА ДЕЙСТВИЯ-ВКЛАД\",\n" +
                "			\"productSubtype\": \"Предложения Первый\",\n" +
                "			\"priority\": 98.0,\n" +
                "			\"taskType\": \"OFFER\",\n" +
                "			\"creator\": \"SberNBA\",\n" +
                "			\"createDate\": \"2022-09-07T19:09:33.166\",\n" +
                "			\"factEndDate\": null,\n" +
                "			\"startCommunicationDate\": \"2022-09-04T10:57:06.290\",\n" +
                "			\"endCommunicationDate\": \"2022-09-07T19:09:33.166\",\n" +
                "			\"dueDate\": null,\n" +
                "			\"deactivationDate\": \"2022-09-07T19:09:33.166\",\n" +
                "			\"ucpId\": \"1428105050034864952\",\n" +
                "			\"shortDesc\": \"У клиента заканчивается срок вклада\",\n" +
                "			\"source\": \"CA\",\n" +
                "			\"comment\": null,\n" +
                "			\"executor\": null,\n" +
                "			\"result\": null,\n" +
                "			\"resultDetail\": null,\n" +
                "			\"marking\": null,\n" +
                "			\"resultDetailList\": null,\n" +
                "			\"allowToCancel\": true\n" +
                "		},\n" +
                "		{\n" +
                "			\"id\": \"ff2f8c1f-8a59-40b7-8be9-6b0101a17c55\",\n" +
                "			\"version\": 1,\n" +
                "			\"taskId\": null,\n" +
                "			\"status\": \"DONE\",\n" +
                "			\"teamId\": \"2d244bae-85b3-47e7-9fb1-e985491223ee\",\n" +
                "			\"product\": \"ОКОНЧАНИЕ СРОКА ДЕЙСТВИЯ-ВКЛАД\",\n" +
                "			\"productSubtype\": \"Предложения Первый\",\n" +
                "			\"priority\": 97.0,\n" +
                "			\"taskType\": \"OFFER\",\n" +
                "			\"creator\": \"SberNBA\",\n" +
                "			\"createDate\": \"2022-09-07T19:10:05.846\",\n" +
                "			\"factEndDate\": null,\n" +
                "			\"startCommunicationDate\": \"2022-09-04T10:57:06.290\",\n" +
                "			\"endCommunicationDate\": \"2022-09-07T19:10:05.846\",\n" +
                "			\"dueDate\": null,\n" +
                "			\"deactivationDate\": \"2022-09-07T19:10:05.846\",\n" +
                "			\"ucpId\": \"1426354352652271068\",\n" +
                "			\"shortDesc\": \"У клиента заканчивается срок вклада\",\n" +
                "			\"source\": \"CA\",\n" +
                "			\"comment\": null,\n" +
                "			\"executor\": null,\n" +
                "			\"result\": null,\n" +
                "			\"resultDetail\": null,\n" +
                "			\"marking\": null,\n" +
                "			\"resultDetailList\": null,\n" +
                "			\"allowToCancel\": true\n" +
                "		},\n" +
                "		{\n" +
                "			\"id\": \"b60b2287-6c00-4c23-a136-371fae4c1173\",\n" +
                "			\"version\": 5,\n" +
                "			\"taskId\": null,\n" +
                "			\"status\": \"ACTIVE\",\n" +
                "			\"teamId\": \"2d244bae-85b3-47e7-9fb1-e985491223ee\",\n" +
                "			\"product\": \"Окончание вкладов\",\n" +
                "			\"productSubtype\": \"sОкончание вкладов\",\n" +
                "			\"priority\": 22.0,\n" +
                "			\"taskType\": \"OFFER\",\n" +
                "			\"creator\": \"creator\",\n" +
                "			\"createDate\": \"2022-09-05T12:36:22.859\",\n" +
                "			\"factEndDate\": null,\n" +
                "			\"startCommunicationDate\": \"2022-09-08T10:03:02.859\",\n" +
                "			\"endCommunicationDate\": \"2022-09-11T07:29:42.859\",\n" +
                "			\"dueDate\": \"2022-09-26T08:36:22.859\",\n" +
                "			\"deactivationDate\": \"2022-10-10T05:56:22.859\",\n" +
                "			\"ucpId\": \"1428105050034864952\",\n" +
                "			\"shortDesc\": \"массовка НА ГЛАВНОМ[2\",\n" +
                "			\"source\": \"VSP\",\n" +
                "			\"comment\": \"Не входит в mvp2022\",\n" +
                "			\"executor\": null,\n" +
                "			\"result\": null,\n" +
                "			\"resultDetail\": null,\n" +
                "			\"marking\": null,\n" +
                "			\"resultDetailList\": null,\n" +
                "			\"allowToCancel\": true\n" +
                "		},\n" +
                "		{\n" +
                "			\"id\": \"9e0d9945-1ca3-40ae-8eb4-8c5c1b9923fb\",\n" +
                "			\"version\": 5,\n" +
                "			\"taskId\": null,\n" +
                "			\"status\": \"ACTIVE\",\n" +
                "			\"teamId\": \"2d244bae-85b3-47e7-9fb1-e985491223ee\",\n" +
                "			\"product\": \"Окончание вкладов\",\n" +
                "			\"productSubtype\": \"sОкончание вкладов\",\n" +
                "			\"priority\": 148.0,\n" +
                "			\"taskType\": \"SERVICE\",\n" +
                "			\"creator\": \"creator\",\n" +
                "			\"createDate\": \"2022-09-05T13:07:57.405\",\n" +
                "			\"factEndDate\": null,\n" +
                "			\"startCommunicationDate\": \"2022-09-08T10:34:37.405\",\n" +
                "			\"endCommunicationDate\": \"2022-09-11T08:01:17.405\",\n" +
                "			\"dueDate\": \"2022-09-26T09:07:57.405\",\n" +
                "			\"deactivationDate\": \"2022-10-10T06:27:57.405\",\n" +
                "			\"ucpId\": \"1428105050034864952\",\n" +
                "			\"shortDesc\": \"массовка НА ГЛАВНОМ[\",\n" +
                "			\"source\": \"SBOL\",\n" +
                "			\"comment\": \"commentНе входит в mvp2022\",\n" +
                "			\"executor\": null,\n" +
                "			\"result\": null,\n" +
                "			\"resultDetail\": null,\n" +
                "			\"marking\": null,\n" +
                "			\"resultDetailList\": null,\n" +
                "			\"allowToCancel\": true\n" +
                "		}\n" +
                "	],\n" +
                "	\"count\": 4,\n" +
                "	\"limit\": 10,\n" +
                "	\"offset\": 0\n" +
                "}";
    }

    public static String getTask(String result) {
        return "{\n" +
                "	\"status\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"success\"\n" +
                "	},\n" +
                "	\"task\": {\n" +
                "		\"id\": \"d398f789-66f3-466e-bd4c-8fd6a0b677b7\",\n" +
                "		\"version\": 4,\n" +
                "		\"taskId\": \"8c6a7f816d434674869b5fde784d00ab5551758158\",\n" +
                "		\"commId\": \"280006ba-a22a-0901-b760-1247bdff4643\",\n" +
                "		\"ucpId\": \"1428105050034864952\",\n" +
                "		\"teamId\": \"2d244bae-85b3-47e7-9fb1-e985491223ee\",\n" +
                "		\"creator\": \"SberNBA\",\n" +
                "		\"executor\": \"Главный И. Б.\",\n" +
                "		\"type\": \"SERVICE\",\n" +
                "		\"isPush\": true,\n" +
                "		\"shortDesc\": \"У клиента заканчивается срок вклада\",\n" +
                "		\"fullDesc\": \"У клиента заканчивается срок вклада. Обсудите с ним пролонгацию или другие варианты размещения средств.\",\n" +
                "		\"matrixList\": [],\n" +
                "		\"comment\": null,\n" +
                "		\"status\": \"CANCELLED\",\n" +
                "		\"createDate\": \"2022-09-28T16:31:51.852\",\n" +
                "		\"startCommunicationDate\": \"2022-09-22T10:57:06.290\",\n" +
                "		\"endCommunicationDate\": \"2022-09-28T16:31:51.852\",\n" +
                "		\"firstDueDate\": null,\n" +
                "		\"dueDate\": null,\n" +
                "		\"deactivationDate\": \"2022-09-28T16:31:51.852\",\n" +
                "		\"factEndDate\": \"2022-10-04T11:45:05.667\",\n" +
                "		\"result\": \"CANCELLED\",\n" +
                "		\"resultDetailName\": null,\n" +
                "		\"postponedCount\": 1,\n" +
                "		\"productSubtype\": \"Предложения Первый\",\n" +
                "		\"product\": \"ОКОНЧАНИЕ СРОКА ДЕЙСТВИЯ-ВКЛАД\",\n" +
                "		\"priority\": 99.0,\n" +
                "		\"source\": \"CA\",\n" +
                "		\"campaignName\": \"тест VIP1\",\n" +
                "		\"marking\": {\n" +
                "			\"markingId\": \"3e791f45-d84c-4ab8-a2fc-27445f3bd446\",\n" +
                "			\"processType\": \"MASS2VIP\",\n" +
                "			\"plannedTeamId\": \"2d244bae-85b3-47e7-9fb1-e985491223ee\",\n" +
                "			\"stage\": 2,\n" +
                "			\"updateDate\": \"2022-10-12T11:58:35.064\"\n" +
                "		},\n" +
                "		\"supportComment\": null,\n" +
                "		\"updateDate\": \"2022-10-04T08:45:05.752\",\n" +
                "		\"updateBy\": \"Главный И. Б.\"\n" +
                "	}\n" +
                "}";
    }

    public static String taskUpdate() {
        return "{\n" +
                "  \"status\": {\n" +
                "    \"code\": 0,\n" +
                "    \"message\": \"Предложение не актуально\"\n" +
                "  }\n" +
                "}";
    }

    public static String getOffer() {
        return "{\n" +
                "	\"rqUid\": \"defb95b7-ab80-4a78-9116-a599c2237905\",\n" +
                "	\"rsTm\": \"2022-10-04T16:43:30.273Z\",\n" +
                "	\"systemName\": \"ARMSB_TASKS\",\n" +
                "	\"channelRoute\": {\n" +
                "		\"channelId\": 10,\n" +
                "		\"channelPath\": 1\n" +
                "	},\n" +
                "	\"status\": {\n" +
                "		\"code\": \"success\"\n" +
                "	},\n" +
                "	\"clientInfo\": [\n" +
                "		{\n" +
                "			\"typeId\": 1,\n" +
                "			\"clientId\": \"1428074405448508292\",\n" +
                "			\"offerGroup\": [\n" +
                "				{\n" +
                "					\"groupType\": null,\n" +
                "					\"offers\": [\n" +
                "						{\n" +
                "							\"commId\": \"dec3490e-118e-4131-90c0-92c30e9b17c2\",\n" +
                "							\"targetId\": \"S\",\n" +
                "							\"prodChannelId\": 10,\n" +
                "							\"source\": \"SberNBA\",\n" +
                "							\"productInfo\": [\n" +
                "								{\n" +
                "									\"productId\": \"1-UQ0QWKWC\",\n" +
                "									\"productType\": \"ОКОНЧАНИЕ СРОКА ДЕЙСТВИЯ-ВКЛАД\",\n" +
                "									\"productSource\": \"CRMprodCat\"\n" +
                "								}\n" +
                "							],\n" +
                "							\"primaryOffer\": 1,\n" +
                "							\"offerStartDate\": \"2022-10-02T07:57:06.001Z\",\n" +
                "							\"offerExpiration\": \"2022-10-30T23:59:59.001Z\",\n" +
                "							\"persParameters\": [\n" +
                "								{\n" +
                "									\"paramId\": \"dep_type_name\",\n" +
                "									\"paramValue\": \"ЛидерСохраняй\",\n" +
                "									\"paramDesc\": \"Название типа (категории) депозита\"\n" +
                "								},\n" +
                "								{\n" +
                "									\"paramId\": \"acct_nbr_sha1\",\n" +
                "									\"paramValue\": \"3333 6543 **\",\n" +
                "									\"paramDesc\": \"sh1-хэш номер счета\"\n" +
                "								},\n" +
                "								{\n" +
                "									\"paramId\": \"dep_curr_bal_rub_amt\",\n" +
                "									\"paramValue\": \"3100000\",\n" +
                "									\"paramDesc\": \"Остаток по счету\"\n" +
                "								},\n" +
                "								{\n" +
                "									\"paramId\": \"ccy_type_name\",\n" +
                "									\"paramValue\": \"Руб\",\n" +
                "									\"paramDesc\": \"Название типа валюты продукта (руб/вал)\"\n" +
                "								},\n" +
                "								{\n" +
                "									\"paramId\": \"current_interest_rate\",\n" +
                "									\"paramValue\": \"22.5\",\n" +
                "									\"paramDesc\": \"Процентная ставка\"\n" +
                "								}\n" +
                "							],\n" +
                "							\"variableParameters\": [],\n" +
                "							\"content\": {\n" +
                "								\"shortDesc\": \"«У клиента 17.10.2022 заканчивается срок действия вклада. ЛидерСохраняй, 3333 6543 **, 3100000, Руб, 22.5. Свяжитесь с клиентом и предложите варианты реинвестирования средств.»\"\n" +
                "							},\n" +
                "							\"additionalParameters\": {\n" +
                "								\"cjName\": \"Тестовая кампания для KMVIP\",\n" +
                "								\"bbName\": \"Дефолтная\",\n" +
                "								\"taskId\": \"67e29730-3b21-4d81-ae6d-541def20c8f5\",\n" +
                "								\"commStartDate\": \"2022-10-03T07:57:06.001Z\",\n" +
                "								\"commEndDate\": \"2022-10-28T23:59:59.001Z\",\n" +
                "								\"productName\": \"ОКОНЧАНИЕ СРОКА ДЕЙСТВИЯ-ВКЛАД\",\n" +
                "								\"productKind\": \"Событие\"\n" +
                "							}\n" +
                "						}\n" +
                "					]\n" +
                "				}\n" +
                "			]\n" +
                "		}\n" +
                "	]\n" +
                "}";
    }

    public static String getPositions() {
        return "{\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"OK\"\n" +
                "	},\n" +
                "	\"data\": [\n" +
                "		{\n" +
                "			\"staffUnitId\": \"48efcffc-20d4-4a32-bdd4-2ada625c7df5\",\n" +
                "			\"version\": 25,\n" +
                "			\"channel\": \"VIP\",\n" +
                "			\"ossCode\": \"30739105\",\n" +
                "			\"ossPositionCode\": \"20000460\",\n" +
                "			\"fosCode\": \"53004027\",\n" +
                "			\"fosElementId\": \"d3c615b6-e1cb-4432-b4cd-2ef38600b482\",\n" +
                "			\"groupCode\": \"53004026\",\n" +
                "			\"divisionCode\": \"38903801665\",\n" +
                "			\"parentGroupCode\": \"53004026\",\n" +
                "			\"fosType\": \"BIZ\",\n" +
                "			\"businessRole\": \"Рук\",\n" +
                "			\"employeeNumber\": \"00448144\",\n" +
                "			\"isFosHead\": true,\n" +
                "			\"changedBy\": \"SB1.FOSSyncJob\",\n" +
                "			\"status\": \"ACTIVE\",\n" +
                "			\"teamId\": [\n" +
                "				\"f2c1f160-c3cb-4395-a00e-ee15f8405211\"\n" +
                "			]\n" +
                "		}\n" +
                "	]\n" +
                "}";
    }

    public static String getMarkingCheck() {
        return "{\n" +
                "	\"data\": {\n" +
                "		\"processInfo\": {\n" +
                "			\"id\": \"90f06c47-14dd-4d06-8d6c-f2349d57d28c\",\n" +
                "			\"plannedTeamId\": \"a10945a4-cfde-4531-acdb-d10f04a97d3b\",\n" +
                "			\"type\": \"VIP — Массовый\",\n" +
                "			\"direction\": \"DOWN\"\n" +
                "		},\n" +
                "		\"isActiveProcess\": true\n" +
                "	},\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"OK\"\n" +
                "	}\n" +
                "}";
    }

    public static String getMarkingById() {
        return "{\n" +
                "	\"data\": [\n" +
                "		{\n" +
                "			\"id\": \"90f06c47-14dd-4d06-8d6c-f2349d57d28c\",\n" +
                "			\"version\": 2,\n" +
                "			\"epkId\": \"1179523406768227832\",\n" +
                "			\"plannedTeamId\": \"a10945a4-cfde-4531-acdb-d10f04a97d3b\",\n" +
                "			\"creator\": \"Варламов Илья КМ\",\n" +
                "			\"comment\": null,\n" +
                "			\"typeProcess\": {\n" +
                "				\"id\": \"072e8e7d-ba92-4fca-b32d-a09554da27dc\",\n" +
                "				\"name\": \"VIP — Массовый\",\n" +
                "				\"direction\": \"DOWN\"\n" +
                "			},\n" +
                "			\"resultMarking\": null,\n" +
                "			\"cancelledReason\": null,\n" +
                "			\"stage\": {\n" +
                "				\"id\": \"8cc383e7-a5a0-487c-828a-d6aaf3f8b8b2\",\n" +
                "				\"name\": \"Коммуникация с клиентом\"\n" +
                "			},\n" +
                "			\"sourceSystem\": \"VSP\",\n" +
                "			\"downgradeReason\": null,\n" +
                "			\"acceptResult\": null,\n" +
                "			\"empAcceptor\": null,\n" +
                "			\"resultCommunication\": null,\n" +
                "			\"empCommunicator\": null,\n" +
                "			\"empAssigner\": null,\n" +
                "			\"rejectReason\": null,\n" +
                "			\"source\": null,\n" +
                "			\"criteria\": null,\n" +
                "			\"engagementChannel\": null,\n" +
                "			\"createDate\": \"2022-11-09T11:00:38.527+00:00\",\n" +
                "			\"updateDate\": \"2022-11-09T11:00:42.122+00:00\",\n" +
                "			\"endDate\": null,\n" +
                "			\"changeBy\": \"Варламов Илья КМ\"\n" +
                "		}\n" +
                "	],\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"OK\"\n" +
                "	}\n" +
                "}";
    }

    public static String createMarking() {
        return "{\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"OK\"\n" +
                "	},\n" +
                "	\"data\": {\n" +
                "		\"epkId\": \"1179522942911756786\",\n" +
                "		\"version\": 2,\n" +
                "		\"segment\": 3,\n" +
                "		\"criteria\": {\n" +
                "			\"id\": null,\n" +
                "			\"changedBy\": null,\n" +
                "			\"date\": null\n" +
                "		},\n" +
                "		\"engagement\": {\n" +
                "			\"id\": null,\n" +
                "			\"changedBy\": null,\n" +
                "			\"date\": null\n" +
                "		},\n" +
                "		\"sourceId\": \"7666f1dd-243d-4b70-9893-bdeee6c3c303\",\n" +
                "		\"ecmId\": null,\n" +
                "		\"balance\": {\n" +
                "			\"value\": null,\n" +
                "			\"date\": null\n" +
                "		},\n" +
                "		\"isDead\": null,\n" +
                "		\"createDate\": \"2022-11-10T16:06:26.430604+03:00\",\n" +
                "		\"lastChangeDate\": \"2022-11-10T16:08:36.314596+03:00\",\n" +
                "		\"changedBy\": \"Варламов Илья КМ\",\n" +
                "		\"status\": \"ACTIVE\",\n" +
                "		\"note\": null,\n" +
                "		\"teams\": [\n" +
                "			{\n" +
                "				\"id\": \"9c13e675-7760-47bd-b90e-5ba440c1fdb2\",\n" +
                "				\"type\": \"DEF\",\n" +
                "				\"kmCode\": \"3890381665301\",\n" +
                "				\"divisionCode\": \"38903801665\",\n" +
                "				\"channel\": \"VIP\",\n" +
                "				\"status\": \"ACTIVE\",\n" +
                "				\"link\": {\n" +
                "					\"id\": \"d61f69a0-c344-4dca-9e1d-f7d0530bc47a\",\n" +
                "					\"name\": \"MAIN\",\n" +
                "					\"description\": \"Основная\"\n" +
                "				}\n" +
                "			}\n" +
                "		]\n" +
                "	}\n" +
                "}";
    }

    public static String getMarkingByClient() {
        return "{\n" +
                "	\"data\": {\n" +
                "		\"epkId\": \"1318742645650130704\",\n" +
                "		\"processes\": [\n" +
                "			{\n" +
                "				\"id\": \"305f063b-72cb-4357-b3bf-528ec8601427\",\n" +
                "				\"version\": 3,\n" +
                "				\"plannedTeamId\": \"a10945a4-cfde-4531-acdb-d10f04a97d3b\",\n" +
                "				\"creator\": \"Варламов Илья КМ\",\n" +
                "				\"comment\": null,\n" +
                "				\"typeProcess\": {\n" +
                "					\"id\": \"a15efeb4-b5af-4ffe-9b59-175b83c6f9bd\",\n" +
                "					\"name\": \"Массовый — VIP\",\n" +
                "					\"direction\": \"UP\"\n" +
                "				},\n" +
                "				\"resultMarking\": false,\n" +
                "				\"cancelledReason\": \"Отмена из VSP\",\n" +
                "				\"stage\": {\n" +
                "					\"id\": \"fced623d-b113-444a-b113-35f4f9930f21\",\n" +
                "					\"name\": \"Завершен\"\n" +
                "				},\n" +
                "				\"sourceSystem\": \"VSP\",\n" +
                "				\"downgradeReason\": null,\n" +
                "				\"acceptResult\": null,\n" +
                "				\"empAcceptor\": null,\n" +
                "				\"resultCommunication\": null,\n" +
                "				\"empCommunicator\": \"Варламов Илья КМ\",\n" +
                "				\"empAssigner\": null,\n" +
                "				\"rejectReason\": null,\n" +
                "				\"source\": null,\n" +
                "				\"criteria\": null,\n" +
                "				\"engagementChannel\": null,\n" +
                "				\"createDate\": \"2022-11-08T12:35:50.968+00:00\",\n" +
                "				\"updateDate\": \"2022-11-10T14:15:32.727+00:00\",\n" +
                "				\"endDate\": \"2022-11-10T14:15:32.721+00:00\",\n" +
                "				\"changeBy\": \"Варламов Илья КМ\"\n" +
                "			}\n" +
                "		]\n" +
                "	},\n" +
                "	\"statusInfo\": {\n" +
                "		\"code\": 0,\n" +
                "		\"message\": \"OK\"\n" +
                "	}\n" +
                "}";
    }

    public static String getMarkingCreate() {
        return "{\n" +
                "	\"status\": {\n" +
                "		\"statusCode\": 0,\n" +
                "		\"message\": \"Запрос успешно обработан\"\n" +
                "	},\n" +
                "	\"themeId\": \"1d8ceea1-bb96-4662-809f-412d23b98947\",\n" +
                "	\"processId\": \"ff2af197-1d7a-4a85-8ad6-17775f04322c\"\n" +
                "}";
    }

    public static String getFilters() {
        return "{\n" +
                "    \"status\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"Ок\"\n" +
                "    },\n" +
                "    \"filtersRequested\": [\n" +
                "        {\n" +
                "            \"name\": \"TASK_TYPE\",\n" +
                "            \"valuesAvailable\": [\n" +
                "                {\n" +
                "                    \"id\": \"type-CHANGESEGMENT\",\n" +
                "                    \"name\": \"Изменение сегмента\",\n" +
                "                    \"taskCount\": 5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"type-OFFER\",\n" +
                "                    \"name\": \"Предложение\",\n" +
                "                    \"taskCount\": 4\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"type-SERVICE\",\n" +
                "                    \"name\": \"Сервис\",\n" +
                "                    \"taskCount\": 1\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"PRODUCT_SUBTYPE\",\n" +
                "            \"valuesAvailable\": [\n" +
                "                {\n" +
                "                    \"id\": \"PRODUCTSUBTYPE-debit\",\n" +
                "                    \"name\": \"Дебетовая карта\",\n" +
                "                    \"taskCount\": 6\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"PRODUCTSUBTYPE-credit\",\n" +
                "                    \"name\": \"Кредитная карта\",\n" +
                "                    \"taskCount\": 4\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"PRODUCTSUBTYPE-long\",\n" +
                "                    \"name\": \"Пример очень длинного огромного просто названия, которое точно никуда не влезет\",\n" +
                "                    \"taskCount\": 7\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"PRODUCT\",\n" +
                "            \"valuesAvailable\": [\n" +
                "                {\n" +
                "                    \"id\": \"PRODUCT-olymp\",\n" +
                "                    \"name\": \"Visa Classic 'Олимпийская'\",\n" +
                "                    \"taskCount\": 3\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"PRODUCT-other\",\n" +
                "                    \"name\": \"Другая крутая карта\",\n" +
                "                    \"taskCount\": 8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"PRODUCT-long\",\n" +
                "                    \"name\": \"Пример очень длинного огромного просто названия, которое точно никуда не влезет\",\n" +
                "                    \"taskCount\": 2\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"USER_CAMPAIGN\",\n" +
                "            \"valuesAvailable\": [\n" +
                "                {\n" +
                "                    \"id\": \"CAMPAIGN-1\",\n" +
                "                    \"name\": \"Кампания 1\",\n" +
                "                    \"taskCount\": 3\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String premierDivisions() {
        return "{\n" +
                "    \"success\": true,\n" +
                "    \"body\": {\n" +
                "        \"responseId\": \"eb4d1a94-24ea-453c-8dcb-4effc303e44f\",\n" +
                "        \"requestId\": \"f03baa37-d286-4f68-a5ea-b15e3f28b704\",\n" +
                "        \"success\": true,\n" +
                "        \"serverInfo\": {\n" +
                "            \"distribVersion\": \"D-09.002.00-961_STD_CFG_ALL-repacked-694\"\n" +
                "        },\n" +
                "        \"dataSourceId\": \"emp.dict.sb.mg\",\n" +
                "        \"versionCode\": \"UNSI_1.1_2024.10.28T14:15:00_SFSDIVISION_CORESET1\",\n" +
                "        \"rowHeader\": {\n" +
                "            \"attrs\": [\n" +
                "                \"code\",\n" +
                "                \"df_address_locationaddress\",\n" +
                "                \"df_fulldivcode\",\n" +
                "                \"df_fullname\",\n" +
                "                \"df_osbcode\",\n" +
                "                \"df_serving_clientsegment_agg\",\n" +
                "                \"df_tbcode\",\n" +
                "                \"df_vspcode\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"rowDatas\": [\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"f20cb2bc1d148280887e133a545f58db35f7765d\",\n" +
                "                    \"Белгородский, г. Белгород, ул. Костюкова, д.63\",\n" +
                "                    \"138592020\",\n" +
                "                    \"Доп.офис №8592/020\",\n" +
                "                    \"8592\",\n" +
                "                    \"Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"020\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"c2475561d4f0e24aa7dc4649ec598dccd5bbe352\",\n" +
                "                    \"Валуйский, г. Валуйки, ул. М.Горького, д.31А\",\n" +
                "                    \"1385920200\",\n" +
                "                    \"Доп.офис №8592/0200\",\n" +
                "                    \"8592\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"0200\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"a8a858b44fb7743b03d0c52fe484abc1280f5d96\",\n" +
                "                    \"Губкинский, г. Губкин, ул. Севастопольская, д.2Б\",\n" +
                "                    \"1385920300\",\n" +
                "                    \"Доп.офис №8592/0300\",\n" +
                "                    \"8592\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"0300\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"d71186e3fb638411a6820489109f83dfbbf886ba\",\n" +
                "                    \"г. Белгород, ул. Попова, 9\",\n" +
                "                    \"138592048\",\n" +
                "                    \"Доп.офис №8592/048\",\n" +
                "                    \"8592\",\n" +
                "                    \"Массовый высокодоходный сегмент,Массовый сегмент\",\n" +
                "                    \"13\",\n" +
                "                    \"048\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"3905c32ac88397af271eb5549a278c4c34608b63\",\n" +
                "                    \"Белгородский, г. Белгород, ул. Губкина, д.17-А\",\n" +
                "                    \"138592053\",\n" +
                "                    \"Доп.офис №8592/053\",\n" +
                "                    \"8592\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"053\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"f480a7b190097b8e5d9afdc3c06a7b42ee2f64b6\",\n" +
                "                    \"Старооскольский, г. Старый Оскол, ул. микрорайон Макаренко, д.4Г\",\n" +
                "                    \"1385920628\",\n" +
                "                    \"Доп.офис №8592/0628\",\n" +
                "                    \"8592\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"0628\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"66095a61b43be2cfaaadf69985ae43e267a75759\",\n" +
                "                    \"г. Белгород, ул. Гражданский, 18\",\n" +
                "                    \"138592071\",\n" +
                "                    \"Доп.офис №8592/071\",\n" +
                "                    \"8592\",\n" +
                "                    \"Массовый высокодоходный сегмент,Массовый сегмент\",\n" +
                "                    \"13\",\n" +
                "                    \"071\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"22c512d2d61e54a628fda61ca6d7cf39418cfbc6\",\n" +
                "                    \"г. Белгород, пр-т Гражданский проспект, д.52\",\n" +
                "                    \"13859208592\",\n" +
                "                    \"Доп.офис №8592/08592\",\n" +
                "                    \"8592\",\n" +
                "                    \"Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"08592\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"823430862939aef5360fae71e93441242c0a47fd\",\n" +
                "                    \"г. Липецк, ул. Стаханова, д.41\",\n" +
                "                    \"1385930105\",\n" +
                "                    \"Доп.офис №8593/0105\",\n" +
                "                    \"8593\",\n" +
                "                    \"КК (крупнейшие клиенты),Массовый высокодоходный сегмент,Массовый сегмент,СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"0105\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"3c44431069332531e7e21bd5a8f42b5551c0aed4\",\n" +
                "                    \"г. Елец, ул. Комсомольская, д.81\",\n" +
                "                    \"1385930700\",\n" +
                "                    \"Доп.офис №8593/0700\",\n" +
                "                    \"8593\",\n" +
                "                    \"КБ (крупный бизнес),КК (крупнейшие клиенты),Клиенты машиностроения(ОПК),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес),Финансовые институты\",\n" +
                "                    \"13\",\n" +
                "                    \"0700\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"b94da1bffb8e21ccf06e76ba85ebdea3ba5367d7\",\n" +
                "                    \"г. Липецк, ул. Первомайская, д.2\",\n" +
                "                    \"13859308593\",\n" +
                "                    \"Доп.офис №8593/08593\",\n" +
                "                    \"8593\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"08593\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"03ba28e19003daa55bab8062ef072ca94609abc3\",\n" +
                "                    \"г. Тамбов, ул. Мичуринская, д.128В\",\n" +
                "                    \"13859403926\",\n" +
                "                    \"Доп.офис №8594/03926\",\n" +
                "                    \"8594\",\n" +
                "                    \"Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"03926\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"d368cd7197c3146091a95331fdc6e73472f63ae9\",\n" +
                "                    \"г. Мичуринск, шоссе Липецкое, д.55\",\n" +
                "                    \"1385940600\",\n" +
                "                    \"Доп.офис №8594/0600\",\n" +
                "                    \"8594\",\n" +
                "                    \"Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"0600\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"e95dcb8d83cbefabbc975cd7c2934d9fac578810\",\n" +
                "                    \"г. Тамбов, ул. Советская, д.119\",\n" +
                "                    \"138594077\",\n" +
                "                    \"Доп.офис №8594/077\",\n" +
                "                    \"8594\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"077\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"d068ff01f07c4a0980350a6151532202d155c1c0\",\n" +
                "                    \"г. Тамбов, ул. Носовская, д.8 стр.26\",\n" +
                "                    \"13859408463\",\n" +
                "                    \"Доп.офис №8594/08463\",\n" +
                "                    \"8594\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"08463\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"8ca8eee7e9a35c86264adaf28b40a593b7db73be\",\n" +
                "                    \"г. Орёл, ул. Комсомольская, д.189\",\n" +
                "                    \"138595014\",\n" +
                "                    \"Доп.офис №8595/014\",\n" +
                "                    \"8595\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"014\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"dbcb68fccb33b3fd2a4246ad5a68eb99761d5e42\",\n" +
                "                    \"г. Курск, ул. Димитрова, 52\",\n" +
                "                    \"1385960141\",\n" +
                "                    \"Доп.офис №8596/0141\",\n" +
                "                    \"8596\",\n" +
                "                    \"Массовый высокодоходный сегмент,МБ (малый бизнес),МкБ (микробизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"0141\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"031bb7d819b0456d22c7c22bc835d6c01ce1f11a\",\n" +
                "                    \"г. Курск, ул. Карла Маркса, д.55\",\n" +
                "                    \"1385960153\",\n" +
                "                    \"Доп.офис №8596/0153\",\n" +
                "                    \"8596\",\n" +
                "                    \"Массовый высокодоходный сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"0153\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"483f797b07397b00d011e97f685e7816a38b320e\",\n" +
                "                    \"Железногорский район, г. Железногорск, ул. Гайдара, д.5\",\n" +
                "                    \"1385960200\",\n" +
                "                    \"Доп.офис №8596/0200\",\n" +
                "                    \"8596\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"0200\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"d770148902d8c4eb9020cacce0cc70353b31a40a\",\n" +
                "                    \"г. Курск, ул. Дзержинского, д.69\",\n" +
                "                    \"138596024\",\n" +
                "                    \"Доп.офис №8596/024\",\n" +
                "                    \"8596\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"024\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    \"655c21daa1669069e1b9219a4113fd941e949be4\",\n" +
                "                    \"г. Курск, ул. Дейнеки, д.1\",\n" +
                "                    \"138596044\",\n" +
                "                    \"Доп.офис №8596/044\",\n" +
                "                    \"8596\",\n" +
                "                    \"КБ (крупный бизнес),Массовый высокодоходный сегмент,Массовый сегмент,МБ (малый бизнес),МкБ (микробизнес),СБ (средний бизнес)\",\n" +
                "                    \"13\",\n" +
                "                    \"044\"\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    }

    public static String getFreeEmployee() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    },\n" +
                "    \"data\": {\n" +
                "        \"id\": \"27d378d7-37b1-4300-93bd-a58baa9c1679\",\n" +
                "        \"kmCode\": \"1385920020499\",\n" +
                "        \"staffUnitId\": \"32637130-523b-11ee-9cd4-cb716f2d5a53\",\n" +
                "        \"employeeNumber\": \"00439599\"\n" +
                "    }\n" +
                "}";
    }

    public static String getDivisionTeams() {
        return "{\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    },\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": \"ab81f036-28a8-420d-b221-0eb0cb224c60\",\n" +
                "            \"version\": 1,\n" +
                "            \"kmCode\": \"3879820524407\",\n" +
                "            \"channelOwner\": \"PREMIER\",\n" +
                "            \"divisionCodeOwner\": \"38903801695\",\n" +
                "            \"type\": \"DEF\",\n" +
                "            \"status\": \"ACTIVE\",\n" +
                "            \"positions\": []\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"fd28165c-35a2-4089-aefc-5501c2afd551\",\n" +
                "            \"version\": 1,\n" +
                "            \"kmCode\": \"3879820524405\",\n" +
                "            \"channelOwner\": \"PREMIER\",\n" +
                "            \"divisionCodeOwner\": \"38903801695\",\n" +
                "            \"type\": \"DEF\",\n" +
                "            \"status\": \"ACTIVE\",\n" +
                "            \"positions\": []\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String tasksGetByFilter() {
        return "{\n" +
                "    \"responses\": [\n" +
                "        {\n" +
                "            \"ucpId\": 1778004645408054952,\n" +
                "            \"individual\": {\n" +
                "                \"id\": 1778004645408054952,\n" +
                "                \"version\": 4,\n" +
                "                \"individualName\": {\n" +
                "                    \"id\": 1778004645408054953,\n" +
                "                    \"name\": \"Петр\",\n" +
                "                    \"surname\": \"Николаев\",\n" +
                "                    \"patronymic\": \"Епифанов\"\n" +
                "                },\n" +
                "                \"birthDate\": {\n" +
                "                    \"birthDatestamp\": {\n" +
                "                        \"month\": 1,\n" +
                "                        \"year\": 1998,\n" +
                "                        \"day\":2\n" +
                "                    }\n" +
                "                },\n" +
                "                \"gender\": {\n" +
                "                    \"genderTypeCode\": \"1\"\n" +
                "                },\n" +
                "                \"segments\": [\n" +
                "                    1.0\n" +
                "                ]\n" +
                "            },\n" +
                "            \"error\": []\n" +
                "        },\n" +
                "        {\n" +
                "            \"ucpId\": 1143553489444605980,\n" +
                "            \"individual\": {\n" +
                "                \"id\": 1143553489444605980,\n" +
                "                \"version\": 41,\n" +
                "                \"individualName\": {\n" +
                "                    \"id\": 1143553489444605997,\n" +
                "                    \"name\": \"Валерий\",\n" +
                "                    \"surname\": \"Зайцев\",\n" +
                "                    \"patronymic\": \"Николаевич\"\n" +
                "                },\n" +
                "                \"birthDate\": {\n" +
                "                    \"birthDatestamp\": {\n" +
                "                        \"month\": 5,\n" +
                "                        \"year\": 1983,\n" +
                "                        \"day\":2\n" +
                "                    }\n" +
                "                },\n" +
                "                \"gender\": {\n" +
                "                    \"genderTypeCode\": \"3\"\n" +
                "                },\n" +
                "                \"segments\": [\n" +
                "                    1.0\n" +
                "                ]\n" +
                "            },\n" +
                "            \"error\": []\n" +
                "        }\n" +
                "    ],\n" +
                "    \"error\": []\n" +
                "}";
    }

    public static String resultDetailGet() {
        return "{\n" +
                "\t\"status\": {\n" +
                "\t\t\"code\": 0,\n" +
                "\t\t\"message\": \"Запрос успешно обработан\"\n" +
                "\t},\n" +
                "\t\"templateId\": \"cb33021b-eca1-4275-a6ac-cd18ea7d8143\",\n" +
                "\t\"types\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"type\": \"OFFER_REJECT_REASON\",\n" +
                "\t\t\t\"isTypeCustom\": false,\n" +
                "\t\t\t\"values\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"fa73a170-f50a-4db3-8a21-a5366cee132d\",\n" +
                "\t\t\t\t\t\"version\": 1,\n" +
                "\t\t\t\t\t\"value\": \"Есть более выгодное предложение в другом банке\",\n" +
                "\t\t\t\t\t\"isActive\": true\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"1e3c5f03-7c30-4069-b74c-0b95570f114f\",\n" +
                "\t\t\t\t\t\"version\": 1,\n" +
                "\t\t\t\t\t\"value\": \"Продукт интересен, но в будущем\",\n" +
                "\t\t\t\t\t\"isActive\": true\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"879754af-87ae-40e5-97b5-49e5cfb9cc2b\",\n" +
                "\t\t\t\t\t\"version\": 1,\n" +
                "\t\t\t\t\t\"value\": \"Выбрал другую идею/продукт\",\n" +
                "\t\t\t\t\t\"isActive\": true\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"94edc93c-9270-4e28-a14f-b7958ed64ff7\",\n" +
                "\t\t\t\t\t\"version\": 1,\n" +
                "\t\t\t\t\t\"value\": \"Нужны деньги на другую цель\",\n" +
                "\t\t\t\t\t\"isActive\": true\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"ad2494e1-1021-4051-85f8-b300eebd86a6\",\n" +
                "\t\t\t\t\t\"version\": 1,\n" +
                "\t\t\t\t\t\"value\": \"Уже оформил самостоятельно\",\n" +
                "\t\t\t\t\t\"isActive\": true\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"e2dc8875-b2be-4ac5-b2c2-1a9703ebb1d9\",\n" +
                "\t\t\t\t\t\"version\": 2,\n" +
                "\t\t\t\t\t\"value\": \"Негатив к продукту\",\n" +
                "\t\t\t\t\t\"isActive\": true\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"11c93a80-3570-4854-ae70-4d7d5f0d43a5\",\n" +
                "\t\t\t\t\t\"version\": 2,\n" +
                "\t\t\t\t\t\"value\": \"Негатив/потеря доверия к банку\",\n" +
                "\t\t\t\t\t\"isActive\": true\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"d728a540-ed6f-4b3d-aa68-10aefeec3c46\",\n" +
                "\t\t\t\t\t\"version\": 2,\n" +
                "\t\t\t\t\t\"value\": \"Другое\",\n" +
                "\t\t\t\t\t\"isActive\": true\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"type\": \"ACCEPT\",\n" +
                "\t\t\t\"isTypeCustom\": false,\n" +
                "\t\t\t\"values\": null\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
    }

    public static String resultDetailUpdate() {
        return "{\n" +
                "    \"status\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"Запрос успешно обработан\"\n" +
                "    },\n" +
                "    \"templateId\": \"cb33021b-eca1-4275-a6ac-cd18ea7d8143\",\n" +
                "    \"types\": [\n" +
                "        {\n" +
                "            \"type\": \"ACCEPT\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"bfb6089f-51a7-47d9-a218-13d5e855175e\",\n" +
                "                    \"version\": 1,\n" +
                "                    \"value\": \"Новый\",\n" +
                "                    \"isActive\": true,\n" +
                "                    \"isSuccess\": true\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    public static String getTemplates() {
        return "{\n" +
                "    \"status\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"Запрос успешно обработан\"\n" +
                "    },\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": \"4728d8a9-6332-40a4-bbde-65553997d167\",\n" +
                "            \"version\": 1,\n" +
                "            \"createdBy\": \"00000000|SB1_PRIORITY_CALC_JOB\",\n" +
                "            \"createdDate\": \"2024-05-20T13:24:09.483\",\n" +
                "            \"updatedBy\": \"00000000|SB1_PRIORITY_CALC_JOB\",\n" +
                "            \"updatedDate\": \"2024-05-20T13:24:09.483\",\n" +
                "            \"cjName\": \"тест VIP55\",\n" +
                "            \"userCampaignName\": \"тест VIP55\",\n" +
                "            \"campaignSegment\": null,\n" +
                "            \"taskType\": \"SERVICE\",\n" +
                "            \"priority\": 50,\n" +
                "            \"capacity\": 15,\n" +
                "            \"isDue\": false,\n" +
                "            \"lastCjDate\": \"2024-05-20\",\n" +
                "            \"sourceSystem\": \"CA\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"count\": 61\n" +
                "}\n";
    }

    public static String getFiltersTemplates() {
        return "{\n" +
                "    \"status\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"Запрос успешно обработан\"\n" +
                "    },\n" +
                "    \"filtersRequested\": [\n" +
                "        {\n" +
                "            \"name\": \"SOURCE_SYSTEM\",\n" +
                "            \"valuesAvailable\": [\n" +
                "                {\n" +
                "                    \"value\": \"CC\",\n" +
                "                    \"name\": \"ЕРКЦ\",\n" +
                "                    \"count\": 18\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"TASK_TYPE\",\n" +
                "            \"valuesAvailable\": [\n" +
                "                {\n" +
                "                    \"value\": \"CHANGE_SEGMENT\",\n" +
                "                    \"name\": \"Изменение сегмента\",\n" +
                "                    \"count\": 15\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"CAMPAIGN_SEGMENT\",\n" +
                "            \"valuesAvailable\": [\n" +
                "                {\n" +
                "                    \"value\": \"test_campaignSegment1|21387007\",\n" +
                "                    \"name\": \"test_campaignSegment1|21387007\",\n" +
                "                    \"count\": 1\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}\n";
    }

    public static String getUpdateTemplates() {
        return "{\n" +
                "    \"status\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"Запрос успешно обработан\"\n" +
                "    },\n" +
                "    \"id\": \"4728d8a9-6332-40a4-bbde-65553997d167\",\n" +
                "    \"version\": 2\n" +
                "}\n";
    }

    public static String getByTeamId() {
        return "{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": \"3933b0c3-9007-48b3-9b10-1b57356c85ce\",\n" +
                "            \"clients\": [\n" +
                "                {\n" +
                "                    \"epkId\": \"12345678\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"statusInfo\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"OK\"\n" +
                "    }\n" +
                "}";
    }

    public static String getByClientId() {
        return "{\n" +
                "  \"statusInfo\" : {\n" +
                "    \"code\" : 0,\n" +
                "    \"message\" : \"string\"\n" +
                "  },\n" +
                "  \"data\" : {\n" +
                "    \"epkId\" : \"1365344737333390792\",\n" +
                "    \"segment\": \"3\",\n" +
                "    \"version\":21,\n" +
                "    \"sourceId\": \"0778e3a1-1101-44dd-812a-409b8a5b1efd\",\n" +
                "    \"criteria\" : {\n" +
                "      \"id\" : \"2e25b362-8063-4abf-9965-b19a14d333b1\"\n" +
                "    },\n" +
                "    \"status\": \"ACTIVE\",\n" +
                "    \"note\" : {\n" +
                "      \"text\" : \"qqq note\",\n" +
                "      \"createDate\" : \"2022-06-30T11:57:21.96536+03:00\",\n" +
                "      \"changedBy\" : \"Краснова Ольга Михайловна\"\n" +
                "    },\n" +
                "    \"teams\" : [ {\n" +
                "      \"id\" : \"9c13e675-7760-47bd-b90e-5ba440c1fdb2\",\n" +
                "      \"kmCode\" : \"4290420102377\",\n" +
                "      \"divisionCode\" : \"38903800000\",\n" +
                "      \"channel\":\"VIP\",\n" +
                "      \"link\": {\n" +
                "        \"id\": \"2ca43483-5eee-4c8e-a8dc-1c63d2a0d289\",\n" +
                "        \"name\": \"MAIN\",\n" +
                "        \"description\": \"Основная\"\n" +
                "      }\n" +
                "    }]\n" +
                "  }\n" +
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
                "                \"EFS_VIP_TB\",\n" +
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

    public static String getGeneralCounters() {
        return "{\n" +
                "    \"status\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"success\"\n" +
                "    },\n" +
                "    \"counters\": {\n" +
                "        \"plannedTasks\": 0,\n" +
                "        \"dueTasks\": 21,\n" +
                "        \"totalTasks\": 21\n" +
                "    }\n" +
                "}";
    }

    public static String getCountersByClients() {
        return "{\n" +
                "    \"status\": {\n" +
                "        \"code\": 0,\n" +
                "        \"message\": \"success\"\n" +
                "    },\n" +
                "    \"counters\": [\n" +
                "        {\n" +
                "            \"ucpId\": \"1428105050034864952\",\n" +
                "            \"tasksCount\": 12\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}