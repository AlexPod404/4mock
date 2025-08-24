package sb1.stub.client_cti.dummy.webservice;


import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import sb1.stub.client_cti.dummy.data.hardcode.Jsons;

@Slf4j
@RestController
public class WebController {

    static long delta = 100L;

    /** СУП - ufs.baseurl.bhep;*/
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/cti/getCommunications", produces = "application/json")
    public String getCommunications() {
        Thread.sleep(delta);
        return Jsons.getCommunications();
    }

    /** СУП - ufs.baseurl.getclientphone*/
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/cti/getClientPhones", produces = "application/json")
    public String getClientPhones() {
        Thread.sleep(delta);
        return Jsons.getClientPhones();
    }

    /** СУП - ufs.baseurl.call*/
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/cti/call/init", produces = "application/json")
    public String initCall() {
        Thread.sleep(delta);
        return Jsons.initCall();
    }

    /** СУП - ufs.baseurl.addressbook*/
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/employees/{fullEmployeeNumber}/phones", produces = "application/json")
    public String addressBook(@PathVariable String fullEmployeeNumber) {
        Thread.sleep(delta);
        return Jsons.addressBook();
    }

    /** СУП - ufs.baseurl.sbpemployeeinfo_http_client*/
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/sbpemployeeinfo/v1/employee", produces = "application/json")
    public String employee() {
        Thread.sleep(delta);
        return Jsons.employee();
    }

    /** СУП - ufs.baseurl.teams*/
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/positions/get", produces = "application/json")
    public String positionsGet() {
        Thread.sleep(delta);
        return Jsons.positionsGet();
    }

    /** СУП - ufs.baseurl.callStates + бек на конце поставить callId из запроса, возможно надо будет параметр-ть*/
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/cti/setNotification", produces = "application/json")
    public String setNotification() {
        Thread.sleep(delta);
        return Jsons.setNotification();
    }

    /** СУП - ufs.baseurl.pprbNotification*/
    @SneakyThrows(Exception.class)
    @RequestMapping(value = "/pprbNotification", produces = "application/json")
    public String pprbNotification() {
        Thread.sleep(delta);
        return Jsons.pprbNotification();
    }

    /** Выставление задержки на заглушке*/
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
