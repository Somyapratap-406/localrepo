public class binarysearch {


    public static int Binarysearch(int numbers[] , int key){
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end)/2;
            // comparisons
            if (numbers[mid] == key) {// key found condition
                return mid;
            }
            if(numbers[mid] < key){// right
                    start = mid+1;

                }else { // left
                    end = mid-1;
                }
                


            }
            return -1; //key does not exist condition when start > end in while loop
        }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;

        System.out.println("index for key is:" + Binarysearch(numbers , key));
    }
}
