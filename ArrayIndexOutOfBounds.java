import java.util.*;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		int[] Array = new int[100];	
		
		try {
			for (int i=0; i<Array.length;i++) {
				Array[i] = new Random().nextInt(100);  //Random.nextInt converts the random number to int. the 10 in brackets, generates random numbers
			}//end of for loop
	
			System.out.println("Enter an index for the array element you would like to display:");
			Scanner In = new Scanner(System.in);
			int UserInput = In.nextInt();
		
			DisplayElement(Array, UserInput);
		}//end of try
		catch (RuntimeException IndexException) {
			System.out.println("Out of Bounds!");
		}	//end of catch
		
	}//end of method main
	
	public static void DisplayElement(int[] Array, int Index) throws RuntimeException {
		
		if (Index > Array.length) {
			throw new RuntimeException("Out of Bounds!");
		}	//end if
		
		System.out.println(Array[Index]);
	
	}//end of method DisplayElement

}	//end of class ArrayIndexOutofBounds.
