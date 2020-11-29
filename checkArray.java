/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
public class checkArray {
    
    public static void main(String[] args){
    
    int[] array={2,4,6,8,5};
    int[] arr={4,5,2,8,6};
    
   boolean a= check(array,arr);
   System.out.println(a);
    
    
    }

    private static boolean check(int[] array, int[] arr) {
        
        int size=array.length;
              
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            
              if(array[i]==arr[j]){
                count++;  
                  
              }
            }
            if(count!=1){
            return false;
            }
            
            }
          return true;
        
        
        }
        
    }
    

