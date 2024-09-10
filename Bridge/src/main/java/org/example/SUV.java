package org.example;

public class SUV extends Carro {

    public SUV(float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.motor.percentualAumento());
    }
}