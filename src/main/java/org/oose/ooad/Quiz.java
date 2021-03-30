package org.oose.ooad;

import java.util.ArrayList;

import org.oose.ooad.question.Question;

public class Quiz {
    private int questionIndex = -1;
    private ArrayList<Question> questions;

    public int getQuestionIndex () {
        return this.questionIndex;
    }

    public Question getNextQuestion() {
        this.questionIndex++;
        return this.getCurrentQuestion();
    }

    public Question getCurrentQuestion() {
        return this.questions.get(questionIndex);        
    }

    public boolean compareAnswer( String ans ) {
        return this.getCurrentQuestion().compareAnswer( ans );
    }
}
