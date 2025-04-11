// Methods

public class Main {
    public static void main(String[] args) {
        SayHello("Aang Solihin");
        System.out.println(Tambah(10, 5));
    }

    // Method Tanpa Mengembalikan Nilai
    static void SayHello() {
        System.out.println("Hallo Teman!");
    }

    // Method Dengan Parameter Tanpa Mengembalikan Nilai
    static void SayHello(String nama) { 
        System.out.printf("Hallo %s! %n", nama);
    }

    // Method yang Mengembalikan Nilai
    static int Tambah(int a, int b) {
        return a + b;
    }
}
