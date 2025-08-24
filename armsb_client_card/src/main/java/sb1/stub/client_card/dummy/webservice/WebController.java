package sb1.stub.client_card.dummy.webservice;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;
import sb1.stub.client_card.dummy.data.hardcode.Jsons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
public class WebController {

    static long delta = 100L;

    /**
     * sup - ufs.baseurl.sbpemployeeinfo_http_client
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/sbpemployeeinfo/v1/employee", produces = "application/json")
    public String employee() {
        Thread.sleep(delta);
        return Jsons.employee();
    }

    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/positions/get", produces = "application/json")
    public String getByClient(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getClientCard_new();
    }

    //notification /sbpcontext_init
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/getClientCardFromCRMandEPK/rest/v1/context", produces = "application/json")
    public String getSbpContext(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getSbpContextInit();
    }

    //notification  - что-то для /send
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/employee/com.sbt.bpspe.core.json.rpc.api.Employee", produces = "application/json")
    public String forSend(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.forSend();
    }

    //notification  - /send
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/send", produces = "application/json")
    public String send(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.send();
    }
    //notification  - что то для /getPageByFilter
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/getCompanies", produces = "application/json")
    public String getCompanies(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getCompanies();
    }

    //notification  -
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/getInfoByCompanyId", produces = "application/json")
    public String getInfoByCompanyId(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getInfoByCompanyId();
    }
    //sup - ufs.baseurl.teams;
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/teams/get", produces = "application/json")
    public String getTeamsGet(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getTeamsGet();
    }

    //sup - ufs.baseurl.bhep;
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/getClientCardFromCRMandEPK", produces = "application/json")
    public String clients(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        //getClientCard from CRM
        if (requestText.contains("urn:sbrfsystems:99-crm")) {
            respText = Jsons.getClientCardFromCRM();
        } else if (requestText.contains("\"ucpId\":")
                && !requestText.contains("updateDateTime")
                && !requestText.contains("ARMSB_NOTIFICATION")) {//getClientCard from EPK
            respText = Jsons.getClientCardFromEPK_ORGIGINAL();
        }//getClientSatellite
        else if (requestText.contains("ucpIdSatellite")) {
            //respText = Jsons.getSatelliteFromEPK();
            respText = Jsons.getAddDelSatellite();
        }//update
        else if (requestText.contains("updateDateTime")) {
            respText = Jsons.getUpdateCard();
        }//addSatellite + removeSatellite
        else if (requestText.contains("servicedVipVsp")) {
            respText = Jsons.getAddDelSatellite();
        }//notes/update
        else if (requestText.contains("LoadRunner obnovlenie notes")) {
            respText = Jsons.getNotesUpdate();
        }//notes/get
        else if (requestText.contains("\"pagination\":{\"limit\":10}")) {
            respText = Jsons.getNotesGet();
        }//getAdditionalInfo
        else if ((requestText.startsWith("{\"epkId\":")) &&
                (requestText.length() < 32)) {
            respText = Jsons.getAdditionalInfo();
        }//teams/get
        else if (requestText.contains("{\"channel\":\"VIP\",\"kmCode\":[],\"id\":[\"c0888085-701d-441b-a344-21d588621673\"]}")) {
            respText = Jsons.getTeamsGet();
        } else if (requestText.contains("{\"kmCode\":[],\"id\":[\"9c13e675-7760-47bd-b90e-5ba440c1fdb2\"],\"staffUnitId\":[]," +
                "\"status\":[],\"ossPositionCode\":[]}")) {
            respText = Jsons.getTeamsGet();
        } else if (requestText.contains("{\"kmCode\":[],\"id\":[")) {
            respText = Jsons.getTeamsGet();
        }//getTeamsGet
        else if (
                (requestText.startsWith("{\"kmCode\":[],\"id\":[\"")) &&
                        (requestText.endsWith("\"],\"status\":[]}")) &&
                        //так как совпадает с getMarkingTeam анализирую айди
                        //у getMarkingTeam константа
                        (!requestText.contains("a10945a4-cfde-4531-acdb-d10f04a97d3b")) &&
                        (requestText.length() < 72)) {
            respText = Jsons.getTeamsGet();
        } //updateAdditionalInfo
        else if ((requestText.contains("{\"criteriaId\":\"8051b304-73a4-4907-abad-82b4eafece39\",\"changedBy\":\""))
                && (requestText.contains("\",\"epkId\":\""))) {
            respText = Jsons.getUpdateAdditionalInfo();
        }
        //else if(requestText.contains("{\"kmCode\":[],\"id\":[\"a10945a4-cfde-4531-acdb-d10f04a97d3b\"],\"status\":[]}")) {
        else if (requestText.contains("{\"kmCode\":[],\"id\":[\"a10945a4-cfde-4531-acdb-d10f04a97d3b\"],\"staffUnitId\":[]," +
                "\"status\":[],\"ossPositionCode\":[]}")) {
            respText = Jsons.getMarkingTeam();
        } else if (requestText.contains("{\"sysSenderUrn\":\"urn:sbrfsystems:99-ufs-sr\",\"subSystemCode\":\"ARMSB_NOTIFICATION\"")) {
            respText = Jsons.notifOfferAccept();
        } else if (requestText.contains("{\"sysSenderUrn\":\"urn:sbrfsystems:99-ufs-sr\",\"subSystemCode\":\"ARMSB_NOTIFICATION\",\"packageId\":\"")) {
            respText = Jsons.notifOfferAccept2();
        } else if (requestText.contains("{\"sbpServiceFormat\":\"REMOTE\",\"sbpFormatType\":\"APPEAL\",\"dt\":\"")) {
            respText = Jsons.sbpContextInit();
        } //encryptor/qliksense
        else if (requestText.contains("\"RqUID\":\"")
                && requestText.contains("\"SPName\":\"")
                && requestText.contains("\"hash_salt_epk_id\":\"")) {
            respText = Jsons.qliksense();
        }
        //это общий запрос не относящийся к МОДУЛЮ
        //похоже это /getEmployeeSession
        else if (requestText.contains("{\"channel\":\"VIP\",\"kmCode\":[],\"id\":[],\"type\":\"DEF\",\"employeeNumber\":\"")) {
            respText = Jsons.getInfoClient();
        } else if (requestText.contains("{\"channel\":\"VIP\",\"kmCode\":[],\"id\":[],\"type\":\"DEF\",\"staffUnitId\":[]," +
                "\"status\":[\"ACTIVE\"],\"ossPositionCode\":[\"20010601\"]}")) {
            respText = Jsons.getTypedTeams2();
        } else if (requestText.contains("{\"method\":\"searchAssignment\",\"id\":\"2\",\"jsonrpc\":\"2.0\"," +
                "\"params\":[{\"pagination\":{\"offset\":0.0,\"limit\":1.0},\"parameters\":[{\"modifier\":\"IN\",")) {
            respText = Jsons.getTypedTeams3();
        } else if (requestText.contains("\",\"teamId\":\"e47346a1-7048-4576-9523-df395f214fc1\"," +
                "\"linkTypeId\":\"d5ab0589-70f3-4200-95ab-1d16c14a01c1\",\"changedBy\":\"")) {
            respText = Jsons.teams_addLink();
        } else if (requestText.contains("{\"id\": [\"")) {
            respText = Jsons.teams_id();
        } else if (requestText.contains("\"epkId\":\"")
                && requestText.contains("\",\"changedBy\":\"")
                && requestText.contains(",\"linkTypeId\":[],\"links\":[\"cf623bd8-bd7f-4bb5-9055-8daea22ca7cc\"]}")) {
            respText = Jsons.teams_unlinkTeam();
        } else if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        Thread.sleep(delta);
        return respText;
    }
    //ECM - единое файловое вложение
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/services/create-structure", produces = "application/json")
    public String createStructure(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.createStructure();
    }
    //NetScan - регион файловых вложений
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/sbolpro/netscanbh/v1/file/setRegionConfig", produces = "application/json")
    public String setRegionConfig(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.setRegionConfig();
    }

    /**
     * Выставление задержки на заглушке
     */
    @RequestMapping(value = "/setDelta/{delta}")
    @ResponseBody
    public String setDelta(@PathVariable String delta) {
        WebController.delta = Long.parseLong(delta, 10);
        return "Set delta to: " + WebController.delta + "\n";
    }

    @RequestMapping(value = "/getDelta", method = RequestMethod.GET)
    @ResponseBody
    public String getDelta() {
        return "Delta is: " + WebController.delta + "\n";
    }
}
