package Day2;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the nubmer:-");
        int n=scn.nextInt();
        
       //we are nested loop for print pattern 
        //external loop will go upto given number
        for(int i=0;i<n;i++){
            //internal loop will go upto ith value
            for(int j=0;j<=i;j++){
                 System.out.print("# ");
            }
            System.out.println();
        }
    
    
        //external loop will come from n to 0
        for(int i=n;i>=0;i--){
            //internal will come from n to ith value
            for(int j=0;j<i;j++){
                  System.out.print("# ");
            }
            System.out.println();
        }
    }
}
    

    
    

