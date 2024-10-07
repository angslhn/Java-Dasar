import java.util.Scanner;
public class LatihanNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        String fakultas;
        String programStudi;
        String mataKuliah;
        String hasil;
        int nilai;

        System.out.println(" ");
        System.out.println("-----------------------------------------------");

        System.out.println("CEK NILAI MAHASISWA");

        System.out.print("Nama = ");
        nama = scanner.nextLine();

        System.out.print("Fakultas = ");
        fakultas = scanner.nextLine();

        System.out.print("Program Studi = ");
        programStudi = scanner.nextLine();

        System.out.print("Mata Kuliah = ");
        mataKuliah = scanner.nextLine();

        System.out.print("Nilai = ");
        nilai = scanner.nextInt();

        System.out.println("-----------------------------------------------");

        if (nilai > 30 && nilai <= 40) {
            hasil = "Selamat kamu mendapatkan nilai F selama semester ini.";
        } else if (nilai > 40 && nilai <= 50) {
            hasil = "Selamat kamu mendapatkan nilai E selama semester ini.";
        } else if (nilai > 50 && nilai <= 60) {
            hasil = "Selamat kamu mendapatkan nilai D selama semester ini.";
        } else if (nilai > 60 && nilai <= 70) {
            hasil = "Selamat kamu mendapatkan nilai C selama semester ini.";
        } else if (nilai > 70 && nilai <= 80) {
            hasil = "Selamat kamu mendapatkan nilai B selama semester ini.";
        } else if (nilai > 80 && nilai <= 90) {
            hasil = "Selamat kamu mendapatkan nilai A selama semester ini.";
        } else if (nilai > 90 && nilai <= 100) {
            hasil = "Selamat kamu mendapatkan nilai A+ selama semester ini.";
        } else {
            hasil = "Maaf nilai yang kamu masukan tidak valid.";
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("Nama = " + nama);
        System.out.println("Fakultas = " + fakultas);
        System.out.println("Program Studi = " + programStudi);
        System.out.println("Mata Kuliah = " + mataKuliah);
        System.out.println("Nilai = " + nilai);
        System.out.println("Keterangan = " + hasil);
        System.out.println("-----------------------------------------------");
    }
}
