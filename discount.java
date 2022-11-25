import java.util.*;
class discount

{

 public static void main(String[]args)

 {
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter price to check discounts");
  float a=sc.nextFloat();
  float b;
  float c;
  if(a<=800)
   {
    System.out.println("Sorry!! no discounts");
   }
  else if(a>800 && a<=1500)
   {
    System.out.println("Congratulation!! you won 10% discount");
    b=(a*10)/100;
    c=a-b;
    System.out.println("Discounted price is"+c);
   }
  else if(a>1500 && a<=2500)
   {
    System.out.println("Congratulation!! you won 15% discount");
    b=(a*15)/100;
    c=a-b;
    System.out.println("Discounted price is"+c);
   }
  else if(a>2500 && a<=5000)
   {
    System.out.println("Congratulation!! you won 20% discount");
    b=(a*20)/100;
    c=a-b;
    System.out.println("Discounted price is"+c);
   }
  else if(a>5000)
   {
    System.out.println("Congratulation!! you won 30% discount");
    b=(a*30)/100;
    c=a-b;
    System.out.println("Discounted price is"+c);
 }
 
 }
}