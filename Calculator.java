
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 boolean exit=true;
 while(exit){
     System.out.println("SIMPLE CALCULATOR");
     System.out.println("SELECT OPERATION FOR CALCUATE NO");
     System.out.println("1.Press 1 to perform Addition");
     System.out.println("2.Press 2 to perform Subtraction");
     System.out.println("3.Press 3 to  perform Multiplication");
     System.out.println("4.Press 4 to  perform Division");
     System.out.println("5.Press 5 for Exit");
     System.out.print("Enter your choice: ");
     int choices=sc.nextInt();
     switch (choices){
         case 1:
             System.out.println("Enter first number for Addition");
             double n1=sc.nextInt();
             System.out.println("Enter second number Addition");
             double n2=sc.nextInt();
             System.out.println("Addition of two numbers is : "+(n1+n2));
             break;
         case 2:
             System.out.println("Enter first number for Subtraction");
             double n3=sc.nextInt();
             System.out.println("Enter second number for Subtraction");
             double n4=sc.nextInt();
             System.out.println("Subtraction of two numbers is : "+(n3-n4));
             break;
         case 3:
             System.out.println("Enter first number for Multiplication");
             double n5=sc.nextInt();
             System.out.println("Enter second number for Multiplication");
             double n6=sc.nextInt();
             System.out.println("Multiplication of two numbers is : "+(n5*n6));
             break;
         case 4:
             System.out.println("Enter first number for Division");
             double n7=sc.nextInt();
             System.out.println("Enter second number for Division");
             double n8=sc.nextInt();
             if(n8==0){
                 System.out.println("Can't divide by 0...!");
             }
             else {
                 System.out.println("Division of two numbers is : " + (n7 / n8));
             }
             break;
         case 5:
             exit=true;
             System.out.println("Thank you for visting here...!");
             break;
         default:
             System.out.println("Invalid choice.Please enter valid choice(1-5).");
             break;
            }
        }
    }
}