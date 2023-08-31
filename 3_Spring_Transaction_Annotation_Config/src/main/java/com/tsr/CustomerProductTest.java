package com.tsr;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tsr.config.RootConfig;
import com.tsr.controller.CustomerProductController;
import com.tsr.form.CustomerProductForm;

public class CustomerProductTest
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
        CustomerProductController controller = applicationContext.getBean("customerProductController",CustomerProductController.class);
        CustomerProductForm form = new CustomerProductForm( "Ram", new Date(), "Male", "MacBook Pro", 150000);
        controller.addCustomerProduct(form);
    }
}
