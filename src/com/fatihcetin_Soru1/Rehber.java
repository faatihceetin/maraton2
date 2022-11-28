

public class Rehber {

		private String isim;
	    private String soyIsim;
	    private String sehir;
	    public String getSehir() {
			return sehir;
		}


		public void setSehir(String sehir) {
			this.sehir = sehir;
		}


		private String telefonNumarası;
	    
	    
		public Rehber(String isim, String soyIsim, String sehir, String telefonNumarası) {
			this.isim = isim;
			this.soyIsim = soyIsim;
			this.sehir = sehir;
			this.telefonNumarası = telefonNumarası;
		}


		public String getIsim() {
			return isim;
		}


		public void setIsim(String isim) {
			this.isim = isim;
		}


		public String getSoyIsim() {
			return soyIsim;
		}


		public void setSoyIsim(String soyIsim) {
			this.soyIsim = soyIsim;
		}


		public String getTelefonNumarası() {
			return telefonNumarası;
		}


		public void setTelefonNumarası(String telefonNumarası) {
			this.telefonNumarası = telefonNumarası;
		}


		@Override
		public String toString() {
			return "Rehber [isim=" + isim + ", soyIsim=" + soyIsim + ", sehir=" + sehir + ", telefonNumarası="
					+ telefonNumarası + "]";
		}


	    
	    
	    
	    
	    
	    
	    
}
