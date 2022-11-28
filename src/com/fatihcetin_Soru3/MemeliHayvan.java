package com.fatihcetin_Soru3;

public abstract class MemeliHayvan extends Hayvan {

	public MemeliHayvan(String ad, int kilosu, int uzunlugu,boolean tehlike) {
		super(ad, kilosu, uzunlugu,tehlike);
		
	}
	
	public abstract void yuru();
	}
