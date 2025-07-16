import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll("\\s+","").toLowerCase();
        String rev=new StringBuilder(str).reverse().toString();
        if(rev.equals(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
