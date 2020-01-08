package poc.cloudwise.service;

import javax.jws.WebService;

/**
 * @author liweizhi
 * @date 2020/1/8 14:06
 */
@WebService
public interface HelloService {
    String say(String name);
}
