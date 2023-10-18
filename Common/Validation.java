/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author hieu
 */
public class Validation {
    Library l = new Library();
    public boolean checkPositiveNumber(String s) {
        try {
            double a = Double.parseDouble(s);
            if (a <= 0) {
                throw new NumberFormatException();
            }
            return true;
        } catch (NumberFormatException e) {
            System.err.println("Invalid number, please input again.");
            return false;
        }
    }
}
