import java.util.Scanner;

public class loopsprob {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int number ;
        int choice;
        int evensum = 0;
        int oddsum = 0;


        do {
            System.out.print("Enter the number");
            number = sc.nextInt();
            
            if(  number % 2 == 0) {
                evensum += number;

            } else {

                oddsum += number;

            }
            System.out.print( "do you want to continue? press 1 for yes or 0 for no");
            choice = sc.nextInt();
        } while(choice==1);
        System.out.println("sum of even number: " + evensum);
        System.out.println("sum of odd numbers:" + oddsum);*/ 
        //problem 2




        //problem 3


        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact =1 ;
        System.out.print("enter any positive integer");
        
         
        for(int i=1; i<=num; i++){
            fact *= i;

        }
        System.out.println("factorial:" + fact);*/



        // problem 4 multiplication table

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number");
        int n =  sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);

        }
        sc.close();

        




        
    }  
}
