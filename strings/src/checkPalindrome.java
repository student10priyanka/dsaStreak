public class checkPalindrome {
    public static void main(String[] args) {
        String str="raceca";
        boolean isPalindrome=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println("Not aplindrome");
        }
    }
}
