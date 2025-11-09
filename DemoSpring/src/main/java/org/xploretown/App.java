package org.xploretown;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Dev dev = (Dev) applicationContext.getBean("dev");
        dev.build();
    }
}
