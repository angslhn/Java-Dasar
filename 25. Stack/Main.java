import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> kota = new Stack<>();

        kota.push("Jakarta");
        kota.push("Bandung");
        kota.push("Sumedang");

        System.out.println(kota.firstElement()); // Jakarta
        System.out.println(kota.peek()); // Sumedang
    }
}