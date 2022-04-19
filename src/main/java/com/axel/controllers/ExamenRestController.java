package com.axel.controllers;

import com.axel.entities.Examen;
import com.axel.service.DniService;
import com.axel.service.ImcService;
import com.axel.service.LeapyearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamenRestController {
    public static final String PATH = "/";
    private static final String PATH_IMC = "/imc";
    private static final String PATH_DNI = "/dni";
    private static final String PATH_LEAPYEAR = "/leapyear/{anio}";

    @Autowired(required = false)
    ImcService imcService;

    @Autowired(required = false)
    DniService dniService;

    @Autowired(required = false)
    LeapyearService leapyearService;

    @PostMapping(value = PATH_IMC)
    public String Imc(Examen ex){
        String message = imcService.Calcular(ex);

        return message;
    }

    @GetMapping(value = PATH_DNI)
    public String Dni(Examen ex){
        String message = dniService.Calcular(ex);

        return message;
    }

    @GetMapping(value = PATH_LEAPYEAR)
    public String Leapyear(Examen ex){
        String message = leapyearService.Calcular(ex);

        return message;
    }
}
