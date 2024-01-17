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
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
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
		this.x = incremental + this.x;
	}
	
	// method to decrease value on x
	public void moveHorReverse(int decremental) {
		this.x = this.x - decremental;
	}
	
	// method to add value on y
	public void movVer(int incremental) {
		this.y = incremental + this.y;
	}
	
	// method to decrease value on y
	public void movVerReverse(int decremental) {
		this.y = this.y - decremental;
	}	
	
	// add x and y value at the same time
	public void movMeth(int xIncrease, int yIncrease) {
		moveHor(xIncrease);
		movVer(yIncrease);
	}
	
	public void setBorder(int xMax, int yMax, int xMin, int yMin) {
		if(this.x > xMax) {
			this.x = xMax;
		}
		if(this.y > yMax) {
			this.y = yMax;
		}
		if(this.x < xMin) {
			this.x = xMin;
		}
		if(this.y < yMin) {
			this.y = yMin;
		}
	}
	
	public void checker(int value) {

	}
	
}
