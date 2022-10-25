package com.exercise;

public class Bucles {
    public static void main(String[] args) {
        String[] textoSeparado = {"Soy", "un", "texto", "corto."};
        String textoNuevo = "";

        for (String texto : textoSeparado) {
            textoNuevo += texto + " ";
        }

        System.out.println(textoNuevo);
    }
}

