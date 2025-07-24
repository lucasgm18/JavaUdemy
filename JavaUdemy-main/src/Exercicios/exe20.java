

import java.util.Scanner;


public class exe20 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();

        if (x < 1 || x > 1000) {
            System.out.println("Valor fora do intervalo permitido (1 <= X <= 1000).");
            return;
        }

      for (int i=1; i<=x; i++) {
          if (i % 2!=0)
                       System.out.println(i);
        }
        sc.close();
    }

}


//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.