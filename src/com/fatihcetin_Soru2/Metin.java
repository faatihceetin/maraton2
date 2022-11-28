package com.fatihcetin_Soru2;

public class Metin {

	private String metin = "Bilgeadam Java Boost Programına Hoşgeldiniz";
	
	

	public String getMetin() {
		return metin;
	}

	public void setMetin(String metin) {
		this.metin = metin;
	}

	public Metin(String metin) {
		super();
		this.metin = metin;
	}

	@Override
	public String toString() {
		return "Metin [metin=" + metin + "]";
	}
	
	
	
}
