

import java.util.Scanner;

public class exe06 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X < 0) {
            System.out.println("Esse número é negativo");
        }
        if (X > 0){
            System.out.println("Esse número não é negativo");
        }
        sc.close();
    }
}
