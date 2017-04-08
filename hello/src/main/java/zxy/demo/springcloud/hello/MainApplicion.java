package zxy.demo.springcloud.hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class MainApplicion {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplicion.class, "--server.port=8081");
	}

}