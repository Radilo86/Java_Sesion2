package principal;

/**
 * @author Rafa
 * Ejercicios tema 2
 * Para este ejercicio tendréis que crear una función que reciba un precio y
 * devuelva el precio con el IVA incluido.
 * **/

public class Total {
    // Función principal del programa.
    public static void main(String[] args){
        double precioBase = 100.0d;
        double resultado = precioConIva(precioBase);
        System.out.println("El precio es " + precioBase + " y el total es " + resultado);
    }

    private static double precioConIva(double precio){
        double total = precio * 1.21;
        return total;
    }
}
