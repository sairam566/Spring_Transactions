package com.tsr.bo;

public class ProductBO {
	
	protected int id;
	protected String name;
	protected int price;
	
	public ProductBO() {
		super();
	}

	public ProductBO(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public ProductBO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
