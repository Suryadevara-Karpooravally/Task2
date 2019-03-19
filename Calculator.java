/*
 * This class Calculator can perform addition of multiple numbers, multiplication of multiple numbers
 * and division of two numbers
 */
import java.util.*;
/**
 *
 * @author VALLI
 */
public class Calculator{
    /*
        this method add() accepts a line of space seperated numbers and returns the addition of them.
    */
  public static double add(String str){
    //Here,StringTokenizer is used to Tokenize the line delimited by " "(Space).
    StringTokenizer st=new StringTokenizer(str," ");
    // the addition is stored in sum.
    double sum=0;
    while(st.hasMoreTokens()){

      sum+=Double.parseDouble(st.nextToken());

    }
    //return the addition
    return sum;

  }
    /*
        this method multiply() accepts a line of space seperated numbers and returns the multiplication of them.
    */
  public static double multiply(String str){
      //Here,StringTokenizer is used to Tokenize the line delimited by " "(Space).
    StringTokenizer st=new StringTokenizer(str," ");
    // the multiplication is stored in product.
    double product=1;
    while(st.hasMoreTokens()){

      product*=Double.parseDouble(st.nextToken());

    }
    //return the multiplication
    return product;
  }
    /*
        this method divide() accepts two numbers (dividend and divisor) and returns the division of them.
    */
  public static double divide(int dividend,int divisor){

    //division is stored in result
    double result=0;

    result=dividend/(divisor*1.0);

    //return the division
    return result;
  }
}
