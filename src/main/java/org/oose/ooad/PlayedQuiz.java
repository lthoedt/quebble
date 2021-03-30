package org.oose.ooad;

import java.util.ArrayList;

import org.oose.ooad.score.IScoreCalculator;
import org.oose.ooad.word.WordManager;

public class PlayedQuiz {
    private int time;
    private IScoreCalculator calculationStrategy;
    private WordManager word = new WordManager();
    private int score = 0;
    private ArrayList<GivenAnswer> givenAnswers;
    private Quiz quiz;

    public PlayedQuiz () {
        this.quiz = this.getRandomQuiz();
    }

    public void decideScore() {

    }

    public boolean answerQuestion( String ans ) {
        // als antwoor dop
        this.addAnswer(ans);

        // check of antwoord correct is
        boolean answerIsCorrect = this.quiz.compareAnswer(ans);

        // keur het antwoord
        this.givenAnswers.get( this.quiz.getQuestionIndex() ).setCorrect(answerIsCorrect);

        if ( answerIsCorrect ) {
            // voeg een letter toe
            this.word.addLetter( ans.charAt(0) );
        }

        return answerIsCorrect;
    }

    private void addAnswer(String ans) {
        givenAnswers.add( new GivenAnswer(ans) );
    }
    
    public boolean makeWord( String w ) {
        return word.makeWord( w );
    }

    private Quiz getRandomQuiz() {
        return new Quiz();
    }
}
