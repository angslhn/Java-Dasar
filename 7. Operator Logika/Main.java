// Operator Logika

// &&	  AND    Jika kedua kondisi "True" dan "True" maka hasilnya "True", jika salah satu kondisinya "False" maka akan "False"
// OR     OR     Salah satu kondisi harus "True" maka hasilnya "True", jika kedua kondisinya "False" dan "False" maka akan "False"
// !	  NOT    Membalikan kondisi, jika kondisi "False" maka hasilnya "True", sebaliknya jika kondisi "True" maka akan "False"

public class Main {
    public static void main(String[] args) {
        boolean kondisi_pertama = true;
        boolean kondisi_kedua = true;

        System.out.println(kondisi_pertama && kondisi_kedua);
        System.out.println(kondisi_pertama || kondisi_kedua);
        System.out.println(!kondisi_pertama);
    }
}
