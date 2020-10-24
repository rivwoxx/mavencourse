package com.rivwox.product.bo;

import com.rivwox.product.dto.Product;

public interface ProductBo {

    public void create(Product product);

    public Product findProduct(int id);
}
