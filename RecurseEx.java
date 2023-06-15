public class RecurseEx {

    public static void printPermutn(int[] arr, int index){
          
     if (index == arr.length - 1){

        for(int num: arr) {
            System.out.print(num);
        }
        System.out.println();
     }else {
        for (int i = index; i < arr.length; i++){
         
            swap(arr, index, i);

            printPermutn(arr, index + 1);
            
            swap(arr, index, i);
        }
     }

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
