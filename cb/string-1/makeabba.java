public class makeabba {
	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public static void main( String[] args) {
	System.out.println(makeAbba("Hi", "Bye")); //"HiByeByeHi"	"HiByeByeHi"	 	
	System.out.println(makeAbba("Yo", "Alice")); //"YoAliceAliceYo"	"YoAliceAliceYo"	 	
	System.out.println(makeAbba("What", "Up")); //"WhatUpUpWhat"	"WhatUpUpWhat"	 	
	System.out.println(makeAbba("aaa", "bbb")); //"aaabbbbbbaaa"	"aaabbbbbbaaa"	 	
	System.out.println(makeAbba("x", "y")); //"xyyx"	"xyyx"	 	
	System.out.println(makeAbba("x", "")); //"xx"	"xx"	 	
	System.out.println(makeAbba("", "y")); //"yy"	"yy"	 	
	System.out.println(makeAbba("Bo", "Ya")); //"BoYaYaBo"	"BoYaYaBo"	 	
	System.out.println(makeAbba("Ya", "Ya"));
	}
}
