// A
// B B
// C C C
// D D D D
// E E E E E
// F F F F F F


import java.util.*;
public class pattern17 {
    public static void p17(int n ){
             char ch = 'A';
        for (int i =0;i<n;i++){
       
            for (int j =0;j<i+1;j++){
                System.out.print(ch +" ");
            }
            ch +=1;
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p17(n);
    }

    
}
