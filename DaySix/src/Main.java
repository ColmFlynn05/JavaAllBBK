import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        studentGrades();
    }
    public static void studentGrades() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int numStudents =0;
        int numFail = 0;
        int numPass =0;
        int numMerit = 0;
        int numDistinction = 0;
        int numErrors = 0;
        do {
            System.out.println("Enter grades -1 to end");
            input = scanner.nextInt();
            numStudents++;
            if(input<0 || input>100){
                numErrors++;
            }
            else if(input < 40){
                numFail++;
            }
            else if(input < 60){
                numPass++;
            }
            else if(input < 80){
                numMerit++;
            }
            else{
                numDistinction++;
            }

        }
        while (input != -1);
        System.out.println("Number of Students " + (numStudents-numErrors) + ". Number of Fails " + numFail + ". Number of Passes " + numPass + ". Number of merits " + numMerit + ". Number of distinctions " + numDistinction);
        System.out.println("errors encountered "+ numErrors);
    }
}