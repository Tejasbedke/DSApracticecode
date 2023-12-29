import java.util.Scanner;
public class christmustree {
    /*
         *    
        ***   
       *****
      *******
      *******
       *****
        ***
         *  
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
         
        System.out.println("Enter height of Christmus tree:->");
        int n=scn.nextInt();

        /*
         * 
         *      #
         *     ###
         *    #####
         *   #######
         */
        
         for(int i=0;i<n;i++){
              
               for(int j=0;j<n-i;j++){
                System.out.print(" ");
               }

               for(int k=0;k<i;k++){
                System.out.print("*");
               }

               System.out.print("*");


                for(int k=0;k<i;k++){
                System.out.print("*");
               }
               System.out.println();
         }

         /*
          * #######
          *  #####
          *   ###
          *    #
          */

           for(int i=n;i>=0;i--){
              
               for(int j=i;j<n;j++){
                System.out.print(" ");
               }

               for(int k=0;k<i;k++){
                System.out.print("*");
               }

               System.out.print("*");


                for(int k=0;k<i;k++){
                System.out.print("*");
               }
               System.out.println();
         }
        
    }

    
}
