import java.util.Arrays;

public class MergeTwoArr {

    public static void main(String[] args) {
        int []arr1={1,3,5};
        int []arr2={2,4,6};
        int []ans=mergedArr(arr1,arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }


    public  static int[] mergedArr(int[]arr1,int []arr2){

        int [] ans=new int[arr1.length+arr2.length];
        int size1= arr1.length;
        int size2= arr2.length;

        for (int i = 0; i < arr1.length; i++) {
            ans[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            ans[i+size1]=arr2[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
