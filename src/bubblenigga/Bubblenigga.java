
package bubblenigga;

import java.util.Arrays;

public class Bubblenigga {

    
    public static void main(String[] args) {
     String[] strArray = {"balaga", "dalde" , "rautraut" , "clarido"};
     
        System.out.println("Original String Array:" + Arrays.toString(strArray));
        
        bubbleniggaz(strArray);
        System.out.println("Sorted String Array:" + Arrays.toString(strArray));
    }
    static void bubbleniggaz(String[]arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - i - 1;j++){
           if(arr[j].compareTo(arr[j + 1])> 0){
           
           String temp  = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = temp;
        }
        
    }
    }
    
}
