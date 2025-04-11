// Math

// abs(x)               Mengembalikan nilai absolut atau positif x   ->   double|float|int|long
// acos(x)              Mengembalikan arccosine dari x, dalam radian   ->   double
// addExact(x, y)       Mengembalikan jumlah x dan y   ->   int|long
// asin(x)              Mengembalikan arcsine dari x, dalam radian   ->   double
// atan(x)              Mengembalikan arctangent dari x sebagai nilai numerik antara -PI/2 dan PI/2 radian   ->   double
// atan2(y,x)           Mengembalikan sudut theta dari konversi koordinat persegi panjang (x, y) ke koordinat kutub (r, theta).   ->   double
// cbrt(x)              Mengembalikan akar pangkat tiga dari x   ->   double
// ceil(x)              Mengembalikan nilai x yang dibulatkan ke atas ke bilangan bulat terdekatnya   ->   double
// copySign(x, y)       Mengembalikan floating point pertama x dengan tanda floating point kedua y   ->   double|float
// cos(x)               Mengembalikan kosinus x (x dalam radian)   ->   double
// cosh(x)              Mengembalikan kosinus hiperbolik dari nilai double   ->   double
// decrementExact(x)    Mengembalikan x-1   ->   int|long
// exp(x)               Mengembalikan nilai Ex    ->   double
// expm1(x)             Mengembalikan ex -1   ->   double
// floor(x)             Mengembalikan nilai x yang dibulatkan ke bawah ke bilangan bulat terdekatnya   ->   double
// floorDiv(x, y)       Mengembalikan pembagian antara x dan y yang dibulatkan ke bawah   ->   int|long
// floorMod(x, y)       Mengembalikan sisa pembagian antara x dan y yang hasil pembagiannya dibulatkan ke bawah   ->   int|long
// getExponent(x)       Mengembalikan eksponen tak bias yang digunakan dalam x   ->   int
// hypot(x, y)          Mengembalikan sqrt(x2 +y2) tanpa luapan atau luapan antara double
// IEEEremainder(x, y)  Menghitung operasi sisa pada x dan y sebagaimana ditentukan oleh standar IEEE 754   ->   double
// incrementExact(x)    Mengembalikan x+1   ->   int|double
// log(x)               Mengembalikan logaritma natural (basis E) dari x   ->   double
// log10(x)             Mengembalikan logaritma basis 10 dari x   ->   double
// log1p(x)             Mengembalikan logaritma natural (basis E) dari jumlah x dan 1   ->   double
// max(x, y)            Mengembalikan angka dengan nilai tertinggi   ->   double|float|int|long
// min(x, y)            Mengembalikan angka dengan nilai terendah   ->   double|float|int|long
// multiplyExact(x, y)  Mengembalikan hasil perkalian x dengan y   ->   int|long
// negateExact(x)       Mengembalikan negasi dari x   ->   int|long
// nextAfter(x, y)      Mengembalikan angka floating point yang berdekatan dengan x dalam arah y   ->   double|float
// nextDown(x)          Mengembalikan nilai floating point yang berdekatan dengan x dalam arah negatif   ->   double|float
// nextUp(x)            Mengembalikan nilai floating point yang berdekatan dengan x dalam arah positif tak terhingga   ->   double|float
// pow(x, y)            Mengembalikan nilai x ke pangkat y   ->   double
// random()             Mengembalikan angka acak antara 0 dan 1   ->   double
// rint(x)              Mengembalikan nilai double yang paling dekat dengan x dan sama dengan bilangan bulat matematika   ->   double
// round(x)             Mengembalikan nilai x yang dibulatkan ke bilangan bulat terdekatnya   ->   long|int
// scalb(x, y)          Mengembalikan x dikalikan 2 ke pangkat y   ->   double|float
// signum(x)            Mengembalikan tanda x   ->   double|float
// sin(x)               Mengembalikan sinus x (x ada di radian)   ->   double
// sinh(x)              Mengembalikan sinus hiperbolik dari nilai double   ->   double
// sqrt(x)              Mengembalikan akar kuadrat dari x   ->   double
// subtractExact(x, y)  Mengembalikan hasil dari x dikurangi y   ->   int|long
// tan(x)               Mengembalikan tangen dari suatu sudut double
// tanh(x)              Mengembalikan tangen hiperbolik dari suatu nilai double   ->   double
// toDegrees(x)         Mengonversi sudut yang diukur dalam radian ke sudut ekuivalen perkiraan yang diukur dalam derajat   ->   double
// toIntExact(x)        Mengonversi nilai long ke int   ->   int
// toRadians(x)         Mengonversi sudut yang diukur dalam derajat ke sudut perkiraan yang diukur dalam radian   ->   double
// ulp(x)               Mengembalikan ukuran unit dengan presisi paling rendah (ulp) dari x   ->   double|float

public class Main {
    public static void main(String[] args) {
        int angka_random = (int) (Math.random() * 20) + (20 + 1);
        long transaksi = -34500000L;

        System.out.println(angka_random);
        System.out.println("Jumlah transaksi = " + Math.abs(transaksi));
    }
}
