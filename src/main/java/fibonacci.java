public class fibonacci {

    public static void main (String args[]){

        int a = 0 ;
        int b = 1 ;
        int c = 50 ;

        for (int i=0;i<c ;i++){

            if (a<50){
                System.out.println(a);
                int result = a+b;
                a = b;
                b= result ;


            }


        }
    }
}
