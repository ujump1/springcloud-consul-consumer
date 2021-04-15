package springboots;

import api.IHelloProducerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboots.feignClient.IHelloServiceExt;

import javax.annotation.Resource;

@RestController
@RequestMapping("/helloProducer")
public class HelloController implements IHelloProducerService {

    @Resource
    private IHelloServiceExt helloServiceExt;

    @Override
    public String sayHello(String name) {
        return helloServiceExt.sayHello(name) ;
    }
}