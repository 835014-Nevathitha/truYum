package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTert {
    static CartDao cartDao = new CartDaoCollectionImpl();

    public static void main(String[] args) {
        testAddCartItem();
        testgetAllCartItems();
        testRemoveCartItem();
        testgetAllCartItems();
    }

    public static void testAddCartItem() {
        System.out.println("Product added into Cart");
        cartDao.addCartItem(1, 2);
        cartDao.addCartItem(1, 3);
    }

    public static void testgetAllCartItems() {
        try {
            System.out.println("Retrieving all the items from Cart");
            List<MenuItem> list = cartDao.getAllCartItems(2).getMenuItemList();
            for (MenuItem menuItem : list) {
                System.out.println(menuItem);
            }
            System.out.println("Total Price:" + cartDao.getAllCartItems(1).getTotal());
        } catch (CartEmptyException e) {
            System.out.println(e);
        }
    }

    public static void testRemoveCartItem() {
        System.out.println("Remove Cart");
        cartDao.removeCartItem(1, 3);
    }
}