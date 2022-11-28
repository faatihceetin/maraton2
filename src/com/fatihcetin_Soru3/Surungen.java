package com.fatihcetin_Soru3;

public abstract class Surungen extends Hayvan {

	public Surungen(String ad, int kilosu, int uzunlugu, boolean tehlike) {
		super(ad, kilosu, uzunlugu, tehlike);	
	}
	
	public abstract void surun();
}
