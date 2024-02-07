package com.cursojava;

import com.cursojava.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Usando Java Based Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = (Alien) context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

        Desktop dt = context.getBean(Desktop.class);
        dt.compile();

        Desktop dt1 = context.getBean(Desktop.class);
        dt.compile();



        //Usando XML
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = (Alien) context.getBean("alien", Alien.class);
//        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();
    }
}
