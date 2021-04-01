package org.oose.ooad.question;

public abstract class Question {
    protected String question;

    private Category category;

    public Question(String question, Category category) {
        this.question = question;
        this.category = category;
    }

    public abstract boolean compareAnswer( String ans );

    public String getQuestion() {
        return this.question;
    }
}
