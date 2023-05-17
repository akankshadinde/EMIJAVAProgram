import java.util.Scanner;
class EmiCalculation
{
	double emi;
	EmiCalculation(double p,double r,double t)
	{
	 emi= (p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
	}
}
class Emi
{ 
    public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);
         
        double principal, rate, time, emi;
  
        System.out.print("Enter principal: ");
        principal = a.nextFloat();
      
        System.out.print("Enter rate: ");
        rate = a.nextFloat();
      
        System.out.print("Enter time in year: ");
        time = a.nextFloat();
      
        rate=rate/(12*100); 
        time=time*12; 
      
      
        EmiCalculation e= new EmiCalculation(principal,rate,time);
      
        System.out.print("EMI is= "+e.emi+"\n");
                 
    }
}