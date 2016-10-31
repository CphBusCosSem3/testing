/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.webtrade.solution.exceptions;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk
 */
public class NoAcronymFoundException extends Exception {

    /**
     * Creates a new instance of <code>NoAcronymFoundException</code> without
     * detail message.
     */
    public NoAcronymFoundException() {
    }

    /**
     * Constructs an instance of <code>NoAcronymFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoAcronymFoundException(String msg) {
        super(msg);
    }
}
