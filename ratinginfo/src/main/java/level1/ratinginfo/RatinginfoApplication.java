package level1.ratinginfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatinginfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatinginfoApplication.class, args);
	}

}
