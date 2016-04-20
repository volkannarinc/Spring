package com.volkannarinc;

public class B {
	private A aNesnesi;
	
	public B(A aNesnesi) {
		System.out.println("B sınıfının hazırlayıcı metodu.");
		this.aNesnesi = aNesnesi;
	}
	
	public A getaNesnesi() {
		return aNesnesi;
	}

	public void setaNesnesi(A aNesnesi) {
		this.aNesnesi = aNesnesi;
	}

	public void sonucuGöster() {
		System.out.println("B sınıfına ait normai bir metot,");
		aNesnesi.konsolaYaz();
	}
	//------------------------------------------------------------
	private String mesaj;
	private int sayi;

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	
	
}

