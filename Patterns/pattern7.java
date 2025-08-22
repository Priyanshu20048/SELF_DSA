// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

import java.util.*;
public class pattern7 {
    public static void p7(int n ){
        for (int i =n;i>0;i--){
            for (int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p7(n);
    }
    
}
