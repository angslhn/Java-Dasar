public class MethodVariableArgument {
    public static void main(String[] args) {
//      Method variable argument memasukan sebuah nilai ke parameter lebih dari 1 nilai.
//      int[] nilai = {80, 90, 70, 100};
        String nama = "Aang Solihin";
        ucapanNilai(nama, 80, 90, 70, 100);
    }

    static void ucapanNilai(String nama, int... nilai) {
        var nilaiNilai = 0;
        for (var value : nilai) {
            nilaiNilai += value;
        }

        var totalNilai = nilaiNilai / nilai.length;

        String ucapanNilai = totalNilai >= 80 && totalNilai <= 100 ? "Selamat " + nama + " Anda Lulus" : nama + " Anda Tidak Lulus";

        System.out.println(ucapanNilai);
    }
}
