package learning_java;

public class Lab006_TernaryOperator {
    public static void main (String args[]){
        /*
    Write a program that calculates and displays the letter grade for a given
    numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59

     */
        int marks = 5;
        String score = (marks <= 59) ? "F" : (marks < 70 && marks > 59 ) ? "D" :
                (marks < 80 && marks > 69 ) ? "C" : (marks < 90 && marks > 79 ) ? "B" :
                        (marks <= 100 && marks > 89 ) ? "A" : "Input not valide";
        System.out.println(score);
        if(marks <= 100 && marks >= 90 )
            System.out.println("Grade A");
        else if (marks <= 89 && marks >= 80 )
            System.out.println("Grade B");
        else if(marks < 80 && marks > 69 )
            System.out.println("Grade C");
        else if (marks < 70 && marks > 59 )
            System.out.println("Grade D");
        else if(marks <= 59 )
            System.out.println("Grade F");
        else
            System.out.println("Number is not valid");



        //Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
        int a=10,b=25,c=15;
        int largestNumber = (a>=b && a>=c) ? a : (b>=a && b>=c) ? b : c;
        System.out.println(largestNumber);
    }

}
