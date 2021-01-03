
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
public class country {
    
    public static void main(String[] args){
        
       
        
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the no.of Element : ");
      int n=sc.nextInt();
    
    states []array=new states[n];
    
    for(int i=0;i<n;i++){
    
    System.out.println("Enter no.of District");
    int districtNumber=sc.nextInt();
    
    System.out.println("population in crores");
    double population=sc.nextDouble();
    System.out.println("enter the state name: ");
    String name=sc.next();
    
     array[i]=new states(districtNumber,population,name);
     
    }
    
   for(int i=0;i<n;i++){
    String f=array[i].getName();
    
    System.out.print(f + "\t");
   

    }

 
 
 
    double k;
    states m;
    for(int j=0;j<n;j++){
    
     double u=array[j].getPopulation();
     
      for(int i=j+1;i<n;i++){
      k=array[i].getPopulation();
      if(u>k){
      m=array[i];
      array[i]=array[j];
      array[j]=m;
      }
      
      }
       
      }
    for(int i=0;i<n;i++){
    System.out.println(array[i].getPopulation());
      
    
    }

}
}
    
    
    class states{
      String name;
     int noOfDistrict;
     double population;
     
    
    public states(int districtNumber,double population,String name){ 
        this.noOfDistrict=districtNumber;
        this.population=population;
        this.name=name;
   
    }
    public String getName(){
    
    return this.name;
    
    }
    
   public double getPopulation(){
   
      return this.population;
   
   
   }
   } 
    

