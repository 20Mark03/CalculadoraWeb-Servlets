package Calculadora;
public class Calculadora {
    
    public static double calcular(double num1, double num2, String operacion) {

        switch (operacion) {
            case "suma" -> {
                return num1 + num2;
            }
            case "resta" -> {
                return num1 - num2;
            }
            case "multiplicacion" -> {
                return num1 * num2;
            }
            case "division" -> {
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("No se puede dividir entre cero");
                }
            }
            default -> {
                return 0;
            }
        }
    }
}