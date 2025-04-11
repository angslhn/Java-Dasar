// For-Each Loop

public class Main {
    public static void main(String[] args) {
        String[] users = {"Aang Solihin", "Mamat Hidayat", "Deden Ferdiansyah", "Ujang Sutadi"};

        int no = 1;
        for (String user : users) {
            System.out.printf("No. %d %s %n", no, user);
            no++;
        }
    }
}
