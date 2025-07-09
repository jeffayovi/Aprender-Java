import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {
        //Declaracion de costante
        final double FACTOR_CONVERSION = 3.7854;
        final int MAX_GALONES = 100;
        final int LINEAS_POR_GRUPO = 10;

        //Declaracion de variables
        int galones;
        double litros;
        int contadorLinea;

        //Inicializar el contador de líneas
        contadorLinea = 0;

        //Bucle para iterar de 1 a MAX_GALONES (100)
        for (galones = 1;  galones < MAX_GALONES ; galones++) {

            //Calcular la cantidad de litros para el número actual de galones
            litros = galones * FACTOR_CONVERSION;

            //Mostrar la conversión actual
            System.out.println(galones + " galones es equivalente a " + litros + " litros");

            //Incrementar el contador de líneas
            contadorLinea = contadorLinea + 1;

            //Verificar si es momento de imprimir una línea en blanco
            if ( contadorLinea == LINEAS_POR_GRUPO){
                System.out.println();
                contadorLinea = 0;
            }



        }







    }
}