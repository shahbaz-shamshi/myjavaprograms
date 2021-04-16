/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author shahbaz
 */
public class hello{
    
    public static void main(String[] args)//main method
    
    { //code block
    
        //print statement
        System.out.println("hello"+" "+"world");
        System.out.println("hello world");
        
        
       
       int firstNumber=5;//Expression
       //int-->datatype
       //fistNumber-->variable
       //5-->value assign in variable
       int secondNumber=10;
       //addition
       int sum=firstNumber+secondNumber;
       System.out.println("sum="+sum);//print the value of sum
       
       //subtraction
       int difference=firstNumber-secondNumber;
       System.out.println("difference="+difference);//print the value of difference
       
       
       //multiplication
       int multiplication=firstNumber*secondNumber;
       System.out.println("multiplication="+multiplication);//print the value of multiplication
        
       //primitive types
       
       //1)int data type
       
       int minValue=Integer.MIN_VALUE;
       int maxValue=Integer.MAX_VALUE;
       
       System.out.println("minimum value of integer : "+minValue);
       System.out .println("maximum value of integer : "+maxValue);
       
      //overflow and underflow 
       System.out.println("basted value : "+(minValue-1));
       System.out.println("basted value : "+(maxValue+1));
       
       //2)byte data type
       
       byte minvaluebyte=Byte.MIN_VALUE;
       byte maxvaluebyte=Byte.MAX_VALUE;
       
       System.out.println("minimum value of byte : "+minvaluebyte);
       System.out.println("maximum value of byte : "+maxvaluebyte);
       
       
       //3)short data type
       
       short minvalueshort=Short.MIN_VALUE;
       short maxvalueshort=Short.MAX_VALUE;
       
       System.out.println("minimum value of short : "+minvalueshort);
       System.out.println("maximum value of short : "+maxvalueshort);
       
       //4)long data type
       
       long minValuelong=Long.MIN_VALUE;
       long maxValuelong=Long.MAX_VALUE;
       
         System.out.println("minimum value of long : "+minValuelong); 
         System.out.println("maximum value of long : "+maxValuelong);
         
         long b=100L;
         System.out.println(b);
         
         
         //CASTINiG
         
         byte casting=(byte)(maxvaluebyte/2);
         System.out.println(casting);
         
         //challenge
          
         byte a=23;
         short d=25000;
         int c=134567;
         long ans=50000+10*(a+d+c);
         System.out.println(ans);
         
         //5)float data typ  
            
            float minvaluefloat =Float.MIN_VALUE;
            float maxvaluefloat=Float.MAX_VALUE;
            System.out.println("minimun value of float:"+minvaluefloat);
            System.out.println("maximun value of float:"+maxvaluefloat);
         
         //6)DOUBLE DATA TYPE
            
             double minvaluedouble =Double.MIN_VALUE;
             double maxvaluedouble =Double.MAX_VALUE;
             System.out.println("minimun value of double:"+minvaluedouble);
             System.out.println("maximun value of double:"+maxvaluedouble);
           
           //7)char data type
             
               char character='D';
               char unicode='\u0044';
               System.out.println(character);
               System.out.println(unicode);
                     
    }
       
}
