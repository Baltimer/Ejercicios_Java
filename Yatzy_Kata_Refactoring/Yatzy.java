package org.foogbarspam.Yatzy.tirada;

public class Yatzy {
	protected int[] dice;
	
	public Yatzy(int d1, int d2, int d3, int d4, int d5){
		dice = new int[5];
		dice[0] = d1;
		dice[1] = d2;
		dice[2] = d3;
		dice[3] = d4;
		dice[4] = d5;
	}
	
	public static int chance(int d1, int d2, int d3, int d4, int d5) {
		int total = 0;
		total += d1;
		total += d2;
		total += d3;
		total += d4;
		total += d5;
		return total;
	}
	
	public static int YatzyScore(int...dice){
		for (int die : dice){
			if(die != dice[1]){
				return 0;
			}
		}
		return 50;
	}
	
	public static int ones(int...dice){
		int score = 0;
		for (int die : dice){
			if (die == 1){
				score += die;
			}
		}
		return score;
	}
	
	public static int twos(int...dice){
		int score = 0;
		for (int die : dice){
			if (die == 2){
				score += die;
			}
		}
		return score;
	}
	
	public static int threes(int...dice){
		int score = 0;
		for (int die : dice){
			if (die == 3){
				score += die;
			}
		}
		return score;
	}
	
	public int fours(){
		int score = 0;
		for (int die : dice){
			if (die == 4){
				score += die;
			}
		}
		return score;
	}
	
	public int fives(){
		int score = 0;
		for (int die : dice){
			if (die == 5){
				score += die;
			}
		}
		return score;
	}
	
	public int sixs(){
		int score = 0;
		for (int die : dice){
			if (die == 6){
				score += die;
			}
		}
		return score;
	}
	
	
}








