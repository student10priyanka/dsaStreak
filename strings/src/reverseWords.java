import java.util.Scanner;

public class reverseWords {
    static String reverse(String s){
        int n=s.length();
        String[] words=s.split(" ");
        String rev="";
        for(int i=words.length-1;i>=0;i--){
            rev+=words[i];
            if(i!=0) rev+=" ";
        }
       return rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=reverse(s);
        for(int i=0;i<ans.length();i++){
            System.out.print(ans.charAt(i));
        }
    }
}
