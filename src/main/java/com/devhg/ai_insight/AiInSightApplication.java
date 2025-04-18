package com.devhg.ai_insight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaRepositories(basePackages = "com.devhg.ai_insight.repository")
public class AiInSightApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiInSightApplication.class, args);
    }

}
