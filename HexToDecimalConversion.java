import java . util . Scanner ;

public class HexToDecimalConversion {

	public static void main ( String [] args ) {
		
		try {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a string
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		}//end of try
		
		catch (NumberFormatException NumFrmtEx) {
			System.out.println("Number is not a hex number");
		}//end of catch
		
	}	//end of method main
	
	public static int hexToDecimal (String hex) throws NumberFormatException {
		int decimalValue = 0 ;
		//the hex.matches below checks whethter or not the string hex mathces the string class in the parentheses. [\\d[A-Fa-f] - the \\d check for any digit[0-9] and "A-Fa-f" checks for a through z or A through Z, inclusive (range)
		if (hex.matches("[\\dA-Fa-f]+")) { 
			for ( int i = 0 ; i < hex.length(); i ++) {
				char hexChar = hex.charAt(i);
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}//end for loop
		return decimalValue ;	
		}//end if 
		else 
			throw new NumberFormatException("Number is not a hex number");
		}	//end of method hexToDecimal
	
	
	public static int hexCharToDecimal (char ch) {
		if ( ch >= 'A' && ch <= 'F' )
			return 10 + ch - 'A' ;
		else // ch is '0', '1', ..., or '9'
			return ch - '0' ;
		}	//end of method hexCharToDecimal
	
	
}//end of class HexToDecimalConversion