import java.util.Scanner;

public class gcdLongDiv {
    public static void gcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        System.out.println(y);
    }
    public static int gcdd(int x,int y){
    if(y==0){
        return x;
    }
    return gcdd(y,x%y);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int min=Math.min(num1,num2);

        gcd(num1,num2);

        int ans=gcdd(num1,num2);
        System.out.println("ans:"+ans);
    }
}
