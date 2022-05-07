package Arrays;

public class Hw3 {
    public static void main(String[] args) {
        int[][] matris = {{2, 3, 4}, {5, 6, 4}};

        printMatris(matris);

        int length1 = matris.length;
        int length2 = matris[0].length;

        int[][] transpoze = new int[length2][length1];
        for (int i = 0; i < transpoze.length; i++){
            for (int j = 0; j < transpoze[i].length; j++){
                transpoze[i][j] = matris[j][i];
            }
        }
        printMatris(transpoze);

    }

    static void printMatris(int[][] matris) {
        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
}
