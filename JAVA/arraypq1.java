import java.util.*;
public class arraypq1 {
    
     public static boolean isEven(int x){
         if(x%2==0){
             return true; }
         else{ return false;
         } 
        }
         public static void main(String args[]){
             Scanner sc = new Scanner(System.in);
              int x = sc.nextInt(); 
              if(isEven(x)){
                 System.out.println("number is even");
                 }else{ System.out.println("number is odd");
                 }sc.close();
}
}

    

