package com.tsr.service;

import com.tsr.bo.CustomerBO;
import com.tsr.bo.ProductBO;
import com.tsr.dao.CustomerDAO;
import com.tsr.dao.ProductDAO;
import com.tsr.form.CustomerProductForm;

public class RegisterService {
	
	private CustomerDAO customerDAO;
	private ProductDAO productDAO;
	
	public RegisterService(CustomerDAO customerDAO, ProductDAO productDAO) {
		super();
		this.customerDAO = customerDAO;
		this.productDAO = productDAO;
	}
	
	public boolean register(CustomerProductForm form) {
		int customerNo = 0;
		int productId = 0;
		CustomerBO customerBO = null;
		ProductBO productBO = null;
		
		customerBO = new CustomerBO(form.getCustomerName(), form.getDob(), form.getGender());
		productBO = new ProductBO(form.getProductName(), form.getPrice());
		
		customerNo = customerDAO.saveCustomer(customerBO);
		productId = productDAO.saveProduct(productBO);
		
		return (customerNo>1 && productId>1) ? true : false;
	}
	
}
