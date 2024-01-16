package ColorPackage;

/**
 * Name: Xuedinan Gao
 * Date: 1/15/2024
 * 
 * This class represent the combination of color with value of red, green and blue.
 * 
 */


public class Color {

	private int rValue;
	private int gValue;
	private int bValue;
	
/**
 * construct a color with no-argument and all-argument.
 * 	 
 * @param rValue the value of red color.
 * @param gValue the value of green color.
 * @param bValue the value of blue color.
 * 
 */
	public Color() {
	}
	
	public Color(int rValue, int gValue, int bValue) {
		this.rValue = setrValue(rValue);
		this.gValue = setgValue(gValue);
		this.bValue = setbValue(bValue);
	}
	
 /**
  * check the given value of color.
  * 
  * @param value given value for checking.
  * @return value set value to 255 if greater than 255 or set value to 0 if value less than 0.
  */	
	
	// value check method, make sure value is greater than 0 and less than 255
	private int checkValue(int value) {
		
		if(value > 255) {
			value = 0;
			return value;
		}
		else if(value < 0) {
			value = 0;
			return value;
		}
		else {
			return value;
		}
	}

	
 /**
  * Return the red value of this color.
  *
  * @return the rValue of this color.
  */
	
	public int getrValue() {
		return rValue;
	}
	
 /**
  * set the red value of this color.
  *
  * make sure color is in the range of < 255 and > 0 by calling checkColor method.
  */
	
	public int setrValue(int rValue) {
		 return this.rValue = checkValue(rValue);
	}
	
 /**
  * Return the green value of this color.
  *
  * @return the gValue of this color.
  */
		
	public int getgValue() {
		return gValue;
	}

 /**
  * set the green value of this color.
  *
  * make sure color is in the range of < 255 and > 0 by calling checkColor method
  */
	
	public int setgValue(int gValue) {
		return this.gValue = checkValue(gValue);
	}
	
 /**
  * Return the blue value of this color.
  *
  * @return the bValue of this color.
  */
	
	public int getbValue() {
		return bValue;
	}

 /**
  * set the blue value of this color.
  *
  * make sure color is in the range of < 255 and > 0 by calling checkColor method.
  */
	
	public int setbValue(int bValue) {
		return this.bValue = checkValue(bValue);
	}

	// method to print out color values
	
 /**
  * print out value of color.
  * @return rValue, gValue, bValue red, green and blue value of color.
  *
  */
	@Override
	public String toString() {
		return rValue + "," + gValue + "," + bValue;
	}
	
	// methods to test if color is black or white

 /**
  * check if it's black color with red 0, green 0 and blue 0
  * 
  * @return true if color is black
  * @return false if color is not black
  */	
	
	public boolean isBlack() {
		if(rValue == 0 && gValue == 0 && bValue == 0) {
			return true;
		}
		else {
			return false;
		}
	}

 /**
  * check if it's white color with red 255, green 255 and blue 255.
  * 
  * @return true if color is white.
  * @return false if color is not white.
  */	
	
	public boolean isWhite() {
		if(rValue == 255 && gValue == 255 && bValue == 255) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
 /**
  * combine given color value to objective value, adjust combine result to 0 if value go over 255.
  * 
  * @return NewrValue, NewgValue, NewbValue the combined color with adjustment.
  * 
  */
	
	public void combineColor(int rValueSent, int gValueSent, int bValueSent) {
		
		int NewrValue = rValueSent + rValue;
		int NewgValue = gValueSent + gValue;
		int NewbValue = bValueSent + bValue;
		
		
		if(NewrValue > 255) {
			NewrValue = 0;
		}
		if(NewgValue > 255) {
			NewgValue = 0;
		}
		if(NewbValue > 255) {
			NewbValue = 0;
		}
		
		rValue = NewrValue;
    	gValue = NewgValue;
    	bValue = NewbValue;
	}
}
