package com.volkannarinc;

public class SelamImpl implements ISelam{

	@Override
	public void mesajYaz(String mesaj) {
		System.out.println(mesaj+"\nB.S.N.");
	}

}
