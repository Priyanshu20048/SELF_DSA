// 1
// 0 1 
// 1 0 1
// 0 1 0 1 
// 1 0 1 0 1 

//  ----------------- MY APPROACH----------------- 
import java.util.Scanner;

public class pattern12 {
    public static void p11(int n ){
      for (int i =0;i<n;i++){
        if (i%2==0){
            for (int j =0;j<i+1;j++){
                if (j%2==0){
                System.out.print("1 ");
            }
            else {
                System.out.print("0 ");
            }
        }
        }
        else {
            for (int j =0;j<i+1;j++){
                if (j%2==0){
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
        }
        System.out.println( );
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p11(n);
    }
    
}


----------------------STRIVER'S Approach-----------
public static void print11(int n ){
    int start = 1;
    for (int i =0; i <n;i++){
        if (i%2== 0 ) start =1;
        else start =0;
        for (int j =0; j<=i;j++){
            System.out.print(start);
            start = 1-start;
        }
        System.out.println();
    }
}