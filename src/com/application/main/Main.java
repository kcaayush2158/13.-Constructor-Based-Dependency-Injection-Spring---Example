package com.application.main;

import com.application.model.Message;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Message message = context.getBean("message", Message.class);
       message.communicate();
        context.close();

    }
}
