public class Main {

    // Question 1 - calculateGrade
    public static String calculateGrade(int grade) {
       if (grade >= 90) {
        return "A";
     }
        else if (grade >= 80) {
        return "B";
    }
        else if (grade >= 70) {
           return "C";
       }
       else if (grade >= 60) {
           return "D";
       }
       else if (grade >= 50) {
           return "E";
       }
       else {
           return "F";
       }
}

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int input){
        int divisibleThree = input % 3;
        int divisibleFive = input % 5;
        if (divisibleThree == 0) if (divisibleFive == 0) {
            if (divisibleFive == 0) {
                return "fizzbuzz";
            } else if (divisibleThree == 0) {
                return "fizz";
            } else if (divisibleFive == 0) {
                return "buzz";
            } else
                return "unlucky";

        }
        return "";
    }
    // Question 3 - frontBack

    // Question 4 - twoAsOne

    // Question 5 - endUp


}
