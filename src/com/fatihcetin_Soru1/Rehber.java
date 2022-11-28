package com.fatihcetin_Soru1;

public class Rehber {

		private String isim;
	    private String soyIsim;
	    private String telefonNumarası;
	    
	    
		public Rehber(String isim, String soyIsim, String telefonNumarası, String string) {
			super();
			this.isim = isim;
			this.soyIsim = soyIsim;
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
			return "Rehber [isim=" + isim + ", soyIsim=" + soyIsim + ", telefonNumarası=" + telefonNumarası + "]";
		}
	    
	    
	    
	    
	    
	    
	    
	    
}
