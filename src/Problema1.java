public class Problema1 {

    public boolean esMultiploDeTres (Integer n){
        return n % 3 == 0;
    }
    public boolean esMultiploDeCinco (Integer n){
        return n % 5 == 0;
    }
    public boolean esMultiploDeCincoYTres (Integer n){
        return n % 5 == 0 || n % 3 == 0;
    }

    static public String cadenaTexto() {
        String[] cadenaText = new String[20];

        return null;
    }

    static public void pruebaMultiplos () {
        Integer num = 0;
        if (num % 3 == 0) {
            System.out.println("Fizz");
        }

        else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("FizzBuzz");
        }

    }
}
