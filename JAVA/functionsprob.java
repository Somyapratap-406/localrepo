import java.util.*;

public class functionsprob {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input of first number:");
        double a = sc.nextDouble();
        System.out.print("input the second number");
        double b = sc.nextDouble();
        System.out.print("input the third number");
        double c = sc.nextDouble();
        System.out.print("the average value is" + average(a , b ,c)+"\n");

    }
    public static double average(double a, double b, double c) {
        return(a + b +c)/3;
        
    }*/
    // method 1

    //PROBLEM 1 method 2 we can data type accordingly
   /*  public static int average(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("the average is" +  average);
        sc.close();
        return 0;
    } */



    // problem 2 
    
   /*  public static boolean isEven(int number){
       
        if(number %2 == 0) {
            return true ;
        }else{
            return false;}
        }
        public static void main (String args []){
            int num;
            Scanner sc = new Scanner (System.in) ;
            System.out.print("enter an integer:");
            num = sc.nextInt();
         
         if(isEven(num)) {
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }sc .close();
    
            
    
}*/




// PROBLEM 3 IF NUMBER IS REVERSE PRINT ITS PALINDROME
 /*  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int rev_num = 0;
    
    while(temp != 0){// we can not  write temp >0 at the place of  !=0 because it gives only positive value
        rev_num = rev_num*10;
        rev_num = rev_num + (temp%10);
        temp = temp/10;
    }
    if (num == rev_num){
        System.out.println(" the number is palindrome");
    }
    else{
        System.out.println(" the number is not a palindrome");
    }sc.close();

 }*/

   // write this palindrome code as a  user define function 

   /*public static boolean isPalindrome (int number){
    int palindrome = number;
    int reverse = 0;
    while (palindrome != 0) {
        int remainder  = palindrome % 10 ;
         reverse = reverse *10 + remainder;
         palindrome = palindrome /10;

    }
    if(number == reverse){
       return true;
    }
    return false;
   }

   public static void main(String[] args) {
    System.out.println("enter a number");
    Scanner sc = new Scanner (System.in);
    int palindrome = sc.nextInt();

    if(isPalindrome (palindrome)){
        System.out.println("number:" + palindrome +" is a palindrome");
    }else {
        System.out.println("number" + palindrome + "is a palindrome");
    }
    sc.close();

   }*/
  // PROBLEM 4 
  public static int getsum( int num)
  {
    int sum = 0;
    while(num !=0){
        sum += num%10;
        num/=10;

    }
    return sum ;
  }
  
  public static void main (String args []) {
    Scanner sc = new Scanner (System.in) ;
    int num = sc.nextInt();
    System.out.println(getsum(num));
    sc.close();
  } 

}
