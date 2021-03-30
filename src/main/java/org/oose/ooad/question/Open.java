package org.oose.ooad.question;

import java.util.ArrayList;

public class Open extends Question {

    private ArrayList<String> answers;

    @Override
    public boolean compareAnswer(String ans) {
        for ( String answer : answers ) {
            if ( ans.equals(answer) ) {
                return true;
            }
        }
        return false;
    }
    
}
