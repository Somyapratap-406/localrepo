public class callbyvalueexam {
public static int multiply(int a ,int b){
  int product = a*b;
  return  product;
}
public static void main(String[] args) {
   /*  int prod =  multiply(3,5);//here we give the direct value of a and b method1
    System.out.println("a*b = " + prod);*/
    int a = 3;
    int b= 5;
    int prod = multiply(a,b);
    System.out.println("a*b = " + prod);//this m2 of writing the same code 
       prod = multiply(10,20);
      System.out.println("a*b = "+ prod);
}

}
