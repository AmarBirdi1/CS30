package HighGrade;

import java.util.ArrayList;

// Make HighestGrade application that prompts the user for five grades between 0 and 100 points and stores the grades in an ArrayList. 
// HighestGrade than traverses the grades to determine the highest grade to determine the highest grade and then displays the 
// grade along with an appropiate message


import java.util.Scanner;
public class HighestGrade {
private static final String A = null;

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int numStudents;
    int[] scores;
    int best;

    System.out.println("Enter the number of students:  ");
    numStudents = input.nextInt();
    scores = new int[numStudents];

    System.out.println("Enter " + numStudents + " scores:  ");
    for (int i = 0; i < numStudents; i++) {
        scores[i] = input.nextInt();
    }

    displayGrades(findBestScore(scores), scores);
}

{
	
ArrayList<Integer> Grades = new ArrayList<Integer>();
Grades.add(1);

Grades.add(2);

Grades.add(3);

Grades.add(4);

Grades.add(5);

}

public static int findBestScore(int[] scores) {
    int best = scores[0];
    for (int i = 1; i < scores.length-1; i++) {
        if (scores[i] > best) 
            best = scores[i];
    }
    return best;
}

public static void displayGrades(int best, int[] scores ) {

    char grade = ' ';
    for (int i = 0; i < scores.length; i++) {
        if (scores[i] >= best-10)
            grade = 'A';
        else if (best - 10 > scores[i] && scores[i] >= best - 20)
            grade = 'B';
        else if (best - 20 > scores[i] && scores[i] >= best -30)
            grade = 'C';
        else if (best - 30 > scores[i] && scores[i] >= best -40)
            grade = 'D';
        else if (best - 40 > scores[i])
            grade = 'F';

        System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
    }
    
    {
    	
    String greatest = A;
	System.out.println("\nHighest grade is: A ");
    
    }
    
}}