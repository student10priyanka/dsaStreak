public class sort0s1s2s {
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void sort(int[] arr){
        int n =arr.length;
       int count_a=0;
       int count_b=0;
       int count_c=0;
       for(int i=0;i<n;i++){
           if(arr[i]==0) count_a++;
           if(arr[i]==1) count_b++;
           if(arr[i]==2) count_c++;

       }int i=0;
       while(count_a-->0) arr[i++]=0;
        while(count_b-->0) arr[i++]=1;
while(count_c-->0) arr[i++]=2;
    }
    public static void main(String[] args) {

        int[] arr={0,1,2,2,1};
        sort(arr);

        printArr(arr);

    }
}
