import java.util.Scanner;

public class swapWithOutTemp {
    public static void swapp(int a,int b){
       a=a+b;
       b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swapp(a,b);
    }
}
