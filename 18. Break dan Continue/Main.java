// Break dan Continue

// Break untuk menghentikan seluruh perulangan, keluar dari iterasi, dan melanjutkan eksekusi setelah iterasi
// Continue untuk melompati iterasi saat ini dan langsung lanjut ke iterasi berikutnya tanpa menghentikan seluruh iterasi

public class Main {
    public static void main(String[] args) {
        for (int index = 1; index <= 10; index++) {
            if (index % 2 == 1) continue;
            System.out.printf("Ini adalah loop ke %d %n", index);
        }

        System.out.println(" ");

        for (int index = 1; index <= 10; index++) {
            if (index == 7) break;
            System.out.printf("Ini adalah loop ke %d %n", index);
        }
    }
}
