import java.util.Arrays;

public class KadansAlgo {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum =nums[0]; 
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public int maxProfit(int[] nums) {
        Arrays.sort(nums);
        int maxdiff = Integer.MIN_VALUE;
        int i = 0; int j = nums.length-1; 

        while (i <= j) {
          maxdiff = Math.max(maxdiff, Math.abs(nums[i]-nums[j]));
            
        }
        return maxdiff;
    }

    public static void main(String[] args) {
        int [] nums = {-2,3,-2, -4};
        KadansAlgo algo = new KadansAlgo();
        int maxSum = algo.maxProduct(nums);
        System.out.println("Max sum : " + maxSum); 
    }

}
