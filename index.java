import java.util.regex.Pattern;

public class index {

    public static void main(String[] args)
    {
  
      int[] arr = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};

      int[] ar = {1, 2};

      RecurseEx.printPermutn(ar, 0);
      
     Listc.listRefresh();
      int num = BinarySearch.findTarget(arr, 11);

      System.out.println("Binary search array val is: " + num);

        String sl = VowelOnly.vowelOnly("Udacity");
        System.out.println(sl);


       
        
       
    }

}