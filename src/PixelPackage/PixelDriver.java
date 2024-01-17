package PixelPackage;

import ColorPackage.Color;

public class PixelDriver {

	public static void main(String[] args) {
		
		//create objective of Color and Pixel
		Color c = new Color();
		Pixel p = new Pixel(115, 200 ,c);
		
		//set border with xMax 150, yMax 120, xMin 50, yMin 50
		p.setBorder(150, 120, 50, 50);
		
		// add x value on objective p
		p.moveHor(100000);

		//check if we go over the border
		System.out.println(p.getX());
		
		
	}

}
