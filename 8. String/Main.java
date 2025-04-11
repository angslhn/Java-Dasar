// String
// String berisi kumpulan karakter yang dikelilingi tanda kutip ganda

// Escape Character
//  \'  Single quote
//  \" 	Double quote
//  \\ 	Backslash
//  \n 	New Line
//  \r 	Carriage Return
//  \t 	Tab
//  \b 	Backspace
//  \f 	Form Feed

// String Format
//  %s  String
//  %d  Integer (byte, short, int, long)
//  %f  Floating-point (float, double)
//  %c  Character
//  %b  Boolean
//  %x  Integer Hexadecimal
//  %o  Integer Octal
//  %e  Scientific notation (float/double)
//  %g  Float/Double
//  %-<number>  Left alignment
//  %<number>   Right alignment
//  %n	Newline

public class Main {
    public static void main(String[] args) {
        String nama_depan = "Aang";
        String nama_belakang = "Solihin";
        String nama_lengkap = nama_depan + " " + nama_belakang;
        String tahun_kelahiran = 20 + "05";
        int umur = 19;

        System.out.printf("Nama saya adalah %s, saya lahir pada tahun %s dan umur saya saat ini adalah %d tahun.", nama_lengkap, tahun_kelahiran, umur);
    }
}