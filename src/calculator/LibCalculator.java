/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author rjgmoritz
 * onderdeel van de calculator package wat de daadwerkelijke berekeningen uitvoerd.
 */
public class LibCalculator {

    /**
     * dit berekend de som van twee getallen en geeft dit als uitkomst.
     */
    public static Double som(double getal1, double getal2) {
        Double uitkomst = getal1 + getal2;
        return uitkomst;
    }

    /**
     * dit berekend de verschil van twee getallen en geeft dit als uitkomst.
     */
    public static Double verschil(double getal1, double getal2) {
        Double uitkomst = getal1 - getal2;
        return uitkomst;
    }

    /**
     * dit berekend de quotient van twee getallen en geeft dit als uitkomst.
     */
    public static Double quotient(double getal1, double getal2) {
        Double uitkomst = getal1 / getal2;
        return uitkomst;
    }

    /**
     * dit berekend de modulo van twee getallen en geeft dit als uitkomst.
     */
    public static Double modulo(double getal1, double getal2) {
        Double uitkomst = getal1 % getal2;
        return uitkomst;
    }

    /**
     * dit berekend de product van twee getallen en geeft dit als uitkomst.
     */
    public static Double product(double getal1, double getal2) {
        Double uitkomst = getal1 * getal2;
        return uitkomst;
    }

}
