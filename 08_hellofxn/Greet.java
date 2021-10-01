/*
Tasnim Chowdhury
APCS
HW08: Refactor Freshie Zero
2021-09-30
*/

/**
DISCOVERIES
I don't need to add print method before greet().

UNRESOLVED QUESTIONS
What does main and what does class do?
What is "System.out...?"

*/

public class Greet {
	public static void main (String [] args) {
		greet("Tasnim");
		greet("Faiza");
		greet("Diana");
	}

	public static void greet(String name) {
		System.out.println("Hi " + name + ", what's up??" );
	}
}
