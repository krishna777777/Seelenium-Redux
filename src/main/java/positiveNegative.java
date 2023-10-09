import java.util.Scanner;

public class positiveNegative {

    public static  void main(String args[]){

        Scanner sc = new Scanner(System.in);


        System.out.println("enter the number");
        int num = sc.nextInt();

        if (num<0){
            System.out.println("the number is a Negative number" + num);
        }
        else {
            System.out.println("the number is not a Negative number"+ num);
        }


    }
}
