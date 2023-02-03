package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductArraytest {

	@Test
	void testProduct_array_object() {
		product_array_object object = new product_array_object();	
		
		assertEquals("Razer Naga V2 Pro", object.product[0].product_name);
		
		assertEquals("gaming_mouse", object.product[0].product_type);
		assertEquals("Razer", object.product[0].product_brand);
		assertEquals(159, object.product[0].product_price);
		assertEquals("Ergonomic Wireless MMO gaming Mouse with 19 programmable Buttons", object.product[0].product_description);
		assertEquals(72, object.product[0].product_stocks);
		
		assertEquals("Razer Naga V2 HyperSpeed", object.product[1].product_name);
		assertEquals("gaming_mouse", object.product[1].product_type);
		assertEquals("Razer", object.product[1].product_brand);
		assertEquals(289, object.product[1].product_price);
		assertEquals("MMO Wireless Gaming Mouse with Hyperscroll Pro wheel", object.product[1].product_description);
		assertEquals(62, object.product[1].product_stocks);
	}


}
