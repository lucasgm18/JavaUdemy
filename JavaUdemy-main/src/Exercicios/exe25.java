import java.util.Scanner;

public class exe25 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }
        sc.close();
    }
}
//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor
