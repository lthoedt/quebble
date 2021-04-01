package org.oose.ooad.word;

import me.shib.java.lib.diction.*;

public class LibraryAdapter implements IWordControllerAdapter {

    private DictionService ds = new DictionService();

    @Override
    public boolean checkWord(String w) {
        return this.ds.getDictionWord(w) != null;
    }
    
}
