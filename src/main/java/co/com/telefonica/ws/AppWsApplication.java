package co.com.telefonica.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppWsApplication.class, args);
    }

}
