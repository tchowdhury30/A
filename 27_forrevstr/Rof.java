/*
Emily Ortiz + Applesauce, Tasnim Chowdhury + Mary, Eric He
APCS
HW27 -- FOR the Love of Strings
2021-10-28
time spent: .5 hours
DISCO
- counter maintenance built in for loop but not in while
- to get one character in a string in the xth position, do "string".substring(x, x + 1)
QCC
- When is a for loop and while loop appropriate?
*/

public class Rof{
	public static void main(String args[]){
		System.out.println("\nfenceF Tests:");
		System.out.println(fenceF(0));
		System.out.println(fenceF(1));
		System.out.println(fenceF(2));
		System.out.println(fenceF(4));
		System.out.println(fenceF(8));

		System.out.println("\nreverseF Tests:");
		System.out.println("Should be stressed: " + reverseF("desserts"));
		System.out.println("Should be desserts: " + reverseF("stressed"));

		System.out.println("\nreverseR Tests:");
		System.out.println("Should be stressed: " + reverseR("desserts"));
		System.out.println("Should be desserts: " + reverseR("stressed"));
	}

	public static String fenceF(int n){
		String f = "|";
		for (int i = 1; i < n; i++){
			f = f + "--|";
		}
		return f;
	}

	public static String reverseF(String s){
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--){
			r = r + s.substring(i, i + 1);
		}
		return r;
	}

	public static String reverseR(String s){
		if (s.length() < 2){
			return s;
		} else {
			return reverseR(s.substring(1)) + s.substring(0, 0 + 1);
		}
	}
}
