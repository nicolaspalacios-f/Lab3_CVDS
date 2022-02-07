package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;

import org.junit.Test;

public class TarifasTest {

    @Test
    public void validateCasoUno() {       
        try{
            double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(2000,21,-15);
        }
        catch(Exception e) {
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validateCasoDos() {
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(3000,22,72);
        Assert.assertEquals(result, 2310,0);
    }
    @Test
    public void validateCasoTres() {        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(2000,15,40);
        Assert.assertEquals(result, 2000,0);
    }
    @Test
    public void validateCasoCuatro() {        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(5000,7,12);
        Assert.assertEquals(result, 4750,0);
    }
    @Test
    public void validateCasoDosCinco() {        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(7000,24,22);
        Assert.assertEquals(result, 5950,0);
    }
    @Test
    public void validateCasoSeis() {     
        try{
            double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(-1000,21,20);
        }
        catch(Exception e) {
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void validateCasoDosSiete() {        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(2000,5,17);
        Assert.assertEquals(result, 1900,0);
    }
    @Test
    public void validateCasoDosOcho() {        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(2000,5,66);
        Assert.assertEquals(result, 1840,0);
    }
    @Test
    public void validateCasoDosNueve() {        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(2000,21,40);
        Assert.assertEquals(result, 1700,0);
    }
}