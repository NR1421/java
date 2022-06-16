package corejava;

import java.util.Scanner;

public class QuizGames {
	
	public static int[] points = {2,3,2,3,5};
	public static String[] answers = {
			"LOTUS",
			"TIGER",
			"HOCKEY",
			"DELHI",
			"PEACOCK"
	};
	//creating static trivialMehtod which takes 2 String parameters
	public static int triviaMethod(String[] questions, String[] stt) {
		int point=0;
		for(int i=0;i<5;i++) {
			System.out.println(questions[i]);
			System.out.println(stt[i]);
			if(stt[i].toUpperCase().equals(answers[i])) {
				System.out.println("Correct!");
				point+=points[i];
				System.out.println("");
			}
			else {
				System.out.println("Wrong answer");
				System.out.println("");
			}
		}
		return point;			
	}
	//creating main method
	public static void main(String[] args) {
		/*Enter your code here. Read input from STDIN. Print output to STDOUT */ 
		int point;
		try (Scanner sc = new Scanner(System.in)) {
			String[] stt=new String[5];
			String[] questions = {
					"Question 1: What is the National Flower of INDIA?",
					"Question 2: What is the National Animal of INDIA?",
					"Question 3: What is the National Game of INDIA?",
					"Question 4: What is the capital of INDIA ?",
					"Question 5: What is the National Bird of INDIA ?",
					
			};
			
			for(int i=0;i<5;i++) {			
				System.out.println(questions[i]);
				stt[i]=sc.nextLine();			
			}
			point=triviaMethod(questions,stt);
		}
		System.out.println("Final score: "+point);
		
	}
}