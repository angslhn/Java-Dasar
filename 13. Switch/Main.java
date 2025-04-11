// Switch

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime waktu = LocalTime.now();
        int jam_sekarang = waktu.getHour();

        String kode_hari;
        
        if ((jam_sekarang >= 0 && jam_sekarang <= 4) || (jam_sekarang > 18 && jam_sekarang <= 24)) {
            kode_hari = "01";
        } else if (jam_sekarang > 4 && jam_sekarang <= 10) {
            kode_hari = "02";
        } else if (jam_sekarang > 10 && jam_sekarang <= 15) {
            kode_hari = "03";
        } else if (jam_sekarang > 15 && jam_sekarang <= 18) {
            kode_hari = "04";
        } else {
            kode_hari = null;
        }

        // Switch
        switch (kode_hari) {
            case "01":
                System.out.println("Hallo, selamat malam.");
                break;
            case "02":
                System.out.println("Hallo, selamat pagi.");
                break;
            case "03":
                System.out.println("Hallo, selamat siang.");
                break;
            case "04":
                System.out.println("Hallo, selamat sore.");
                break;
            default:
                System.out.println("Hallo, selamat datang.");
                break;
        }

        // Switch Lambda
        switch (kode_hari) {
            case "01" -> System.out.println("Hallo, selamat malam.");
            case "02" -> System.out.println("Hallo, selamat pagi.");
            case "03" -> System.out.println("Hallo, selamat siang.");
            case "04" -> System.out.println("Hallo, selamat sore.");
            default -> System.out.println("Hallo, selamat datang.");
        }

        // Switch Expression
        String text_ucapan = switch (kode_hari) {
            case "01": 
                yield "Hallo, selamat malam.";
            case "02": 
                yield "Hallo, selamat pagi.";
            case "03": 
                yield "Hallo, selamat siang.";
            case "04": 
                yield "Hallo, selamat sore.";
            default: 
                yield "Hallo, selamat datang.";
        };

        System.out.println(text_ucapan);
    }
}
