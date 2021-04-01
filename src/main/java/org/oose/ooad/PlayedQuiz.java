package org.oose.ooad;

import java.util.ArrayList;

import org.oose.ooad.score.CalculateWithTime;
import org.oose.ooad.score.IScoreCalculator;
import org.oose.ooad.word.WordManager;

public class PlayedQuiz {
    private Timer timer = new Timer();
    private int time = 0;
    private IScoreCalculator calculationStrategy;
    private WordManager word = new WordManager();
    private int score = 0;
    private ArrayList<GivenAnswer> givenAnswers = new ArrayList<>();
    private Quiz quiz;

    public PlayedQuiz () {
        this.quiz = this.getRandomQuiz();
    }

    public int decideScore() {
        int correctAnswers = 0;
        String createdWord = this.word.getCreatedWord();
        for ( GivenAnswer ga : givenAnswers ) {
            if ( ga.getCorrect() )
                correctAnswers++;
        }
        return this.calculationStrategy.calculateScore(correctAnswers, createdWord, this.time);
    }

    public void setCalculationStrategy( IScoreCalculator calculationStrategy ) {
        this.calculationStrategy = calculationStrategy;
    }

    public boolean answerQuestion( String ans ) {
        this.time += this.timer.stop();
        
        // als antwoor dop
        this.addAnswer(ans);

        // check of antwoord correct is
        boolean answerIsCorrect = this.quiz.compareAnswer(ans);

        // keur het antwoord
        this.givenAnswers.get( this.quiz.getQuestionIndex() ).setCorrect(answerIsCorrect);

        if ( answerIsCorrect ) {
            // voeg een letter toe
            this.word.addLetter( this.quiz.getCurrentQuestion().getLetter() );
        }

        return answerIsCorrect;
    }

    private void addAnswer(String ans) {
        givenAnswers.add( new GivenAnswer(ans) );
    }
    
    public int makeWord( String w ) {
        boolean valid = word.makeWord( w );
        this.calculationStrategy = new CalculateWithTime();
        return decideScore();
    }

    private Quiz getRandomQuiz() {
        return new Quiz();
    }

    public String getNextQuestion() throws IndexOutOfBoundsException {
        this.timer.start();
        return this.quiz.getNextQuestion().getQuestion();
    }
}
