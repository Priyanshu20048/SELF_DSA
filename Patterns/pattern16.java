// A B C D E F
// A B C D E
// A B C D
// A B C
// A B
// A


import java.util.*;
public class pattern16 {
    public static void p15(int n ){
       
        for (int i =0;i<n;i++){
              char ch = 'A';
            for ( int j =n-i;j>0;j--){
               
                System.out.print(ch + " ");
                ch +=1;

            }
            System.out.println();
        }

    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    p15(n);    }
    
}
