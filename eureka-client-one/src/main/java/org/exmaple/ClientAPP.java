package org.exmaple;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientAPP {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ClientAPP.class).web(true).run(args);
	}

	@GetMapping("/index")
	public String index() {
		return "hello world!!!";
	}

}
