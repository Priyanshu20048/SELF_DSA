// 1
// 2 2
// 3 3 3 
// 4 4 4 4
// 5 5 5 5 5


import java.util.Scanner;

public class pattern5 {
    public static void p4(int n){
     for (int i =1;i<=n;i++){
        for (int j =0;j<i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
     }
    }

    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    p4(n);
}
    
}
