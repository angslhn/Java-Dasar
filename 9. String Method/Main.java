// String Method

// charAt()                 Mengembalikan karakter pada indeks (posisi) yang ditentukan    ->    char
// codePointAt()            Mengembalikan Unicode karakter pada indeks yang ditentukan    ->    int
// codePointBefore()        Mengembalikan Unicode karakter sebelum indeks yang ditentukan    ->    int
// codePointCount()         Mengembalikan jumlah nilai Unicode yang ditemukan dalam string.    ->    int
// compareTo()              Membandingkan dua string secara leksikografis    ->    int
// compareToIgnoreCase()    Membandingkan dua string secara leksikografis, mengabaikan perbedaan huruf besar/kecil    ->    int
// concat()                 Menambahkan string ke akhir string lain    ->    String
// contains()               Memeriksa apakah string berisi urutan karakter    ->    boolean
// contentEquals()          Memeriksa apakah string berisi urutan karakter yang sama persis dari CharSequence atau StringBuffer yang ditentukan    ->    boolean
// copyValueOf()            Mengembalikan String yang mewakili karakter dari Array karakter    ->    String
// endsWith()               Memeriksa apakah string diakhiri dengan karakter yang ditentukan    ->    boolean
// equals()                 Membandingkan dua string. Mengembalikan true jika stringnya sama, dan false jika tidak    ->    boolean
// equalsIgnoreCase()       Membandingkan dua string, mengabaikan pertimbangan huruf besar/kecil    ->    boolean
// format()                 Mengembalikan string yang diformat menggunakan lokal, string format, dan argumen yang ditentukan    ->    String
// getBytes()               Mengubah string menjadi array byte    ->    byte[]
// getChars()               Menyalin karakter dari string ke array karakter    ->    void
// hashCode()               Mengembalikan kode hash dari string    ->    int
// indexOf()                Mengembalikan posisi kemunculan pertama karakter yang ditentukan dalam string    ->    int
// intern()                 Mengembalikan representasi kanonik untuk objek string    ->    String
// isEmpty()                Memeriksa apakah string kosong atau tidak    ->    boolean
// join()                   Menggabungkan satu atau beberapa string dengan pemisah yang ditentukan    ->    String
// lastIndexOf()            Mengembalikan posisi kemunculan terakhir karakter yang ditentukan dalam string    ->    int
// length()                 Mengembalikan panjang string yang ditentukan    ->    int
// matches()                Mencari string untuk kecocokan dengan regex, dan mengembalikan kecocokan    ->    boolean
// offsetByCodePoints()     Mengembalikan indeks dalam String ini yang diimbangi dari indeks yang diberikan oleh codePointOffset titik kode    ->    int
// regionMatches()          Menguji apakah dua string region sama    ->    boolean
// replace()                Mencari string untuk nilai yang ditentukan, dan mengembalikan string baru tempat nilai yang ditentukan diganti    ->    String
// replaceAll()             Mengganti setiap substring dari string ini yang cocok dengan regex yang diberikan dengan penggantian yang diberikan    ->    String
// replaceFirst()           Mengganti kemunculan pertama substring yang cocok dengan regex yang diberikan dengan penggantian yang diberikan    ->    String
// split()                  Membagi string menjadi array substring    ->    String[]
// startsWith()             Memeriksa apakah string dimulai dengan karakter yang ditentukan    ->    boolean
// subSequence()            Mengembalikan urutan karakter baru yang merupakan suburutan dari urutan ini    ->    CharSequence
// substring()              Mengembalikan string baru yang merupakan substring dari string yang ditentukan    ->    String
// toCharArray()            Mengubah string ini menjadi array karakter baru    ->    char[]
// toLowerCase()            Mengubah string menjadi huruf kecil    ->    String
// toString()               Mengembalikan nilai dari objek String    ->    String
// toUpperCase()            Mengubah string menjadi huruf kapital    ->    String
// trim()                   Menghapus spasi dari kedua ujung string    ->    String
// valueOf()                Mengembalikan representasi string dari nilai yang ditentukan    ->    String

public class Main {
    public static void main(String[] args) {
        String nama = "aang solihin";

        System.out.println("Nama = " + nama.toUpperCase());
        System.out.println("Panjang Nama = " + (nama.length() - 1));
    }
}