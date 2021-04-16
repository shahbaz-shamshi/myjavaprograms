/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
public class problem1{
    
    public static void main(String[] args){
    
        Employee shahbaz=new Employee("audi",50000);
      
            String x=shahbaz.getName();
            System.out.println(x);
            
            int w=shahbaz.getSalary();
            System.out.println(w);
             
        Employee saquib=new Employee("apache",40000);
             
           String y= saquib.getName();
           System.out.println(y);
           int v=saquib.getSalary();
           System.out.println(v);
           
      
        
      
        
    }
    
}
class Employee{

    int salary;
    String name;
    
  
    public Employee(String n,int sal) {
        this.name = n;
        this.salary=sal;
        
    }
    public String getName(){
       return this.name;
     
    
    }
    public int getSalary(){
        return this.salary;
    
    
    
    }

}
