package com.cursojava.config;

import com.cursojava.Alien;
import com.cursojava.Computer;
import com.cursojava.Desktop;
import com.cursojava.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.cursojava")
public class AppConfig {

    //Por ter colocado @Component em cima das classes, apenas o @ComponentScan("...")
    // é o suficiente para fazer a configuração de forma automatica.


//    @Bean
//    public Alien alien(Computer com){ //@Qualifier("desktop1")
//        Alien obj = new Alien();
//        obj.setAge(19);
//        obj.setCom(com);
//
//        return obj;
//    }
//
//    @Bean(name = {"com1","desktop1"})
//    //@Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
