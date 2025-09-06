// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********


import java.util.*;
public class pattern20 {
    public static void p20(int n ){
        for (int i =1; i<=n;i++ ){
            for (int j = n-i+1;j>0;j--){
                System.out.print("*");
            }
            for (int k =1;k<=2*i-2;k++){
                System.out.print(" ");
            }
            for (int l =n-i+1;l>0;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    
          int lo= n;
        for (int i =1;i<=n;i++){
          
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 2*lo -2;j>0;j--){
                System.out.print(" ");
                
            }

            for (int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
             lo -=1;
        }
    }
    
    
 public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p20(n);
       
    }
}
