
import java.util.Arrays;

public class FourSumProblem {


    /**
     * Bruthforce for to check. time complexity is O(n^4) & space cmplexity O(1)
     * @param arr
     * @param target
     * @return
     */
    private boolean isFourSum(int [] arr, int target){
        for (int i = 0; i <arr.length; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                for(int p = j + 1; p < arr.length; p++){
                    for (int q = p + 1 ; q < arr.length; q++)  {
                        int sum = arr[i] + arr[j] + arr[q] + arr[p];
                        if(sum == target){
                            System.out.println("i : " + arr[i] + " j:  " + arr[j]
                            +" p : " + arr[p] + " q :  " + arr[q]);
                            return true;
                        }
                    }
                }
            }
        }
        
        return false;
    }

    /**
     * Two pointer concept 
     * @param arr
     * @param target
     * @return
     */
    private boolean isFourSum1(int [] arr, int target){
        // Short array
        Arrays.sort(arr);
        int i = 0;
        int j = i +1;
        int p = j +1;
        int q = arr.length - 1;

        


        return false;
    }
    public static void main(String[] args) {

    FourSumProblem fourSumProblem = new FourSumProblem();
    int [] arr1 = {10, 20, 30, 40, 1, 2};
    int target1 = 91; 

    boolean status1 = fourSumProblem.isFourSum(arr1, target1);
    System.out.println("Status 1 : " + status1);
    int [] arr2 = {1, 2, 3, 4, 5, 9, 7, 8};
    int target2 = 16; 
    boolean status2 = fourSumProblem.isFourSum(arr2, target2);
    System.out.println("Status 2 : " + status2);

    }
    
}
