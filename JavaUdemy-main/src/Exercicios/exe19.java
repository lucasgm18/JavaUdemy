public class exe19 {
    // Função f(x) = -x^2 + 2x
    public static double f(double x) {
        return -Math.pow(x, 2) + 2 * x;
    }

    // Função g(x) = x / (x^2 - 1)
    public static double g(double x) {
        return x / (Math.pow(x, 2) - 1);
    }

    public static void main(String[] args) {
        // Letra (a)
        System.out.println("a) f(-1) = " + f(-1));
        System.out.println("   f(1/2) = " + f(1.0 / 2));

        // Letra (b)
        System.out.println("b) g(0) = " + g(0));
        System.out.println("   g(2) = " + g(2));
        System.out.println("   g(sqrt(2)) = " + g(Math.sqrt(2)));

        // Letra (c)
        double a = 2, b = 3; // Valores arbitrários diferentes de zero
        double resultadoC = (f(a + b) - f(a - b)) / (a * b);
        System.out.println("c) (f(a+b) - f(a-b)) / ab = " + resultadoC);

        // Letra (d)
        double resultadoD = (f(a + b) - f(a - b)) / (a * b);
        System.out.println("d) (f(a+b) - f(a-b)) / ab = " + resultadoD);
    }
}

