package com.harmonicnumber;

import com.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number to check the harmonic number:");
		int number = utility.getIntValue();
		utility.getHarmonicNumber(number);
	}

}
