public class callbyvalueex2 {
    public static int factorial(int n){
        int f = 1;// isme n ke factorial ki value store hogi

        for(int i=1; i<=n; i++) {
           f =  f*i;
        }
        return f; //factorial of n

    }
   // public static void main(String[] args) {
     //  System.out.println(factorial(7)); 
    


    // binomial coefficient 
    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n/(fact_r * fact_nmr);
        return bincoeff;


    }
    //fuction to calculate sum of 2 nums

   /*  public static int sum(int a, int b) {
        return a+b;
    }

    // function to calculate sum of 3 nums

    public static int sum(int a ,int b, int c){
        return a + b+ c;
    }*/

    //different data types


    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }



    //check if a number is prime or not
   /* public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i<=n-1; i++ ){
            if(n%i == 0){// completely dividing
                isPrime = false;
                //break; we can write it here because we only need one no. which is divisible so we can come out from loop 
            }
        }
        return isPrime;
    }*/

    // optimised method for check prime

    public static boolean isPrime(int n) {// WE CAN MAKE THIS USER DEFINE FUNCTION AFTER OR BEFORE MAIN FUNCTION
        if(n == 2){
             return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }



    // print all prime numbers in a range

    public static void primesinaRange(int n) {
        for (int i =2; i<=n; i++) {
            if(isPrime(i)) {//true
                System.out.println(i+" ");

            }
        }
        System.out.println();
    }


    // binary to decimal


    public static void bintodec(int binnum){
        int mynum = binnum;
        int pow = 0;
        int decnum = 0;

        while(binnum>0) {
            int lastdigit = binnum % 10;
            decnum = decnum + (lastdigit *(int) Math.pow(2, pow) );

            pow++;
            binnum = binnum/10;

        }
        System.out.println("decimal of " + mynum + " = " + decnum);
    }


    // decimal to binary

     public static void dectobin(int n) {
        int mynum = n;
        int pow = 0;
        int binnum = 0 ;

        while(n>0) {
            int rem = n%2;
            binnum = binnum + (rem *(int) Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("binary form of "  + mynum + " = " + binnum);
     }
    public static void main(String[] args) {
       // System.out.println(bincoeff(5,2));// this line is only for bincoeff function
      // System.out.println(sum(3,5));//using parameters 
       //System.out.println(sum(5,2,6));//using parameters
     //  System.out.println(sum(3,5));//usingdatatypes
       //System.out.println(sum(5.2f,3.5f));// using data types
     // System.out.println(isPrime(16));// same for optomised and unoptimised version
      // primesinaRange(16);//ye koi value return nhi krega kyunki void hai toh simple call lagayenge syso bina likhe
      //bintodec(1010);//same here return type is void so no use syso
      dectobin(15);


    }
}
 