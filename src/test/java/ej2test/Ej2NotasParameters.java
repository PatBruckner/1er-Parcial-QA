package ej2test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parcial1.filaB.p2.Ej2Notas;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class Ej2NotasParameters {

    private String expectedResult;
    private int notaFinal;

    public Ej2NotasParameters(int notaFinal, String expectedResult){
        this.notaFinal=notaFinal;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects= new ArrayList<>();
        objects.add(new Object[]{-1,"VALOR INCORRECTO" });
        objects.add(new Object[]{1,"F" });
        objects.add(new Object[]{2,"F" });
        objects.add(new Object[]{3,"F" });
        objects.add(new Object[]{4,"F" });
        objects.add(new Object[]{5,"F" });
        objects.add(new Object[]{6,"C" });
        objects.add(new Object[]{7,"C" });
        objects.add(new Object[]{8,"B" });
        objects.add(new Object[]{9,"B" });
        objects.add(new Object[]{10,"A" });

        return objects;
    }
    @Test
    public void verify_notas_all_values(){
        Ej2Notas notas = new Ej2Notas();
        String actualResult= notas.notasCualitativas(this.notaFinal);
        Assert.assertEquals("Error", this.expectedResult, actualResult);
    }
}
