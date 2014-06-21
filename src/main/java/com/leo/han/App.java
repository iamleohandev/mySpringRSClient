package com.leo.han;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leo.han.services.CalculateService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "start" );
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:client-config.xml");
        
        CalculateService service = context.getBean(CalculateService.class);
        
        
        System.out.println(service.getSummary());
        
        System.out.println(service.sum(20, 30)); 
        System.out.println( "end" );
        
    }
}
