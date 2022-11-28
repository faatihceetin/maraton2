package com.fatihcetin_Soru3;

public class Main {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		
		Aslan aslan = new Aslan("Simba", 100, 200,true);
		Yilan yilan = new Yilan("Mamba", 200 , 150, true );
		Kertenkele kertenkele = new Kertenkele("Arif", 200 , 150, true );
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leao",120,500,true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("ali",120,500,true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Osman",120,500,false));
		
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeSurungenEkle(kertenkele);
	System.out.println(aslan.toString());
		
		
		

	}

}
