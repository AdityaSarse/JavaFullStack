package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = SpringApplication.run(MyappApplication.class, args);

        Dev obj = context.getBean(Dev.class);

        obj.build();
    }
}
