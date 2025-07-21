public class rortateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=2;
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<d;i++){
            temp[i]=arr[n-d+i];
        }
        for(int i=0;i<n-d;i++){
            temp[i+d]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }}

}
