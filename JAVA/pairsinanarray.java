public class pairsinanarray {
    public static void printpairs(int numbers[]){
        int tp = 0;


        for (int i =  0 ; i<numbers.length; i++){
            int current = numbers[i]; // 2,4,6,8,10
            for(int j = i+1; j < numbers.length; j++){
                System.out.println("("+ current +", " + numbers[j] + ")");
               tp++;//total pairs

            }
            System.out.println();
        }
        System.out.println("total pairs =" + tp); // for finding total pairs
    }

        public static void main(String args []) {
            int numbers[] = {2,4,6,8,10};
            printpairs(numbers);
        }
    
}
