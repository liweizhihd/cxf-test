package poc.cloudwise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import poc.cloudwise.cxfclient.HelloService;
import poc.cloudwise.cxfclient.HelloServiceImplService;

@Controller
@ResponseBody
public class MainController {


    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() {
        return "pong";
    }

    @RequestMapping(value = "/cxf/say/{name}", method = RequestMethod.GET)
    public String cxfSay(@PathVariable("name") String name) {
        HelloService helloServiceImplPort = new HelloServiceImplService().getHelloServiceImplPort();
        return helloServiceImplPort.say(name);
    }
}
