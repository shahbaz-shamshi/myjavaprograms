
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
public class arraysort {
    
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in); 
    int s;
    System.out.println("enter the total element"+": ");
    int n=sc.nextInt();
   
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
         
            System.out.println("enter the"+" "+i+" "+"element: ");
              a[i]=sc.nextInt();
             
        }
        
        for(int i=0;i<n;i++){
        
           for(int j=i+1;j<n;j++){
           
           if(a[j]<a[i]){
           
               s=a[i];
               a[i]=a[j];
               a[j]=s;
           
           }
           }
        
        }
        for(int i=n-1;i>=0;i--){
        System.out.print(a[i]+" ");
        
        
                }
        }
        
        
    }

