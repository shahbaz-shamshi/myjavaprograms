
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
public class method {
    
    public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the first number");
    int FirstNumber=sc.nextInt();
    
   System.out.println("Enter the second number");
   int SecondNumber=sc.nextInt();
   
      int sum=sum(FirstNumber,SecondNumber);
      System.out.println("sum of two number"+":"+sum);
      
      int subtraction=subtraction(FirstNumber,SecondNumber);
      System.out.println("subtraction of two number"+":"+subtraction);
      
      int multiplication=multiplication(FirstNumber,SecondNumber);
      System.out.println("multiplication of two number"+":"+multiplication);
    }
    
    public static int sum(int FirstNumber,int SecondNumber) {
    int sum=FirstNumber+SecondNumber;
    return sum;
    }

    public static int subtraction(int FirstNumber, int SecondNumber) {
        int subtraction=SecondNumber-FirstNumber;
        return Math.abs(subtraction);
       
    }

    public static int multiplication(int FirstNumber, int SecondNumber) {
        
        int multiplication=FirstNumber*SecondNumber;
        
        return multiplication;
    }
    
     
    
    
    
 
    
}
