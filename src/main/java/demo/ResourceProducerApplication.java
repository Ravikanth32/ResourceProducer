package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.cgsinc.model","com.cgsinc.service","com.cgsinc.controller"})
public class ResourceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceProducerApplication.class, args);
    }
}
