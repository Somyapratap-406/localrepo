package ArrayPQ;

public class ArrayPQ1 {

   public static boolean isEven(int var0) {
      return var0 % 2 == 0;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (isEven(var2)) {
         System.out.println("number is even");
      } else {
         System.out.println("number is odd");
      }

   }
}


