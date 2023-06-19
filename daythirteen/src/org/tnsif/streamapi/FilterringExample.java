package org.tnsif.streamapi;


	import java.util.Arrays;
	import java.util.List;


	public class FilteringExample {

		public static void main(String[] args) {
			List<String>obj=Arrays.asList("pranita", "Parag", "Aishwarya");
			obj.stream().filter((i->i.length()>5)).forEach((i)-> System.out.print(i+" "));

			obj.stream().limit(2).forEach((i)->System.out.println(i+" "));
			obj.stream().skip(2).forEach((i)->System.out.println(i+" "));
		}
}