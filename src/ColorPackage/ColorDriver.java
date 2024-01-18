package ColorPackage;

/**
 * Name: Xuedinan Gao
 * Date: 1/15/2024
 * 
 * This is a Driver class for Color class.
 */

public class ColorDriver {

/** Calling all test method and see if there is any error messages pop up.
 * 
 * @param args command line arguments.
 */

	public static void main(String[] args) {
		
		
		// create a color test objective for testing
		
		ColorTests ct = new ColorTests();
		
		// calling each testing function and check if any error pop up
		
		ct.gettersAndSetters();
		ct.testNoArgConstructor();
		ct.testAllArgConstructor();
		ct.valueBorderTest();
		ct.colorTestValidAndInvalid();
		ct.colorTestcombineColor();
		ct.colorTestTests();
		ct.colorTestPrintOut();
		
		// inform user all testing is completed
		
		System.out.println("Completed all testing case for Class Person and Book. \n"); // inform user test completed
		
		
	}

}
