package springboots.feignClient;



import springboots.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 这个可以通过引入其他模块的包来引入(如果需要熔断器的话这种分api和service的只有在service重写该interface）
 */
@FeignClient(value = "spring-cloud-consul-producer",path = "hello",fallback = HelloHystrix.class)
public interface IHelloServiceExt {

	@GetMapping("/sayHello")
	String sayHello(@RequestParam(value = "name") String name);

}
