import java.util.*;
 public class array1  {
    public static void main(String args []){
      //  int marks [] = new int[50]; // there  is no value to store therefore it takes 0 or null value

       // int numbers[] = {1,2,3};  //array size is 3 

        //int morenumbers [] = {4,5,6};// array size 3 as their is 3 elements

       // String fruits [] ={"apple", "mango", "orange"};// array size 3
        
       int marks [] = new int[100];
       Scanner sc = new Scanner(System.in);
       // int phy;
       // phy = sc,nextInt();

        marks[0] = sc.nextInt(); //phy
       marks[1] = sc.nextInt(); //chem
       marks[2] = sc.nextInt(); //math

       System.out.println("phy : " + marks[0]);
       System.out.println("chem :" + marks[1]);
       System.out.println("math :" + marks[2]);
       sc.close();
       // we can change the marks for example teacher calculate your marks wrong
       // we can +,-,/,*,% also calc. percentage

      /*  marks[2] = 100;
       System.out.println("math :" + marks[2]);*/
       // for changing the value
      /*  marks[2] = marks[2] + 1 ;
       System.out.println("math :" + marks[2]);*/

       //for calculating percentage

       int percentage = (marks[0] + marks[1] + marks[2])/3;
       System.out.println("percentage = " + percentage + "%");
       /*  comment out all for calculating the length of the array
        System.out.println(" length of array = " + marks.length);*/
        


    }
    
}
