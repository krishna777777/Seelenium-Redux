public class Palin {


    public static void main(String args[]){

        String s= "racecar";

        for (int i=0;i<s.length()/2;i++){

            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                System.out.println("a plaindrome ");
            }
            else{
                System.out.println("Not a Palindrome");
            }
        }
    }
}
