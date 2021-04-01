package org.oose.ooad;

import java.util.Scanner;

public class Quebble 
{

    private User speler;

    
    private static final String STATE_START_GAME = "START_GAME";
    private static final String STATE_DURING_GAME = "DURING_GAME";
    private static final String STATE_END_GAME = "END_GAME";
    private static final String STATE_CALC_SCORE = "CALC_SCORE";

    public String prompt = "Command: ";
    
    private String STATE = STATE_START_GAME;

    private void setup() {
        this.speler = new User();
    }

    public static void main( String[] args )
    {
        Quebble game = new Quebble();
        game.setup();

        Scanner input = new Scanner(System.in);
        boolean play = true;
        do {
            System.out.print(game.prompt);
            String command = input.nextLine();

            if ( command.equals("q") )
                play = false; 

            switch ( game.getState() ) {
                case STATE_START_GAME:
                    if ( command.equals("speel") ) {
                        System.out.println(game.playQuiz());
                        System.out.println("\n");

                        // EXIT
                        game.prompt = "Antwoord: ";
                        System.out.println(game.getNextQuestion());
                        System.out.println("\n");
                        game.setState(STATE_DURING_GAME);
                    }
                    break;
                case STATE_DURING_GAME:
                    System.out.println(game.answerQuestion(command));
                    System.out.println("\n");
                    try {
                        System.out.println(game.getNextQuestion());
                        System.out.println("\n");
                    } catch ( IndexOutOfBoundsException e ) {

                        // EXIT
                        game.prompt = "Woord: ";
                        game.setState(STATE_END_GAME);
                    }
                    break;
                case STATE_END_GAME:
                    System.out.println(game.makeWord(command));
                    
                    // EXIT
                    game.prompt = "";
                    game.setState(STATE_CALC_SCORE);
                    break;
                    case STATE_CALC_SCORE:
                    
                    break;
                }
                
        } while ( play );
        input.close();
    }

    public void setState( String state ) {
        this.STATE = state;
    }

    private String getState() {
        return this.STATE;
    }

    public String playQuiz() {
        this.speler.playQuiz();
        return "Quiz is gestart!";
    }

    public String getNextQuestion() throws IndexOutOfBoundsException {
        return this.speler.getNextQuestion();
    }

    public String answerQuestion(String ans) {
        
        if ( this.speler.answerQuestion( ans ) )
            return "Jou antwoord is goed!";
        else
            return "Jou antwoord is fout!";
    }

    public String makeWord( String word ) {
        return "Jou score is " + this.speler.makeWord(word);
    }
}
