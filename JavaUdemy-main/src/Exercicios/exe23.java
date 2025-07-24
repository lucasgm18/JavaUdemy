import java.util.Locale;
import java.util.Scanner;

public class exe23 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b == 0){
                System.out.println("divisao impossivel");
            }
            else{
                double div = a / b;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
