package com.volkannarinc;

public class Adres {

	String tamAdresi;

	public String getTamAdresi() {
		return tamAdresi;
	}

	public void setTamAdresi(String tamAdresi) {
		this.tamAdresi = tamAdresi;
	}

	@Override
	public String toString() {
		return "Adres [tamAdresi=" + tamAdresi.toUpperCase().toString() + "]";
	}


}
