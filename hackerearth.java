/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
import java.util.Scanner;
public class hackerearth {
    
 
  
    
    public static void main(String[] args){
    
  Scanner sc=new Scanner(System.in);
  
     int t=sc.nextInt();
     for(int f=0;f<t;f++){
    


       int n=sc.nextInt();
       
        int array[]=new int[n];
        
        for(int i=0;i<n;i++){
        
            array[i]=sc.nextInt();
            
        }
        
        
  
    int sum=0;
  for(int i=0;i<n;i++){
     int d=0;
        for(int j=i+1;j<n;j++){
     if(array[i]==array[j]){
     
         d=(j+1)-(i+1);
         
         
     
     }
  
         
  
  }
        sum=sum+d;
      
  
  
  
  }
System.out.println(sum);  



}
    
    
    
}
    
}
