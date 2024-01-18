package PixelPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import ColorPackage.Color;

import org.junit.Before;

/** 
 * Edited by: Xuedinan Gao
 * Assignment: CS5004 Lab01
 * Date: 01/16/2024
 * 
 * A test class for the Pixel class.
 */

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
	
	//Pixel Tests
	
	// test no argument constructor that sets the x and y to 0 and uses the default color constructor
	@Test
	public void testConstXY() {
		
		assertEquals(0, p4.getY());
		assertEquals(0, p4.getX());
		assertEquals(0, p4.getColor().getbValue());
		
	}
	
	// test 2 argument constructor that accepts x and y values then uses the default color constructor
	@Test
	public void testConst2ArgXY() {
		
		assertEquals(20, p3.getY());
		assertEquals(20, p3.getX());
		assertEquals(0, p3.getColor().getrValue());
		
	}
	
	// 	test color constructor that uses this chaining to set the default x and y values to 0 then sets the color using a sent color
	@Test
	public void testUpdateConst() {
		
		p4.getColor().combineColor(255, 100, 255);
		
		assertEquals(255, p4.getColor().getrValue());
		assertEquals(100, p4.getColor().getgValue());
		assertEquals(255, p4.getColor().getbValue());
		
	}
	
	//  test all-argument constructor
	@Test
	public void testAllConst() {
		
		assertEquals(10, p1.getX());
		assertEquals(50, p2.getY());
		assertEquals(100, p1.getColor().getbValue());
		assertEquals(200, p2.getColor().getbValue());
		
	}
	
	// 	test printPixel method that prints the x and y coordinates separated by commas and then uses composition to add on the color objects information
	@Test
	public void testPrintPixel() {
		
		//expected string return from printPixel method
		String expected1 = "0,0,0,0,0";
		String expected2 = "10,20,100,200,100";
		String expected3 = "20,50,50,100,200";
		
		assertEquals(expected1, p4.printPixel());
		assertEquals(expected2, p1.printPixel());
		assertEquals(expected3, p2.printPixel());
		
	}
	
	
	//  test moveHor method that increases the x coordinate given a set amount
	@Test
	public void testMoveHor() {
		
		// increase x value of p1, p2, p3 
		p1.moveHor(100);
		p2.moveHor(50);
		p3.moveHor(0);
		
		assertEquals(110, p1.getX());
		assertEquals(70, p2.getX());
		assertEquals(20, p3.getX());
		
	}
	
	//	test movVer method that increases the y coordinate a given amount
	@Test
	public void testMovVer() {
		
		// increase y value of p1, p2, p3 
		p1.movVer(10);
		p2.movVer(20);
		p3.movVer(0);
		
		assertEquals(30, p1.getY());
		assertEquals(70, p2.getY());
		assertEquals(20, p3.getY());
	}
	
	//  test moveHorReverse method that decrease the x coordinate given a set amount
	@Test
	public void testMoveHorReverse() {
		
		// decrease x value of p1, p2, p3 
		p1.moveHorReverse(5);
		p2.moveHorReverse(3);
		p3.moveHorReverse(0);
		
		assertEquals(5, p1.getX());
		assertEquals(17, p2.getX());
		assertEquals(20, p3.getX());
		
	}
	
	//	test movVerReverse method that decreases the y coordinate a given amount
	@Test
	public void testMovVerReverse() {
		
		// decrease x value of p1, p2, p3 
		p1.movVerReverse(5);
		p2.movVerReverse(3);
		p3.movVerReverse(0);
		
		assertEquals(15, p1.getY());
		assertEquals(47, p2.getY());
		assertEquals(20, p3.getY());
	}
	
	//	test movMeth that moves the x and y coordinates a given amount (use code reduction)
	@Test
	public void testMovMeth() {
		
		// increase x and y value of p1, p2, p3 
		p1.movMeth(100, 10);
		p2.movMeth(50, 20);
		p3.movMeth(0, 0);
		
		assertEquals(110, p1.getX());
		assertEquals(70, p2.getY());
		assertEquals(20, p3.getX());
		assertEquals(20, p3.getY());
		
	}
	
	//	test setBorder that sets a max and min x and y values
	@Test
	public void testSetBorder() {
		
		// set border of p1 and p2
		p1.setBorder(5, 5, 5, 5);
		p2.setBorder(1, 1, 1, 1);
		
		assertEquals(5, p1.getX());
		assertEquals(5, p1.getY());
		assertEquals(1, p2.getX());
		assertEquals(1, p2.getY());
		
		
	}
	
	//	test checker helper method that makes sure values don’t exceed the border amount
	@Test
	public void testChecker() {
		
		// set border for checking checker() method
		p1.setBorder(5, 5, 5, 5);
		p2.setBorder(1, 1, 1, 1);
		
		// add amount on p1 and p2
		p1.moveHor(10000);
		p1.movVer(10000);
		p2.moveHor(10000);
		p2.movVer(10000);
		
		
		// check if x, y value is still in the border
		
		assertEquals(5, p1.getX());
		assertEquals(5, p1.getY());
		assertEquals(1, p2.getX());
		assertEquals(1, p2.getY());
		
	}
	
}
