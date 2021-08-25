package integrador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es capicua o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea capicua retornar true.
     * @param num
     * @return esPalindromo
     *
     *      * Función numeroCapicua(): La función recibirá un numero x y deberá determinar si es capicúa o no.
     *      * Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es.
     *      * Además deberemos contemplar los siguientes escenarios:
     *      * • Contemplar que el numero que llega puede ser negativo.
     *      * • Contemplar que el numero que llega puede ser de un dígito, si es así debe devolver true.
     *      * • Contemplar que el numero que llega puede ser null, si es así debe devolver false. *
     */
    public Boolean numeroCapicua(Integer num) {
        // chequear si es null o Integer.MIN_VALUE ya que el menor valor de int no puede convertirse a positivo (y no es capicua)
        if(num == null || num == Integer.MIN_VALUE) return false;

        // convirtiendo el numero a su valor absoluto para asegurarse que sea positivo
        num = Math.abs(num);
        // si es menor a 10 si o si va a tener un solo digito así que devuelve true
        if(num < 10) return true;

        // convirtiendo el numero a String
        String numStr = num.toString();

        // creando un inverso del string con un StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(numStr);
        sb.reverse();

        // chequeando que el numero y su inverso sean iguales
        return sb.toString().equalsIgnoreCase(numStr);
    }

    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de ladrones en ronda, contemplando
     * al primer ladron que se sienta, como el ladron 0. A los ladrones se le
     * repartira una m cantidad de caramelos contemplando que se comenzaran a
     * repartir los caramelos desde el primer ladron (inicio). El ultimo
     * caramelo en repartirse estara podrido, determinar a que ladron, segun su
     * posicion en la ronda le tocara.
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadLadrones
     * @return ladronQueLeTocoElCarameloPodrido
     *
     *      * Función prisioneroDulce():
     *      * Estamos en caramelolandia, donde estan los peores ladrones de dulces.
     *      * Una vez al mes, se sienta una n cantidad de presos en ronda,
     *      * contemplando al preso que inicia la ronda, como el preso 0.
     *      * A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso,
     *      * contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio).
     *      * Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido,
     *      * determinar a que preso, según su posición en la ronda le tocara el caramelo podrido. *
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        // marco al ladron actual como el numero de inicio de la ronda
        int ladronActual = inicio;

        // hago un while hasta que se acaban los caramelos
        while (cantidadCaramelos > 0){
            // doy un caramelo
            cantidadCaramelos--;
            // si se acabaron le corresponde al ladron actual
            if(cantidadCaramelos == 0) return ladronActual;
            // si no, al siguiente ladron, si el ladron es el ultimo, vuelve a cero
            ladronActual++;
            if(ladronActual == cantidadLadrones) ladronActual = 0;
        }
        return ladronActual;
    }

    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :(. List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        // creo un set para medias solas y medias acompañadas
        Set<String> mediasSolas = new HashSet<>();
        Set<String> mediasAcompaniadas = new HashSet<>();

        // itero por la lista de pasajeros, intento agregar el pasajero a la lista de media sola
        // si la media sola devuelve falso al agregar, quiere decir que es repetida, entonces lo agrego a medias acompañadas
        for(String media: pasajeros){
            if(!mediasSolas.add(media)){
                mediasAcompaniadas.add(media);
            }
        }
        // devuelvo el set convertido a ArrayList
        return new ArrayList<>(mediasAcompaniadas);
    }
}
