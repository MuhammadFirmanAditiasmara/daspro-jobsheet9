
import java.util.Scanner;

public class SearchNilai18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int arrNilai[] = {80, 85, 78, 96, 90, 82, 86};
        // int key = 90;

        // for (int i = 0; i < arrNilai.length; i++) {
        // if (key == arrNilai[i]) {
        // hasil = i;
        // break;
        // }
        // }
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlah = input.nextInt();

        int nilai[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = input.nextInt();

        int hasil = 0;
        for (int i = 0; i < jumlah; i++) {

            if (key == nilai[i]) {
                hasil = i + 1;
                break;

            }
        }
        if (hasil != 0) {
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil));
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        input.close();
    }
}
