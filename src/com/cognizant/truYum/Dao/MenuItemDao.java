package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public interface MenuItemDao {
    public List<MenuItem> getMenuItemListAdmin();// all items should be displayed

    public List<MenuItem> getMenuItemListCustomer();// depands on Dol and status

    public void modifyMenuItem(MenuItem menuitem);// update menuitem

    public MenuItem getMenuItem(long menuItemId);// Retrieve the particular menuitem

}
