import java.util.Scanner;

public class PpowerQ {
    static int pow(int p,int q){
        if(q==0){
             return 1;
        }
        return pow(p,q-1)*p;
    }

    static int poww(int p,int q){
        if(q==0) return 1;
        int smallPow=poww(p,q/2);
        if(q%2==0){
            return smallPow*smallPow;
        }
        else{
            return smallPow*smallPow*p;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int p =sc.nextInt();
int q=sc.nextInt();
        System.out.println(poww(p,q));
    }
}
