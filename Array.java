public class Array
{
    // Returns a square matrix in row-major order
    public int[][] getRowMajorSquare(int x)
    {
        int[][] matrix = new int[x][x];
        int num = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix[i][j] = num++;
            }
        }
        return matrix;
    }

    // Returns a square matrix in column-major order
    public int[][] getColumnMajorSquare(int x)
    {
        int[][] matrix = new int[x][x];
        int num = 1;
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x; i++) {
                matrix[i][j] = num++;
            }
        }
        return matrix;
    }

    // Returns a rectangular matrix in row-major order
    public int[][] getRowMajorRectangle(int row, int column)
    {
        int[][] matrix = new int[row][column];
        int num = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = num++;
            }
        }
        return matrix;
    }

    // Returns a rectangular matrix in column-major order
    public int[][] getColumnMajorRectangle(int column, int row)
    {
        int[][] matrix = new int[row][column];
        int num = 1;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                matrix[i][j] = num++;
            }
        }
        return matrix;
    }

    // Prints a matrix with double spacing between numbers
    public void printDouble(int[][] a)
    {
        for (int[] row : a) {
            for (int num : row) {
                System.out.printf("%-2d ", num); // Ensures two-space width formatting
            }
            System.out.println();
        }
    }
}
