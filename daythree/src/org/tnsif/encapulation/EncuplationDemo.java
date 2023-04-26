package org.tnsif.encapulation;

public class EncuplationDemo {

	public static void main(String[] args) {
HDFCBank h=new HDFCBank();
		
		h.setCardNo(677485659081L);
		h.setCardType("Debit-Card");
		h.setCVVNo(0106);
		h.setPinNo(1001);
		
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCVVNo());
		System.out.println(h.getPinNo());
	}

}
