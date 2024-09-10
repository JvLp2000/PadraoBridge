package org.example;

public abstract class Carro {

    protected Motor motor;
    protected float precoBase;

    public Carro(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}