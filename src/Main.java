import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        long[] c = new long[22 / 2];
        int b = 0;
        for (int i = 22; i > 1; i = i - 2) {
            c[b] = i;
            b++;
        }

        double[] x = new double[14];
        for (int i = 0; i < 14; i++) {
            x[i] = (double) (Math.random() * (15)) - 2;
        }

        double[][] nums = new double[11][14];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(c[i] == 18){
                    nums[i][j] = Math.pow((Math.atan(Math.pow((x[j]+ 5.5) / 15, 2))), Math.PI * (0.5 - Math.asin(1/ Math.pow(Math.E, Math.abs(x[j])))));
                } else if (c[i] == 2 || c[i] == 4 || c[i] == 12 || c[i] == 14 || c[i] == 16) {
                    nums[i][j] = Math.cbrt(Math.pow(Math.PI * (x[j] + 0.25) ,2)) -1;
                }
                else {
                    nums[i][j] = Math.pow(Math.E, Math.asin(Math.cos(x[j])));
                }
                System.out.printf("%.4f ", nums[i][j]);
            }
            System.out.println();
        }
    }
}