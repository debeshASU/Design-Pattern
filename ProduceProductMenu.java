package assignment515;

import assignment515.ProductMenu;

public class ProduceProductMenu extends ProductMenu {
    @Override
    public void showMenu() {

        System.out.println(" Show Menu...");
    }

    @Override
    public void showAddButton() {
        System.out.println("Show Add Button...");

    }

    @Override
    public void shoViewButton() {
        System.out.println("Show View  Button...");

    }

    @Override
    public void showRadioButton() {
        System.out.println("Show Radio Button...");

    }

    @Override
    public void showLabels() {
        System.out.println("Show Labels...");

    }

    @Override
    public void showComboxes() {
        System.out.println("Show ComboBoxes...");

    }

    public void selectCourse(int USerType) {

        System.out.println("Low Level Course Selected ...\n Bridge Pattern for connection used ");
        Person person;
        if (USerType == 0) {
            person = PersonFactory.createObject("Buyer");

        } else
        {
            person = PersonFactory.createObject("Seller");

        }
        person.showMenu();
    }
}