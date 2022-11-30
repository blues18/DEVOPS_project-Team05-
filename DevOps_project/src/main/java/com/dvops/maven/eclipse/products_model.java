package com.dvops.maven.eclipse;

public class products_model {
	
	protected String product_name;
	protected String product_type;
	protected String product_brand;
	protected int product_price;
	protected String product_discription;
	protected int product_stocks;
	//protected String product_images;
	
	public products_model(String product_name, String product_type, String product_brand, int product_price, 
			String product_discription, int product_stocks) {
		this.product_name = product_name;
		this.product_type = product_type;
		this.product_brand = product_brand;
		this.product_price = product_price;
		this.product_discription = product_discription;
		this.product_stocks = product_stocks;
		//this.product_images = product_images;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getProduct_brand() {
		return product_brand;
	}
	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_discription() {
		return product_discription;
	}
	public void setProduct_discription(String product_discription) {
		this.product_discription = product_discription;
	}
	public int getProduct_stocks() {
		return product_stocks;
	}
	public void setProduct_stocks(int product_stocks) {
		this.product_stocks = product_stocks;
	}
	/*
	public String getproduct_images() {
		return product_images;
	}
	public void setproduct_images(String product_images) {
		this.product_images = product_images;
	}
	*/
}
