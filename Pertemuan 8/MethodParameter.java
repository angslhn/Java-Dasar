import java.util.Scanner;
public class MethodParameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angkaPertama;
        int angkaKedua;
        int hasil;

        line();

        System.out.print("Angka Pertama = ");
        angkaPertama = input.nextInt();

        System.out.print("Angka Kedua = ");
        angkaKedua = input.nextInt();

        line();

        hasil = tambah(angkaPertama, angkaKedua);
        System.out.println("Hasilnya adalah " + hasil);

        line();
    }

//  Tidak mengembalikan nilai
    static void line() {
        System.out.println("------------------------------------------");
    }

//  Mengembalikan nilai
    static int tambah(int angkaPertama, int angkaKedua) {
        return angkaPertama + angkaKedua;
    }
}
