package week3.day2;


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class PrintDuplicatesInArray {

		public static void main(String[] args) {
			int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			List <Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}
			System.out.println(list);
			
			Set <Integer> set = new HashSet <Integer>();
			Set <Integer> dset = new HashSet <Integer>();
			for (Integer i : list) {
				if(!set.add(i))
					dset.add(i);
				
			}
			System.out.println("Duplicate Values :"+dset);
		}

	}

