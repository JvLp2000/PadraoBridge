package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HatchTest {

    @Test
    void deveRetornarPrecoHatchComMotorV6() {
        Motor motorV6 = new MotorV6();
        Hatch hatch = new Hatch(30000.0f);
        hatch.setMotor(motorV6);
        assertEquals(30000.0f * 1.2f, hatch.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoHatchComMotorV8() {
        Motor motorV8 = new MotorV8();
        Hatch hatch = new Hatch(30000.0f);
        hatch.setMotor(motorV8);
        assertEquals(30000.0f * 1.5f, hatch.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoHatchComMotorEletrico() {
        Motor motorEletrico = new MotorEletrico();
        Hatch hatch = new Hatch(30000.0f);
        hatch.setMotor(motorEletrico);
        assertEquals(30000.0f * 1.8f, hatch.calcularPreco(), 0.01f);
    }
}