package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by adel.amodwala on 2/10/2017.
 */

 // JAR Version
@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableScheduling
@ImportResource("classpath:application-context.xml")
public class DemoApp {

   public static void main(String[] args) throws Exception {
       SpringApplication.run(DemoApp.class, args);
   }
}

// WAR Version
// @EnableAutoConfiguration
// @EnableTransactionManagement
// @EnableScheduling
// @ImportResource("classpath:application-context.xml")
// public class DemoApp extends SpringBootServletInitializer {
//
//     @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//         return application.sources(DemoApp.class);
//     }
// }
