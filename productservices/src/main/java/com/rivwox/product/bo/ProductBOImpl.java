package com.rivwox.product.bo;

import com.rivwox.product.dao.ProductDAO;
import com.rivwox.product.dto.Product;

public class ProductBOImpl implements ProductBo{

    private ProductDAO dao;

    @Override
    public void create(Product product) {
        dao.create(product);
    }

    @Override
    public Product findProduct(int id) {
        return null;
    }

    public ProductDAO getDao() {
        return dao;
    }

    public void setDao(ProductDAO dao) {
        this.dao = dao;
    }
}
