package org.oose.ooad;

public class User {
    private int credits = 1000;
    private PlayedQuiz pq;

    public void playQuiz() {
        this.substractCredits(40);
        this.pq = new PlayedQuiz();
    }

    public void substractCredits(int amount) {
        this.credits -= amount;
    }

    public void addCredits(int amount) {
        this.credits += amount;
    }

    public boolean answerQuestion(String ans) {
        return this.pq.answerQuestion(ans);
    }

    public boolean makeWord(String word) {
        return this.pq.makeWord(word);
    }
}
