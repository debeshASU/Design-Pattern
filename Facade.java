package assignment515;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class Facade {
    private int UserType;
    private String product;
    private Product theSelectedProduct;
    private int nProductCategory;
    private ClassProductList theProductList;
    private Person thePerson;


    public void startFacade() {
        System.out.println("Facade pattern initiated ");
        UserType = login(new Login());
        System.out.println(
                "Select from available Course Menus \n 1. Meat Product Menu \n 2. Produce Product Menu ");
        Scanner scan = new Scanner(System.in);
        product = scan.nextLine();
        // pattern implemented (Bridge implementation and Factory implementation
        if (product.equalsIgnoreCase("Meat Product Menu")) {
            SelectProduct(new MeatProductMenu(), UserType);
        } else if (product.equalsIgnoreCase("Produce Product Menu")) {
            SelectProduct(new ProduceProductMenu(), UserType);
        } else {
            System.out.println("Wrong Selection");
            System.exit(-1);
        }
        System.out.println("Implementing Visitor Pattern....");
        remind();
        System.out.println("Implementing Iterator pattern ....");
        ClassProductList products = new ClassProductList();
        @SuppressWarnings("rawtypes")
        Iterator iterate = (Iterator) products.createIterator();
        ProductIterator productIterator = new ProductIterator();
        OfferingList solList = new OfferingList();
        @SuppressWarnings("rawtypes")
        Iterator iterate2 = (Iterator) solList.createIterator();
        OfferingIterator si = new OfferingIterator();
        while (ProductIterator.HasNext(iterate)) {
            System.out.println(productIterator.Next(iterate));
            System.out.println(si.Next());
        }
        scan.close();
    }
    public int login(Login object) {
        return object.login();
    }
    public void addTrading(TradingMenu AM)
    {
        AM.add();

    }
    public void viewTrading(TradingMenu AM)
    {
        AM.view();

    }
    public void decideBidding()
    {

    }
    public void discussBidding()
    {

    }
    public void submitBidding()
    {

    }
    public void remind()
    {
        ReminderVisitor remind = new ReminderVisitor();
        ClassProductList CL = new ClassProductList();
        CL.accept(remind);

    }

    public void createProductList()
    {

    }
    public void attachProductToUser()
    {

    }
    public void SelectProduct( ProductMenu CM, int UserType )
    {
         CM.showMenu();

    }
    public void productOperation()
    {

    }
}
