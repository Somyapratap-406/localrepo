//import java.util.Scanner;

public class conditionalstate {
     public static void main(String[] args) {
       /* int age =  16 ;
        if (age >= 18) {
            System.out.println("adult : drive , vote");
        }
        if (age >13 && age <18)
        System.out.println("teenager");
        else {
            System.out.println("not adult");
        }*/




        // print the largest of 2 

      /*  int a =  1 ;
        int b = 3;
        if (a >= b) {
            System.out.println("a is largest of 2");
            
        }
        else {
            System.out.println("b is largest of 2");
        }*/


        // print if a number is odd or even 

         // is baar code m hum input lenge user so

         /*Scanner sc = new Scanner(System.in);
         int number =  sc.nextInt();
         if(number % 2 == 0) {
            System.out.println("even");
         }
         else {
            System.out.println("odd");
         }
         sc.close();*/


         // ELSE IF STATEMENT

         /*int age = 22;
         if (age >= 18) {
            System.out.println("adult");
         }

         else if (age >= 13 && age <18) {
            System.out.println("teenager");
         }
          
        else {
            System.out.println("child");
        } */




        // INCOME TAX CALCULATOR 

       /*  Scanner sc = new Scanner (System.in);
        int income = sc.nextInt();
        int tax;//yaha = krke koi value assign nhi ki hai toh jva apne ap value zero de dega 

        if (income< 500000) {
            tax = 0;
            
        }
        else if (income >500000 && income<1000000) {
            tax = (int) (income *0.2);// here we use type casting kyunki java float aur int ko dekh kr double m convert krdega

            
        }
        else {
            tax = (int) (income *0.3);
        }
        System.out.println("your tax is : " + tax);
        sc.close();*/


        //PRINT THE LARGEST OF 3
       /*  int  a = 1;
        int b = 3;
        int c = 6;
        if ((a>=b) && (a>=c)) {
            System.out.println("a is largest of three");
            
        } 
        else if (b>=c) {
            System.out.println("b is largest of three ");
            
        }
        else{
            System.out.println("c is largest of three");
            
        } */


        //TERNARY OPERATORS

       /*  int number = 4;
       String type = ((number%2) == 0)? "even" :" odd";
       System.out.println(type);*/

       /*int marks = 67;
       String reportcard = marks >= 33 ? "pass":"fail";
       System.out.println(reportcard);*/


       //SWITCH STATEMENTS
      /*  int number = 2;

       switch (number) {
        case 1 : System.out.println("samosa");
                 break ;
        case 2 : System.out.println("burger");
                  break;
        case 3 : System.out.println("mango shake");
                 break;
        default : System.out.println("we wake up in reality");

       }*/
       // we are using break staatement for stopping the printing of statements after the  execution of matched statement

       //example 2 of switch 
       
       char ch = 'a' ;
       switch(ch) {
        case 'b' : System.out.println("samosa");
        break;
        case 'a': System.out.println("burger");
        break;
        case 'c':System.out.println("mango shake");
        break;
        default: System.out.println("wake up to reality");
       }



            
        }
}

