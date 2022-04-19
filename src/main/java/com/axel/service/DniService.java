package com.axel.service;

import com.axel.entities.Dni;
import com.axel.entities.Examen;
import com.axel.interfaces.IEOperacion;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("DNI")
@Getter
@Setter
public class DniService implements IEOperacion {
    private Dni dniEntity;
    private char[] letrasDni;

    public DniService() {
        this.dniEntity = new Dni();
        this.letrasDni = dniEntity.getLetras();
    }

    public char obtenerLetraDni(int numeroDNI) {
        int resto;
        resto = numeroDNI % 23;
        return letrasDni[resto];
    }

    @Override
    public String Calcular(Examen examen) {
        int numDni = Integer.parseInt(examen.getParam1());
        return "DNI: " + numDni + " - Letra: " + obtenerLetraDni(numDni);
    }
}
