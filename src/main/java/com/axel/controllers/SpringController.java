package com.axel.controllers;

import com.axel.entities.Examen;
import com.axel.interfaces.IEOperacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
    public static final String PATH_PLAY = "/play";
    public static final String PATH = "/";

    @Autowired
    IEOperacion operacion;

    @GetMapping(value = PATH_PLAY)
    public ModelAndView DatosForm(Examen ex){
        ModelAndView mv = new ModelAndView();
        mv.addObject("examen", ex);
        mv.addObject("message", operacion.Calcular(ex));
        mv.setViewName("index");

        return mv;
    }

    @GetMapping(value = PATH)
    public ModelAndView GoToIndex() {
        Examen ex = new Examen();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("examen", ex);
        modelAndView.setViewName("index");

        return modelAndView;
    }
}
