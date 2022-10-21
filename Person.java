package assignment515;

import assignment515.ProductMenu;

public abstract class Person {
    private ProductMenu theProductMenu ;

    public Person(ProductMenu productMenu) {
        this.theProductMenu = productMenu;
    }
    public Person()
    {

    }

    public abstract void showMenu();
    public void showAddButton()
    {

    }
    public void showViewButton()
    {

    }
    public void showRadioButton()
    {

    }
    public void showLabels()
    {

    }
    public abstract ProductMenu CreateProductMenu();

}
