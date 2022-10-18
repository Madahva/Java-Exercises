package com.exercises;

public class ObtenerIva {
    public static void main(String[] args) {
        System.out.println("El Resultado es: " + getIva(1000, 21));
    }

    private static double getIva(double producto, double iva) {
        return (producto + ((producto*iva) / 100));
    }
}
