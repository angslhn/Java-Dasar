// If, Else If, dan Else

// If       Kode yang dijalankan jika kondisi 1 benar
// Else if  Kode yang dijalankan jika kondisi 2 benar
// Else     Kode yang dijalankan jika semua kondisi sebelumnya salah

public class Main {
    public static void main(String[] args) {
        double jam = 20.30;

        if ((jam >= 0 && jam <= 3) || (jam > 19 && jam < 24)) {
            System.out.println("Hallo, selamat malam!");
        } else if (jam > 3 && jam <= 10) {
            System.out.println("Hallo, selamat pagi!");
        } else if (jam > 10 && jam <= 15) {
            System.out.println("Hallo, selamat siang!");
        } else if (jam > 15 && jam <= 19) {
            System.out.println("Hallo, selamat sore!");
        } else {
            System.out.println("Hallo, selamat datang!");
        }
    }
}
