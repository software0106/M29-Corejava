package org.tnsif.designpattern;

abstract class CellularPlan {
	protected double rate;
	abstract void getRate();
	public void processBill(int minutes) {
		System.out.println(minutes*rate);
	}
}
