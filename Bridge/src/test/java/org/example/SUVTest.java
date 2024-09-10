package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SUVTest {

    @Test
    void deveRetornarPrecoSUVComMotorV6() {
        Motor motorV6 = new MotorV6();
        SUV suv = new SUV(50000.0f);
        suv.setMotor(motorV6);
        assertEquals(50000.0f * 1.2f, suv.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSUVComMotorV8() {
        Motor motorV8 = new MotorV8();
        SUV suv = new SUV(50000.0f);
        suv.setMotor(motorV8);
        assertEquals(50000.0f * 1.5f, suv.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSUVComMotorEletrico() {
        Motor motorEletrico = new MotorEletrico();
        SUV suv = new SUV(50000.0f);
        suv.setMotor(motorEletrico);
        assertEquals(50000.0f * 1.8f, suv.calcularPreco(), 0.01f);
    }
}