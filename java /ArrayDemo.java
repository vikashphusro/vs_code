public class ArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        int [][] nums = new int[2][];
        nums[0] = new int [3];
        nums[1] = new int [2];

        int count = 0;

        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = count++;
            }
        }

          for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print( nums[i][j]);
            }
            System.out.println("");

        }
    }   
}