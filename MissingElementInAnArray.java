package week3.day2;



	import java.util.Set;
	import java.util.TreeSet;

	public class MissingElementInAnArray {
		public static void main(String[] args) {
			int[] arr = {1,2,3,4,7,6,8};
			
			Set <Integer> set = new TreeSet<Integer>();
			for (int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
			}
			System.out.println("Sorted Array : -> " +set);
			for (int i = arr[0]; i < arr.length; i++) {
				if (i!=arr[i-1])
				{
					System.out.println("Missing number in Array :  "+ i);
					break;
				}
			}
			
			
		}

	}
