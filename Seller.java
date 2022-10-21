package assignment515;

public class Seller extends Person {
    @Override
    public void showMenu() {
        System.out.println("Seller Menu items ....");

    }
    public Seller()
    {
        super();
    }


    public Seller(ProductMenu productMenu) {
        super(productMenu);
    }
    @Override
    public ProductMenu CreateProductMenu() {
        String res = "meat product";
        if (res.equalsIgnoreCase("High Level")) {
            return new MeatProductMenu();
        } else {
            return new ProduceProductMenu();
        }

    }
}
