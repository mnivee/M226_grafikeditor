package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FigurParserTest {
    private FigurFileDAO dao;
    private FigurParser fp;

    @Before
    public void setup() {
        dao = new FigurFileDAO();
        fp = new FigurParser(dao);
    }

    @Test
    public void test() {
        List<Figur> figuren = fp.parse();
        assertEquals(3, figuren.size());
        assertEquals("Rechteck 40 50 90 70", figuren.get(0).toString());
        assertEquals("Kreis 150 100 50", figuren.get(1).toString());
        assertEquals("Linie 80 175 150 200", figuren.get(2).toString());
    }
}