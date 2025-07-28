
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++){ 
            if(numSet.contains(nums[i])){
                return true;
            }
            numSet.add(nums[i]);
        }
        
        return false;
    }

    public boolean isAnagram(String s, String t) {    
            if((s != null && t == null)){
                return false;
            }

            if((s.length() != t.length())){
                return false;
            }

            char []s1 = s.toCharArray();
            char []t1 = t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
            for (int i = 0; s1[i] == t1[1]; i++) {
                if(i == s1.length-1){
                    return true;
                }
            }
            
            return false;
    }

    public int[] twoSum(int[] nums, int target) {
        int[]arr = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int req = target - nums[i];
            if(mp.containsKey(req)){
                arr[0] = mp.get(req);
                arr[1] = i;
            }
            mp.put(nums[i], i);
        }
        return arr;
    }

    public int[] twoSum1(int[] numbers, int target) {
          int[]arr = new int[2];
          int p = 0;
          int q = numbers.length -1;
          while(p < q){
          int sum = numbers[p] + numbers[q];

            if(target > sum) {
                p ++;
            } else if(target < sum){
                q--;
            } else {
                arr[0] = p;
                arr[1] = q;
                return arr;
            }
          }
          return arr;

    }

    public void moveZeros(int [] nums){

        int p = 0;
        for(int q = 0; q < nums.length  && nums.length != 1; q++){
            if(nums[q] != 0){
                int temp = nums[q];
                nums[q] =nums[p];
                nums[p] = temp;
                p++;
            }
        }
       
        for(int n : nums){
            System.out.println(n);
        }
    }

    public int majorityElement(int[] nums) {
       int candidate =0, count = 0, n = nums.length;
        for(int i = 0; i < n; i++) {
            if(count == 0) candidate = nums[i];
            if(nums[i] == candidate) count++;
            else count--;
        }
        return candidate;
    }

    public void reverseString(char[] s) {
        int p = 0; 
        int q  = s.length-1;
        
        while(p < q ){
            char temp = s[p];
            s[p] = s[q];
            s[q] = temp;
            p ++;
            q --;
        }

        for(char ss : s) {
            System.out.println(".()" + ss);
        }
       
        
    }

  
    public static void main(String[] args) {

        char [] nums = {'v', 'k', 's', 'h'};
        Solution ss = new Solution();
        ss.reverseString(nums);


       
    }
}
