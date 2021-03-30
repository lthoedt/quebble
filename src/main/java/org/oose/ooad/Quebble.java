package org.oose.ooad;

import java.util.Scanner;

public class Quebble 
{

    private static User speler;

    private static void setup() {
        speler = new User();
    }

    public static void main( String[] args )
    {
        setup();

        Scanner input = new Scanner(System.in);
        boolean play = true;
        do {
            System.out.print("command: ");
            String command = input.nextLine();

            switch ( command ) {
                case "speel":
                    System.out.println(playQuiz());
                    break;
                // case "antwoord":
                //     System.out.println(playQuiz());
                //     break;
                // case "speel":
                //     System.out.println(playQuiz());
                //     break;
                case "q":
                    play = false;
                    break;
            }

        } while ( play );
        input.close();
    }

    public static String playQuiz() {
        speler.playQuiz();
        return "Quiz is gestart!";
    }

    public static String answerQuestion(String ans) {
        
        if ( speler.answerQuestion( ans ) )
            return "Jou antwoord is goed!";
        else
            return "Jou antwoord is fout!";
    }

    public static String makeWord( String word ) {
        if ( speler.makeWord(word) )
            return "Jou woord is goed!";
        else
            return "Jou woord is fout!";
    }
}
