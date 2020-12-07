
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
public class states {
    
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Name of States"+":");
        String nameOfState=sc.next();
    
        System.out.println("Enter No.of District"+":");
        int noOfDistrict=sc.nextInt();
      
       System.out.println("Enter the area of states in (sqkm)"+":");
       long areaOfState=sc.nextLong();
       
       district[] xyz=new district[noOfDistrict];
       
       for(int i=0;i<noOfDistrict;i++){
           System.out.println("enter district name: ");
           String districtName = sc.next();
           System.out.println("enter population of " + districtName +": ");
           String populationOfDistrict=sc.next();
            
            System.out.println("enter area of "+districtName+": ");
            long area=sc.nextLong();
   
             xyz[i]=new district(districtName,populationOfDistrict,area);
             
             String c=xyz[i].getDistrictName();
             System.out.println(c);
       }
        
       
       
       
       
       
       
       
    }
}

class district{
   String districtName;
   String populationOfDistrict;
   long area;
   
    public district(String districtName,String populationOfDistrict,long area){
        
        this.districtName=districtName;
        this.populationOfDistrict=populationOfDistrict;
        this.area=area;
       
    }
    
    public String getDistrictName(){
    
    return districtName;
}
    
}


