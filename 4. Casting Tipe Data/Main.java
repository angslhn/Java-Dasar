// Casting tipe data
// Mengkonversi sebuah variable dengan tipe data tertentu ke tipe data lain

//  Type casting adalah saat menetapkan nilai dari satu tipe data primitif ke tipe lain.
//  Di Java, ada dua tipe casting:

//  Widening Casting (otomatis) - mengubah tipe yang lebih kecil ke tipe yang lebih besar
//  byte -> short -> char -> int -> long -> float -> double

//  Narrowing Casting (manual) - mengubah tipe yang lebih besar ke tipe yang lebih kecil
//  double -> float -> long -> int -> char -> short -> byte

public class Main {
    public static void main(String[] args) {
        byte angka_byte = 25;
        short angka_short = angka_byte;
        int angka_int = angka_short;
        long angka_long = angka_int;
        float angka_float = angka_long;
        double angka_double = angka_float;

        System.out.println(angka_double);

        double angka_double = 25.99;
        float angka_float = (float) angka_double;
        long angka_long = (long) angka_float;
        int angka_int = (int) angka_long;
        short angka_short = (short) angka_int;
        byte angka_byte = (byte) angka_short;

        System.out.println(angka_byte);
    }
}