package com.fatihcetin_Soru2;

public class CustomStringTR {
	
	private String str;
	
	
	public CustomStringTR(String metin) {
		this.str = metin;
	}

	public int uzunluk() {
		
		return str.length();
	}
	
	public boolean icerir(String aranan) {
		return str.contains(aranan);
	}
	
	
	public boolean esittir(String aranan) {
		return str.equals(aranan);
	}

	
	public String kucukHarfYap(String aranan) {
		return aranan.toLowerCase();
	}
	
	public String buyukHarfYap(String aranan) {
		return aranan.toUpperCase();
	}
}
