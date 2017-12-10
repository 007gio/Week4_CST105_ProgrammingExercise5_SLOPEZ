/**Program: 2D array
*File: Exercise.java
*Summary:Write a program that reads text from a file.  Creating a 2D character array.
*Author: Sergio M. Lopez
*Date: December 3, 2017
**/
package com.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise {
	public static void main(String[] exercise) throws IOException {
		String fileName = "input.txt";//name of the input file to be used
		FileReader reader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String input = "";
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			input = input + line;
		}
		bufferedReader.close();
		
		int rows = 20; //variables
		int cols = 45;
		char[][] array2d = new char[rows][cols]; //allocating space

		int count = 0;
		
		
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < cols; j++) {
				if (count == input.length()) { //input string exhausted
					array2d[i][j] = '@';
				}
				else { //input string not exhausted
					array2d[i][j] = input.charAt(count);
					count++;
				}	
			}
		}
		for (int i = 0; i < cols; i++) { //e
			for (int j = 0; j < rows; j++) {
				System.out.print(array2d[j][i]);
			}
		}
		System.out.println();
	}

}
