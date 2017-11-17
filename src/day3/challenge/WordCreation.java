package day3.challenge;

import java.util.Random;
import java.util.Scanner;

public class WordCreation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The Word from which the extraction happens
		System.out.print("Please Enter word or words : ");
		Scanner userInputWord = new Scanner(System.in);
		String S = userInputWord.nextLine();
		
		// The # of letters to be extracted from the word
		System.out.print("Please Enter a Number : ");
		Scanner userInput = new Scanner(System.in);
		int lengthOfNewWord = userInput.nextInt();
		
		// Define the output
		String output = new String();
		
		// Break down the User Input Words into an array of characters
		char[] arrayOfS = S.toCharArray();
		
		
		boolean isVowelPresent = false;
		char[] newWord = new char[lengthOfNewWord];
		
		do{
			for(int i = 1; i<=lengthOfNewWord; i++){
				Random a = new Random();
				char singleChar = arrayOfS[a.nextInt(S.length())];
				output = output + singleChar;
				
				if(singleChar == 'a' || singleChar == 'e' || singleChar == 'i' || singleChar == 'o' || singleChar == 'u'){
					isVowelPresent = true;
				}
			}
		}while(isVowelPresent == false);
		
		
		
		System.out.println("The Extracted letters from the String Value is : " + output);		

	}

}
