package com.rivwox.product.dao;

import static org.junit.Assert.*;

import com.rivwox.product.dto.Product;
import junit.framework.TestCase;
import org.junit.Test;


public class ProductDAOImplTest{
    @Test
    public void createShouldCreateAProduct(){

        ProductDAO  dao = new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("Augustus");
        product.setDescription("Its Awesome!!");
        product.setPrice(800);
        dao.create(product);
        Product result = dao.read(1);

        assertNotNull(result);
        assertEquals("Augustus",result.getName());

    }

}