/*public class functionmethod {
    public static void printhelloworld() {
        System.out.println("helloworld");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        printhelloworld();// function call
    }
    
}*/
// IF THERE IS INT AT THE PLACE OF VOID THEN WE HAVE TO WRITE RETURN
//AT THE AND NUMBER HELLO WORLD PRINTED FOR EXAMPLE - return 3; 
 


// Now we are going to see the code for parameters

import java.util.*;

public class functionmethod {

public static void calculatesum(){
    Scanner sc = new Scanner(System.in);
         int a =  sc.nextInt();
         int b = sc.nextInt();
         int sum = a + b;
         System.out.println("sum is " + sum);
         sc.close();

}
    public static void main(String[] args) {
    
        calculatesum();
    }
}

