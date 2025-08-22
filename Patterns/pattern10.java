//      *
//     ***
//    *****
//   *******
//  *********
//  *********
//   *******
//    *****
//     ***
//      * 
     
import java.util.*;
public class pattern10 {
    public static void p10(int n ){
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

    public static void p10second(int n ){
    for (int i =0;i<n;i++){
        for (int j =0;j<=i;j++){
            System.out.print(" ");
        }
        for (int k = 2*n-(2*i+1);k>0;k--){
             System.out.print("*");
        }
        for (int l =0;l<i;l++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p10first(n);
        p10second(n);
    }
}
