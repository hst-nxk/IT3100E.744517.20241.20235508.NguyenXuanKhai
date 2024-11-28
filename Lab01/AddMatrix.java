import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args){
        int row,col;
        System.out.println("Input the number of rows: ");
        Scanner a = new Scanner(System.in);
        row = a.nextInt();
        System.out.println("Input the number of columns: ");
        Scanner b = new Scanner(System.in);
        col = b.nextInt();
        int [] [] matrix1 = new int[row][col];
        int [] [] matrix2 = new int[row][col];
        // int [] [] matrix3 = new int[row][col];
        Scanner x1 = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);
        // Scanner x3 = new Scanner(System.in);
        // Scanner x4 = new Scanner(System.in);
        System.out.println("Input the first matrix:");
        for(int i = 0; i<row; i++){
            // System.out.println("Input the row " + (i+1) + " of the matrix 1 : ");
            for(int j = 0;j<col;j++){
                System.out.print("Value at row " + (i+1) + " and " + "col " + (j+1) + " is: ");
                matrix1[i][j] = x1.nextInt();
            }
        }
        System.out.println();
        System.out.println("Input the second matrix:");
        for(int i = 0; i<row; i++){
            for(int j = 0;j<col;j++){
                System.out.print("Value at row " + (i+1) + " and " + "col " + (j+1) + " is: ");
                matrix2[i][j] = x2.nextInt();
            }
        }
        System.out.println();
        System.out.println("Two matrices is: ");
        for(int i = 0; i<row; i++){
            for(int j = 0;j<col;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        
        }
       
        System.out.println();
        for(int i = 0; i<row; i++){
            for(int j = 0;j<col;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        
        }
        System.out.println();
        System.out.println("The matrix after add: ");
        for(int i = 0; i<row; i++){
            for(int j = 0;j<col;j++){
                System.out.print((matrix2[i][j] + matrix1[i][j]) + " ");
            }
            System.out.println();
        
        }
    }
}
