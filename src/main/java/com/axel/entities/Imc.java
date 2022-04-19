package com.axel.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Imc {
    private double peso;
    private double estatura;
    private double imc;

    public Imc() {
        this.imc = peso / (estatura * estatura);
    }
}
