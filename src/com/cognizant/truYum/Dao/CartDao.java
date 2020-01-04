package com.cognizant.truYum.Dao;

import com.cognizant.truYum.model.Cart;

public interface CartDao {
    public void addCartItem(long userId, long menuItem);

    public Cart getAllCartItems(long userId) throws CartEmptyException;

    public void removeCartItem(long userId, long menuItem);
}
