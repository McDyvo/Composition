package com.Colect;

public class Car {
	
	private String model;
	int totalValue;
	Don don;
	Wheel wheel;
	Body body;
	
	
	public Car(String model, int totalValue, int diametrDon, int valueDon, String manufacturerDon, String styleDon, 
			int diametrWheel, int valueWheel, String seasoneWheel, String manufacturerWheel, String quantityWheel, 
			int weightBody, int valueBody, String manufactureBody, String collor) {
		
		this.model = model;
		this.totalValue = totalValue;
		this.don = new Don(diametrDon, valueDon, manufacturerDon, styleDon );
		this.wheel = new Wheel(diametrWheel, valueWheel, seasoneWheel, manufacturerWheel, quantityWheel);
		this.body = new Body(weightBody, valueBody, manufactureBody, collor );
		
	}
	
	public Car(String model, int totalValue, Don don, Wheel wheel, Body body) {
		super();
		this.model = model;
		this.totalValue = totalValue;
		this.don = don;
		this.wheel = wheel;
		this.body = body;
	}
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getTotalValue() {
		return totalValue;
	}


	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}


	public Don getDon() {
		return don;
	}


	public void setDon(Don don) {
		this.don = don;
	}


	public Wheel getWheel() {
		return wheel;
	}


	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}


	public Body getBody() {
		return body;
	}


	public void setBody(Body body) {
		this.body = body;
	}

	
	public void turnRight(int right) {
		don.turnRight(right);
	}

	public void turnLeft(int left) {
		don.turnLeft(left);
	}

	public void discountDon(int discountDon) {
		don.discountDon(discountDon);
	}

	public void riseDiametrWheel(int riseDiametrWheel) {
		wheel.riseDiametrWheel(riseDiametrWheel);
	}

//	public void discountWheel(int discountWheel) {
//		wheel.discountWheel(discountWheel);
//	}

	public void discountBody(int discountBody) {
		body.discountBody(discountBody);
	}

	public void downBody(int downBody) {
		body.downBody(downBody);
	}

	public void upBody(int upBody) {
		body.upBody(upBody);
	}

	public void paintBody(String collorBody) {
		body.paintBody(collorBody);
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", totalValue=" + totalValue + ", don=" + don + ", wheel=" + wheel + ", body="
				+ body + "]";
	}
	
	
	

}
