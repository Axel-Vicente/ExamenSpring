package com.axel.entities;

import com.axel.interfaces.IEOperacion;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dni {
    private int numeroDNI;
    private final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    private char letra;
    private String dni;
}
