package com.volkannarinc;

public class Selam {
	private String mesaj;

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	public void goster(){
		System.out.println(getMesaj());
	}
	
	public void init() {
		System.out.println("Bean başlatılıyor !\n");
	}
	
	public void destroy() {
		System.out.println("Bean Sonlandırılıyor ! \n");
	}
}
