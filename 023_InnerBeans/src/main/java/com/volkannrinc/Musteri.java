package com.volkannrinc;

public class Musteri {

	private Siparis siparis;
	
	public Musteri() {
		// TODO Auto-generated constructor stub
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}
	
	public void hesabiOde() {
		System.out.println("Musteri sınıfındaki hesabiOde metodu.");
		siparis.toplamSonucuA();
	}

}
