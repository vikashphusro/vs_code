
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class LargestElement {


    private int secondLargestElement(int [] arr){

        int secondLargest = Integer.MIN_VALUE;
        int firstLargest = Integer.MIN_VALUE;

        for(int x : arr){
            if(x > firstLargest){
                secondLargest = firstLargest;
                firstLargest = x;

            }

            if(x > secondLargest && x != firstLargest){
                secondLargest = x;

            }
        }
        return secondLargest;
    }

    private int secondLargestElement2(int [] arr){

        Arrays.sort(arr);
        for(int i = arr.length-2; i>=0; i--){
            if(arr[i]!= arr[arr.length-1]){
                return arr[i];
            }
        }

        return -1;
        
    }


    private List<Integer> getTopElement(int [] arr){
    

        int first = Integer.MIN_VALUE; 
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int x : arr) {

            if(x > first) {
                third = sec;
                sec = first;
                first = x;
            }

            if(x > sec && x != first){
                third = sec;
                sec = x; 
            }

            if(x > third && x != first && x != sec){
                third = x;
            }


        }

        List <Integer> nums = new ArrayList<>();
        if(first == Integer.MIN_VALUE){
            return nums;
        }
        nums.add(first);
        if(sec == Integer.MIN_VALUE){
            return nums;
        }
        nums.add(sec);        

        if(third == Integer.MIN_VALUE){
            return nums;
        }
        nums.add(third);        
        return nums;

}


    
    public static void main(String[] args) {
       int [] arr = {2, 5, 1, 9, 33, 2, 66,444, 444, 444, 444,  33, 444, 33,33, 444, 3000, 3000};
       
       LargestElement largestElement = new LargestElement();
       List<Integer> kk = largestElement.getTopElement(arr);

       for(int n : kk){
        System.out.println(n);
       }

       int secondLargest = largestElement.secondLargestElement2(arr);
       System.out.println("Second Lasrgest : " + secondLargest);


        
    }
}
