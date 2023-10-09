public class LargetElement {

    public static void main(String args[]){
        int arr[] = {3,1,2,6,10};

        int max = 0 ;

        for (int i=0;i<arr.length;i++){
            max = arr[0];
            if (max<arr[i]){
                max=arr[i];
            }


        }
        System.out.println("the max value is "+max);


    }
}
