package org.oose.ooad.word;

import java.util.ArrayList;

public class WordManager {
    private ArrayList<Character> letters = new ArrayList<>();
    private String createdWord = "";
    private IWordControllerAdapter wordController = new LibraryAdapter();

    public void addLetter(char letter) {
        letters.add(letter);
    }

    public boolean makeWord( String w ) {
        boolean valid = wordController.checkWord( w );
        if (valid)
            this.createdWord = w;
        return valid;
    }

    public String getCreatedWord() {
        return this.createdWord;
    }
}
