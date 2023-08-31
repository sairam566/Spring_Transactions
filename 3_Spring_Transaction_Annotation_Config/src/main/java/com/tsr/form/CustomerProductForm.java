package com.tsr.form;

import java.util.Date;

public class CustomerProductForm {
	
	protected int customerNo;
	protected String customerName;
	protected Date dob;
	protected String gender;
	protected int id;
	protected String productName;
	protected int price;
	
	public CustomerProductForm() {
		super();
	}

	public CustomerProductForm(int customerNo, String customerName, Date dob, String gender, int id, String productName,
			int price) {
		super();
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.dob = dob;
		this.gender = gender;
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	
	public CustomerProductForm(String customerName, Date dob, String gender, String productName, int price) {
		super();
		this.customerName = customerName;
		this.dob = dob;
		this.gender = gender;
		this.productName = productName;
		this.price = price;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CustomerProductForm [customerNo=" + customerNo + ", customerName=" + customerName + ", dob=" + dob
				+ ", gender=" + gender + ", id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}
	
}
