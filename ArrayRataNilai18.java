
import java.util.Scanner;

public class ArrayRataNilai18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        double rata2;
        int j = 0, l = 0;
        int k;
        double nilaiTdkLulus = 0, nilaiLulus = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        k = input.nextInt();

        int nilaiMhs[] = new int[k];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();

            if (nilaiMhs[i] > 70) {
                nilaiLulus += nilaiMhs[i];
                j++;

            }
            if (nilaiMhs[i] < 70) {
                nilaiTdkLulus += nilaiMhs[i];
                l++;

            }

        }

        nilaiLulus = nilaiLulus / j;
        nilaiTdkLulus = nilaiTdkLulus / l;

        System.out.println("Rata-rata nilai mahasiswa lulus : " + nilaiLulus);
        System.out.println("Rata-rata nilai mahasiswa tidak lulus : " + nilaiTdkLulus);

        // System.out.println("Total mahasiswa lulus : " + j);
        // for (int i = 0; i < nilaiMhs.length; i++) {
        // total += nilaiMhs[i];
        // }
        // rata2 = total / nilaiMhs.length;
        // System.out.println("rata-rata nilai = " + rata2);
    }
}
