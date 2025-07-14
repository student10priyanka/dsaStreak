import java.util.Scanner;

public class GCDbruteForce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int min=Math.min(num1,num2);
        for(int i=min;i>=1;i--){
            if((num1%i==0)&&(num2%i==0)){
                System.out.println("Recurse ele is:"+i);
                return ;
            }
        }
    }
}
