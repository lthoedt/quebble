package org.oose.ooad.question;

public abstract class Question {
    protected String question;

    private Category category;

    protected char letter;

    public Question(String question, Category category, char letter) {
        this.question = question;
        this.category = category;
        this.letter = letter;
    }

    public abstract boolean compareAnswer( String ans );

    public String getQuestion() {
        return this.question;
    }

    public char getLetter() {
        return this.letter;
    }
}
