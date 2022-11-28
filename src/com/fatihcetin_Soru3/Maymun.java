package com.fatihcetin_Soru3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilosu, int uzunlugu, boolean tehlike) {
		super(ad, kilosu, uzunlugu, tehlike);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		System.out.println("Maymun Yürüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println("Maymun ses çıkarıyor");
		
	}

	@Override
	public String toString() {
		return "Maymun [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlike=" + tehlike + "]";
	}


}
