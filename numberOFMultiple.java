import java.util.Scanner;
public class numberOFMultiple{

 public static void main(String[] args)
 {
 
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    
    int count =0;
    
    for(int i=1;i<=n;i++){
    
    for(int j=1;j<=i;j++){
    
    if(i%j==0){
    
    count++;
    
    }
    
    }
    
    System.out.print(count + " ");
    count=0;
    
    
    
    
    }
    
    
    
    
    
    }
    
    
    
    
    
    }
