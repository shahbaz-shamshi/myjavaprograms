
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
public class arraysortusingmethod {
    
    public static void main(String[] args){
    
     Scanner sc= new Scanner(System.in);
    System.out.println("enter the total element"+": ");
    int n=sc.nextInt();
   
        int[] array=new int[n];
        
        for(int i=0;i<n;i++){
         
            System.out.println("enter the"+" "+i+" "+"element: ");
              array[i]=sc.nextInt();
              
              
              
        }
       array =ascending(array);
      int size=array.length;
      for(int i=0;i<size;i++){
      
      System.out.println(array[i]);
      
      }
          
    }
    
    
   public static  int[] ascending(int[] array){
        int size=array.length;
      
          int s;
           for(int i=0;i<size;i++){
        
           for(int j=i+1;j<size;j++){
           
           if(array[j]<array[i]){
           
               s=array[i];
               array[i]=array[j];
               array[j]=s;
           
           }
           }
        
        }
           return array;
       
   
   
   
   }
    
}
