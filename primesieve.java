import java.util.Scanner;
public class primesieve{

 public static void main(String[] args)
 {

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    
    
    int [] a = new int[n];
    
    for(int i=0;i<n;i++){
    
    a[i]=0;
    
    
    }
    
    for(int i=2;i<=n/2;i=i+1){
    
    for(int j=i+i;j<n;j=j+i){
    
    a[j]=1;
    
    }
    
    
    
    }
    
    for(int i=2;i<n;i++){
    
    if(a[i]==0){
    
    System.out.print(" " +i);
    
    }
    
    }

}




}
