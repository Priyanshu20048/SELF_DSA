// for variable length of patterns 
import java.util.*;
public class pattern2 {
    public static void p1(int n){
        for (int i =0; i <n;i++){
            for (int j =0; j <n;j++){
                System.out.print("# ");
            }
            System.out.println( );
        }
        
    } 
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    p1(n);
}}