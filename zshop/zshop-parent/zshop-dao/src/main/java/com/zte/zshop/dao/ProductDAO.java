package com.zte.zshop.dao;

import com.zte.zshop.entity.Product;
import com.zte.zshop.params.ProductParam;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author:msy
 * Date:2020-05-28 14:36
 * Description:<描述>
 */
@Repository
public interface ProductDAO {
    public void insert(Product product);

    public Product selectByName(String name);

    public List<Product> selectAll();

    public Product selectById(Integer id);

    public void update(Product product);

    public void deleteById(Integer id);

    public List<Product> selectByParams(ProductParam productParam);
}
