/*
* this class Interest can calculaltes simple interest and compound interest
*/

/**
 *
 * @author VALLI
 */
public class Interest{
    private final double principle;
    private final double rate;
    private final double period;
    private int n;

    // constructor to accept values required to calculate simpleInterest
    Interest(double principle,double rate,double period){

        this.principle=principle;
        this.rate=(rate/100);
        this.period=period;

    }

    // constructor to accept values required to calculate compound interest
    Interest(double principle,double rate,double period,int n){

        this.principle=principle;
        this.rate=(rate/100);
        this.period=period;
        this.n=n;

    }
    //this method simple interest calculates the simple interest using simple interest formula
    public double simpleInterest(){
        return principle*rate*period;
    }
    //this method compound interest calculates the compound interest using compound interest formula
    public double compoundInterest(){
        return principle*Math.pow((1+rate/(n*1.0)),(n*period));
    }
}
