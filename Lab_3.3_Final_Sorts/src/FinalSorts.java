import java.util.Arrays;

public class FinalSorts {

		public static void main(String[] args)
		{
			
			int [] list1 = {11,2,53,24,35,26,79,83,19};
			
			long start = System.nanoTime();
			quickSort(list1, list1[0], list1[list1.length-1]);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println("quickSort took: " + time + "nanoseconds");
			System.out.println(Arrays.toString(list1));
			
		}
		
		public static String [] mergeSort(String [] list1)
		{
			int length = list1.length;
			String [] merge = new String[list1.length];
			//base case
			if (list1.length <=1)
			{
				merge = list1;
			}
			else
			{
				int mid = (list1.length)/2;
				String[] left = null;
				String[] right = null;
				if ((length % 2)==0)
				{
					left = new String[length/2];
					right = new String[length/2];
				}
				else
				{
					left = new String[length/2];
					right = new String[(length/2)+1];
				}
				int i = 0;
				int j = 0;
				for (; i < mid; i++)
				{
					left[i] = list1[i];
				}
				for (;i <length;i++)
				{
					right[j++] = list1[i];
				}
				left = mergeSort(left);
				right = mergeSort(right);
				merge = mergeArray(left,right);
			}
		return merge;
		}
		
		public static int partition(int [] list1, int front, int back)
		{
			int pivot = list1[back]; //set pivot as front of list1
			int x = front -1; // x = front pivot -1
			int temp = 0;
			int y = front;
			for (y = front; y<back; y++); //increment y by 1
				{
					if (list1[y]<=pivot) //if x is less than y
					{
						x++;
						temp = list1[x]; //swap method
						list1[x] = list1[y];
						list1[y] = temp;
					}
				}
				
				temp = list1[x+1]; //other swap method
				list1[x+1] = list1[back];
				list1[back] = temp;
				return (x+1);
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
