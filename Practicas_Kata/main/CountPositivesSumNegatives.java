package main;

public class CountPositivesSumNegatives {
	
	public static int[] countPositivesSumNegatives(int[] input){
		int[] count = new int[2];
		if (input == null || input.length == 0){
			return new int[0];
		}
		for (int i = 0; i < input.length; i++){
			if (input[i] > 0){
				count[0] += 1;
			} else {
				count[1] += input[i];
			}
		}
		return (input.length != 0) ? count : input;
	}
}