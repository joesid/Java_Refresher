import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class index {

    public static void main(String[] args)
    {
    
      callList();

      int[] arr = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};

      // int[] perm_arr  = {1, 2};

      // RecurseEx.printPermutn(perm_arr, 0);
      
      // Listc.listRefresh();


      List<String> list_string = new ArrayList<String>();
      list_string.add("abc");
      list_string.add("bcd");
      list_string.add("bcd");

      System.out.println(list_string);

        int num = BinarySearch.findTarget(arr, -1);

        System.out.println("Binary search array val is: " + num); //Print result of the Binary Search Class

         String sl = VowelOnly.vowelOnly("Udacity");
         System.out.println(sl);
      
      
        
       
    }


    static void callList (){

      List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbb", "eeee" );
      
      List<String>[] val = Listc.groupString(input);

      for (List<String> in : val)
      {
        System.out.println(in);
        System.out.println(" ");
      }

    }

}