public class ArrayExtend {
    public static void main(String[] args) {
        String[][] datas = {
                {"Aang Solihin", "19", "Mahasiswa"},
                {"Asep Septian", "21", "Mahasiswa"},
                {"Jajang Kurniawan", "23", "Ojek Online"},
                {"Cecep Priyatna", "31", "Kuli Bangunan"}
        };

        for (int i = 0; i < datas.length; i++) {
            System.out.println("-----------------------");
            System.out.println("Nama : " + datas[i][0]);
            System.out.println("Umur : " + datas[i][1]);
            System.out.println("Umur : " + datas[i][2]);
        };
        System.out.println("-----------------------");
        System.out.println("Jumlah : " + datas.length + " Orang");
    }
}