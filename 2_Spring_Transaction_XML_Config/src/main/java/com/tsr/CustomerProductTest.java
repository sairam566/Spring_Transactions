package com.tsr;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tsr.controller.CustomerProductController;
import com.tsr.form.CustomerProductForm;

public class CustomerProductTest
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/config/application-context.xml");
        CustomerProductController controller = applicationContext.getBean("customerProductController",CustomerProductController.class);
        CustomerProductForm form = new CustomerProductForm( "sai", new Date(), "Male", "Iphone-15", 150000);
        controller.addCustomerProduct(form);
    }
}
