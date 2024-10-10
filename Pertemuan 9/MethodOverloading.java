public class MethodOverloading {
    public static void main(String[] args) {
//      Method overloading nama yang sama tetapi mengharuskan perbedaan antara jumlah atau isi dari parameter.

        String nama = "Aang";
        String namaAwal = "Aang";
        String namaAkhir = "Solihin";

        ucapan();
        ucapan(nama);
        ucapan(namaAwal, namaAkhir);

    }

    static void ucapan() {
        System.out.println("Hallo");
    }

    static void ucapan(String nama) {
        System.out.println("Hallo" + " " + nama);
    }

    static void ucapan(String namaAwal, String namaAkhir) {
        System.out.println("Hallo" + " " + namaAwal + " " + namaAkhir);
    }
}
