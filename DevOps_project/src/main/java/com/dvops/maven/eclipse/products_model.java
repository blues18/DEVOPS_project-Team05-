package com.dvops.maven.eclipse;

public class products_model {

	public products_model(String product_name, String product_type, String product_brand, String product_price,
			String product_description, String product_stocks) {
		this.product_name = product_name;
		this.product_type = product_type;
		this.product_brand = product_brand;
		this.product_price = product_price;
		this.product_description = product_description;
		this.product_stocks = product_stocks;
		// this.product_images = product_images;
	}

	protected String product_name;
	protected String product_type;
	protected String product_brand;
	protected String product_price;
	protected String product_description;
	protected String product_stocks;
	// protected String product_images;

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

	public String getProduct_price() {
		return product_price;
	}

	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public String getProduct_stocks() {
		return product_stocks;
	}

	public void setProduct_stocks(String product_stocks) {
		this.product_stocks = product_stocks;
	}
	/*
	 * public String getproduct_images() { return product_images; } public void
	 * setproduct_images(String product_images) { this.product_images =
	 * product_images; }
	 */
}
