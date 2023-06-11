import java.util.Arrays;

public class BinarySearch {
	
	public static int findTarget(int[] arr, int target){
        
		Arrays.sort(arr); //sort the array 
	
	
        int start = 0;
		int endindex = arr.length - 1; 
		
		while (start <= endindex) {
        int midindex = (endindex - 1)/2;  

			if(arr[midindex] == target){
				return arr[midindex];     
			}
			else if (arr[midindex] < target)
			{
			  start = midindex + 1;
			}
			else if (arr[midindex] > target)
			{
				endindex = midindex - start;
			}
			 break;
		    }

  return -1;


	}
	
}

    