import java.util.ArrayList;
import java.util.List;

public class Enhanced {

    public static void main(String args[]){

        String names [] = {"krishna","sriram","ram","abcd"};


        // enhanced for loop

        //datatype name : variable
        for (String n : names){
            System.out.println(n);
        }

        // normal for loop
// initialization ;condition ; incrementation

        for (int i=0;i<names.length;i++){
            System.out.println("the names present are "+names[i]);
        }


        // array list


        List<String> al = new ArrayList<String>();

        al.add("october");
        al.add("november");
        al.add("december");

        //simple for loop
       for (int i=0;i<al.size();i++){
           System.out.println(al.get(i));
       }
       // enhanced for loop

        for (String s : al){
            System.out.println(s);
        }








    }
}
