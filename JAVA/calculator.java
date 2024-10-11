import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // by using switch statements
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a : ");
        int a =  sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter operator : ");
        char operator =  sc.next().charAt(0);
        // string kisi wording  ke liye ho gya aur char At(0) kisi bhi single no.ke liye 
        

        switch(operator) {
          case '+': System.out.println(a+b);  
          break;
          case '-': System.out.println(a-b);
          break;
          case '*':System.out.println(a*b);
          break;
          case '/': System.out.println(a/b);
          break;
          case '%': System.out.println(a%b);
          break;
          default : System.out.println("it can only calculate normal probs");
          sc.close();


        }



        

        
    }
}
