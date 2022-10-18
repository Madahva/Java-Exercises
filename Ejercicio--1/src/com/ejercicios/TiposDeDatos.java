package com.ejercicios;

public class TiposDeDatos {
    public static void main(String[] args) {
        //Numeros Enteros
        byte numeroMuyChico = 127;
        short numeroChico = 32767;
        int numeroGrande = 2147483647;
        long numeroMuyGrande = 9223372036854775807L;

        //Numeros Reales
        float numeroDecimal = 3.402823f;
        double decimalDoble = 1.79769313486232d;

        //Valores Booleanos
        boolean itIsSunny = false;

        //Carácteres
        char unaSolaLetra = 's';
        String variasLetras = "Hola soy un texto";

        System.out.println("Ejemplos de Números Enteros:");
        System.out.println("byte: " + numeroMuyChico);
        System.out.println("short: " + numeroChico);
        System.out.println("int: " + numeroGrande);
        System.out.println("long: " + numeroMuyGrande);
        System.out.println();
        System.out.println("Ejemplos de Numeros Reales:");
        System.out.println("float: " + numeroDecimal);
        System.out.println("double: " + decimalDoble);
        System.out.println();
        System.out.println("Ejemplos de booleanos:");
        System.out.println("boolean: " + itIsSunny);
        System.out.println();
        System.out.println("Ejemplos de Carácteres:");
        System.out.println("char: " + unaSolaLetra);
        System.out.println("String: " + variasLetras);
    }
}

