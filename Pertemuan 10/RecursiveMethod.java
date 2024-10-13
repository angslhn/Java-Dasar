import java.util.Scanner;
public class RecursiveMethod {
    public static void main(String[] args) {
//      Recursive method adalah kemampuan memanggil fungsi dari fungsi itu sendiri.

        Scanner input = new Scanner(System.in);

        int nilaiFaktorialLoop;
        int nilaiFaktorialRecursive;

        lines();
            System.out.print("Masukan Nilai Faktorial -> ");
            nilaiFaktorialLoop = input.nextInt();
        lines();
            System.out.print("Masukan Nilai Faktorial -> ");
            nilaiFaktorialRecursive = input.nextInt();
        lines();
            System.out.println("Hasilnya Adalah " + faktorialLoop(nilaiFaktorialLoop));
            System.out.println("Hasilnya Adalah " + faktorialRecursive(nilaiFaktorialRecursive));
        lines();
    }

    //      Faktorial loop
    static int faktorialLoop(int value) {
        int hasil = 1;
        for (var i = 1; i <= value; i++) {
            hasil *= i;
        }
        return hasil;
    }

    //      Faktorial Recursive
    static int faktorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * faktorialRecursive(value - 1);
        }
    }

    static void lines() {
        System.out.println("-----------------------------------------------");
    }
}
