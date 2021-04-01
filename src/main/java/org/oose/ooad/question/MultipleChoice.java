package org.oose.ooad.question;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleChoice extends Question {
    private ArrayList<Field> fields;

    public MultipleChoice(String question, Category category, char letter, ArrayList<Field> fields) {
        super(question, category, letter);
        this.fields = fields;
    }

    private List<Field> getCorrectFields() {
        return this.fields.stream().filter( field -> field.getCorrect() ).collect(Collectors.toList());
    }

    @Override
    public boolean compareAnswer(String ans) {
        for ( Field field : this.getCorrectFields() ) {
            if ( ans.toLowerCase().equals(field.getKey().toLowerCase()) )
                return true;
        }

        return false;
    }

    @Override
    public String getQuestion() {
        String response = this.question;
        for ( Field field : this.fields ) {
            response += "\n" + field.getKey() + ": " + field.getValue();
        }
        return response;
    }
}
