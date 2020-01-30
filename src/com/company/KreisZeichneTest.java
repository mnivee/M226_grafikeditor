package com.company;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KreisZeichneTest {
    private GraphicStub g2 = new GraphicStub();
    private Kreis kreis;
    private Rechteck r;

    @Before
    public void setup() {
        r = new Rechteck("Rechteck", 10, 10, 30, 70);
        kreis = new Kreis("Kreis", 50, 80, 90);
    }

    @Test
    public void testZeichne() {
        kreis.zeichne(g2);
        assertEquals(1, g2.numOfDrawOvalCalls);
        assertEquals(50, g2.x);
        assertEquals(80, g2.y);
        assertEquals(90, g2.width);
        assertEquals(90, g2.height);
        r.zeichne(g2);
        assertEquals(10, g2.);
        assertEquals(1, g2.numOfDrawOvalCalls);

    }
}
