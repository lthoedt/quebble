package org.oose.ooad.question;

import java.util.ArrayList;

public class Open extends Question {
    private ArrayList<String> answers;

    public Open(String question, Category category, ArrayList<String> answers) {
        super(question, category);
        this.answers = answers;
    }

    @Override
    public boolean compareAnswer(String ans) {
        for ( String answer : this.answers ) {
            if ( ans.equals(answer) ) {
                return true;
            }
        }
        return false;
    }
    
}
