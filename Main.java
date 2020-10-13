/**
 * a method named firstDigit that returns the first digit of an integer.
 * @author Ahmad Zeshan 
 */
public class Main {

	public static int firstDigit(int num){
		// repeat as long as num is 2 or more digits
    while (num > 10 || num < -10){
      // keep dividing num by 10
      num = num/10;
    }
    // this will return the first digit to the screen
    return num;
	}
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int finalAnswer = firstDigit(-643456);
		System.out.println(finalAnswer);
    
  }
}
