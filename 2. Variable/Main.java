// Variable

public class Main {

    public static void main(String[] args) {
        final int ID = 1; // Final nilainya tidak bisa diubah setelah diberikan nilai awal.
        var kode_biodata = "L001"; // Deklarasi variabel dengan inferensi tipe secara otomatis.
        String nama = "Aang Solihin"; // String
        int umur = 19; // Integer
        char jenis_kelamin = 'L'; // Char
        float tinggi_badan = 170.5F; // Float
        boolean status_menikah = false; // Boolean
        long penghasilan_bulanan = 120_0000_000; // Long

        System.out.println(ID);
        System.out.println(kode_biodata);
        System.out.println(nama);
        System.out.println(umur);
        System.out.println(jenis_kelamin);
        System.out.println(tinggi_badan);
        System.out.println(status_menikah);
        System.out.println(penghasilan_bulanan);
    }
}