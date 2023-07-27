package Abdulbari.Loops;
import java.util.*;
public class Fibanocci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0,b=1;
        int n=sc.nextInt();
        System.out.print(a+","+b+",");

        for(int i=0;i<n-2;i++){
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }

    }
}
