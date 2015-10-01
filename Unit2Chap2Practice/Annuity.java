/**
 * Calculates values for an annuity
 * 
 * @author Calvin Field
 * @version 9/29/15
 */

public class Annuity
{
    private double pmt;
    private double i;
    private int n;
    private double pv;
    
    public Annuity(double periodicPayment, double interestRate, int paymentsNum)
    {
        this.pmt = periodicPayment;
        this.i = interestRate;
        this.n = paymentsNum;
    }
    
    
    /**
     * Returns the current value of the annuity as a double
     * 
     * @return  The present value
     */
    public double getPresentValue()
    {
        double numerator = (Math.pow((1+this.i), this.n-1) - 1) / this.i;
        double denominator = Math.pow((1+this.i), this.n-1);
        this.pv = this.pmt*((numerator/denominator)+1);
        //Round pv to two decimal places
        this.pv = Math.round(this.pv*100.0)/100.0;

        
        return this.pv;
    }
}