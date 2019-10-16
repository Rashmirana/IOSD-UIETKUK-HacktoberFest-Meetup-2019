public class MergeSort {
	
	public static void partition(int[] input, int start, int end)
	{
        
		if(end - start < 1)
		{
			return;
		}
		
		int mid = (start + end)/2;
		partition(input, start, mid);
		partition(input, mid+1 , end);
		merge(input, start, mid, end);   

	}
	
	public static void merge(int[] input, int start, int mid, int end)
	{
		int n1 = mid+1-start;     
		int n2 = end-mid;
		
		int l[] = new int[n1];
		int r[] = new int[n2];
		
		for(int i = 0; i < n1; i++)    
		{
			l[i] = input[start + i];
		}

		for(int j = 0; j<n2; j++)
		{
			r[j] = input[mid+1+j];
		}
		
		int i = 0 ,j = 0, k=start;
		while(i<n1 && j<n2)
		{
			input[k++]= l[i]< r[j] ? l[i++] : r[j++];
		}
		while(i<n1)
		{
			input[k++]= l[i++];
		}
		while(j<n2)
		{
			input[k++]= r[j++];
		}

	}

    public static void main(String args[])
	{
		int arr[]= {20,35,-15,7,55,1,-22};
		
		partition(arr,0,arr.length-1);

		 for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}