import java.util.Scanner;
import java.util.Arrays;
//program to create array and taking input from user
public class Arrayinput {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of array:->");
        int n=scn.nextInt();
        //Array created with the n size
        int []arr=new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();            
        }
        
        //Now we are printing the array
         System.out.println("Array contains:->");
        for (int i : arr) {
            System.out.print(i+" ");            
        }
        System.out.println();
        //By using toString method of Arrays class
        System.out.println(Arrays.toString(arr));
    }
    
}
