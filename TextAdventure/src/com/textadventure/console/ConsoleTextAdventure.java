package com.textadventure.console;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Waaaaaaaaaa
public class ConsoleTextAdventure {

	String[] words = readArray("Level_0");	
	
	public ConsoleTextAdventure() {
		System.out.println(words[0]);
		Level_0();
	}
	
	public void Level_0() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String sa = s.next();
		//s.nextLine();
		//System.out.println(sa);
		//System.out.println(s.nextLine());
		if (sa.equals("1")) {
			System.out.println(words[1]);
		}
		
	}
	
	private static String[] readArray(String file) {
		//List<String> lines = new ArrayList<String> ();
		//String line == null;
	int ctr = 0;
	try {
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(new File(file));
		while (s1.hasNextLine()) {
			
			ctr = ctr + 1;
			s1.nextLine();
		}
		String[] words = new String[ctr];
				@SuppressWarnings("resource")
				Scanner s2 = new Scanner(new File(file));
		for (int i = 0; i < ctr; i = i + 1) {
			words[i] = s2.nextLine();
		}
		//System.out.println(words);
		return words;
	} catch (FileNotFoundException e) {
		
	}
	return null;
	}
	
	public static void main(String args[]) {
		@SuppressWarnings("unused")
		ConsoleTextAdventure cta = new ConsoleTextAdventure();
	}
	
}
