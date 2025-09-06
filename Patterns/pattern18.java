
// E
// D E
// C D E
// B C D E
// A B C D E
import java.util.*;
public class pattern18 {
    public static void p18(int n ){
      for (int i =0; i <n;i++){
        char ch = (char)('A' + (n-i-1));
        for (int j =0;j<i+1;j++){
            System.out.print(ch+ " ");
            ch++;

        }
        System.out.println();
      }
    }
       public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p18(n);
    }
    
}
