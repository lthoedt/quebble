package org.oose.ooad.word;

import java.util.ArrayList;

public class WordManager {
    private ArrayList<Character> letters;
    private String createdWord;
    private IWordControllerAdapter wordController;

    public void addLetter(char letter) {
        letters.add(letter);
    }

    public boolean makeWord( String w ) {
        this.createdWord = w;
        return wordController.checkWord( w );
    }
}
