
import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiMhs[] = new int[10];
        double total = 0;
        double rata2;
        int j=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();

            if (nilaiMhs[i] > 70) {
                j++;
            }
        }
        System.out.println("Total mahasiswa lulus : " + j);
        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     total += nilaiMhs[i];
        // }

        // rata2 = total / nilaiMhs.length;
        // System.out.println("rata-rata nilai = " + rata2);

    }
}