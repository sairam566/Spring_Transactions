package com.tsr.controller;

import com.tsr.form.CustomerProductForm;
import com.tsr.service.RegisterService;

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
