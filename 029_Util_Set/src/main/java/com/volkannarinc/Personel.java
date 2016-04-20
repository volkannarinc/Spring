package com.volkannarinc;

import java.util.Set;

public class Personel {
	
	private Set<?> setimiz;
	
	

	public Set<?> getSetimiz() {
		return setimiz;
	}



	public void setSetimiz(Set<?> setimiz) {
		this.setimiz = setimiz;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PERSONELLER	:	" + getSetimiz();
	}
	
	
	
}
