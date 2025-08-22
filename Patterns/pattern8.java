//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 

import java.util.*;
public class pattern8 {
    public static void p8(int n ){
        for (int i =0; i <n;i++){
            for (int j =n;j>i;j--){
                System.out.print(" ");
            }
            for (int k =0;k<2*i+1;k++){
                System.out.print("*");
            }
            for (int l =0;l<n;l++){
                System.out.print(" ");
            }
  System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p8(n);
    }
}
