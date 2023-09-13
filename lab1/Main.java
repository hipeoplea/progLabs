import java.util.Random;
import java.lang.Math;

import static java.lang.Math.pow;

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
                nums[i][j] = switch ((int)c[i]) {
                    case 18 -> Math.pow((Math.atan(pow((x[j] + 5.5) / 15, 2))), Math.PI * (0.5 - Math.asin(1 / pow(Math.E, Math.abs(x[j])))));
                    case 2, 4, 12, 14, 16 -> Math.cbrt(pow(Math.PI * (x[j] + 0.25), 2)) - 1;
                    default -> Math.pow(Math.E, Math.asin(Math.cos(x[j])));
                };
                System.out.printf("%10.4f ", nums[i][j]);
            }
            System.out.println();
        }
    }
}