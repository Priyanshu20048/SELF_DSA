// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

import java.util.*;
public class pattern11 {
    public static void p11first(int n ){
        for (int i =0 ;i<n;i++){
            for (int j = 0 ;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p11second(int n ){
        for (int i =0;i<n-1;i++){
          for (int j =n-1;j>i;j--){
            System.out.print("* ");
          }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p11first(n);
        p11second(n);
    }
    
}

//------------------Strivers Approach --------------------------
// public static void print11(int n ){
//     for (int i =1; i <= 2*n-1; i++){
//         int stars = i;
//         if (i>n){stars = 2*n -i;}
//             for (int j =1;j<=stars;j++){
//                 System.out.print("*");
//             }
        
       
//         System.out.println();
//     }}

