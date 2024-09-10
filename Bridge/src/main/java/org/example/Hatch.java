package org.example;

public class Hatch extends Carro {

    public Hatch(float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.motor.percentualAumento());
    }
}