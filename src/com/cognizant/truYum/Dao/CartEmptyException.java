package com.cognizant.truYum.Dao;
//custom exception(user defined exception)
public class CartEmptyException extends Exception {

   

    private static final long serialVersionUID = 1L;
    @Override
    public String toString() {
        return "Cart is Empty" ;
    }
}