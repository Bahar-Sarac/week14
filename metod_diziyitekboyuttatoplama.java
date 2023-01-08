
import java.util.Scanner;
import java.util.Random;

public class metod_diziyitekboyuttatoplama {

    public static void tekboyut(int lb, int ub, int rs) {
        Scanner input = new Scanner(System.in);

        Random R = new Random();
        int[][] a = new int[ub][ub];
        int[][] b = new int[ub][ub];
        int[] t = new int[(int) Math.pow(ub, 2)];

        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                a[i][j] = R.nextInt(rs);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                b[i][j] = R.nextInt(rs);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                t[i] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                System.out.print("birinci dizinin ");
                System.out.println((i + 1) + ".satır / " + (j + 1) + ".sütunu: ");
                System.out.println(a[i][j]);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                System.out.print("ikinci dizinin");
                System.out.println(" " + (i + 1) + ".satır / " + (j + 1) + ".sütunu: ");
                System.out.println(b[i][j]);
            }
        }
        for (int i = 0; i < ub; i++) {
            for (int j = 0; j < ub; j++) {
                System.out.print("üçüncü dizinin");
                System.out.println(" " + (i + 1) + ".satır / " + (j + 1) + ".sütunu ");
                System.out.println(t[i]);
            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("NxN için bir N değeri giriniz:");
        int ub = input.nextInt();
        System.out.println("Hangi değere kadar random alınsın: ");
        int rs = input.nextInt();
        tekboyut(0, ub, rs);
    }

}
