package assignment515;

import assignment515.Buyer;
import assignment515.Person;
import assignment515.ProductMenu;
import assignment515.Seller;

public class PersonFactory extends Person {

    PersonFactory(ProductMenu productMenu) {
        super(productMenu);
    }
    public PersonFactory()
    {
        super();
    }

    @Override
    public void showMenu() {

    }

    @Override
    public ProductMenu CreateProductMenu() {
        return null;
    }


    public static Person createObject(String str) {
        Person person;
        System.out.println("Factory Pattern Intiated....");
        if (str.equalsIgnoreCase("Seller")) {
            person = new Seller();
        } else

        {
            person = new Buyer();
        }
        return person;
    }
}
