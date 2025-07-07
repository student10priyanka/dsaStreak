import java.util.Scanner;

public class printSpiralorder2dMtraix {
    static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
       int total=0;
        while(total<r*c){
            for(int j=leftCol;j<=rightCol && total<r*c;j++){
                System.out.print(matrix[topRow][j]+" ");
            }
            topRow++;
            total++;
            for(int i=topRow;i<=bottomRow && total<r*c;i++){
                System.out.print(matrix[i][rightCol]+" ");
            }
            rightCol--;
            total++;
            for(int j=rightCol;j>=leftCol && total<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
            }
            bottomRow--;
            total++;
            for(int i=bottomRow;i>=topRow && total<r*c;i--){
                System.out.print(matrix[i][leftCol]+" ");
            }
            leftCol++;
            total++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and col:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        int total=r*c;
        System.out.println("Enter "+total+" values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Mtrix");
        printMatrix(matrix);
        System.out.println("Spiral order");
        printSpiralOrder(matrix,r,c);
    }
}
