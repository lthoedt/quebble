package org.oose.ooad.question;

import java.util.ArrayList;

public class Open extends Question {
    private ArrayList<String> answers;

    public Open(String question, Category category, char letter, ArrayList<String> answers) {
        super(question, category, letter);
        this.answers = answers;
    }

    @Override
    public boolean compareAnswer(String ans) {
        for ( String answer : this.answers ) {
            if ( ans.toLowerCase().equals(answer.toLowerCase()) ) {
                return true;
            }
        }
        return false;
    }
    
}
