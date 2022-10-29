public class SmartDevice {

    //Propiedades
    String marca;
    String modelo;
    String color;

    //Constructor vacio
    public SmartDevice() {

    }


    //Constructor con parametros
    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }


    // Clase hija
    public static class SmartPhone extends SmartDevice {

        int ram;
        String sistema;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String marca, String modelo, String color, int ram, String sistema) {
            super(marca, modelo, color);
            this.ram = ram;
            this.sistema = sistema;
        }
    }

    // Otra clase hija
    public static class SmartWatch extends SmartDevice {

        double pulgadas;
        String conectividad;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String marca, String modelo, String color, double pulgadas, String conectividad) {
            super(marca, modelo, color);
            this.pulgadas = pulgadas;
            this.conectividad = conectividad;
        }
    }

    public static void main(String[] args) {

        SmartPhone celular = new SmartPhone("Samsung", "S9", "Blanco",
                1, "Android");

        SmartWatch reloj = new SmartWatch("Xiaomi", "GTS 2", "Negro",
                3.5, "Bluetooth");

        System.out.println("Smartphone: " + celular.marca + " " + celular.modelo);
        System.out.println("Smartwatch : " + reloj.marca + " " + reloj.modelo);
    }
}
