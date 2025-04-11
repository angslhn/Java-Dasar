// Methods Overloading
// Beberapa method dapat memiliki nama yang sama dengan parameter yang berbeda

public class Main {
    public static void main(String[] args) {
        int hasilTambahInteger = Tambah(17, 25);
        float hasilTambahFloat = Tambah(23.5f, 12.8f);

        System.out.println(hasilTambahInteger);
        System.out.println(hasilTambahFloat);
    }

    static int Tambah(int a, int b) {
        return a + b;
    }

    static float Tambah(float a, float b) {
        return a + b;
    }
}
