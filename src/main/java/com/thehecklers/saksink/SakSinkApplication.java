package com.thehecklers.saksink;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@SpringBootApplication
public class SakSinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SakSinkApplication.class, args);
    }

}

@Configuration
class ConfigSink {
    @Bean
    Consumer<Greeting> logGreeting() {
		return System.out::println;
    }
}

@Data
@AllArgsConstructor
class Greeting {
    private final Long id;
    private final String text;
}