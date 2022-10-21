package assignment515;

public class Buyer extends Person {
    @Override
    public void showMenu() {
        System.out.println("Buyer Menu items....");
    }




    public Buyer(ProductMenu productMenu) {
        super(productMenu);
    }

    public Buyer()
    {
        super();

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
