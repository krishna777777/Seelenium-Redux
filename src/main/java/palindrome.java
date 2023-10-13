public class palindrome {

public static void main (String args[]){
    String s = "racecar";

    boolean ispalindrome = true;



    for (int i=0;i<s.length()/2;i++){

        if (s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            System.out.println("not a Plaindrome ");
            break;
        }
        else{

                System.out.println("it is a Palindrome ");


        }



    }


}
}
