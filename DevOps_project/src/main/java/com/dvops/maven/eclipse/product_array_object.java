package com.dvops.maven.eclipse;

public class product_array_object {
	public products_model product[] = new products_model[2];
	
	public product_array_object() {
		
		products_model first_product = new products_model(
				"Razer Naga V2 Pro",
				"gaming_mouse",
				"Razer",
				159,
				"Ergonomic Wireless MMO gaming Mouse with 19 programmable Buttons",
				72
				);
		products_model second_product = new products_model(
				"Razer Naga V2 HyperSpeed",
				"gaming_mouse",
				"Razer",
				289,
				"MMO Wireless Gaming Mouse with Hyperscroll Pro wheel",
				62
				);
		
		product[0]=first_product;
		product[1]=second_product;
	} 
}


