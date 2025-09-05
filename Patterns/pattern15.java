// A
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F



import java.util.*;
public class pattern15 {
    public static void p15(int n){
        for (int i =0; i < n ; i++){
            for ( char a = 'A'; a <= 'A' +i;a++ ){
                System.out.print(a + " ");

            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        p15(n);
    }
    
}
