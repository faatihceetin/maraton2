

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	static List<Rehber> rehberList = new ArrayList<>();
	FileWriter fileWriter = null;
	static File file = new File("C:\\Users\\Fatih\\Desktop\\Eclips\\Dersler\\Teori\\Maraton2\\src\\com\\fatihcetin_Soru1\\Rehber.txt");
	static Scanner in = new Scanner(System.in);
	
	

	
	public static void main(String[] args) throws IOException {
		 
		
		dosyadanKisileriOku();
		
		kisiBul();

		
	}
	 private static void kisiBul() throws IOException {
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

	    private static void soyIsimIleBul() {
	        System.out.print("Lütfen Soyisim giriniz: ");
	        String soyIsimIleBul = in.nextLine();
	        int eslesme = 0;
	        for(Rehber rehber : rehberList) {           
	            if(rehber.getSoyIsim().toLowerCase().equals(soyIsimIleBul.toLowerCase())) {
	                System.out.println(rehber);
	                eslesme++;
	            }
	        }
	         if(eslesme<=0) {
	            System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
	        }
	    }

	    private static void isimIleBul() {
	        System.out.print("Enter name: ");
	        String nameToFind = in.nextLine();
	        int eslesme = 0;
	        for(Rehber rehber : rehberList) {       
	            if(rehber.getIsim().toLowerCase().equals(nameToFind.toLowerCase())) {
	                System.out.println(rehber);
	                eslesme++;
	            }
	        }
	        if(eslesme<=0) {
	            System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
	        }
	    }


		  private static void dosyadanKisileriOku() throws IOException {
		        try(BufferedReader okuyucu = new BufferedReader(new FileReader(file))) {
		        	String st;
		            while((st = okuyucu.readLine()) != null) {
		            	String[] parts = st.split(";");
		            	String[] splitedNameSurname = parts[0].split(" ");
		            
		            	Rehber rehber = new Rehber(splitedNameSurname[0].trim(), splitedNameSurname[1].trim(), parts[1].trim(), parts[2].trim());
		            	rehberList.add(rehber);

		            }
		        }
		        catch ( IOException e) {
		            e.printStackTrace();		        }
		    }

	
	
	

}
