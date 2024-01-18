package PixelPackage;

import ColorPackage.Color;

public class PixelDriver {

	public static void main(String[] args) {
		
		//create objective of Color and Pixel
		
		Color c = new Color();
		Pixel p = new Pixel(10, 20 ,c);
		
		//check value of x, y 
		
		System.out.println("Pixel p has x: " + p.getX() + " y: " + p.getY());
		
		// reserve y with 5
		p.movVerReverse(5);
		
		System.out.println("\nAfter move back 5 of y, now y = " + p.getY());
		
		// add 100 on x
		p.moveHor(1000);
		
		System.out.println("\nAfter add 1000 on x, now x = " + p.getX());
		
		
		//set border with xMax 100, yMax 120, xMin 50, yMin 50
		p.setBorder(100, 120, 50, 50);
		
		System.out.println("\nNow we set border as xMax: " + p.xMax + " xMin: " + p.xMin + " yMax: " + p.yMax + " yMin: " + p.yMin);
		
		
		// check x, y value after set border
		System.out.println("\nAfter set border, the max value of x is " + p.getX());
	
		
		// decrease y value with 10000
		p.movVerReverse(10000);

		//check if we go over the border
		System.out.println("\nDecreased y value with 100000, the value of y is " + p.getY() + " , becuase the min value of y is " + p.yMin);
		
		
	}

}
