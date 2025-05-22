package com.constructor;

public class Laptop {

		public String brand;
		public int ramSize;
		
		public Laptop(String Brand,int ram) {
			brand=Brand;
			ramSize=ram;
		}
		
			public Laptop() {
				brand="Lenovo";
				ramSize=14;
		}
			public void showSpecs() {
				System.out.println("Laptop Brand :" + brand);
				System.out.println("Size of the Ram :" + ramSize);
			}
			public static void main(String[] args) {
				Laptop lap1 = new Laptop();
				Laptop lap2 = new Laptop("dell",10);
				lap1.showSpecs();
				lap2.showSpecs();
			}
	}	