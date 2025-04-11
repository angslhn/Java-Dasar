// Arrays Multidimensi

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Arrays multidimensi terstruktur dan tetap
        int[][] numbers = {
            {75, 54, 76},
            {24, 86, 93},
            {33, 21, 12}
        };

        for (int index_numbers = 0; index_numbers < numbers.length; index_numbers++) {
            for (int index_number = 0; index_number < numbers[index_numbers].length; index_number++) {
                System.out.print(numbers[index_numbers][index_number] + " ");
            }
            System.out.println();

            if (index_numbers == (numbers.length - 1)) System.out.println();
        }

        // Arrays multidimensi lebih fleksibel
        ArrayList<List<Object>> users = new ArrayList<>();

        users.add(Arrays.asList(1, "Mamat Hidayat", "mamat.hidayat@yahoo.com", "XiaubGTSBAjksuXlKJ"));
        users.add(Arrays.asList(2, "Ujang Supardi", "ujangsupardi004@gmail.com", "JUYausytwbSGWkPPKL"));

        for (int index_users = 0; index_users < users.size(); index_users++) {
            System.out.println("ID           =" + " " + users.get(index_users).get(0));
            System.out.println("Nama Lengkap =" + " " + users.get(index_users).get(1));
            System.out.println("Email        =" + " " + users.get(index_users).get(2));
            System.out.println("Password     =" + " " + users.get(index_users).get(3));

            if (index_users != (users.size() - 1)) System.out.println("");
        }
    }
}