package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.domain.Demo;
import com.example.demo.repository.DemoRepository;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class },
scanBasePackages={"com.example.demo.DemoApplication", 
"com.example.demo.DemoRepository"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan(basePackages = {"com.example.demo"})
@EntityScan("com.example.demo.domain")
@EnableJpaRepositories("com.example.demo.repository")
public class DemoApplication implements CommandLineRunner {
	
	@Autowired 
	DemoRepository demoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Demo demo = new Demo(null, "Demo");
		Demo demo2 = new Demo(null, "Demo 2");
		
		demoRepository.saveAll(Arrays.asList(demo, demo2));
	}
}
