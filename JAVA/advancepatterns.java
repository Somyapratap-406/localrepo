public class advancepatterns {
    public static void hollow_rectangle(int totrows, int totcols){
        // outer loop
        for( int i = 1;i<=totrows; i++){
            // inner loop
            for(int j = 1; j<= totcols; j++){
                // cell boundary(i,j)
                if (i == 1 || i == totrows || j == 1|| j == totcols) {
                    // boundary cells condition
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    // inverted rotated half pyramid 


   public static void inverted_rotated_half_pyramid(int n) {
    // outer f
     for(int i = 1; i<=n; i++){
        // spaces 
        for (int j = 1; j<=n-i ;j++){
            System.out.print(" ");
        }
        // stars
        for( int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
     }
   }

 

    // inverted half - pyramid with numbers 


     public static void inver_half_pyra_numbers(int n){
         for(int i=1; i<=n; i++){
            // inner - numbers
            for(int j = 1 ;j<= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
     }



     // floyd's triangle

     public static void  floyds_triangle(int n) {
        //outer loop
        int counter = 1;
        for(int i = 1; i<=n; i++){ // n is total no. of lines
            //inner loop - how many times will counter be printed
            for(int j = 1; j<=i; j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
     }


     // 0-1 Triangle

     public static void zero_one_triangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
               if((i+j) %2 == 0){// even
                System.out.print("1");

               }else {
                System.out.print("0");
               }
            }
            System.out.println();
        }
     }



     // butterfly pattern


     public static void butterfly_pattern(int n){
        //first half
        //outer loop
        for( int i =1; i<=n; i++){
            //stars - i
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for (int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i =n; i>= 1; i-- ){
            //stars - i
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for (int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
     }

     public static void solid_rhombus(int n){
        //outer loop
        for(int i= 1; i<=n; i++){
            //spaces inner loop
            for(int j = 1; j<=(n-i); j++){
            System.out.print(" ");}
        
        // stars inner loop;
            for(int j=1; j<=n; j++){
            System.out.print("*");

        }
        System.out.println();
    }

     }

     // hollow rhombus

      public static  void  hollow_rhombus(int n){
        for(int i = 1; i<=n; i++){
            // spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // hollow rectangle - stars
            for( int j = 1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            System.out.println();
    }
        
}

    // Diamond pattern

    public static void diamond(int n){
        // 1st half
       for(int i=1; i<=n; i++){
        // spaces
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
         
        // stars
         for(int j=1; j<=((2*i)-1); j++){
            System.out.print("*");
         }
         System.out.println();

       }

       // second half
       for(int i=n; i>=1; i--){
        // spaces
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
         
        // stars
         for(int j=1; j<=((2*i)-1); j++){
            System.out.print("*");
         }
         System.out.println();

       }


    }
       

     

    public static void main(String[] args) {
       // hollow_rectangle(10, 7 );
      // inverted_rotated_half_pyramid(10);
      //inver_half_pyra_numbers(5);
      //floyds_triangle(5);
      //zero_one_triangle(5);
     // butterfly_pattern(7);
     //solid_rhombus(5);
     // hollow_rhombus(7);
      diamond(5);
    }
    
}
