package com.kodnest.trick;
import java.util.Scanner;

public class SolveTheTrick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		sc.close();
		String reslut = res(str1, str2);
		System.out.println(reslut);
	}

	private static String res(String str1, String str2) {
		String str = "";
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch>='a' && ch<='z') {
				str = str + ch;
			}
		}
		for(int i=0; i<str2.length(); i++) {
			char ch = str2.charAt(i);
			if(ch>='a' && ch<='z') {
				str = str + ch;
			}
		}
		return str;		
	}
}