


import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
public class exe08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros:");
        int B = sc.nextInt();
        int A = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos!");
        }
        else {
            System.out.println("Não são multiplos!");
        }

        sc.close();
    }
}
