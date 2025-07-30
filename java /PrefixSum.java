
import java.util.ArrayList;
import java.util.List;

/**
 * Prefix code sume example 
 */

public class PrefixSum {
 
    public static List<Integer> getSumOfPrefic(int [] arr){
        List<Integer> integers = new ArrayList<>();
        integers.add(arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            integers.add(integers.get(i-1) + arr[i]);
        }
        return integers; 
    }

     public static int[] getSumOfPrefic1(int [] arr){
        int [] nums = new int[arr.length];
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
            nums[i] = sum;
        }
        return nums; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        List<Integer> prefixSum = getSumOfPrefic(arr);
        for (int i : prefixSum) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        int [] kk = getSumOfPrefic1(arr);
        for (int i : kk) {
            System.out.print(i + " ");
        }
    }
}
