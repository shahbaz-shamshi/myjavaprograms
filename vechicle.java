/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
public class vechicle {
    
    public static void main(String[] args){
    
        Bike bmw=new Bike("Single Cylinder","82000","30km/l","31cc","Limestone Metallic");
        bmw.setenginetype("double Cylinder");
        
    String get=bmw.getenginetype();
    
    System.out.println(get);
    
    
    }
    
}

  class Bike{

    String engineType;
    String price;
    String mileage;
    String displacement;
    String colour;
    
    
    public Bike(String engineType,String price,String mileage,String displacement,String colour){
    
         this.engineType=engineType;
         this.price=price;
         this.mileage=mileage;
         this.displacement=displacement;
         this.colour=colour;
    }
    
    public void setenginetype(String enginetype){
    
    this.engineType=enginetype;
    
    }
    
    public String getenginetype(){
    
    return this.engineType;
    
    
    }
 
}
