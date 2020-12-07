
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
public class revision {
   
    public static void main(String[] args){
          
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the no.of Element : ");
    int n=sc.nextInt();
    
    revision2[] array =new revision2[n];
    
    for(int i=0;i<n;i++){
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        char c = sc.next().charAt(0);
        System.out.println("Enter the fourth number:");
        String d=sc.next();
    
     array[i]=new revision2(a,b,c,d);
    
    }
    int g;
    revision2 s;
    for(int j=0;j<n;j++){
    
     int f=array[j].geta();
     
      for(int i=j+1;i<n;i++){
      g=array[i].geta();
      if(f>g){
      s=array[i];
      array[i]=array[j];
      array[j]=s;
      }
      
      }
       
      }
    for(int i=0;i<n;i++){
    System.out.println(array[i].geta());
      
    }
     
      
    }
    
      
}




class revision2{

int a;
int b;
char c;
String d;

public revision2(int a,int b,char c,String d){

    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;

}

public int geta(){ 
    return this.a;
}


public int getb(){
return this.b;
}

public char getc(){
return this.c;
}

public String getd(){
return this.d;
}

public void seta(int a){
this.a=a;
}

public void setb(int b){
this.b=b;
}





}
