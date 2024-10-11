public class patternsloop {
    public  static void main (String args []) {

        /*for (int line = 1; line<=4; line++){
            //niche wala for one line ko dikhata hai
            for(int star =1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();


        }*/
        //star pattern



        //inverted star pattern
       /*  int n = 7;

        for (int line = 1; line<=n; line++){
            for(int star = 1; star<= n-line+1; star++){//we can also write 7 at the place of n
                System.out.print("*");
            }
            System.out.println();
        }*/


        // print half - pyramid pattern

        /*int n = 4;
         for (int line = 1; line<=n;line++) {
            for(int number= 1; number<=line ;number++ ) {
                System.out.print( number);
            }
            System.out.println();
        }*/


        // print character pattern

        int n = 4;
        char ch = 'A';
        // outer loop
        for(int line = 1; line<=n;line++){
            //inner loop
            for(int chars = 1; chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    

    }

}
