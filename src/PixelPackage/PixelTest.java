package PixelPackage;

import static org.junit.Assert.*;
import org.junit.Test;

import ColorPackage.Color;

import org.junit.Before;


public class PixelTest {
	
	Pixel p1;
	Pixel p2;
	Pixel p3;
	Pixel p4;
	
	Color c1;
	Color c2;
	Color c3;
	
	@Before
	public void setUp() {
		c1 = new Color(100, 200, 100);
		c2 = new Color(50, 100, 200);
		c3 = new Color();
		
		p1 = new Pixel(10, 20, c1);
		p2 = new Pixel(20, 50, c2);
		p3 = new Pixel(20, 20);
		p4 = new Pixel();
		
	}
	
	//	1.	a no argument constructor that sets the x and y to 0 and uses the default color constructor
	@Test
	public void testConstXY() {
		
		assertEquals(0, p4.getY());
		assertEquals(0, p4.getX());
		assertEquals(0, p4.getColor().getbValue());
		
	}
	
	// 	2.	a 2 argument constructor that accepts x and y values then uses the default color constructor
	@Test
	public void testConst2ArgXY() {
		
		assertEquals(20, p3.getY());
		assertEquals(20, p3.getX());
		assertEquals(0, p3.getColor().getrValue());
		
	}
	
	// 	3.	a color constructor that uses this chaining to set the default x and y values to 0 then sets the color using a sent color
	@Test
	public void testUpdateConst() {
		
		p4.getColor().combineColor(255, 100, 255);
		
		assertEquals(255, p4.getColor().getrValue());
		assertEquals(100, p4.getColor().getgValue());
		assertEquals(255, p4.getColor().getbValue());
		
	}
	
	//  4.	an all-argument constructor
	@Test
	public void testAllConst() {
		
		assertEquals(10, p1.getX());
		assertEquals(50, p2.getY());
		assertEquals(100, p1.getColor().getbValue());
		assertEquals(200, p2.getColor().getbValue());
		
	}
	
	// 	5.	a printPixel method that prints the x and y coordinates separated by commas and then uses composition to add on the color objects information
	public void testPrintPixel() {
		
	}
	
	
	//  6.	a moveHor method that increases the x coordinate given a set amount
	public void testMovHer() {
		
	}
	
	//	7.	a movVer method that increases the y coordinate a given amount
	public void testMovVer() {
		
	}
	
	//	8.	a movMeth that moves the x and y coordinates a given amount (use code reduction)
	public void testMovMeth() {
		
	}
	
	//	9.	a setBorder that sets a max and min x and y values
	public void testSetBoder() {
		
	}
	
	//	10.	a checker helper method that makes sure values don’t exceed the border amount
	public void testChecker() {
		
	}
	
	//	11.	Once border values are set, make sure the x and y values can only be less than or equal to the max border and greater than or equal to the min border

}
