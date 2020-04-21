package poc.cloudwise.service.impl;

import org.springframework.stereotype.Service;
import poc.cloudwise.service.HelloService;

import javax.jws.WebService;

/**
 * @author liweizhi
 * @date 2020/1/8 14:07
 */
@Service("helloServiceImpl")
@WebService(
        endpointInterface = "poc.cloudwise.service.HelloService"
        , serviceName = "helloService"
        , targetNamespace = "http://service.cloudwise.poc/"
)
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "hello, " + name + "!";
    }
}
