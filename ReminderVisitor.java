package assignment515;

public class ReminderVisitor extends NodeVisitor{
    private Reminder m_reminder;
    @Override
    public void visitProduct(Product product) {

        System.out.println("visiting Product ....");

    }

    @Override
    public Reminder visitTrading(Trading trading) {
        System.out.println("visiting Trading ....");

        return null;
    }

    @Override
    public void visitFacade(Facade facade) {
        System.out.println("visiting Facade ....");

    }

}
