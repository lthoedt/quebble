package org.oose.ooad;

public class GivenAnswer {
    private String value;
    private boolean correct;

    public GivenAnswer( String value ) {
        this.value = value;
    }

    public boolean getCorrect() {
        return this.correct;
    }

    public void setCorrect( boolean correct ) {
        this.correct = correct;
    }
}
