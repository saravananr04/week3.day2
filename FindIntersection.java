package week3.day2;



	import java.util.ArrayList;
	import java.util.List;

	public class FindIntersection {


		public static void main(String[] args) {
		    int[] array = new int[] {3,2,11,4,6,7};
		    List<Integer>list = new ArrayList<Integer>();
		    list.add(3);
		    list.add(2);
		    list.add(11);
		    list.add(4);
		    list.add(6);
		    list.add(7);
		    int[] array1 = new int[] {1,2,8,4,9,7};
		    List<Integer>list1 = new ArrayList<Integer>();
		    list1.add(1);
		    list1.add(2);
		    list1.add(8);
		    list1.add(4);
		    list1.add(9);
		    list1.add(7);
		   list.retainAll(list1);//comparing a two value 
		            	System.out.println(list);
		            }
		}

