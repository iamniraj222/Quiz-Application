package com.nirajkchaudhary.quizapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Quiz q = new Quiz();
		q.logic();
	}

}

class Quiz {
	Scanner sc = new Scanner(System.in);
	int correctAnsCount = 0;
	int wrongAnsCount = 0;
	public void logic() {
		Questions q1 = new Questions("1) Number of primitive data types in Java are?", "A. 8", "B. 7", "C. 6", "D. 9");
		Questions q2 = new Questions("2) Which of the following is not a Java features?", "A. Dynamic", "B. Architecture Neutral", "C. Use of pointers", "D. Object-oriented");
		Questions q3 = new Questions("3) Which keyword is used for accessing the features of a package?", "A. package", "B. import", "C. extends", "D. export");
		Questions q4 = new Questions("4) JDK stands for ____.", "A. Java development kit", "B. Java deployment kit", "C. JavaScript deployment kit", "D. None of these");
		Questions q5 = new Questions("5) Which of these is a type of variable in Java?", "A. Instance Variable", "B. Local Variable", "C. Static Variable", "D. All of these");

		Map<Questions, Character> hmap = new HashMap<>();
		hmap.put(q1, 'A');
		hmap.put(q2, 'C');
		hmap.put(q3, 'B');
		hmap.put(q4, 'A');
		hmap.put(q5, 'D');
		
		for(Map.Entry<Questions, Character> map:hmap.entrySet()) {
			System.out.println(map.getKey().getQuestions());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			
			System.out.print("choose the correct option: ");
			Character ans = sc.next().charAt(0);
			
			int cans = Character.compare(ans,map.getValue());
			if(cans == 0) {
				System.out.println("Correct.");
				correctAnsCount++;
			}
			else {
				System.out.println("Wrong.");
				wrongAnsCount++;
			}
			
			
		}
		System.out.println();
		System.out.println("========Result=========");
		System.out.println("Total Questions: " + hmap.size());
		System.out.println("Correct Answered Questions: " + correctAnsCount);
		System.out.println("Wrong Answered Questions: " + wrongAnsCount);
		System.out.println("Percentage Scored: " + (100*correctAnsCount)/hmap.size());
	}
}
