import java.util.Scanner;

class Student_Grade_Calculator {

    public static void main(String[] args) {
        System.out.println("This is helpful in finding Grade of the Student");

        int Maths_marks, Science_marks, Physics_marks, Chemistry_marks, Biology_marks, Computerscience_marks;
        int Total_marks;
        double average_percentage;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter mathematics marks out of 100: ");
        Maths_marks = sc.nextInt();
        System.out.print(" Enter mathematics marks out of 100: ");
        Science_marks = sc.nextInt();
        System.out.print(" Enter mathematics marks out of 100: ");
        Physics_marks = sc.nextInt();
        System.out.print(" Enter mathematics marks out of 100: ");
        Chemistry_marks = sc.nextInt();
        System.out.print(" Enter mathematics marks out of 100: ");
        Biology_marks = sc.nextInt();
        System.out.print(" Enter mathematics marks out of 100: ");
        Computerscience_marks = sc.nextInt();

        Total_marks = Maths_marks + Science_marks + Physics_marks + Chemistry_marks + Biology_marks
                + Computerscience_marks;
        System.out.println("The total marks is: " + Total_marks);

        average_percentage = Total_marks / 6;
        System.out.println("The average percentage is: " + average_percentage);

        if (Total_marks >= 570) {
            System.out.println("Grade A");
        } else if (Total_marks >= 470) {
            System.out.println("Grade B");
        } else if (Total_marks >= 425) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

    }
}