package com.JavaCourse.Chapter_6_Task_08;

public class Client {

	// instance variables
	private String name;
	private double hrsParked;
	private double charge;

	// constructor
	public Client(String name, double hrsParked) {
		setName(name);
		setHrsParked(hrsParked);
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	private void setHrsParked(double hrsParked) {

		if (hrsParked > 0 && hrsParked <=24) {
			this.hrsParked = hrsParked;
		}

	}

	// Getters
	public String getName() {
		return name;
	}

	public double getHrsParked() {
		return hrsParked;
	}

	public double getCharge() {
		calculateCharges(hrsParked);
		return charge;
	}
	
	// Calculate charges
		private double calculateCharges(double hrsParked) {
			double charge = 0;

			if (hrsParked > 0 && hrsParked <= 3) {
				this.charge = hrsParked * 2;
			} else if (hrsParked > 3) {
				charge = (hrsParked - 3) * 0.5 + 6;
				if (charge > 10 && hrsParked <= 24) {
					this.charge = 10;
				}

				else {
					this.charge = charge;
				}
			}

			return charge;
		}

}
