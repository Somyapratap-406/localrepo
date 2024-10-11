//import java.util.*;
public class largestinarray{


    public static int getlargest(int numbers[]){
          int largest = Integer.MIN_VALUE; // it signifies the value of -infinity
          int smallest = Integer.MAX_VALUE; // IT signifies the value of +infinity
          for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
          }
          System.out.println("smallest value is :" + smallest);// wecan return only one value so we haveto print to get largest as well as smallest value 
          return largest ;
        
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest value is :" + getlargest(numbers));



    }
}

    

