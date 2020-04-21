package poc.cloudwise.controller;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Value("${wsdlUrl.say}")
    private String wsdlUrl;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        ModelAndView model = new ModelAndView("index");
//        model.addObject("msg", "pong");
        model.addObject("msg", wsdlUrl);
        return model;
    }

    @RequestMapping(value = "/cxf/say", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object cxfSay(String name) throws Exception {
        try {
            JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
            Client client = clientFactory.createClient(wsdlUrl);
            Object[] result = client.invoke("say", name);
            return result[0];
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    public static void main(String[] args) throws Exception {
        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://localhost:8080/cxfserver/ws/soap/hello?wsdl");
        Object[] result = client.invoke("say", "KEVIN");
        System.out.println(result[0]);
    }
}
