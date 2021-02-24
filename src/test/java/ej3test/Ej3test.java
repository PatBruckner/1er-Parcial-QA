package ej3test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import parcial1.filaB.p3.Ej3Utils;

public class Ej3test {

    Ej3Utils ci;
    @Before
    public void before(){
        ci = new Ej3Utils();
    }

    @Test(expected = Exception.class){
        public void vacio() throw Exception{
            ci.isCorrectCI("");
        }
    }
    @Test(expected = Exception.class){
        public void esCero() throw Exception {
            ci.isCorrectCI("0");
        }
    }
    @Test(timeout = 1500){
        public void ciTime() throw Exception{
            boolean actualResult= ci.isCorrectCI("123456");
            boolean expectedResult=true;
            Assert.assertEquals("Error", actualResult, expectedResult);
        }
    }
}
