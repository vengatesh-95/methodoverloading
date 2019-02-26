package org.test;

public class methodOverloading {
	public void voterId(int id) {
		System.out.println(id);
	}
	public void voterId(String name) {
		System.out.println(name);
	}
	public void voterId(long phnno, char block,double sal ) {
		System.out.print(phnno+"\n"+block+"\n"+sal);
	
	}	
	public static void main(String[] args) {
		methodOverloading mm = new methodOverloading();
		mm.voterId(55658);
		mm.voterId("venky");
		mm.voterId(7255648795l, 'Y', 454);
	}
		
}