public class SlidingWindow {
    
    private int maxSum(int []arr, int size){
        if(arr.length <= size){
            return  -1;
        }
        int maxSum = Integer.MIN_VALUE;
        int window = 0; 

        for(int i = 0; i < size ; i++){
            window += arr[i];
        }
        maxSum = window;
        for(int i = size; i < arr.length ; i++){
            window = window + arr[i] - arr[i-size];
            maxSum = Math.max(maxSum, window);
        }
        return maxSum;
    }

    public static void main(String[] args) {
    int arr[] = {100, 200, 300, 400};
    int k = 2;
    SlidingWindow slidingWindow = new SlidingWindow();
    int sum = slidingWindow.maxSum(arr, k);
    }
}
