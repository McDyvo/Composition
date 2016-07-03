package com.Colect;

public  class Wheel {
	
	int diametrWheel;
	int valueWheel;
	String seasoneWheel;
	String manufacturerWheel;
	String quantityWheel;
	
	
	public Wheel(int diametrWheel, int valueWheel, String seasoneWheel, String manufacturerWheel,
			String quantityWheel) {
		
		this.diametrWheel = diametrWheel;
		this.valueWheel = valueWheel;
		this.seasoneWheel = seasoneWheel;
		this.manufacturerWheel = manufacturerWheel;
		this.quantityWheel = quantityWheel;
	}
	
	public void riseDiametrWheel(int riseDiametrWheel){
		
		diametrWheel +=riseDiametrWheel;
		System.out.println("new Diametr of Wheel " + diametrWheel);
	}
	
	public void discountWheel(int discountWheel){
	System.out.println("Value of Wheel - " + valueWheel);
	System.out.println("Discount for Wheel - " + discountWheel);
	valueWheel = valueWheel - (valueWheel * discountWheel / 100);
	System.out.println("new value of Wheel " + valueWheel);
	}
	
	
	
	public int getDiametrWheel() {
		return diametrWheel;
	}
	public void setDiametrWheel(int diametrWheel) {
		this.diametrWheel = diametrWheel;
	}
	public int getValueWheel() {
		return valueWheel;
	}
	public void setValueWheel(int valueWheel) {
		this.valueWheel = valueWheel;
	}
	public String getSeasoneWheel() {
		return seasoneWheel;
	}
	public void setSeasoneWheel(String seasoneWheel) {
		this.seasoneWheel = seasoneWheel;
	}
	public String getManufacturerWheel() {
		return manufacturerWheel;
	}
	public void setManufacturerWheel(String manufacturerWheel) {
		this.manufacturerWheel = manufacturerWheel;
	}
	public String getQuantityWheel() {
		return quantityWheel;
	}
	public void setQuantityWheel(String quantityWheel) {
		this.quantityWheel = quantityWheel;
	}
	@Override
	public String toString() {
		return "Wheel [diametrWheel=" + diametrWheel + ", valueWheel=" + valueWheel + ", seasoneWheel=" + seasoneWheel
				+ ", manufacturerWheel=" + manufacturerWheel + ", quantityWheel=" + quantityWheel + "]";
	}
	

	
	
	
	
	
}
