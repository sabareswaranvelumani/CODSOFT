import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
    
        int numberOfSubjects = 5; 


        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;

        
        System.out.println("Enter marks out of 100 for " + numberOfSubjects + " subjects:");

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i]; 
        }

        
        double averagePercentage = (double) totalMarks / (numberOfSubjects * 100) * 100;

        
        
        if (averagePercentage >= 90) {
             System.out.println("Grade: A+");
        } else if (averagePercentage >= 85) {
         System.out.println("Grade: A");

        } else if (averagePercentage >= 75) {
            System.out.println("Grade: B+");
        } else if (averagePercentage >= 65) {
          System.out.println("Grade: B");

        } else if (averagePercentage >= 55) {
            System.out.println("Grade: C");

        } else {
         System.out.println("Grade: F");

        }

        System.out.println("Total Marks: " + totalMarks + " out of " + (numberOfSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage );


        
        scanner.close();
    }
}
