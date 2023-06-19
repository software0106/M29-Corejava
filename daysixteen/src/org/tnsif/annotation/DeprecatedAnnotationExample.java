package org.tnsif.annotation;

public class DeprecatedAnnotationExample {
	@Deprecated
	public void print()
	{
		System.out.println("welcome to Annotation");
	}
	public static void main(String[] args) 
	{
		DeprecatedAnnotationExample d=new DeprecatedAnnotationExample();
		d.print();
			

		}
}
