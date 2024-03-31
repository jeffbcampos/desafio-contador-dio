package edu.jeferson.aulaJava.desafioContadorDio;

public class Contador {
    public static void main(String[] args) {
        try {
            int valor1 = 10;
            int valor2 = 32;
            parametroMenor(valor1, valor2);
            contar(valor1, valor2);

        } catch(ParametrosInvalidosException e) {
            System.out.println("Parametro 1 é maior que parametro 2");
        }

    }
    static void parametroMenor(int param1, int param2) throws ParametrosInvalidosException {
        if(param1 > param2) {
            throw new ParametrosInvalidosException();
        }
    }

    static void contar(int num1, int num2) {
        int contador = num2 - num1;
        for(int i = 0; i != contador; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
