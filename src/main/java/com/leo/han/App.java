package com.leo.han;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import com.leo.han.beans.User;


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
        
        
       JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
       
       ObjectMessage msg = (ObjectMessage)jmsTemplate.receive();
       
       User user = (User) msg.getObject();
       
       System.out.println("User Name:  "+user.getUsername());
       System.out.println("User Age:  "+user.getAge());
       System.out.println("User Name:  "+user.getComment());
    }
}
