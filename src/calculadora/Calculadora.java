/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author usuario
 */

public class Calculadora {

    public int resultado;
    
    public int sumar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public static int restar(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public static int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public static int dividir(int valor1, int valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return valor1 / valor2;
    }

    public static int modulo(int valor1, int valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("Módulo por cero");
        }
        return valor1 % valor2;
    }
    
    public int operacion(int valor1, int valor2, String operacion) {
        if (null != operacion) switch (operacion) {
            case "sumar":
                return sumar(valor1,valor2);
            case "restar":
                return restar(valor1,valor2);
            case "multiplicar":
                return multiplicar(valor1,valor2);
            case "dividir":
                return dividir(valor1,valor2);
            case "modulo":
                return modulo(valor1,valor2);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
        
        throw new IllegalArgumentException("Operación no válida");
    }
  

}