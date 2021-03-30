package org.oose.ooad.question;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleChoice extends Question {
    private ArrayList<Field> fields;

    private List<Field> getCorrectFields() {
        return this.fields.stream().filter( field -> field.getCorrect() ).collect(Collectors.toList());
    }

    @Override
    public boolean compareAnswer(String ans) {

        for ( Field field : this.getCorrectFields() ) {
            if ( ans.equals(field.getValue()) )
                return true;
        }

        return false;
    }
}
