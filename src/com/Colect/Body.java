package com.Colect;

public final class Body {
	
	int weightBody;
	int valueBody;
	String manufactureBody;
	String collor;
	



	public Body(int weightBody, int valueBody, String manufactureBody, String collor) {
		this.weightBody = weightBody;
		this.valueBody = valueBody;
		this.manufactureBody = manufactureBody;
		this.collor = collor;
	}
	
	
	public void discountBody(int discountBody){
		System.out.println("Value of Body - " + valueBody);
		System.out.println("Discount for Body - " + discountBody);
			
		valueBody = valueBody - (valueBody * discountBody / 100);
			System.out.println("new value of Body " + valueBody);
		}
		
	public void downBody(int downBody){
		
		System.out.println("down body  for " + downBody);
	}
	
	public void upBody(int upBody){
		
		System.out.println("up body  for " + upBody);
	}
	
	public void paintBody(String collorBody){
		
		System.out.println("Paint body  in " + collorBody + " collor");
	}
	
	
	public int getWeightBody() {
		return weightBody;
	}
	public void setWeightBody(int weightBody) {
		this.weightBody = weightBody;
	}
	public int getValueBody() {
		return valueBody;
	}
	public void setValueBody(int valueBody) {
		this.valueBody = valueBody;
	}
	public String getManufactureBody() {
		return manufactureBody;
	}
	public void setManufactureBody(String manufactureBody) {
		this.manufactureBody = manufactureBody;
	}
	
	public String getCollor() {
		return collor;
	}


	public void setCollor(String collor) {
		this.collor = collor;
	}
	@Override
	public String toString() {
		return "Body [weightBody=" + weightBody + ", valueBody=" + valueBody + ", manufactureBody=" + manufactureBody
				+ ", collor=" + collor + "]";
	}
	
    
	
}
