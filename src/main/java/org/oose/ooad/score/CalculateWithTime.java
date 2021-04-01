package org.oose.ooad.score;

public class CalculateWithTime implements IScoreCalculator {

    @Override
    public int calculateScore(int correctAnswers, String createdWord, int time) {

        float time_max_score = 80f;
        float time_maximum_scope = 160f;

        int score = 0;
        score += correctAnswers * 5;
        score += createdWord.length() * 10;
        score += (int) Math.round( 1f / (Math.pow(time_maximum_scope, 2f) / time_max_score) * Math.pow(( (time/1000f) - time_maximum_scope ), 2f) );

        return score;
    }
    
}
