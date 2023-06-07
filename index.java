import java.util.regex.Pattern;

public class index {

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Good Morning");
        sb.insert(1, "Friend");
        System.out.println(sb.toString());


        String t = "name";

        char[] m = t.toCharArray();

        System.out.println(m);

        int val = m.length;

        for(int i = 0; i<val; i++)
        {
          System.out.println(m[i]);
        }
      

      int[] arr = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};

      int num = BinarySearch.findTarget(arr, 11);

      System.out.println("Binary search val is: " + num);

        String sl = VowelOnly.vowelOnly("Udacity");
        System.out.println(sl);
    }



/*
public static String vowelOnly (String input)
{
  String vowel = "aeiou";

  StringBuilder sb = new StringBuilder();

  for(char c:input.toCharArray()){
    if(vowel.contains(String.valueOf(c).toLowerCase())){
      sb.append(c);
    }
  }


  return sb.toString();
} 
*/
}