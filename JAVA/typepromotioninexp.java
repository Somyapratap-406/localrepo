public class typepromotioninexp {
    public static void main(String[] args) {
      //  char a = 'a';
        //char b = 'b';
       // System.out.println((int)(b));
        //System.out.println((int)(a));
       // System.out.println(b-a);// type promotion sirf expression ka hota hai
     //   System.out.println(a);// variable ka nhi isko aisekaaise he print krdegi


    //char a = 'a';
     //char b = 'b';
     //char c = a-b ;
     //yahan pr integera-b ko charcter c m convert nhi kr skte

     //short a = 5;
     //byte b = 25;
     //char c = 'c';
     //byte bt = (byte) (a + b + c);//here type casting it in byte
     //System.out.println(bt);
     //byte sbse bda datatype  hai in sb toh usi m value cast krwa di humne or (we can say that largest possible data type m convert ho jaayengi)
     // answer is -127 which is ki bss hai jiska koi sense nhi hai 


     /*int a = 10;
     float b = 20.25f;
     long c = 25;
     double d = 30;
      double ans = a + b + c + d;
     System.out.println(ans);
     //simple si baat hai ki type conversion m sbse bde wale m convert kr dete hai jisse ki
     //lossy conversion na ho aur koi data ka loss na ho final answer m*/




     byte b = 5 ;// a = b*2 m kch glt nhi hai lekin 
     byte a =  (byte) (b*2);//int se byte m convert krenge toh choti balti ho gye java lossy conversion bol dega
     System.out.println(a);//toh alg se type cast krna pdega byte likh krke
    }
}
