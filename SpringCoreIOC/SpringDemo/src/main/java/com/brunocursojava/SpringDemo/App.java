package com.brunocursojava.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Alien obj1 = (Alien) context.getBean("alien");
        obj1.code();
        
        System.out.println(obj1.getAge());
        
        /*
	        Usando diferente scope no spring.xml a variavel age muda, sendo que prototype cria um
	        novo objeto fazendo age = 0, já o singleton usa a já existente fazendo com que o obj2.age = obj1.age
		*/
//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.age);
    }
}
