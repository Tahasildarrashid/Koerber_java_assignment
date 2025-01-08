public class q4 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] pascal = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
