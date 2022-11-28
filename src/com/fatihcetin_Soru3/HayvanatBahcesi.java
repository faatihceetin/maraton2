package com.fatihcetin_Soru3;

import java.util.ArrayList;
import java.util.Iterator;

public class HayvanatBahcesi  {

	private ArrayList<MemeliHayvan> memeliList = new ArrayList<>();
	private ArrayList<Surungen> surungenList = new ArrayList<>();
	
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		boolean found = false;

		for (Iterator iterator = memeliList.iterator(); iterator.hasNext();) {
			MemeliHayvan memeliHayvan = (MemeliHayvan) iterator.next();
			if(memeliHayvan.ad.toLowerCase().equals(m.ad.toLowerCase())) {
				found = true;
			}
		}
		if(!found)
			memeliList.add(m);
		else
			System.out.println("Bu hayvan var.");
		
		
	}
	
	public void bahceyeSurungenEkle(Surungen s) {
		boolean found = false;

			for (Iterator iterator = surungenList.iterator(); iterator.hasNext();) {
				Surungen surungenHayvan = (Surungen) iterator.next();
				if(surungenHayvan.ad.toLowerCase().equals(s.ad.toLowerCase())) {
					found = true;
				}
			}
			if(!found)
				surungenList.add(s);
			else
				System.out.println("Bu hayvan var.");		
		
	}
	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
		
	}
	public void hayvaninCinsiniBul(String fo) {
		String message = "Hayvan bulunamadı";
		boolean found = false;
		
		for (Iterator iterator = memeliList.iterator(); iterator.hasNext();) {
			MemeliHayvan memeliHayvan = (MemeliHayvan) iterator.next();
			if(memeliHayvan.ad.equals(fo)) {
				message = "Hayvan Memeli";
				found = true;
			}
		}
		
		if(!found) {
			for (Iterator iterator = surungenList.iterator(); iterator.hasNext();) {
				Surungen surungenHayvan = (Surungen) iterator.next();
				if(surungenHayvan.ad.equals(fo)) {
					message = "Hayvan Sürüngen";
				}
			}
		}
		
		System.out.println(message);
	}
	
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		Hayvan hayvan = null;
		boolean found = false;
		
		for (Iterator iterator = memeliList.iterator(); iterator.hasNext();) {
			MemeliHayvan memeliHayvan = (MemeliHayvan) iterator.next();
			if(memeliHayvan.ad.equals(hayvanAdi)) {
				hayvan = memeliHayvan;
				found = true;
			}
		}
		
		if(!found) {
			for (Iterator iterator = surungenList.iterator(); iterator.hasNext();) {
				Surungen surungenHayvan = (Surungen) iterator.next();
				if(surungenHayvan.ad.equals(hayvanAdi)) {
					hayvan = surungenHayvan;
				}
			}
		}
		
		System.out.println(hayvan.toString());
	}
	
	public void hayvaniHareketEttir(String hayvanAdi) {
		boolean found = false;
		
		for (Iterator iterator = memeliList.iterator(); iterator.hasNext();) {
			MemeliHayvan memeliHayvan = (MemeliHayvan) iterator.next();
			if(memeliHayvan.ad.equals(hayvanAdi)) {
				memeliHayvan.yuru();
				found = true;
			}
		}
		
		if(!found) {
			for (Iterator iterator = surungenList.iterator(); iterator.hasNext();) {
				Surungen surungenHayvan = (Surungen) iterator.next();
				if(surungenHayvan.ad.equals(hayvanAdi)) {
					surungenHayvan.surun();
				}
			}
		}
		
	}
	
}
