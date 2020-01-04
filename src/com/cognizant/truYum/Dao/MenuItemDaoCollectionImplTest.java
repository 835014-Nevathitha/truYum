package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;


public class MenuItemDaoCollectionImplTest {
    static MenuItemDao menudao = new MenuItemDaoCollectionImpl();

    public static void main(String[] args) {

        testGetMenuItemListAdmin();
        testGetMenuItemListCustomer();
        testModifyMenuItem();
        testGetMenuItemListAdmin();
        testGetMenuItem();

    }

    public static void testGetMenuItemListAdmin() {
        System.out.println("Admin Page");
        List<MenuItem> menu = menudao.getMenuItemListAdmin();
        System.out.printf("%-5s%-20s%-8s%-9s%-20s%-15s%-5s\n", "Id ", "Name", "Price", "Active",
                "Date of Launch", "Category", "Free Delivery");
        for (MenuItem menuItem : menu) {
            System.out.println(menuItem);
        }

    }

    public static void testGetMenuItemListCustomer() {
        System.out.println("Customer Page");
        List<MenuItem> menuitem = menudao.getMenuItemListCustomer();
        System.out.printf("%-5s%-20s%-8s%-9s%-20s%-15s%-5s\n", "Id ", "Name", "Price", "Active",
                "Date of Launch", "Category", "Free Delivery");
        for (MenuItem menuItem2 : menuitem) {
            System.out.println(menuItem2);
        }

    }

    public static void testModifyMenuItem() {
        System.out.println("Modify Menu Item");
        MenuItem menuitem = new MenuItem(2, "eat and enjoi", 123.0f, true,
                DateUtil.convertToDate("03/01/2020"), "Main Course", false);
        menudao.modifyMenuItem(menuitem);
    }

    public static void testGetMenuItem() {
        System.out.println("Get Menu Item");

        MenuItem menuItem = menudao.getMenuItem(2);
        System.out.println(menuItem);
    }

}