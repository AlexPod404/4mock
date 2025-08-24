package sb1.stub.armsb_clients.dummy.webservice;


import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;
import sb1.stub.armsb_clients.dummy.data.hardcode.Jsons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
public class WebController {

    static long delta = 100L;

    //createContext  - 1 - clients/srvgetclientlist
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/srvgetclientlist", produces = "application/json")
    public String clients(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        if (requestText.contains("GetCompanionsByClientId")) {
            respText = Jsons.getCompanions();
        } else if (requestText.contains("GetEmployees")) {
            respText = Jsons.getEmployees();
        /*} else if (requestText.contains("GetClients")) {
            respText = Jsons.GetClients();*/
        /*} else if (requestText.contains("{\"secondName\":\"Ivanov\",\"segment\":\"3\",")) {
            respText = Jsons.getVipClientsByFullName();*/
        } else if (requestText.contains("{\"lastName\":\"Ivanov\",")) {
            respText = Jsons.getVipClientsByFullName();
        } else if (requestText.contains("ARMSB_CLIENTS")) {
            respText = Jsons.getAllClients();
        } else if (//changeSegmentService
                (requestText.startsWith("{\"epkId\":")) &&
                        (requestText.length() < 35)) {
            respText = Jsons.getChangeSegmentService();
        } else if (requestText.contains("\"dateFrom\": \"2024-04-10\"")) {
            respText = Jsons.getPageByFilter();
        } else if (requestText.contains("\"massMailingId\": \"c6466dd4-f5af-40b3-8dfb-2146e8e3686b\"")) {
            respText = Jsons.getMailingInfoPageByFilters();
        } else if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        Thread.sleep(delta);
        return respText;
    }

    //createContext  - 1 - clients/srvgetclientlist
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "armsb/clients/v1/rest/getClientsForMassMailing", produces = "application/json")
    public String clientsMM(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        respText = Jsons.getMailingInfoPageByFilters();
        Thread.sleep(delta);
        return respText;
    }

    //createContext  - 1 - clients/srvgetclientlist
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/get", produces = "application/json")
    public String tasksGetByFilter(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        respText = Jsons.tasksGetByFilter();
        Thread.sleep(delta);
        return respText;
    }


    //createContext  - 1 - clients/srvgetclientlist
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/srvgetclientlist/clients/searchByLastName", produces = "application/json")
    public String clientsLN(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        respText = Jsons.getVipClientsByFullName();
        Thread.sleep(delta);
        return respText;
    }

    //createContext  - 2 - clients/pprbBhepService
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/pprbBhepService", produces = "application/json")
    public String clients2(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        if (requestText.contains("{\"method\":\"search\",\"id\":\"2\",")) {//pprbBhepService
            respText = Jsons.pprbBhepService();
        } else if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        Thread.sleep(delta);
        return respText;
    }

    //createContext  - 3 - /clients/getByTeamId
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/pprbClients/clients/getByTeamId", produces = "application/json")
    public String getByTeamId(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.pprbClients();
    }

    //createContext  - 4 - clients/teams/get
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/teams/get", produces = "application/json")
    public String getTeams(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getTeams();
    }

    //createContext  - 5 - /clients/ucpclients/clients/get
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/ucpclients/clients/get", produces = "application/json")
    public String getUspClients(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.ucpClients();
    }

    //createContext  - 6 - что-то для /send
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/employee/com.sbt.bpspe.core.json.rpc.api.Employee", produces = "application/json")
    public String forSend(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.forSend();
    }


    //createContext  - 3 - clients/teams/get
    /*@SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/teams/get", produces = "application/json")
    public String clients3(@RequestBody String newJsonBody){
        String respText = "";
        String requestText = newJsonBody;
        if (requestText.contains("divisionCodeOwner")) {//teams/getFull
            respText = Jsons.getTeams();
        }
        else if(requestText.length() == 0) {
            respText = Jsons.ErrorRequest();
        }
        Thread.sleep(delta);
        return respText;
    }*/

    //createContext  - 4 - clients/pprbClients
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/pprbClients", produces = "application/json")
    public String clients4(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        if (requestText.contains("\"channel\":\"VIP\",\"kmCode\":[],\"id\":[],\"type\":\"DEF\",\"status\":[\"ACTIVE")) {//teams/getFull
            respText = Jsons.getTeams();
        }
        /*else if (requestText.contains("linkTypeId")) {//pprbClients
            respText = Jsons.pprbClients();
        }*/
        else if (requestText.contains("{\"id\": [")) {
            respText = Jsons.getClientsId();
        } else if (requestText.contains("\",\"changedBy\":\"NOT_FOUND\",\"status\":\"INACTIVE\"")) {//pprbClients
            respText = Jsons.getChangedBy();
        } else if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        Thread.sleep(delta);
        return respText;
    }


    //createContext  - 5 - clients/ucpclients
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/clients/ucpclients", produces = "application/json")
    public String clients5(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        if (requestText.contains("ucpIds")) {//ucpclients
            respText = Jsons.ucpClients();
        } else if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        Thread.sleep(delta);
        return respText;
    }

    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/sbpemployeeinfo/v1/employee", produces = "application/json")
    public String employee() {
        Thread.sleep(delta);
        return Jsons.employee();
    }


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
