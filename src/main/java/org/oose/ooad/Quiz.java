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
        getSampleQuestions();
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

    private void getSampleQuestions() {
        Category cultuur = new Category( "Cultuur" );
        Category muziek = new Category( "Muziek" );
        Category geografie = new Category( "geografie" );
        Category sport = new Category( "sport" );
        Category politiek = new Category( "politiek" );

        // ============ vraag 1 ============ //
        ArrayList<Field> f1 = new ArrayList<>();
        f1.add(
            new Field("A", "Arequipa", false)
        );
        f1.add(
            new Field("B", "Caracas", false)
        );
        f1.add(
            new Field("C", "Lima", true)
        );
        f1.add(
            new Field("D", "Santiago", false)
        );

        this.questions.add(
            new MultipleChoice("Wat is de hoofdstad van Peru?", geografie, 'L', f1)
        );
        // ================================ //

        // ============ vraag 2 ============ //
        ArrayList<Field> f2 = new ArrayList<>();
        f2.add(
            new Field("A", "Davis Cup", true)
        );
        f2.add(
            new Field("B", "Diamond League", false)
        );
        f2.add(
            new Field("C", "Fed Cup", false)
        );
        f2.add(
            new Field("D", "Nations League", false)
        );

        this.questions.add(
            new MultipleChoice("Hoe heet het officieuze landenkampioenschap tennis voor mannen?", sport, 'D', f2)
        );
        // ================================ //

        // ============ vraag 3 ============ //
        ArrayList<Field> f3 = new ArrayList<>();
        f3.add(
            new Field("A", "Ruth", false)
        );
        f3.add(
            new Field("B", "Emmy", false)
        );
        f3.add(
            new Field("C", "Joanne", false)
        );
        f3.add(
            new Field("D", "Agatha", true)
        );

        this.questions.add(
            new MultipleChoice("Wat is de voornaam van de schepper van Miss Marple en Hercule Poirot?", cultuur, 'A', f3)
        );
        // ================================ //

        // ============ vraag 4 ============ //
        ArrayList<Field> f4 = new ArrayList<>();
        f4.add(
            new Field("A", "Arsenal", false)
        );
        f4.add(
            new Field("B", "Chelsea", false)
        );
        f4.add(
            new Field("C", "Everton", true)
        );
        f4.add(
            new Field("D", "Tottenham Hotspur", false)
        );

        this.questions.add(
            new MultipleChoice("Welke van de volgende Engelse voetbalclub is afkomstig uit Liverpool?", sport, 'E', f4)
        );
        // ================================ //

               
        // ============ vraag 5 ============ //
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Avignon");

        this.questions.add(
            new Open("Wat is de hoofdstad van het Franse departement Vaucluse die we kennen uit een heel bekend liedje over een brug?", geografie, 'A', a1)
        );
        // ================================ //

        // ============ vraag 6 ============ //
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("Coldplay");

        this.questions.add(
            new Open("Welke band stond in 2008 in de hitparade met de song Viva La Vida?", muziek, 'C', a2)
        );
        // ================================ //

        // ============ vraag 7 ============ //
        ArrayList<String> a3 = new ArrayList<String>();
        a3.add("Tory");
        a3.add("Tories");
        a3.add("The Tories");

        this.questions.add(
            new Open("Wat is de bijnaam van de Conservatieve Partij in Engeland?", politiek, 'T', a3)
        );
        // ================================ //

        // ============ vraag 8 ============ //
        ArrayList<String> a4 = new ArrayList<String>();
        a4.add("Instanboel");
        a4.add("Instanbul");

        this.questions.add(
            new Open("Welke stad ligt in twee continenten?", geografie, 'I', a4)
        );
        // ================================ //

    }
}
