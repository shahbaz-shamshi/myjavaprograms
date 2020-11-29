public class methodOverloading{

public static void main(String[] args){

calculation();
int a=calculation(5);
int b=calculation(10,5);
double sum=calculation(10,10.5);
}


public static void calculation(){
System.out.println("method overloading");
}


public static int calculation(int a){
    return a;
}

public static int calculation(int b,int c){
    int sum=b+c;
    return sum;
}


public static double calculation(int b,double c){
    double sum=b+c;
    return sum;
}



}