package PixelPackage;
import java.lang.reflect.Array;

import ColorPackage.Color;

/**
 * Name: Xuedinan Gao
 * Assignment: CS5004 Lab01
 * Date: 01/16/2024
 * 
 * This class represent the Pixel with value x, y and color.
 * 
 */

public class Pixel {
	
	private int x;
	private int y;
	private Color color = new Color(); //default value of color is (0,0,0)

/**
 * construct a Pixel with no-argument, two argument and all-argument.
 * 	 
 * @param x the horizontal value of coordinate.
 * @param y the vertical value of coordinate.
 * @param color the RGB value of color.
 * 
 */	
	
	public Pixel() {
	}

	public Pixel(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Pixel(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	
	//setters and getters
	
	public int getX() {
		return checker(x, 'x');
	}

	public void setX(int x) {
		this.x = checker(x, 'x');
	}

	public int getY() {
		return checker(y, 'y');
	}

	public void setY(int y) {
		this.y = checker(y, 'x');
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	// method print out value of x, y, red color, green color, blue color
	public String printPixel() {
		System.out.println(x + "," + y + "," + color.getrValue() + "," + color.getgValue() + "," + color.getbValue());
		return x + "," + y + "," + color.getrValue() + "," + color.getgValue() + "," + color.getbValue();

	}
	
	// method to add value on x
	public void moveHor(int incremental) {
		int result = incremental + this.x;
		this.x = checker(result, 'x');
	}
	
	// method to decrease value on x
	public void moveHorReverse(int decremental) {
		int result = this.x - decremental;
		this.x = checker(result, 'x');
	}
	
	// method to add value on y
	public void movVer(int incremental) {
		int result = incremental + this.y;
		this.y = checker(result, 'y');
	}
	
	// method to decrease value on y
	public void movVerReverse(int decremental) {
		int result = this.y - decremental;
		this.y = checker(result, 'y');
	}	
	
	// add x and y value at the same time
	public void movMeth(int xIncrease, int yIncrease) {
		moveHor(xIncrease);
		movVer(yIncrease);
	}

	
	// set max and min values of x and y, default is infinity number to cover the case that there is no border input

	public int xMax = 999999999;
	public int xMin = -99999999;
	public int yMax = 999999999;
	public int yMin = -99999999;
	
	
	// get border values for x and y
	
	public void setBorder(int xSetMax, int ySetMax, int xSetMin, int ySetMin) {
		
		xMax = xSetMax;
		xMin = xSetMin;
		
		yMax = ySetMax;
		yMin = ySetMin;
	}
	
	// checker method to make sure value is in the border range
	
	public int checker(int value, char axis) {
		
		switch(axis){
		
		case 'x':
			if(value > xMax) {
				return xMax;
			}
			if(value < xMin) {
				return xMin;
			}
			else{
				return value;}
			
		case 'y':
			if(value > yMax) {
				return yMax;
			}
			if(value < yMin) {
				return yMin;
			} 
			else {
				return value;}
		}
		
		return -99999999;

	}

}
