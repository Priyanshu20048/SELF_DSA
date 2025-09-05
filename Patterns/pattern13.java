// 1             1
// 1 2         2 1
// 1 2 3     3 2 1
// 1 2 3 4 4 3 2 1

import java.util.*;
public class pattern13 {
    public static void p13(int n ){
        int space = 2*(n-1);
    for (int i =1;i<=n;i++){
        for (int j = 1 ; j<=i;j++){
            System.out.print(j+" ");
        }
        for (int k =1; k<=space;k++){
            System.out.print("  ");
        }
        for (int l = i ; l >=1;l--){
            System.out.print(l+" ");
        }
        System.out.println();
        space-=2;
    }
    
}

public static void main(String [] args ){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    p13(n);
   
}
}
