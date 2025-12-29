import java.util.Scanner;
public class CompoundInt{

   double principal;
   double rate;
   double time;

   CompoundInt(double p,double r,double t)
   {
    principal = p;
    rate = r;
    time = t;
   }
   double calculateCI()
   {
    return calculateTotal() - principal ;
   }
   double calculateTotal()
   {
    return principal* Math.pow(1+(rate/100),time);
   }
   public static void main(String args[])
   {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Principal:");
    double principal = input.nextDouble();
    
    System.out.print("Enter rate:");
    double rate = input.nextDouble();

    System.out.print("Enter time:");
    double time = input.nextDouble();

    CompoundInt obj = new CompoundInt(principal ,rate ,time);
    
    System.out.printf("Compound interest: %.2f%n",obj.calculateCI());
    System.out.printf("Total Amount: %.2f%n",obj.calculateTotal());
   }
}