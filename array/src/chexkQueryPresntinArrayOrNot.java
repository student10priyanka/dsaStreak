import java.util.Scanner;
public class chexkQueryPresntinArrayOrNot {
    static int[] frequencyArr(int[] arr) {
        int[] freq = new int[10005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of ele:");
        int n = sc.nextInt();
        System.out.println("The ele are:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = frequencyArr(arr);
        System.out.println("enter number of freq: ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("enter the number to check");
            int num = sc.nextInt();
            if (freq[num] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
    }

}
