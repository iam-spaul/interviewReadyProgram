import java.util.Arrays;

public class SecondSmall {
    public static void main(String[] args) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The smallest element in array is: " + findSecondSmall2(arr1));
    }
    public static int findSecondSmall(int []arr){
//        int  secondSmall=Integer.MAX_VALUE;

        Arrays.sort(arr);

        int ans=arr[1];

        return ans;
    }

    public static int findSecondSmall2(int []arr){
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            small=Math.min(small,arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }


        return second_small;
    }

}