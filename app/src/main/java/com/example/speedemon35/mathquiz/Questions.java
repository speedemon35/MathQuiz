package com.example.speedemon35.mathquiz;

/** W.I.P
 * Created by Speedemon35 on 22-12-2017.


public class Questions {
    private String myQuestions[] = {
            "Random q1 ",
            "Random q2",
            "Random q3 ",
            "Random q4",
            "Random q5",
            "Random q6",
            "Random q7",
            "Random q8",
            "Random q9"
    };

    private String myChoices[][] = {
            {"0","1","2"},
            {"0","1","2"},
            {"0","1","2"},
            {"0", "1", "2"},
            {"0", "1", "2"},
            {"0","1","2"},
            {"0", "1","2" },
            {"0", "1", "2" },
            {"0", "1", "2"}
    };

    private String myCorrectAnswers[] = {"3","3","3","3", "3","3",
            "3","3","3"};

    public String getQuestion(int n){
        String question = myQuestions[n];
        return question;
    }

    public String getChoice1(int n){
        String choice0 = myChoices[n][0];
        return choice0;
    }

    public String getChoice2(int n){
        String choice1 = myChoices[n][1];
        return choice1;
    }

    public String getChoice3(int n){
        String choice2 = myChoices[n][2];
        return choice2;
    }

    public String getCorrectanswer(int n){
        String answer = myCorrectAnswers[n];
        return answer;
    }
}
 */