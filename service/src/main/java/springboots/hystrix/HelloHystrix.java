package springboots.hystrix;

import org.springframework.stereotype.Component;
import springboots.feignClient.IHelloServiceExt;

/**
 * hello服务熔断器
 */
@Component
public class HelloHystrix implements IHelloServiceExt {
	@Override
	public String sayHello(String name) {
		return "hello:"+name+" I am port 9003, sorry, you message send failed";
	}
}
