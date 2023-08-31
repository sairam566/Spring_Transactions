package com.tsr.controller;

import org.springframework.stereotype.Controller;

import com.tsr.form.CustomerProductForm;
import com.tsr.service.RegisterService;

@Controller
public class CustomerProductController {
	
	private RegisterService registerService;

	public CustomerProductController(RegisterService registerService) {
		super();
		this.registerService = registerService;
	}
	
	public boolean addCustomerProduct(CustomerProductForm customerProductForm) {
		return registerService.register(customerProductForm);
	}
}
