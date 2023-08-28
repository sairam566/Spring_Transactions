package com.tsr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tsr.model.Person;
import com.tsr.model.Product;
import com.tsr.service.RegistrationService;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tsr/config/application-context.xml");

		RegistrationService registrationService = context.getBean("registrationService", RegistrationService.class);

		Person person = new Person();
		person.setName("sai");
		person.setCountry("India");

		Product product = new Product();
		product.setName("Iphone");
		product.setPrice(56566);

		registrationService.regPersonPrduct(product, person);

		context.close();

	}

}
