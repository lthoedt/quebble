package org.oose.ooad.question;

public abstract class Question {
    private String question;

    private Category category;

    public abstract boolean compareAnswer( String ans );
}
