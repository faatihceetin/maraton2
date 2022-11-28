package com.fatihcetin_Soru3;

public class Kertenkele extends Surungen{

	public Kertenkele(String ad, int kilosu, int uzunlugu, boolean tehlike) {
		super(ad, kilosu, uzunlugu, tehlike);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println("Kertenkele sürünüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println("Kertenkele ses çıkarıyor");
		
	}

	@Override
	public String toString() {
		return "Kertenkele [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlike=" + tehlike + "]";
	}



}
