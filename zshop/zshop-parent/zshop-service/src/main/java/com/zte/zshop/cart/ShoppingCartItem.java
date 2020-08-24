package com.zte.zshop.cart;

import com.zte.zshop.entity.Product;

/**
 * Author:helloboy
 * Date:2020-06-21 14:59
 * Description:<描述>
 * 购物车明细对象，用于封装购物车中的条目产品信息,和数量
 *
 */
public class ShoppingCartItem {

    //产品对象
    private Product product;
    //数量
    private int quantity;

    public ShoppingCartItem() {
    }

    //默认一次只能购买一件商品
    public ShoppingCartItem(Product product) {
        this.product = product;
        this.quantity = 1;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //获取该商品在购物车中的总价
    public double getItemMoney(){

        return  product.getPrice()* this.quantity;

    }

    //商品数量+1
    public void increment(){
        this.quantity++;
    }
}
