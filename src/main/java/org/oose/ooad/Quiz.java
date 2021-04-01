package org.oose.ooad;

import java.util.ArrayList;

import org.oose.ooad.question.Category;
import org.oose.ooad.question.Field;
import org.oose.ooad.question.MultipleChoice;
import org.oose.ooad.question.Open;
import org.oose.ooad.question.Question;

public class Quiz {
    private int questionIndex = -1;
    private ArrayList<Question> questions = new ArrayList<>();

    public Quiz() {
        Category cultuur = new Category( "Cultuur" );
        Category muziek = new Category( "Muziek" );
        
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("meneer");
        answers.add("cool");

        this.questions.add(
            new Open("Wie is henkjan?", cultuur, answers)
        );

        ArrayList<Field> fields = new ArrayList<>();
        fields.add(
            new Field("A", "henk", true)
        );
        fields.add(
            new Field("B", "piet", false)
        );
        fields.add(
            new Field("C", "jan", false)
        );
        fields.add(
            new Field("D", "klaas", false)
        );

        this.questions.add(
            new MultipleChoice("Wie speelt dit?", muziek, fields)
        );

        System.out.println(this.questions.size());
    }

    public int getQuestionIndex () {
        return this.questionIndex;
    }

    public Question getNextQuestion() throws IndexOutOfBoundsException {
        this.questionIndex++;
        return this.getCurrentQuestion();
    }

    public Question getCurrentQuestion() throws IndexOutOfBoundsException {
        return this.questions.get(questionIndex);        
    }

    public boolean compareAnswer( String ans ) {
        return this.getCurrentQuestion().compareAnswer( ans );
    }
}
