package PixelPackage;

import ColorPackage.Color;

public class PixelDriver {

	public static void main(String[] args) {
		
		//create objective of Color and Pixel
		
		Color c = new Color();
		Pixel p = new Pixel(10, 20 ,c);
		
		//set border with xMax 150, yMax 120, xMin 50, yMin 50
		System.out.println("First y, is " + p.getY());
		
		p.movVerReverse(5);
		
		System.out.println("Second y, is " + p.getY());
		
		
		
		System.out.println("First X, is " + p.getX());
		
		p.moveHorReverse(5);
		
		System.out.println("Second X, is " + p.getX());
		
		
		
//		p.setBorder(100, 120, 50, 50);
		
		System.out.println("xmax: " + p.xMax + " xmin: " + p.xMin);
		
		System.out.println("First x, border is 100, x is " + p.getX());
	
		
		
		// add x value on objective p
		p.moveHor(100000);

		//check if we go over the border
		System.out.println("Second x, border is 100, but move 10000, x is " + p.getX());
		
		
	}

}
