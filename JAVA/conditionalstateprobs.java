import java.util.Scanner;

public class conditionalstateprobs {
    public static void main(String[] args) {
        //problem 1
        /*Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("a is a positive number");
        
        }
        else  {
            System.out.println("a is a negative number");
         sc.close();   
        }*/





        // problem 2
      /*  double temp = 103.5;
        if (temp>100) {
            System.out.println("you have fever");
        }
        else {
            System.out.println("you don't have a fever");
        }*/

        //problem 3

       /*  Scanner sc = new Scanner (System.in);
        System.out.println("enter the week number(1-7):");
        int week  = sc.nextInt();
        switch (week) {
            case 1:
            System.out.println("monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3 : 
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("thursday");
                break;
                case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("saturday");
                break;
                case 7:
                System.out.println("sunday");
                break;
        
            default:System.out.println("inavlid input : please enter week number between 1-7.");
                break;
             
        }
        sc.close();*/


        //problrem 5


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();

        boolean x = (year  % 4) == 0;
        boolean y = (year % 100)  != 0; 
        boolean z = ((year % 100 == 0)  && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }
        sc.close();

    }
}
