package io.github.gdimitriu.wstestserver.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.github.gdimitriu.wstestserver")
public class WSServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WSServerApplication.class, args);
    }
}
