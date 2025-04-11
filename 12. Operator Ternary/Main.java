// Operator Ternary
// Operator kondisional yang digunakan untuk menggantikan if-else sederhana dalam satu baris kode

public class Main {
    public static void main(String[] args) {
        boolean absen = false;

        String info_absen = (absen) ? "Anda sudah absen." : "Anda belum melakukan absen.";

        System.out.println(info_absen);
    }
}
