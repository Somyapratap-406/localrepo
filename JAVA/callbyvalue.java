/*public class callbyvalue {
    public static void main(String[] args) {
        //swap - vale exchanges

        int a =5;
        int b = 10;


        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a);
        System.out.println("b = " + b);

    }
}*/
// similar code by using method of function


public class callbyvalue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
       
        
    }
    public static void main(String[] args) {
        int a = 5; 
        int b = 10;
        swap(a,b);
        System.out.println("a = " +a);
        System.out.println("b = "+ b );
    }
}