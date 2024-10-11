public class printsubarrays {

    public static void  subarrays (int numbers []) {
        int ts = 0; // total sum
     for (int i =0; i<numbers.length; i++){
        int start = i; //or we can also take the i AT THE PLACE OF numbers [i] because it can cause issue 
        for(int j= i; j<numbers.length; j++){
            int end = j; //or we can also take the j AT THE PLACE OF numbers [j]
             // or also write int j no need to write end or start 
             for( int k = start; k<= end;k++){// this loop is only for print 
                System.out.print(numbers[k] + " ");// subarray
            }
            ts++;// total sub arrays
            System.out.println();

        }
        System.out.println();
     }
     System.out.println("total subarrays = " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarrays(numbers);
        
    }
}
