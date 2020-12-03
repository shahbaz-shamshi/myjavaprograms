/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
public class bimaari {
    
    public static void main(String[] args){
    diseases corona=new diseases(100, "corona ho gaya");
    diseases fever = new diseases(99, "fver hai" );
    
   corona.second();
   fever.second();
 //   double c = corona.getbodyTemp();
    
    
    }                                           

}


class diseases{

String symptoms;
int bodyTemp;


public diseases(int bodytemp, String syamptoms){
    System.out.println(bodytemp);
    this.bodyTemp = bodytemp;
    this.symptoms = syamptoms;




}

public int second(){
System.out.println(this.symptoms);
System.out.println("fit");
return this.bodyTemp;
}
public double getbodyTemp() {
 return this.bodyTemp;
}

}
