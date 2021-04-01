package org.oose.ooad.question;

public class Field {
    private String key;
    private String value;
    private boolean correct;

    public Field( String key, String value, boolean correct ) {
        this.key = key;
        this.value = value;
        this.correct = correct;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public boolean getCorrect() {
        return this.correct;
    }
}
