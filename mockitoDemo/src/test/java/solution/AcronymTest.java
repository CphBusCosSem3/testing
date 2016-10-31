/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import dk.webtrade.solution.exceptions.NoAcronymFoundException;
import java.io.NotActiveException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk
 */
public class AcronymTest {
    private static IAcronym ia;
    private static AcronymUser au;
    
    public AcronymTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        au = new AcronymUser();
        ia = mock(IAcronym.class);
        au.setAcronoymUser(ia);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetAcronym() throws NoAcronymFoundException {
        System.out.println("testGetAcronym");
        
        //Acronym acronym = new Acronym();
//        String result = acronym.getInitialPhrase("NATO");
        when(ia.getInitialPhrase("NATO")).thenReturn("North Atlantic Treaty Organization");
        String result = au.getInitialPhrase("NATO");
        assertTrue(result.equals("North Atlantic Treaty Organization"));
    }
    @Test(expected = NoAcronymFoundException.class)  
    public void testThrowNoAcronymFoundException() throws NoAcronymFoundException {
        System.out.println("testThrowAcronymException");
        // TODO review the generated test code and remove the default call to fail.
        when(ia.getInitialPhrase("ATO")).thenThrow(NoAcronymFoundException.class);
        au.getInitialPhrase("ATO");
    }
    
}
