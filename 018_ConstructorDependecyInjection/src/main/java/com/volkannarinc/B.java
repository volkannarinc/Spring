package com.volkannarinc;

public class B {
	private A aNesnesi;
	
	public B(A aNesnesi) {
		System.out.println("B sınıfının hazırlayıcı metodu.");
		this.aNesnesi = aNesnesi;
	}
	
	public void sonucuGöster() {
		System.out.println("B sınıfına ait normai bir metot,");
		aNesnesi.konsolaYaz();
	}
}
