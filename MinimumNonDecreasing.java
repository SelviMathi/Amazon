
import java.util.Arrays;
import java.util.Scanner;

public class MinimumNonDecreasing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();

        int res=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int diff=arr[i]-arr[i+1];
                res+=diff;
                Add(arr,i+1,diff);
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(res);
    }
    static void Add(int[] arr,int start,int val){
        for(int i=start;i<arr.length;i++){
            arr[i]+=val;
    }
    }
}

