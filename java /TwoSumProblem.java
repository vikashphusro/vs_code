
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumProblem {

    /**
     * Here solve problem using brute force.
     * @param arr
     * @param target
     * @return
     */
    private boolean  statusTwoSumProblem(int [] arr, int target){
            for(int i=0; i < arr.length; i++){
            for(int j = i+1;j < arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println("i : " + i + " " + "j : "+j);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Here solve problem using two pointer concept
     * @param arr
     * @param target
     * @return
     */
    private boolean statusTwoSumProblem1(int [] arr, int target){
        Arrays.sort(arr);
        int i = 0; 
        int j = arr.length - 1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum < target){
                i ++;
            } else if (sum > target){
                j --;
            } else {
                System.out.println("i : " + arr[i] + " j : " + arr[j]);
                return true;
            }
        }
        return false;
    }

    /**
     * Here solve problem using Hash set
     * @param arr
     * @param target
     * @return
     */
    private boolean statusTwoSumProblem2(int [] arr, int target){
        // Add number to set
        Set<Integer> numbers = new HashSet<>();

        for(int i=0; i < arr.length; i++){
            // number which required for to equale target
            int requiredNumber = target - arr[i];
            if(numbers.contains(requiredNumber)){
                System.out.println("Number 1 : " + arr[i] + " " + " Number 2 : " + requiredNumber);
                return true;
            }

            // Add number to set.
            numbers.add(arr[i]);
        }
        return false;
    }

    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        int requiereNumber = Integer.SIZE;
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            requiereNumber = target- nums[i];
            if(map.containsValue(requiereNumber)){
                arr[1] = i;
                break;
            }
            map.put(i, nums[i]);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == requiereNumber){
                arr[0] = entry.getKey();
                break;
            }
        }
    
        return arr;
    }

    public static void main(String[] args) {
        int [] num = {0, -1, 2, -3, 1};
        int target = -2;

        // Brute force solution
        TwoSumProblem sumProblem = new TwoSumProblem();
        boolean status = sumProblem.statusTwoSumProblem(num, target);
        System.out.println("Two way sum status : " + status);

        // Two pointer solution
        boolean status1 = sumProblem.statusTwoSumProblem1(num, target);
        System.out.println("Two way sum status1 : " + status1);

        // Hashset solution
        boolean status2 = sumProblem.statusTwoSumProblem2(num, target);
        System.out.println("Two way sum status1 : " + status2);

        // return indices in array format 
        int arr [] = {3,2,4};

        int arr2[] = sumProblem.twoSum(arr, 6);
        for(int i : arr2){
            System.out.println("indices : " + i);
        }


    }
    
}
