
import java.util.ArrayList;
import java.util.Stack;

/**
 * Clase para manejar la creacion de los arreglos cuando el usuariio ingrese
 * los simbolos de entrada y los simbolos de pila
 * @author Jovan Alejandro Zambrano Bello
 * @author Kevin Correa Reyes
 */


public class automata {
    
    /**
     * Método apra guardar en un arreglo los simbolos de entrada
     * @param s Cadena de texto con los simbolos de entrada del automata
     * @return Arreglo con los simbolos
     */
    public ArrayList<String> Entrada(String s){
        ArrayList<String> simbolos = new ArrayList<>();
        String cadena = "";
        for(int i=0; i<s.length();i++){
            char car = s.charAt(i);
            cadena = Character.toString(car);
            if(cadena.equals(",") || cadena.equals(".")){
                continue;
            }else{
                simbolos.add(cadena);
            }
        }
        return simbolos;
    }
    
    /**
     * Método apra guardar en un arreglo los simbolos de pila
     * @param s Cadena de texto con los simbolos de pila del automata
     * @return Arreglo con los simbolos
     */
    public ArrayList<String> pilas(String s){
        ArrayList<String> pilas = new ArrayList<>();
        String cadena = "";
        for(int i=0; i<s.length();i++){
            char car = s.charAt(i);
            cadena = Character.toString(car);
            if(cadena.equals(",") || cadena.equals(".")){
                continue;
            }else{
                pilas.add(cadena);            }
        }
        return pilas;
    }
    
    }
