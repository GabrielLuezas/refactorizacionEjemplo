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
    
    public int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }

    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Módulo por cero");
        }
        return a % b;
    }
    
    public int operacion(int a, int b, String operacion) {
        if (null != operacion) switch (operacion) {
            case "sumar":
                return sumar(a,b);
            case "restar":
                return restar(a,b);
            case "multiplicar":
                return multiplicar(a,b);
            case "dividir":
                return dividir(a,b);
            case "modulo":
                return modulo(a,b);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
        
        throw new IllegalArgumentException("Operación no válida");
    }
  

  public static int operacionObsoleta(int a, int b) {
        return a + b;
  }
}