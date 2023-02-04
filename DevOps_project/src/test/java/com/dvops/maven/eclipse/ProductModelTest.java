package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductModelTest {

	public products_model model;
	
	@BeforeEach
	void setUp() {
		model = new products_model("product_name", "product_type", "Product_Brand", 1, "Product_Description", 1);
	}

	@AfterEach
	void tearDown() {
		model = null;
	}

	@Test
	void testGetProduct_name() {
		assertEquals("product_name", model.getProduct_name());
	}

	@Test
	void testSetProduct_name() {
		model.setProduct_name("product_name");
		assertEquals("product_name", model.getProduct_name());
	}

	@Test
	void testGetProduct_type() {
		assertEquals("product_type", model.getProduct_type());
	}

	@Test
	void testSetProduct_type() {
		model.setProduct_type("product_type");
		assertEquals("product_type", model.getProduct_type());
	}

	@Test
	void testGetProduct_brand() {
		assertEquals("Product_Brand", model.getProduct_brand());
	}

	@Test
	void testSetProduct_brand() {
		model.setProduct_brand("Product_Brand");
		assertEquals("Product_Brand", model.getProduct_brand());
	}

	@Test
	void testGetProduct_price() {
		assertEquals(1, model.getProduct_price());
	}

	@Test
	void testSetProduct_price() {
		model.setProduct_price(1);
		assertEquals(1, model.getProduct_price());
	}

	@Test
	void testGetProduct_description() {
		assertEquals("Product_Description", model.getProduct_description());
	}

	@Test
	void testSetProduct_description() {
		model.setProduct_description("Product_Description");
		assertEquals("Product_Description", model.getProduct_description());
	}

	@Test
	void testGetProduct_stocks() {
		assertEquals(1, model.getProduct_stocks());
	}

	@Test
	void testSetProduct_stocks() {
		model.setProduct_stocks(1);
		assertEquals(1, model.getProduct_stocks());
	}

	
}

