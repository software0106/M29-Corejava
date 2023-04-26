package org.tnsif.firstpackage;

public class AccessSpecifierExecutor {

	public static void main(String[] args) {

		Base b=new Base();
		 
		 b.methodDefault();
		 b.methodPublic();
		 b.methodProtected();
		 
		 /*b.mrthod.Private(); --> this Private member, we can't 
		 access into another class*/
		 
	}

}
