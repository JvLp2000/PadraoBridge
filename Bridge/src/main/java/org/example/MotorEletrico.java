package org.example;

public class MotorEletrico implements Motor {

    @Override
    public float percentualAumento() {
        return 0.8f; // Aumenta o preço em 80%
    }
}