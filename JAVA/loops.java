import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
      /*   int counter = 0;
        while (counter <100) {
            System.out.println("hello world");
            counter ++;
            // WHILE LOOP 
            }
            System.out.println("printed hello world 100 times");*/
            // never condition like true in loop code because it can cause infinite loop and other statements is not going to print
            
            

        // example 2 print number from 1 to 10
        /*int counter = 1;
        while (counter <= 10) {
            System.out.print(counter+" " );// for printing numbers in a single line
            counter ++ ;
            
        }
        System.out.println();*/

        
        
        
        // for printing numbers in a new line
        /*int counter = 1;
        //counter++; this is strong it can cause infinite loop problem

        while (counter <= 10) {
            System.out.println(counter);
            counter ++;
            
        }*/


        
        
        //print the number from 1 to n

        /*Scanner sc = new Scanner (System.in);

        int range =  sc.nextInt();
        int counter = 1;
        while(counter<=range)  {
            System.out.print(counter+" ");
            counter ++;

        }
        System.out.println();
        sc.close(); */




        //PRINT SUM OF FIRST N NATURAL NUMBERS 
      /*   Scanner sc =  new Scanner (System.in);
       int n = sc.nextInt() ;
       int sum = 0;
       int i = 1;
       while (i<= n) {
        sum += i ;
        i++;
       }
        System.out.p*/


        //printing pattern
        //**** 
        //****
        //****
        //****

        /*int line = 1;
        while (line<=4) {
            System.out.println("****");
            line++;
            
        }*/



        //FOR LOOP   
         /*for (int i = 1 ; i<=10 ; i++){
            System.out.println("hello world");
         }*/


         //Printing square pattern 

         /*for (int line = 1; line <=4; line++ ){
            System.out.println("****");

         }*/

         //print reverse of a number using while loop

         /*int n = 10899;

         while (n>0) {
            int lastdigit =  n%10;
            System.out.print(lastdigit);
            n = n/10;// or we can also right as n/=10

            
         }
         System.out.println();*/


         //REVERSE THE GIVEN NUMBER using while loop (isme hum number reverse krke save krwa rhe hai)
         /*int n = 10899;
         int rev = 0;

         while (n>0) {
            int lastdigit = n %10;
            rev = (rev*10) + lastdigit;
            n = n/10;
         }
            System.out.println(rev);*/



            //do while loop (kaam pehle krte hai aur check baad m krte hai)

         /*    int counter = 1;
            do{
                System.out.println("hello world");
                counter ++;

            }while(counter<=10);*/


            //using break statement
          /* for (int i =1; i<=5; i++) {
                if (i ==3) {
                    break;

                }
                System.out.println(i);

            }
            System.out.println("i am out of the loop");*/

            // another example of break statement
            //keep entering numbers till user enters a multiple of 10
           /*  Scanner sc = new Scanner (System.in);
            do {
                System.out.println("enter your number 9");
                int n =sc.nextInt();
                if(n%10==0){
                    break;
                }
                System.out.println(n);
                
            }while(true);*///ye loop chlta rhega until user enters the multiplt of 10



            //CONTINUE STATEMENT :TO SKIP AN ITERATION 

           /*  for (int i= 1 ; i<=5; i++){
                if (i==3){
                continue;
            }
    }
            System.out.println(i);*/


            //display all numbers entered by user except multiples of 10

           /*  Scanner sc = new Scanner(System.in);


            do {
                System.out.println("enter your number:");
                int n = sc.nextInt();
                if(n%10==0){
                    continue;
                }
                System.out.println("number was :"+n);

            }while(true);//code chlta he rhega infinite loop*/



            //CHECK  IF A NUMBER IS PRIME OR NOT
            
           /*  Scanner sc = new Scanner (System.in);
            int n =sc.nextInt();

            if (n==2){
                System.out.println("n is prime");
            }else{
            boolean isPrime = true;//making boolean variable  to track that number is prime or not
            for(int i =2; i<=n-1; i++){
                if(n%i == 0) {// n is a multiple of i (i not equal to 1 or n  )
                    isPrime = false;// n is a composite number not a prime beacuse it also divisible by another number other then 1 and n itself)

                }

            } 
            if (isPrime == true)  {
                System.out.println(" n is prime");
            }else {
                System.out.println("n is not prime");
            }


            
        }
        sc.close();*/


        // for finding prime or not fromn = 2 to square root of n
        Scanner sc = new Scanner (System.in);
            int n =sc.nextInt();

            if (n==2){
                System.out.println("n is prime");
            }else{
            boolean isPrime = true;//making boolean variable  to track that number is prime or not
            for(int i =2; i<=Math.sqrt(n); i++){
                if(n%i == 0) {// n is a multiple of i (i not equal to 1 or n  )
                    isPrime = false;// n is a composite number not a prime beacuse it also divisible by another number other then 1 and n itself)

                }

            } 
            if (isPrime == true)  {
                System.out.println(" n is prime");
            }else {
                System.out.println("n is not prime");
            }


            
        }
        sc.close();
    }
    

            


         






    
        
       



        
        


       
        
    }
