public class KonversiTipeDataNumber {
    public static void main(String[] srgs) {
//  Konversi widening
        byte iniByteWide = 30;
        int iniIntWide = iniByteWide;

//  Konversi narrowing
        byte iniByteNarrow = (byte) iniIntWide;

        System.out.println(iniIntWide);
        System.out.println(iniByteNarrow);
    }
}
