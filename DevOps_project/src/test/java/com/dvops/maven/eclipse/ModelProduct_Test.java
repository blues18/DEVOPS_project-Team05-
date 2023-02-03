package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelProduct_Test {

	private products_model model;

    @BeforeEach
    void setUp() {
        model = new products_model("Product 1", "Type 1", "Brand 1", 100, "Description 1", 10);
    }

    @AfterEach
    void tearDown() {
        model = null;
    }

    @Test
    void testGetProduct_name() {
        assertEquals("Product 1", model.getProduct_name());
    }

    @Test
    void testSetProduct_name() {
        model.setProduct_name("Product 2");
        assertEquals("Product 2", model.getProduct_name());
    }

    @Test
    void testGetProduct_type() {
        assertEquals("Type 1", model.getProduct_type());
    }

    @Test
    void testSetProduct_type() {
        model.setProduct_type("Type 2");
        assertEquals("Type 2", model.getProduct_type());
    }

    @Test
    void testGetProduct_brand() {
        assertEquals("Brand 1", model.getProduct_brand());
    }

    @Test
    void testSetProduct_brand() {
        model.setProduct_brand("Brand 2");
        assertEquals("Brand 2", model.getProduct_brand());
    }

    @Test
    void testGetProduct_price() {
        assertEquals(100, model.getProduct_price());
    }

    @Test
    void testSetProduct_price() {
        model.setProduct_price(200);
        assertEquals(200, model.getProduct_price());
    }

    @Test
    void testGetProduct_description() {
        assertEquals("Description 1", model.getProduct_description());
    }

    @Test
    void testSetProduct_description() {
        model.setProduct_description("Description 2");
        assertEquals("Description 2", model.getProduct_description());
    }

    @Test
    void testGetProduct_stocks() {
        assertEquals(10, model.getProduct_stocks());
    }

    @Test
    void testSetProduct_stocks() {
        model.setProduct_stocks(20);
        assertEquals(20, model.getProduct_stocks());
    }
}
