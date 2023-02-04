package com.dvops.maven.eclipse;

public class product_array_object {
	public products_model product[] = new products_model[1];

	public product_array_object(String product_name, String product_type, String product_brand, String product_price,
			String product_description, String product_stocks) {

		products_model first_product = new products_model("Razer Naga V2 Pro", "gaming_mouse", "Razer", "159",
				"Ergonomic Wireless MMO gaming Mouse with 19 programmable Buttons", "72");
		products_model second_product = new products_model("Razer Naga V2 HyperSpeed", "gaming_mouse", "Razer", "289",
				"MMO Wireless Gaming Mouse with Hyperscroll Pro wheel", "62");

		product[0] = first_product;
		product[1] = second_product;
	}
}
