package org.example;

public class Sedan extends Carro {

    public Sedan(float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.motor.percentualAumento());
    }
}
