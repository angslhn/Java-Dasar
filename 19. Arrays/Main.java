// Arrays
// Array digunakan untuk menyimpan beberapa nilai dalam satu variabel, alih-alih mendeklarasikan variabel terpisah untuk setiap nilai

import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat dan Menginisialisasi Array Secara Terpisah
        int[] angka = new int[5];
        angka[0] = 23; 
        angka[1] = 75; 
        angka[2] = 32; 
        angka[3] = 95; 
        angka[4] = 145; 
        
        int jumlah = 0;
        for (int x : angka) {
            jumlah += x;
        }

        System.out.println("Hasil dari" + " " + "adalah" + " " + jumlah + "\n");

        // Membuat dan Menginisialisasi Secara Langsung
        LocalDate tanggal = LocalDate.now();
        int index_hari = tanggal.getDayOfWeek().getValue();
    
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};

        System.out.println("Hari ini adalah" + " " + hari[index_hari - 1] + "\n");

        // Membuat dengan ArrayList sebagai Alternatif jika ukuran dinamis
        ArrayList<String> users = new ArrayList<>();

        users.add("Aang Solihin");
        users.add("Jajang Supardi");
        users.add("Jamal Hidayat");

        int no = 1;
        for (String user : users) {
            System.out.println(no + ". " + user);
            no ++;
        }
    }
}