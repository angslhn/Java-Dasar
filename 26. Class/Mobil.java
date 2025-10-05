public class Mobil {
    String merek;
    String model;
    int tahun_produksi;

    public Mobil (String merek, String model, int tahun_produksi){
        this.merek = merek;
        this.model = model;
        this.tahun_produksi = tahun_produksi;
    }

    void maju() {
        System.out.println("Mobil maju...");
    }

    void mundur() {
        System.out.println("Mobil mundur...");
    }
}
