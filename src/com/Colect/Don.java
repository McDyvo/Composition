package com.Colect;

public final class Don {
	
	int diametrDon;
	int valueDon;
	String manufacturerDon;
	String styleDon;
	
	
	public Don(int diametrDon, int valueDon, String manufacturerDon, String styleDon) {
		this.diametrDon = diametrDon;
		this.valueDon = valueDon;
		this.manufacturerDon = manufacturerDon;
		this.styleDon = styleDon;
	}
	
	public void turnRight(int right){
		System.out.println("Right  for " + right + " degree");
		
	} 
	
	public void turnLeft(int left){
		System.out.println("Left  for " + left + " degree");
		
	} 
		
	public void discountDon (int discountDon){
		System.out.println("Value of Don - " + valueDon);
		System.out.println("Discount for Don - " + discountDon);
		valueDon = valueDon / discountDon * 100;
			System.out.println("new value of Don " + discountDon);
		}
	
	public int getDiametrDon() {
		return diametrDon;
	}
	public void setDiametrDon(int diametrDon) {
		this.diametrDon = diametrDon;
	}
	public int getValueDon() {
		return valueDon;
	}
	public void setValueDon(int valueDon) {
		this.valueDon = valueDon;
	}
	public String getManufacturerDon() {
		return manufacturerDon;
	}
	public void setManufacturerDon(String manufacturerDon) {
		this.manufacturerDon = manufacturerDon;
	}
	public String getStyleDon() {
		return styleDon;
	}
	public void setStyleDon(String styleDon) {
		this.styleDon = styleDon;
	}
	@Override
	public String toString() {
		return "Don [diametrDon=" + diametrDon + ", valueDon=" + valueDon + ", manufacturerDon=" + manufacturerDon
				+ ", styleDon=" + styleDon + "]";
	}

	
	
	
} 
