package com.axel.service;

import com.axel.entities.Examen;
import com.axel.entities.Imc;
import com.axel.interfaces.IEOperacion;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("IMC")
@Getter
@Setter
public class ImcService implements IEOperacion {
    private Imc imc;
    private double peso;
    private double altura;

    public ImcService() {
        this.imc = new Imc();
        this.peso = 80;
        this.altura = 1.80;
        imc.setPeso(peso);
        imc.setEstatura(altura);
    }

    public Imc calcularIMC() {
        Imc imc = new Imc();
        imc.setPeso(80);
        imc.setEstatura(1.80);
        return imc;
    }

    @Override
    public String Calcular(Examen examen) {
        double peso = Double.parseDouble(examen.getParam1());
        double altura = Double.parseDouble(examen.getParam2());
        double imc = peso / (altura * altura);
        return "Tu IMC es: " + imc;
    }
}
