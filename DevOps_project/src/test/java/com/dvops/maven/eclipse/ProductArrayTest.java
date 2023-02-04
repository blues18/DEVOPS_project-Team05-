package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductArrayTest {
    @Test
    void testProductArrayObject() {
        product_array_object Product = new product_array_object();

        // Test first product
        assertEquals("Razer Naga V2 Pro", Product.product[0].product_name);
        assertEquals("gaming_mouse", Product.product[0].product_type);
        assertEquals("Razer", Product.product[0].product_brand);
        assertEquals(159, Product.product[0].product_price);
        assertEquals("Ergonomic Wireless MMO gaming Mouse with 19 programmable Buttons", Product.product[0].product_description);
        assertEquals(72, Product.product[0].product_stocks);

        // Test second product
        assertEquals("Razer Naga V2 HyperSpeed", Product.product[1].product_name);
        assertEquals("gaming_mouse", Product.product[1].product_type);
        assertEquals("Razer", Product.product[1].product_brand);
        assertEquals(289, Product.product[1].product_price);
        assertEquals("MMO Wireless Gaming Mouse with Hyperscroll Pro wheel", Product.product[1].product_description);
        assertEquals(62, Product.product[1].product_stocks);
    }
}
