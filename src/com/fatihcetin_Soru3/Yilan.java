package com.fatihcetin_Soru3;

public class Yilan extends Surungen{

	public Yilan(String ad, int kilosu, int uzunlugu, boolean tehlike) {
		super(ad, kilosu, uzunlugu, tehlike);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println("Yılan sürünüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println("Yılan ses çıkarıyor");
		
	}

	@Override
	public String toString() {
		return "Yilan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlike=" + tehlike + "]";
	}

	

}
