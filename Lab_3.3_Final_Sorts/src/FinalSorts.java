
public class FinalSorts {

		public static void main(String[] args)
		{
			
			int [] list1 = {11,2,53,24,35,26,79,83,19};
			
		}
		
		public static String [] mergeSort(String [] list1)
		{
			int left
			int right
			//base case
			if (list1.length <=1)
				return list1;
			
			return(merge(mergeSort(left), mergeSort(right))
		return list1;
		}
		
		public static int partition(int [] list1, int front, int back)
		{
			int pivot = list1[front]; //set pivot as front of list1
			int x = front -1; // x = front pivot -1
			int y = back +1; //y = back pivot +1
			while ( x < y) //for as long as the the two pivot points haven't crossed
			{
				for (x++; list1[x] < pivot; x++); //increment x by 1
				for (y--; list1[y] > pivot; y--); //increment y by 1
				{
					if (x < y) //if x is less than y
					{
						int temp = list1[x]; //swap method
						list1[x] = list1[y];
						list1[y] = temp;
					}
				}
			}
			return y;
		}
		
		public static void quickSort(int [] list1, int front, int back)
		{
			if 
		}
}
