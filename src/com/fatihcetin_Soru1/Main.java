package com.fatihcetin_Soru1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	List<Rehber> rehber = new ArrayList<>();
	FileWriter fileWriter = null;
	File file = new File("C:\\Users\\Fatih\\Desktop\\Eclips\\Dersler\\Teori\\Maraton2\\src\\com\\fatihcetin_Soru1\\Rehber.txt");
	Scanner in = new Scanner(System.in);
	
	

	
	public void main(String[] args) throws IOException {
		 
		
		try {
			dosyadanKisileriOku();
		} catch (Exception e) {
			System.out.println("I/O Exception");
		}
		
	}
	 private void kisiBul() throws IOException {
	        System.out.println("1. İsmi ile bul");
	        System.out.println("2. Soyismi ile bul");

	        String choice;
	        do {
	            choice = in.nextLine();
	            switch (choice) {
	                case "1":
	                    isimIleBul();
	                    break;
	                case "2":
	                    soyIsimIleBul();
	                    break;
	                default:
	                    System.out.print("Lütfen seçim yapınız");
	            }
	        } while (!choice.equals("1") && !choice.equals("2"));
	        System.out.println();
	        
	    }

	    private void soyIsimIleBul() {
	        System.out.print("Lütfen Soyisim giriniz: ");
	        String soyIsimIleBul = in.nextLine();
	        int eslesme = 0;
	        for(Rehber rehber : rehber) {           
	            if(rehber.getSoyIsim().equals(soyIsimIleBul)) {
	                System.out.println(rehber);
	                eslesme++;
	            }
	        }
	         if(eslesme<=0) {
	            System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
	        }
	    }

	    private void isimIleBul() {
	        System.out.print("Enter name: ");
	        String nameToFind = in.nextLine();
	        int eslesme = 0;
	        for(Rehber rehber : rehber) {       
	            if(rehber.getIsim().equals(nameToFind)) {
	                System.out.println(rehber);
	                eslesme++;
	            }
	        }
	        if(eslesme<=0) {
	            System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
	        }
	    }


		  private boolean dosyadanKisileriOku() throws IOException {
		        try(BufferedReader okuyucu = new BufferedReader(new FileReader(file))) {
		            String isim = null;
		            while((isim = okuyucu.readLine()) != null) {
		                Rehber rehber = new Rehber(isim, okuyucu.readLine(), okuyucu.readLine(), okuyucu.readLine());
		                ((List<Rehber>) rehber).add(rehber);        
		                okuyucu.readLine();                                 
		            }
		            return true;
		        }
		        catch ( IOException e) {
		            System.out.println(e);
		        }
		        return false;
		    }

	
	
	

}
