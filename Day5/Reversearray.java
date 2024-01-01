package Day5;

import java.util.Arrays;

public class Reversearray {

    public static void main(String[] args) {
        
        int []arr={10,20,30,40,50};

        int end=arr.length-1;
        int start=0;

        System.out.println("Before reversed Array:->");
        System.out.println(Arrays.toString(arr));
        while(start<end){
            //swap between s and e

            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        System.out.println("After Reversed Array:->");
        System.out.println(Arrays.toString(arr));

    }
    
}
