package sb1.stub.armsb_tasks.dummy.webservice;


import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;
import sb1.stub.armsb_tasks.dummy.data.hardcode.Jsons;

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

    /**
     * sup - ufs.baseurl.teams + еще бэк сам припишет к нему концовку "clients/getByTeamId"
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/clients/getByTeamId", produces = "application/json")
    public String getByTeamId(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getByTeamId();
    }

    /**
     * Этот эндпойнт вызывается внутри при createMarking
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/clients/get", produces = "application/json")
    public String getByClientId(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getByClientId();
    }

    /**
     * sup - ufs.baseurl.templates
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/templates/get", produces = "application/json")
    public String getTemplates(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getTemplates();
    }

    /**
     * sup - ufs.baseurl.templates
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/templates/getFilters", produces = "application/json")
    public String getFiltersTemplates(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getFiltersTemplates();
    }

    /**
     * sup - ufs.baseurl.templates
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/templates/update", produces = "application/json")
    public String getUpdateTemplates(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getUpdateTemplates();
    }

    /**
     * sup - ufs.baseurl.tasksGetByFilter
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/getByFilter", produces = "application/json")
    public String tasksGetByFilter(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.tasksByFilter(result);
    }

    /**
     * sup - ufs.baseurl.getTask
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/getTaskById", produces = "application/json")
    public String getTask(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getTask(result);
    }

    /**
     * sup - ufs.baseurl.offers
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/offers", produces = "application/json")
    public String getOffer(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getOffer();
    }

    /**
     * sup - ufs.baseurl.getFilters
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/getFilters", produces = "application/json")
    public String getFilters(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getFilters();
    }

    /**
     * sup - ufs.baseurl.marking
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/marking/getById", produces = "application/json")
    public String getMarkingById(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getMarkingById();
    }

    /**
     * sup - ufs.baseurl.dictionary.service
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/data-dictionary-service/rest/pm/ver.4.0/getRows", produces = "application/json")
    public String premierDivisions(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.premierDivisions();
    }

    /**
     * Сервис пойдет с запросом по пути:  {значение суп-параметра ufs.baseurl.resultDetail}/values/get
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/values/get", produces = "application/json")
    public String resultDetailGet(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.resultDetailGet();
    }

    /**
     * Сервис пойдет с запросом по пути:  {значение суп-параметра ufs.baseurl.resultDetail}/values/update
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/values/update", produces = "application/json")
    public String resultDetailUpdate(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.resultDetailUpdate();
    }

    /**
     * Сервис пойдет в суп-параметр ufs.baseurl.tasksCounters + допишет на конце "getGeneralCounters"
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/getGeneralCounters", produces = "application/json")
    public String getGeneralCounters(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getGeneralCounters();
    }

    /**
     * Сервис пойдет в суп-параметр ufs.baseurl.tasksCounters + допишет на конце "getCountersByClients"
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/getCountersByClients", produces = "application/json")
    public String getCountersByClients(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getCountersByClients();
    }

    /**
     * createContext - 3 - tasks/positions/get
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/positions/get", produces = "application/json")
    public String getPositions(HttpServletRequest request, HttpServletResponse response) {
        String result = IOUtils.toString(request.getInputStream()); // ПОЛУЧАЕМ СТРОКУ ИЗ ТЕЛА ЗАПРОСА
        Thread.sleep(delta);
        return Jsons.getPositions();
    }

    /**
     * sup - ufs.baseurl.bhep;
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks", produces = "application/json")
    public String clients(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        if (requestText.contains("{\"method\":\"search\",\"id\":\"2\",\"jsonrpc\":\"2.0\"")) {
            respText = Jsons.search();
        }
        //getByFilter
        else if (requestText.contains("{\"ucpIds\":[1428105050034864952,1426354352652271068]}")) {
            respText = Jsons.tasksGetByFilter();
        }
        //taskUpdate
        else if (requestText.contains("{\"result\":\"APPROVAL\",\"editor\":\"")) {
            respText = Jsons.taskUpdate();
        }
        /**
         * sup - ufs.baseurl.markingSbDown
         * */
        else if ((requestText.contains("\"plannedTeamId\":\""))
                && (requestText.contains("\"processType\":\"VIP2MASS\""))) {
            respText = Jsons.getMarkingCreate();
        }
        //createMarking (совпадает с markingCheck в основном)
        else if ((requestText.startsWith("{\"epkId\":")) &&
                (requestText.length() < 35)) {
            respText = Jsons.createMarking();
        }
        //getFreeEmployee
        else if (requestText.contains("\"divisionCode\":\"13859200020\"")) {
            respText = Jsons.getFreeEmployee();
        } else if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        Thread.sleep(delta);
        return respText;
    }

    /**
     * createContext - 2 - tasks/teams/get
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/teams/get", produces = "application/json")
    public String clients2(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        if ((requestText.contains("\"type\":\"DEF\""))
                && (requestText.contains("\"status\":[\"ACTIVE\",\"INACTIVE\"]"))
                || (requestText.contains("{\"channel\":\"VIP\",\"kmCode\":[],\"id\":["))) {
            respText = Jsons.getTeams();
        }
        //teams/get
        if ((requestText.contains("\"kmCode\":[]"))
                && (requestText.contains("\"status\":[]"))) {
            respText = Jsons.getTeams();
        }
        //teams/get
        else if (requestText.contains("{\"divisionCodeOwner\":\"38903800566\",\"kmCode\":[],\"id\":[],\"status\":[\"ACTIVE\"]}")) {
            respText = Jsons.getDivisionTeams();
        }
        //getDivisionTeams
        else if (requestText.contains("{\"divisionCodeOwner\":\"38903800566\",\"channel\":\"VIP\",\"kmCode\":[]," +
                "\"id\":[],\"type\":\"DEF\",\"status\":[\"ACTIVE\"]}")) {
            respText = Jsons.getDivisionTeams();
        } else if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        Thread.sleep(delta);
        return respText;
    }

    /**
     * createContext - 5 - tasks/marking/check
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/marking/check", produces = "application/json")
    public String clients5(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        //markingCheck
        else if ((requestText.startsWith("{\"epkId\":"))
                && (requestText.length() < 35)) {
            respText = Jsons.getMarkingCheck();
        }
        Thread.sleep(delta);
        return respText;
    }

    /**
     * createContext - 5 - /tasks/teams/free
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/teams/free", produces = "application/json")
    public String clients6(@RequestBody String newJsonBody) {
        String requestText = newJsonBody;
        Thread.sleep(delta);
        return Jsons.getFreeTeams();
    }

    /**
     * createContext - 7 - tasks/marking/getByClient
     */
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/tasks/marking/getByClient", produces = "application/json")
    public String clients7(@RequestBody String newJsonBody) {
        String respText = "";
        String requestText = newJsonBody;
        if (requestText.length() == 0) {
            respText = Jsons.errorRequest();
        }
        //getMarkingByClient совпадает с createMarking и markingCheck в других заглушках
        else if ((requestText.startsWith("{\"epkId\":")) &&
                (requestText.length() < 35)) {
            respText = Jsons.getMarkingByClient();
        }
        Thread.sleep(delta);
        return respText;
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


