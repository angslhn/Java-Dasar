import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args) {
        int numberAcak = ThreadLocalRandom.current().nextInt(1, (4 + 1));

        String selamat = switch (numberAcak) {
            case 1:
                yield "Selamat Pagi!";
            case 2:
                yield "Selamat Siang!";
            case 3:
                yield "Selamat Sore!";
            case 4:
                yield "Selamat Malam!";
            default:
                yield "Selamat!";
        };

        System.out.println(selamat);
        System.out.println(numberAcak);
    }
}
