package org.tnsif.framework;

public  abstract class ShopAcc {
	//data members
		private int accNo;
		private String accNm;
		private float charges;
		
		//para constructor
		public ShopAcc(int accNo, String accNm, float charges) {
			super();
			this.accNo = accNo;
			this.accNm = accNm;
			this.charges = charges;
		}
		
		abstract public void bookProduct(float charges);
		public void items(float charges)
		{	
			System.out.println(charges);
			
		}
		
		//toString
		@Override
		public String toString() {
			return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
		}
		
		//getter and setters

		public int getAccNo() {
			return accNo;
		}

		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}

		public String getAccNm() {
			return accNm;
		}

		public void setAccNm(String accNm) {
			this.accNm = accNm;
		}

		public float getCharges() {
			return charges;
		}

		public void setCharges(float charges) {
			this.charges = charges;
		}
}
