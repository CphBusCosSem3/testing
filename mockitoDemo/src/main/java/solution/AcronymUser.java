package solution;

import dk.webtrade.solution.exceptions.NoAcronymFoundException;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk created on Oct 31, 2016 
 */
public class AcronymUser {
  IAcronym acr;
  public void setAcronoymUser(IAcronym acr) {
    this.acr = acr;
  } 
  public String getInitialPhrase(String Acronym) throws NoAcronymFoundException
  {
    return acr.getInitialPhrase(Acronym);
  }
}
