package com.fatihcetin_Soru3;

public class Aslan extends MemeliHayvan {

	public Aslan(String ad, int kilosu, int uzunlugu,boolean tehlike) {
		super(ad, kilosu, uzunlugu,tehlike);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		// TODO Auto-generated method stub
		System.out.println("Aslan Yürüyor");

	}

	@Override
	public void sesCikar() {
		System.out.println("Aslan ses çıkarıyor");

	}
		@Override
		public String toString() {
			return "Aslan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlike=" + tehlike + "]";
		}

}

	
