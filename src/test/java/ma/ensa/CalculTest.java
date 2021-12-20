package ma.ensa;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculTest {
    Calcul calcul;
    CalculService calculService;
    @Before
    public void beforeAll(){
        calculService=mock(CalculService.class);
        calcul =new Calcul(calculService);
    }

    @Test
    public void testCalculNote() {
        double expected = 5;
        Calcul calcul = new Calcul();
        double result = calcul.calculNote(5,5);
        assertEquals(5,result);
    }

    @Test
    public void testCompare() {
        int x = 1;
        int y = 1;
        Calcul calcul = new Calcul();
        double result = calcul.compare(x,y);
        assertEquals(2,result);
    }
    @Test
    public void multiplyLogTest(){
        assertNotNull(calculService);
        when(calculService.calculLog(4,0)).thenReturn(5);
        when(calculService.calculLog(4,0)).thenReturn(3);
        Assertions.assertEquals(calcul.calculSomme(4,4),3);
    }

}
