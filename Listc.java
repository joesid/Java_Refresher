import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Arrays;


public class Listc {
    
    public static void listRefresh(){

        List arrayList = new ArrayList();

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
    
    for(String in: input){
        if(in.charAt(0) == 'a'){
            List<String> sub_list;
            if (big_list[0] == null)
            {
             sub_list = new ArrayList<>();
            }
            else{
                sub_list = big_list [0];
            }
        }
    }


    return big_list;
     }
}