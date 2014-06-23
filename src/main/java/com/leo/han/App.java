package com.leo.han;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leo.han.beans.User;
import com.leo.han.services.SampleService;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws JMSException
    {
        System.out.println( "start" );
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:client-config.xml");
        
        
       SampleService sampleService = context.getBean(SampleService.class);
       
       String result = sampleService.getServiceMessage("Hello", "World");
       
       System.out.println("Result:   "+result);

    }
}
