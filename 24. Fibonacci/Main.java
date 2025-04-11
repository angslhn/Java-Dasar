public class Main {
    public static void main(String[] args) {
        long n = 20;
        long result = fibonacci(n);

        System.out.printf("Deret Fibonacci Ke-%d Adalah %d", n, result);
    }

    static long fibonacci (long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0;
        long b = 1;
        long result = 0;

        for (int iteration = 2; iteration <= n; iteration++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}
