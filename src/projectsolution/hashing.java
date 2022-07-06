
package projectsolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class hashing {
 public static void main(String []args){
         
         Scanner scn = new Scanner(System.in);
         System.out.print("Enter The Array Length");
         int n=scn.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter the Array elements");
         for(int j=0; j<n;j++){
             arr[j]=scn.nextInt();
             
         }
       
         
         
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int value = hashMap.get(arr[i]);
                hashMap.put(arr[i], ++value);
            } else
                hashMap.put(arr[i], 1);
 
        }
        
        int maxReapeatedNumber = getMaxReapeatedNumber(hashMap ,  arr.length);
        
        if (maxReapeatedNumber != -1) {
            System.out.println("maxReapeatedNumber =   " + maxReapeatedNumber);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == maxReapeatedNumber)
                    System.out.println("index =   " + i);
            }
        } else {
            System.out.println( "index =   " + maxReapeatedNumber);
            System.out.println("No dominator");
        }
         
        
     }
     
   public static int getMaxReapeatedNumber(HashMap<Integer, Integer> hashMap , int arrSize ) {
         
        Map.Entry<Integer, Integer> entryWithMaxValue = hashMap.entrySet().iterator().next();
 
         for (Map.Entry<Integer, Integer> currentEntry : hashMap.entrySet()) {
            if ( currentEntry.getValue() > entryWithMaxValue.getValue()) {
                entryWithMaxValue = currentEntry;
            }
        }
        int number = entryWithMaxValue.getKey();
        int repeatedTime = entryWithMaxValue.getValue();
 
         if (repeatedTime > (int) arrSize / 2)
            return number;
        else return -1;
     
      
    }
 
}