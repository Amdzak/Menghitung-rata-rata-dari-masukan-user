//2023/04/26

// Buatlah program Java untuk menghitung rata-rata dari n bilangan bulat yang dimasukkan oleh pengguna.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("\t.::Program menghitung rata-rata dari inputan user::.\n");
        System.out.print("Masukan banyak nilai yang ada : ");
        int masukan = inputUser.nextInt();
        
        int[] data = new int[masukan];
        int total = 0;
        for (int i = 0; i < masukan; i++) {
            System.out.print("nilai ke " + (i + 1) + " : ");
            data[i] = inputUser.nextInt();
            total += data[i];
        }

        double rata2 = (double)total / masukan;
        System.out.println("Hasil rata - rata : " + rata2);
    }    
}
