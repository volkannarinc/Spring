package com.volkannarinc;

public class Araba {
	
	private Yakit yakit;
	
	/*
	public Araba() {
		this.yakit = new Yakit();
	}*/
	
	public  Araba(Yakit yakit) {
		this.yakit = yakit;		// new kullanmadan yaptık, Dikkat et !
	}
	
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba Harekete Geçti!");
	}
}
