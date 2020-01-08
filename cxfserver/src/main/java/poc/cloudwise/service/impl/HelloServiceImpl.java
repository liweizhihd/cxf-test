package poc.cloudwise.service.impl;

import org.springframework.stereotype.Service;
import poc.cloudwise.service.HelloService;

/**
 * @author liweizhi
 * @date 2020/1/8 14:07
 */
@Service("helloServiceImpl")
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "hello, " + name + "!";
    }
}
