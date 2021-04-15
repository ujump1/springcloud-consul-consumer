package api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 提供api给其他服务（打包）
 */
@FeignClient(name="spring-cloud-consul-consumer",path = "helloProducer")
public interface IHelloProducerService {

	@GetMapping("/sayHello")
	String sayHello(String name);

}
