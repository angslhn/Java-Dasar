public class Array {
    public static void main(String[] args){
//  Cara-cara membuat sebuah variabel yang berisi array.
//  1.
        String[] nama_lengkap;
        nama_lengkap = new String[2];

        nama_lengkap[0] = "Aang";
        nama_lengkap[1] = "Solihin";

        for (String nama : nama_lengkap) {
            System.out.println(nama);
        }

        System.out.println("\n");

//  2.
        int[] angka = {1, 4, 7, 9, 2, 3, 5, 10, 8, 6};
        for (int loop : angka) {
            System.out.println(loop);
        };

        System.out.println("\n");

//  3.
        long[] harga = new long[] {
                1_000_000L, 250_000L, 750_000L
        };

        for(long newHarga : harga) {
            System.out.println(newHarga);
        }

    }
}
