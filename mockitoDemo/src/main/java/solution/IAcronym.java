package solution;

import dk.webtrade.solution.exceptions.NoAcronymFoundException;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk created on Oct 31, 2016
 */
public interface IAcronym {
    String getInitialPhrase(String Acronym) throws NoAcronymFoundException;
}
