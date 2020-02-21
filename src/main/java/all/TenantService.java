package all;


import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2 
@EnableEurekaClient
@SpringBootApplication
public class TenantService {


	public static void main(String[] args) {
		SpringApplication.run(TenantService.class, args);
		
		//repo.saveAndFlush(e);
		
	}

	
	@LoadBalanced
	@Bean 
public RestTemplate getTemplate(){
		return new RestTemplate();
	}
	
	
}
