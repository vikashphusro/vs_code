public class JavaCollection{

    public void printAlternate(int []nums){

        int [] numss = nums;

        for(int i = 0; i < numss.length ; i++){
            System.out.print(numss[i] + "\t");
            i = i +1;
        }
    }

    

    public static void main(String[] args) {
      
         int arr[] = {-5, 1, 4, 2, 12};

         JavaCollection collection = new JavaCollection();
         collection.printAlternate(arr );
    }

}
