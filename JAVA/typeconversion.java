 import java.util.*;
 public class typeconversion {
    public static void  main (String args []) {
      //  int a = 5;
        //long b = a ;
        //System.out.println(b);
       // long a = 25 ;
        //nt b = a;
        //System.out.println(b);
        //this code gives error of compilation due to lossy conversion 
       // Scanner sc = new Scanner (System.in);
        //int number = sc.nextFloat();
        //System.out.println(number);
       //sc.close();
       // this code is incompatible with the compiler and has a lossy conversion 

       Scanner sc = new Scanner (System.in);
       float number = sc.nextInt();
       System.out.println(number);
        sc.close();
        //this is known as a type conversion or implicit or widening in java

    }
 }
