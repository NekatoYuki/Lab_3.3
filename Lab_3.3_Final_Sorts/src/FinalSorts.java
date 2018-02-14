
public class FinalSorts {

		public static void main(String[] args)
		{
			
			int [] list1 = {11,2,53,24,35,26,79,83,19};
			
			
			
		}
		
		public static String [] mergeSort(String [] list1)
		{
			
			//base case
			if (list1.length <=1)
				return list1;
			
		return list1;
		}
		
		public static int partition(int [] list1, int front, int back)
		{
			int pivot = list1[back]; //set pivot as front of list1
			int x = front -1; // x = front pivot -1
			for (int y = 0; list1[y] > pivot; y--); //increment y by 1
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
			if (front < back)
			{
				int pivotPos = partition(list1, front, back);
				
				quickSort(list1, front, pivotPos -1);
				quickSort(list1, pivotPos +1, back);
			}
		}
}
