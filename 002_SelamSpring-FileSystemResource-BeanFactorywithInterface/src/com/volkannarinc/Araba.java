package com.volkannarinc;

public class Araba {
	
	private Yakit yakit;
	
	/*
	public Araba() {
		this.yakit = new Yakit();
	}*/
	
	public  Araba(Yakit yakit) {
		this.yakit = yakit;		// new kullanmadan yapt�k, Dikkat et !
	}
	
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba Harekete Ge�ti!");
	}
}
