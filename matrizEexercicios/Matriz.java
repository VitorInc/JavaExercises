package matrizEexercicios;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o 1 número:");
        int n = input.nextInt();
        System.out.println("Digite o 2 número:");
        int m = input.nextInt();
        int[][] biDimensional = new int[n][m];
        for (int i = 0; i < biDimensional.length; i++) {
            for (int j = 0; j < biDimensional[i].length; j++) {
                biDimensional[i][j] = input.nextInt();

            }
        }
        System.out.println("Main diagonal:");
        for (int i = 0; i < biDimensional.length; i++) {
            System.out.print(biDimensional[i][i] + " ");
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < biDimensional.length; i++) {
            for (int j = 0; j < biDimensional[i].length; j++) {
                if (biDimensional[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);


        System.out.println("Qual será sua referência ?");
        int referenica = input.nextInt();

        for (int i = 0; i < biDimensional.length; i++) {
            for (int j = 0; j < biDimensional[i].length; j++) {
                if (biDimensional[i][j] == referenica) {
                    System.out.println("Position" + i + " " + j);
                    if (j >= 0) {
                        System.out.println("Left:" + biDimensional[i][j - 1]);
                    }
                    if (j > 0) {
                        System.out.println("Up" + biDimensional[i - 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Righ" + biDimensional[i][j + 1]);
                    }
                    if (j > 0) {
                        System.out.println("Down" + biDimensional[i + 1][j]);
                    }

                }
            }

        }

        input.close();

    }
}

