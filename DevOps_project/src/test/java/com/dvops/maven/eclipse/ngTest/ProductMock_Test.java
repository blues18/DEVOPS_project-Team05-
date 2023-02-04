package com.dvops.maven.eclipse.ngTest;

import org.testng.annotations.Test;

import com.dvops.maven.eclipse.product_array_object;

import org.testng.annotations.BeforeTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductMock_Test {
		@Test
		void testProductArrayObject() {
	        product_array_object obj = new product_array_object();

	        // Test first product
	        assertEquals("Razer Naga V2 Pro", obj.product[0].product_name);
	        assertEquals("gaming_mouse", obj.product[0].product_type);
	        assertEquals("Razer", obj.product[0].product_brand);
	        assertEquals(159, obj.product[0].product_price);
	        assertEquals("Ergonomic Wireless MMO gaming Mouse with 19 programmable Buttons", obj.product[0].product_description);
	        assertEquals(72, obj.product[0].product_stocks);

	        // Test second product
	        assertEquals("Razer Naga V2 HyperSpeed", obj.product[1].product_name);
	        assertEquals("gaming_mouse", obj.product[1].product_type);
	        assertEquals("Razer", obj.product[1].product_brand);
	        assertEquals(289, obj.product[1].product_price);
	        assertEquals("MMO Wireless Gaming Mouse with Hyperscroll Pro wheel", obj.product[1].product_description);
	        assertEquals(62, obj.product[1].product_stocks);
	    }
}
