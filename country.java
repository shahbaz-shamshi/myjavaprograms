
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
    
    System.out.println("Enter chiefminister names"+":");
    String cheifministerName=sc.nextLine();
    
    System.out.println("Enter Population"+":");
    String population=sc.nextLine();
    
    System.out.println("Enter Area"+":");
     String area=sc.nextLine();
     
    System.out.println("Enter noOfDistrict"+":");
      int noOfDistrict=sc.nextInt();
      
       System.out.println("Enter noOfMales"+":");
       long noOFMales=sc.nextLong();
       
        System.out.println("Enter noOfFemales"+":");
        long noOfFemales=sc.nextLong();
        
        states bihar=new states(cheifministerName,population,area,noOfDistrict,noOFMales,noOfFemales);
              
    
         
         String a=bihar.getcheifministerName();
         System.out.println(a);
         
         String b=bihar.getpopulation();
          System.out.println(b);
          
           String c=bihar.getarea();
          System.out.println(c);
          
           int d=bihar.getnoOfDistrict();
          System.out.println(d);
          
           long e=bihar.getnoOfMales();
          System.out.println(e);
          
           long f=bihar.getnoOfMales();
          System.out.println(f);
          
          
        
        
    }
    
}
class states{
    
String cheifministerName;
String population;
String area;
int noOfDistrict;
long noOfMales;
long noOfFemales;




public states(String cheifministerName,String population,String area,int noOfDistrict,long noOfMales,long noOfFemales){
    this.cheifministerName=cheifministerName;
    this.population=population;
    this. area= area;
    this.noOfDistrict=noOfDistrict;
    this.noOfMales=noOfMales;
    this.noOfFemales=noOfFemales;
    
}

public String getcheifministerName(){
return this.cheifministerName;
}

public String getpopulation(){
return this.population;

}

public String getarea(){
return this.area;

}

public int getnoOfDistrict(){
return this.noOfDistrict;

}


public long getnoOfMales(){
return this.noOfMales;

}


public long getnoOfFemales(){
return this.noOfFemales;

}












}