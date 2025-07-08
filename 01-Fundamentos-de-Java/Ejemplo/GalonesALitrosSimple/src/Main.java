
public class Main {
    public static void main(String[] args) {
        //Declaracion de variables
        final double FACTOR_CONVERCION = 3.7854;
        double galones,litros;

        //Asinacion de valor de entrada
        galones = 10.0;

        //Realizar el calculo de conversion
        litros = galones * FACTOR_CONVERCION;

        //Mostrar los resultados
        System.out.println("La cantidad de galones es: " + galones);
        System.out.println("La cantidad equivalente en litros es: " +litros);




    }
}
