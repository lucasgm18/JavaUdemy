

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto (1 a 5) e a quantidade:");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        String produto;

        String[] produtos = {"Cachorro quente", "X-bacon", "X-salada", "Torrada simples", "Refrigerante"};
        double[] precos = {4.0, 4.5, 5.0, 2.0, 1.5};

        if (codigo >= 1 && codigo <= 5) {
            produto = produtos[codigo - 1];
            total = quantidade * precos[codigo - 1];
            System.out.printf("Produto: %s%nQuantidade: %d%nTotal: R$ %.2f%n", produto, quantidade, total);
        } else {
            System.out.println("Código inválido.");
        }

        sc.close();
    }
    }

