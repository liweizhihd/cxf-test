package poc.cloudwise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import poc.cloudwise.cxfclient.HelloService;
import poc.cloudwise.cxfclient.HelloServiceImplService;

@Controller
public class MainController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        ModelAndView model = new ModelAndView("HelloWorldPage");
        model.addObject("msg", "pong");
        return model;
    }

    @RequestMapping(value = "/cxf/say", method = RequestMethod.GET)
    public ModelAndView cxfSay(String name) {
        HelloService helloServiceImplPort = new HelloServiceImplService().getHelloServiceImplPort();
        ModelAndView model = new ModelAndView("HelloWorldPage");
        model.addObject("msg", helloServiceImplPort.say(name));
        return model;
    }
}
