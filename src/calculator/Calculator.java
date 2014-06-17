/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.regex.Pattern;

/**
 *
 * @author rjgmoritz
 */
public class Calculator {

    /**
     * @param args the command line arguments Start het programma
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * print de vraag voor invoer van de user en vangt de invoer op.
     */
    public static String vraagOpdracht() {
        System.out.println("Wat voor een bewerking zou u willen uitvoeren?");
        String input = System.console().readLine();
        return input;
    }

    /**
     *
     * Stuurt de opdracht door naar de libcalculator class na bepaald is of de
     * berekening wel correct is door middel van een regex test. hierna word
     * gekeken wat voor een berekening het is plus min , gedeeld door etc. De
     * output is het berekende cijfer.
     */
    public static String verwerkOpdracht(String input) {
        String output = "incorrect input";
        LibCalculator libCalc = new LibCalculator();

        if (!input.matches("(\\d+)([\\+\\-\\*\\\\/\\%])(\\d+)")) {
            output = "incorrect input";
            printHelp();
        } else if (input.contains("+")) {
            Double getal1 = Double.parseDouble(input.substring(0, input.indexOf("+")));
            Double getal2 = Double.parseDouble(input.substring(input.indexOf("+") + 1, input.length()));
            output = libCalc.som(getal1, getal2).toString();
        } else if (input.contains("-")) {
            Double getal1 = Double.parseDouble(input.substring(0, input.indexOf("-")));
            Double getal2 = Double.parseDouble(input.substring(input.indexOf("-") + 1, input.length()));
            output = libCalc.verschil(getal1, getal2).toString();
        } else if (input.contains("*")) {
            Double getal1 = Double.parseDouble(input.substring(0, input.indexOf("*")));
            Double getal2 = Double.parseDouble(input.substring(input.indexOf("*") + 1, input.length()));
            output = libCalc.product(getal1, getal2).toString();
        } else if (input.contains("/")) {
            Double getal1 = Double.parseDouble(input.substring(0, input.indexOf("/")));
            Double getal2 = Double.parseDouble(input.substring(input.indexOf("/") + 1, input.length()));
            output = libCalc.quotient(getal1, getal2).toString();
        } else if (input.contains("%")) {
            Double getal1 = Double.parseDouble(input.substring(0, input.indexOf("%")));
            Double getal2 = Double.parseDouble(input.substring(input.indexOf("%") + 1, input.length()));
            output = libCalc.modulo(getal1, getal2).toString();
        }

        return output;
    }

    /**
     * dit zorgt voor dat de help geprint word wanneer dit aangeroepen word.
     */
    public static void printHelp() {
        System.out.println("De verwachte invoer is: nummer bewerking nummer");
        System.out.println("Een voorbeeld is 5 * 5");
        System.out.println("Het programma eindigen met exit.");
    }

    /**
     * Dit zorgt er voor dat het programma blijft draaien tot dat er exit word ingevoerd.
     * Dit doet het door middel van een vorm van recursie.
     * 
     */
    public static void run() {
        String opdracht = vraagOpdracht();
        if (!opdracht.contains("exit")||!opdracht.contains("help")) {
            String newOut = verwerkOpdracht(opdracht);
            System.out.println(newOut);
            run();
        }else if(opdracht.contains("exit")){
            System.out.println("Exit Found stopping program.");
        }else if(opdracht.contains("help")){
            printHelp();
        }

    }

}
