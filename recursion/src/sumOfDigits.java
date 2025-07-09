public class sumOfDigits {
    static int sod(int n){
        if(n>=0&&n<=9){
            return n;
        }
        int smallAns= sod(n/10);
         return smallAns+(n%10);
    }

    public static void main(String[] args) {
        System.out.println(sod(123));
    }
}
