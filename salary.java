import java.util.*;
class salary

{

 public static void main(String[]args)

 {
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter your basic salary");
  float a=sc.nextFloat();
  float h;
  float d;
  float g;s
  float i;
  float n;
  
  h=(a*10)/100;
  d=(a*73)/100;
  g=a+d+h;
  i=(30*g)/100;
  n=g-i;
  
  System.out.println("BASIC SALARY-"+a);
  System.out.println("HOUSE RENT ALLOWANCE-"+h);
  System.out.println("DEARNESS ALLOWANCE-"+d);
  System.out.println("GROSS SALARY-"+g);
  System.out.println("INCOME TAX-"+i);
  System.out.println("NET SALARY-"+n);
  
  }

}