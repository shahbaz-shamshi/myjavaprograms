/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
public class Mobile {
    
    public static void main(String[] args){
    
        specification realme=new specification("8pro","RMX3081","6GB","128GB","16.26cm","4500 mAh","16MP");
        
         String modelName=realme.getmodelName();
         System.out.println("model Name : "+modelName);
         
         String modelNameNew=realme.setmodelName("proMax");
         System.out.println("new model name: "+modelNameNew);
         
        
         String modelNumber=realme.getmodelNumber();
         System.out.println("model Number : "+modelNumber);
         
         String modelNumberNew=realme.setmodelNumber("RMX80000");
         System.out.println("new model number: "+modelNumberNew);
         
         
         
         String Ram=realme.getRam();
         System.out.println("Ram : "+Ram);
         
         String Rom=realme.getRom();
         System.out.println("Rom : "+Rom);
         
         String Display=realme.getDisplay();
         System.out.println("Display : "+Display);
         
         String Battery=realme.getBattery();
         System.out.println("Battery : "+Battery);
         
         String frontCamera=realme.getfrontCamera();
         System.out.println("Front Camera: "+frontCamera);
   
    
          
    
    
    } 
}

class specification{

    String modelNumber;
    String modelName;
    String Ram;
    String Rom;
    String Display;
    String Battery;
    String frontCamera;
    

    public specification(String modelName,String modelNumber,String Ram,String Rom,String Display,String Battery,String frontCamera){
    
        this.modelName=modelName;
        this.modelNumber=modelNumber;
        this.Ram=Ram;
        this.Rom=Rom;
        this.Display=Display;
        this.Battery=Battery;
        this.frontCamera=frontCamera;
        
    }
    
    
    public String getmodelName(){
    
       return this.modelName;
    }
    
    public String setmodelName(String modelName){
    
    return this.modelName=modelName;
    
    }
     
     public String getmodelNumber(){
    
       return this.modelNumber;
    }
     
       public String setmodelNumber(String modelNumber){
    
    return this.modelNumber=modelNumber;
    
    }
     
     
     
     
     public String getRam(){
     return this.Ram;
     
    }
     
     public String getRom(){
     return this.Rom;
            
    }
     
     public String getDisplay(){
     return this.Display;
     
     }

     public String getBattery(){
     return this.Battery;
     
     }
     
     public String getfrontCamera(){
     
     return this.frontCamera;
     
     }

}