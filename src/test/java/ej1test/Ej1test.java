package ej1test;

import org.junit.*;
import parcial1.filaB.p1.Ej1UtilsNumeros;



public class Ej1test {
    Ej1UtilsNumeros prim;
    @Before
    public void before(){
        prim = new Ej1UtilsNumeros();
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Se dara inicio a las pruebas");
    }
    @After
    public void after(){
        System.out.println("Las pruebas han finalizado");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Todas pruebas han finalizado");
    }

    @Test
    public void esPrimo(){
        boolean actualResult= prim.esPrimo(3);
        boolean expectedResult= true;
        Assert.assertEquals("Error, el numero si es primo", expectedResult, actualResult);
    }
    @Test
    public void noPrimo(){
        boolean actualResult= prim.esPrimo(4);
        boolean expectedResult= false;
        Assert.assertEquals("Error, el numero no es primo", expectedResult, actualResult);
    }
    @Test(expected = ArithmeticException.class)
    public void invalido(){
        prim.esPrimo(-1);
    }


}
