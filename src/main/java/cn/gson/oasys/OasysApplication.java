package cn.gson.oasys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//使用jar方式部署
//@SpringBootApplication
//public class OasysApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(OasysApplication.class, args);
//	}
//}

//使用war方式部署
@SpringBootApplication
public class OasysApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OasysApplication.class, args);
	}
}

