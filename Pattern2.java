package Abdulbari.Loops;

public class Pattern2 {
    public static void main(String[] args){

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){

                System.out.format("%2d",j);
            }
            System.out.println("");
        }
    }
}