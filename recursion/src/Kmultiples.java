import java.util.Scanner;

public class Kmultiples {
    static void printMul(int num,int k) {
        if (k == 1) {
            System.out.println(num);
            return;
        }
            printMul(num, k - 1);
            System.out.println(num * k);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        printMul(num,k);
    }
}
