package integrador;

import java.util.ArrayList;
import java.util.Arrays;

public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        
        System.out.println( (int) Math.log10(1000)+1);

        int numero = 2147447412;

        System.out.println(practica.numeroCapicua(numero));
        System.out.println(practica.prisioneroDulce(455, 0, 500));
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D","A", "C", "D", "A"}));
        System.out.println(practica.mediasAmigas(medias));
        //Generar las variables necesarias para probar

        //System.out.println(practica.mediasAmigas(medias));
        //System.out.println(practica.numeroCapicua(null));
    }
}
