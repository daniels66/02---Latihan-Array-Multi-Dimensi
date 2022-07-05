package latihan;

public class Main {
    public static void main(String[] args) {

        int[][] matrix_1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        int[][] matrix_2 = {
                { 10, 11, 12 },
                { 13, 14, 15 },
                { 16, 17, 18 },
        };

        int[][] matrix_3 = {
                { 5 },
                { 3 },
                { 1 },
        };

        printMatrix(matrix_1);
        printMatrix(matrix_2);

        tambahMatrix(matrix_1, matrix_2);
        tambahMatrix(matrix_2, matrix_1);
        kaliMatrix(matrix_1, matrix_2);
        kaliMatrix(matrix_1, matrix_3);

    }

    private static void kaliMatrix(int[][] matrix1, int[][] matrix2) {
        int baris = matrix1.length; // banyaknya baris
        int kolom = matrix2[0].length; // banyaknya kolom
        int c[][] = new int[baris][kolom];

        try {
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    for (int k = 0; k < baris; k++) {
                        c[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    if (j == 0) {
                        System.out.print("[");
                    }
                    System.out.print(c[i][j]);
                    if (j < (kolom - 1)) {
                        System.out.print(",");
                    } else {
                        System.out.print("]");
                    }

                }
                System.out.println("");
            }
            System.out.print("\n");

        } catch (Exception e) {
            System.out.println("Matrix tidak dapat dikalikan");
            System.err.println(e.getMessage());
        }
    }

    private static void tambahMatrix(int[][] matrix1, int[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;

        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            // System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                if (j == 0) {
                    System.out.print("[");
                }
                System.out.print(hasil[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static void printMatrix(int[][] matrix) {
        int baris = matrix.length;
        int kolom = matrix[0].length;
        for (int i = 0; i < baris; i++) {
            // System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                if (j == 0) {
                    System.out.print("[");
                }
                System.out.print(matrix[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}