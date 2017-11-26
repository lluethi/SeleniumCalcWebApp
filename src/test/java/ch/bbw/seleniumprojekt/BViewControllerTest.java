/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.seleniumprojekt;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class BViewControllerTest {

    public BViewControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
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
    public void testBerechne() {
        BerechnungsViewController meineBean = new BerechnungsViewController();
        meineBean.setValue1("1");
        meineBean.setValue2("2");
        meineBean.berechne();
        assertEquals("3.0", meineBean.getResult());
    }

}
