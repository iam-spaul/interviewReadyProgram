//find missing number in array
public class MissingNoInArray {
    public static void main(String[] args) {
        int []arr={1,2,3,5};

        int ans=MissingNo(arr);
        System.out.println(ans);

    }
    public  static int MissingNo(int []arr){
        int n=arr[arr.length-1];
        int xor1=0;
        int xor2=0;
        for (int i = 1; i <=n; i++) {
            xor1=xor1^i;
        }

        for (int i = 0; i < arr.length; i++) {
            xor2^=arr[i];
        }

        return xor1^xor2;
    }
}
