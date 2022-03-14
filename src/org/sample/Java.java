package org.sample;

public class Java {
    static Java a;
	private Java() {

	System.out.println("sigle ton");
	}
	
	private static Java student() {
     if (a==null) {
    	 a = new Java();
		System.out.println(a);
	}
	return a;
	}
	public static void main(String[] args) {
		Java a = student();
		Java a1 = student();
		//same memory is alocated because check if condition
	}
} 