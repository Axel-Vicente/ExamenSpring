package com.axel.service;

import com.axel.entities.Dni;
import com.axel.entities.Examen;
import com.axel.entities.Leapyear;
import com.axel.interfaces.IEOperacion;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("LEAPYEAR")
@Getter
@Setter
public class LeapyearService implements IEOperacion {
    private Leapyear leapyear;
    private int anio;

    public LeapyearService() {
        Leapyear leapyearEntity = new Leapyear();
    }

    @Override
    public String Calcular(Examen examen) {
        int anio = Integer.parseInt(examen.getParam1());
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            return "El año es bisiesto";
        }else {
            return "El año no es bisiesto";
        }
    }
}
