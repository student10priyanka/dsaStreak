import java.util.Scanner;
import java.util.SplittableRandom;

public class serieSum {
    static int SeriesSum(int n){
        if(n==0){
            return 0;
        }
        return SeriesSum(n-1)+n;
    }
    static int seriesSum(int n){
        if(n==0) return 0;
        if(n%2==0) {
            return seriesSum(n-1)-n;
        }else{
            return seriesSum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p =sc.nextInt();

        System.out.println(SeriesSum(p));
        System.out.println(seriesSum(p));
    }
}
