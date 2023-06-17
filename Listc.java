import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;


public class Listc {
    
    public static void listRefresh(){

       /*  List arrayList = new ArrayList();

        arrayList.add("Amani");
        arrayList.add("Jane");
        arrayList.add("Janet");
        arrayList.add("Cynthia");

        System.out.println("Size: " + arrayList.size());

        System.out.println("ArrayLis elements: ");
        System.out.println(arrayList);  */


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
}