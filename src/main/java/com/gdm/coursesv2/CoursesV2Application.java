package com.gdm.coursesv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories("com.gdm.coursesv2.*")
@ComponentScan(basePackages = { "com.gdm.coursesv2.*" })
@EntityScan("com.gdm.coursesv2.*")
public class CoursesV2Application {

    public static void main(String[] args) {
        SpringApplication.run(CoursesV2Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
                        .allowedOrigins("http://localhost:4200");
            }
        };
    }
}
