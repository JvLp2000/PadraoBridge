package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SedanTest {

    @Test
    void deveRetornarPrecoSedanComMotorV6() {
        Motor motorV6 = new MotorV6();
        Sedan sedan = new Sedan(40000.0f);
        sedan.setMotor(motorV6);
        assertEquals(40000.0f * 1.2f, sedan.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSedanComMotorV8() {
        Motor motorV8 = new MotorV8();
        Sedan sedan = new Sedan(40000.0f);
        sedan.setMotor(motorV8);
        assertEquals(40000.0f * 1.5f, sedan.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSedanComMotorEletrico() {
        Motor motorEletrico = new MotorEletrico();
        Sedan sedan = new Sedan(40000.0f);
        sedan.setMotor(motorEletrico);
        assertEquals(40000.0f * 1.8f, sedan.calcularPreco(), 0.01f);
    }
}