package com.fatihcetin_Soru3;

public abstract class Hayvan {

	public String ad;
	public int kilosu;
	public int uzunlugu;
	public boolean tehlike;
	
	
	public abstract void sesCikar();

	public Hayvan(String ad, int kilosu, int uzunlugu, boolean tehlike) {
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		this.tehlike = tehlike;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getKilosu() {
		return kilosu;
	}


	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}


	public int getUzunlugu() {
		return uzunlugu;
	}


	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}


	public boolean isTehlike() {
		return tehlike;
	}


	public void setTehlike(boolean tehlike) {
		this.tehlike = tehlike;
	}
	
	
	
	
	
	
	
	
}