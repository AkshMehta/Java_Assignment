public class Second_largest {
    public static void main(String args[])
    {
        int[] arr1={10,9,14,17,23,15};  //Create an array
        int secondHighest=findSecondLargestNumberInTheArray(arr1);
        System.out.println("Second largest number in the array : "+ secondHighest);
    }
 
    public static int findSecondLargestNumberInTheArray(int array[])
    {
    
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
 
        
        for (int i = 0; i < array.length; i++) {  //Iterate through the loop
             
            if (array[i] > highest) {
 
                secondHighest = highest;
 
                highest = array[i];
            } else if (array[i] > secondHighest && array[i]!=highest)
                secondHighest = array[i];
        }
 
        return secondHighest;
    }
}
 