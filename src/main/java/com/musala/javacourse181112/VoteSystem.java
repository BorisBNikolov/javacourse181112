package com.musala.javacourse181112;

// clean
public class VoteSystem {
    public static void main(final String[] args) {
        System.out.println("Welcome to Vote System");
        final String[][] dataArray = new String[2][30];
        int questionsCount, votesCount;

        for (questionsCount = 0; questionsCount < dataArray.length; questionsCount++) {
            System.out.println("Please Answer to the Question" + (questionsCount + 1));

            for (votesCount = 0; votesCount < 30; votesCount++) {
                if (votesCount % 2 == 0) { // could be using ternary operator
                    dataArray[questionsCount][votesCount] = "Yes";
                } else {
                    dataArray[questionsCount][votesCount] = "No";
                }
                System.out.println("Person: " + (votesCount + 1) + " Voted for: "
                        + dataArray[questionsCount][votesCount] + " on question: " + (questionsCount + 1));
            }
        }
    }
}
