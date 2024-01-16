package ColorPackage;

public class Color {

	private int rValue;
	private int gValue;
	private int bValue;
	
	
	
	public Color() {

	}

	public Color(int rValue, int gValue, int bValue) {
		this.rValue = rValue;
		this.gValue = gValue;
		this.bValue = bValue;
	}

	private int checkValue(int value) {
		
		if(value > 255) {
			value = 255;
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

	public int getrValue() {
		return rValue;
	}
	public void setrValue(int rValue) {
		this.rValue = checkValue(rValue);
	}
	public int getgValue() {
		return gValue;
	}
	public void setgValue(int gValue) {
		this.gValue = checkValue(gValue);
	}
	public int getbValue() {
		return bValue;
	}
	public void setbValue(int bValue) {
		this.bValue = checkValue(bValue);
	}

}
