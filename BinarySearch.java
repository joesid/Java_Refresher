import java.util.Arrays;



public class BinarySearch {
	
	public static int findTarget(int[] arr, int target){
        
		Arrays.sort(arr);
		


		int midindex = ((arr.length) - 1)/2;

		if (arr[midindex] > target )
		{ 
		  int endindex = arr.length - 1;

		  for (int ls = midindex; ls <= endindex; ++ls)
		  {
                   if(target == arr[ls])
				   {
					int returnval = ls;
				   }
				   
		  }
       
          //arr = Arrays.copyOfRange(arr, (arr[0]), (arr[midindex]));
		}
		else if (arr[midindex] < target)
		{
			for (int ls = 0; ls <= midindex; ++ls)
			{
				if(target == arr[ls])
				{
					int returnval = ls;
				}
			}
           //arr = Arrays.copyOfRange(arr, (arr[midindex]), (arr[(arr.length - 1)]));
		}
		else if (arr[midindex] == target)
		{
			int returnval = midindex;
		}
        
		else 
		{
			int returnval = -1;
			return returnval;
		}
//test commit
	}
}
