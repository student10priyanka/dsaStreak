import java.util.Scanner;

public class transposeOfMtrix {
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix,int r,int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

return ans;
    }
static void transposeInPlace(int[][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and col:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalEle=r*c;
        System.out.println("Enter "+totalEle+"values");
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printMatrix(matrix);
        System.out.println("Transpose of matrix");
        int[][] ans=findTranspose(matrix,r,c);
        printMatrix(ans);

        System.out.println("transpose in place");
        transposeInPlace(matrix,r,c);
printMatrix(matrix);

      }
}
