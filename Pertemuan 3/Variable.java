public class Variable {
    public static void main(String[] args) {
//  Ini adalah cara membuat variable dengan cara inisialisasi terlebih dahulu.
        String name;
        String age;
        String address;

        name = "Aang Solihin";
        age = "19";
        address = "Sumedang - Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

//  Ini adalah cara membuat variable dengan kata "var" tapi tidak boleh dengan cara inisialisasi terlebih dahulu.
        var x = 10;
        var y = 15;
        var result = x + y;

        System.out.println(result);

//  Ini adalah cara membuat variable konstan yang tidak dapat di ubah lagi setelah di buat.
        final String goal = "Aku ingin menjadi monster atau sangat hebat di bilang programming.";
        System.out.println(goal);
    }
}
