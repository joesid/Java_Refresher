import java.util.Arrays;

public class BinarySearch {
	
	public static int findTarget(int[] arr, int target){
        
		Arrays.sort(arr); //sort the array 
	
	
        int start = 0; //Begin count for while loop
		int endindex = arr.length - 1;  
        int midindex = (endindex - 1)/2;  //middle index for Array 
		
		if (target > arr[endindex])
		{
			return -1;
		}

		while (start <= endindex) {
        

			if(target == arr[midindex]){
				return arr[midindex];     
			}
				else if (target < arr[midindex])
			{
				//reduce endindex which in turns reduces the midindex
				endindex-=1;
			}
		
			else if (target > arr[midindex])
			{
			    midindex +=1;
			}
		
		    }
  //return -1 if value isn't in the array
  return -1;


	}
	
}

    