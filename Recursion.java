import java.util.Scanner;

public class Recursion {

	String InputString; //input string is the string to reverse
	
	
	public static void main(String[] args) {
		System.out.println("Enter a string to reverse:");
		Scanner in_String = new Scanner(System.in);
		String InputString = in_String.nextLine();	//must use nextline and not next for strings with multiple words
		System.out.println("The string in reverse is " + ReverseString(InputString));	//call method reverse String

		
		System.out.println("Enter an integer:");
		Scanner in_Fact = new Scanner(System.in);
		int Fact = in_Fact.nextInt();
		System.out.println("The factorial of " + Fact + " is  " + Factorial(Fact));
		
		
		System.out.println("Enter an integer for Fibonacci sequence:");
		Scanner in_Fibo = new Scanner(System.in);
		int FiboNum = in_Fibo.nextInt();
		System.out.println("The " + FiboNum + "th Fibonacci number is " + CalcFibonacci(FiboNum));

		
		System.out.println("Enter a string:");
		Scanner String_in = new Scanner(System.in);
		String NewString = String_in.nextLine();	//must use nextline and not next for strings with multiple words
		System.out.println("Enter a word to find:");
		Scanner String_find = new Scanner(System.in);
		String SearchString = String_find.nextLine();	//must use nextline and not next for strings with multiple words
		System.out.println("Enter a word to replace with:");
		Scanner String_rep = new Scanner(System.in);
		String ReplaceString = String_rep.nextLine();	//must use nextline and not next for strings with multiple words
		
		//now send all the 3 new strings to the SearchReplace Function
		String FinalStr = SearchReplace(NewString,SearchString,ReplaceString);
		System.out.println(FinalStr);
			
		
		
	}	//end of method main
	
	
static String ReverseString(String Input) {
	
	String Reversed = new StringBuilder(Input).reverse().toString();
	return Reversed;
	
}//end of method reverse String

static int Factorial(int Fact) {
	int Factorial = 1;
	if (Fact == 0) {
		Factorial = 1;		//factorial of 0 is 1
	}	// end if statement
	else if (Fact > 0){
		for (int i=0; i< Fact; i++) {
			Factorial = Factorial * (Fact-i);  
		}	//end of for loop
	}	//end of else if
	return Factorial;
	}	//end of method factorial

static int CalcFibonacci(int FiboNum) {
	int N = 0;
	for (int n=2; n<FiboNum; n++) {
		N = ((n-1) + (n-2));   //general formula for Fibonacci is Xn = X(n-1) +X(n-2). where if we start the loop at n=2, then (n-1)=1 and (n-2) =0. which are the 1st and 2 nd numbers in the Fibonacci sequence 
		
	}//end for loop
	return N;
}	//end of CalcFibonacci method



static String SearchReplace(String Input, String SearchStr, String ReplaceStr) {
	String Output="";
	Output = Input.replaceAll(SearchStr, ReplaceStr);  //replaceALL will replace all occurencese of SearchStr with the ReplaceStr
	return Output;
}	//end of method Search

}	//end of class Recursion
