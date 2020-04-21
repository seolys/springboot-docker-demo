package seol.study.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 구성방법 : https://www.youtube.com/watch?v=agbpWm2Ho_I
 * 요약 : https://secr.tistory.com/519
 */
@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello Spring Boot 0.0.1";
	}

}
