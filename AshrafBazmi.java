/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
public class AshrafBazmi {
    
    public static void main(String[] args){
    
    Son shaharyar=new Son("shaharyar",25,"5ft9inch");
     
    String name=shaharyar.getname();
    System.out.println("Name :"+name);
    
       
    int age=shaharyar.getage();
    System.out.println("age :"+age);
    
    
    }
    
}

class Son{

   int age;
   String name;
   String height;
    
    public Son(String n,int a,String h){
        
        
        
        this.name=n;
        this.age=a;
        this.height=h;

}
    
    public String getname(){
    
    return this.name;
  
    }
    
    public int getage(){
    
    return this.age;
    
    }






}
