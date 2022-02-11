package week3.day2;



	import java.util.LinkedHashSet;
	import java.util.Set;

	public class RemoveDuplicates {


		public static void main(String[] args) {
			
			String text = "We learn java basics as part of java sessions in java week1";	
			String[] array=text.split(" ");
			System.out.println("Text before duplicacy"+text);
			Set<String> charset = new LinkedHashSet<String>();
			for (int i = 0; i < array.length; i++) {
				charset.add(array[i]);
				
			}
			System.out.println("After Removing duplicate values"+charset);
			
			
		}

	}
