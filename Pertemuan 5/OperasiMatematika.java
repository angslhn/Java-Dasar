import java.util.Scanner;
public class OperasiMatematika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angkaPertama;
        int angkaKedua;
        int hasil = 0;
        int opsi;

        System.out.println("----------------------");
        System.out.println("KALKULATOR KABATAKU");
        System.out.println("1. Kali");
        System.out.println("2. Bagi");
        System.out.println("3. Tambah");
        System.out.println("4. Kurang");
        System.out.println("----------------------");
        System.out.print("Masukan Opsi = ");
        opsi = scanner.nextInt();
        System.out.println("----------------------");

        if (opsi ==  1) {
            System.out.print("Angka Pertama = ");
            angkaPertama = scanner.nextInt();
            System.out.print("Angka Kedua = ");
            angkaKedua = scanner.nextInt();

            hasil = angkaPertama * angkaKedua;
            System.out.println("Hasilnya adalah = " + hasil);

        } else if (opsi == 2) {
            System.out.print("Angka Pertama = ");
            angkaPertama = scanner.nextInt();
            System.out.print("Angka Kedua = ");
            angkaKedua = scanner.nextInt();

            hasil = angkaPertama / angkaKedua;
            System.out.println("Hasilnya adalah = " + hasil);

        } else if (opsi == 3) {
            System.out.print("Angka Pertama = ");
            angkaPertama = scanner.nextInt();
            System.out.print("Angka Kedua = ");
            angkaKedua = scanner.nextInt();

            hasil = angkaPertama + angkaKedua;
            System.out.println("Hasilnya adalah = " + hasil);

        } else if (opsi == 4) {
            System.out.print("Angka Pertama = ");
            angkaPertama = scanner.nextInt();
            System.out.print("Angka Kedua = ");
            angkaKedua = scanner.nextInt();

            hasil = angkaPertama + angkaKedua;
            System.out.println("Hasilnya adalah = " + hasil);

        } else {
            System.out.println("Maaf opsi tidak valid!");
        }
        System.out.println("----------------------");

    }
}
