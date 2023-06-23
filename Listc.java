import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Listc {
    
    public static void listRefresh(){

        List<String> arrayList = new ArrayList<String>();

        arrayList.add("Amani");
        arrayList.add("Jane");
        arrayList.add("Janet");
        arrayList.add("Cynthia");

        System.out.println("Size: " + arrayList.size());

        System.out.println("ArrayList elements: ");
        System.out.println(arrayList);  


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
    
        Collections.sort(cars); 

        for (String i: cars) {
            System.out.println(i);
        }



    }


    static List<String>[] groupString(List<String> input){

    List<String>[]  big_list = new List[3];
  
    for (String in: input)
      //Looping through individual strings of the list 
    {
        
        if (in.charAt(0) == 'a' )
        {
            List<String> sub_list;
            if (big_list[0] == null)
            {
               sub_list = new ArrayList<>();
            }
            else
            {
                sub_list = big_list[0];
            }
            sub_list.add(in);
            big_list[0] = sub_list;
             }   
             else if (big_list[1] == null)
             {
                List<String> sub_list;
                if (big_list[1] == null )
                {
                    sub_list = new ArrayList<>();
                }
                else {
                    sub_list = big_list[1];
                }
                sub_list.add(in);
                big_list[1] = sub_list;
             }
             else{
                List<String> sub_list;
                if (big_list[2] == null )
                {
                    sub_list = new ArrayList<>();
                }
                else {
                    sub_list = big_list[2];
                }
                sub_list.add(in);
                big_list[2] = sub_list;

             }
    }



    return big_list;
     }
}