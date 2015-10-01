public class UseAnnuity
{
    public static void main(String[] args)
    {
        Annuity account = new Annuity(10000.0, .08, 20);
        double currentAmount = account.getPresentValue();
        System.out.println("Current value: $"+currentAmount);
    }
}