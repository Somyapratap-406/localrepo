public class maxsubarray3 {
    //kadane's algorithm -ve ki place pr zero use krlo
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0) {// negative nhi chahiye  
                cs = 0;
            }
            ms = Math.max(cs,ms);// jo maximum hoga vo maxsum(ms) m store hoga

        }
        System.out.println("our max subaray sum is :" + ms);
    }
     public static void main(String[] args) {
        int numbers[] = {-2, -3 , 4, -1, -2, 1, 5 , -3};
        kadanes(numbers);
     }

}
