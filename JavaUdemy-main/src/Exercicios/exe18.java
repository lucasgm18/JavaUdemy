

public class exe18 {
    public static double logBaseA(double x, double a) {
        if (a <= 0 || a == 1) {
            throw new IllegalArgumentException("A base 'a' deve ser um número positivo diferente de 1.");
        }
        if (x <= 0) {
            throw new IllegalArgumentException("O valor de 'x' deve ser positivo.");
        }
        return Math.log(x) / Math.log(a);
    }

    public static void main(String[] args) {
        double a = 0.5;
        double[] valoresX = {0.1, 0.5, 1, 2, 5};

        for (double x : valoresX) {
            System.out.printf("log_%.2f(%.2f) = %.4f%n", a, x, logBaseA(x, a));
        }
    }
}
