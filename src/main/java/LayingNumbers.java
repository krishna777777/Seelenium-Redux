public class LayingNumbers {

    /**
     * How this calculated is that 12,15 two numbers are given so the output is calculated by the number beetween them
     * 12+13+14+15 =54
     * @param args
     */
    public static void main(String args[]){

        int a = 12 ;
        int b = 15 ;
        int sum =0 ;

        for (int i=12;i<=b;i++){

            sum = sum +i ;

        }
        System.out.println(sum);
    }
}
