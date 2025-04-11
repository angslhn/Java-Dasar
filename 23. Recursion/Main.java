public class Main {
    public static void main(String[] args) {
        int angka = 10;
        int hasilFaktorial = faktorial(angka);

        System.out.printf("Hasil Faktorial Dari %d Adalah %d", angka, hasilFaktorial);
    }

    static int faktorial(int angka) {
        if (angka == 0 || angka == 1) {
            return 1;
        } else {
            return angka * faktorial(angka - 1);
        }
    }
}
