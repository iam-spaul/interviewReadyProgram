import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArr {
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Reverse array using library function
    static void reverseArray(int arr[]) {
        //fetching array as list object
        //reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
    }

    //reverse2
    public  static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public  static int [] reverseArr2(int []arr){
        int left=0;
        int right= arr.length-1;

        while (left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        return arr;
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {5,4,3,2,1};
//        reverseArray(arr);
//        printArray(arr, n);
        int []ans=reverseArr2(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
