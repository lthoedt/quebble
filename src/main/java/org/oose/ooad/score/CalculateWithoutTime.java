package org.oose.ooad.score;

public class CalculateWithoutTime implements IScoreCalculator {

    @Override
    public int calculateScore(int correctAnswers, String createdWord, int time) {
        int score = 0;
        score += correctAnswers * 10;
        score += createdWord.length() * 15;

        return score;
    }
    
}
