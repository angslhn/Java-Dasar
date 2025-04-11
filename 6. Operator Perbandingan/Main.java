// Operator Perbandingan

// ==	Sama dengan
// !=	Tidak sama dengan
// >	Lebih besar
// <	Lebih kecil
// >=	Lebih besar atau sama dengan
// <=	Lebih kecil atau sama dengan

public class Main {
    public static void main(String[] args) {
        int nilai_mahasiswa = 95;
        int nilai_mahasiswa_lulus = 65;

        System.out.println(" Nilai Mahasiswa Sama Dengan Nilai Untuk Lulus ? " + (nilai_mahasiswa == nilai_mahasiswa_lulus));
        System.out.println(" Nilai Mahasiswa Tidak Dengan Nilai Untuk Lulus ? " + (nilai_mahasiswa != nilai_mahasiswa_lulus));
        System.out.println(" Nilai Mahasiswa Lebih Besar Nilai Untuk Lulus ? " + (nilai_mahasiswa > nilai_mahasiswa_lulus));
        System.out.println(" Nilai Mahasiswa Lebih Kecil Nilai Untuk Lulus ? " + (nilai_mahasiswa < nilai_mahasiswa_lulus));
        System.out.println(" Nilai Mahasiswa Lebih Besar Sama Dengan Nilai Untuk Lulus ? " + (nilai_mahasiswa >= nilai_mahasiswa_lulus));
        System.out.println(" Nilai Mahasiswa Lebih Kecil Sama Dengan Nilai Untuk Lulus ? " + (nilai_mahasiswa <= nilai_mahasiswa_lulus));
    }
}
