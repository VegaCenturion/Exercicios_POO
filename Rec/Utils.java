import java.util.*;

public class Utils {

    public static boolean existe(Collection x, Planta y) {
            return x.contains(y);   // x.contains(y) is a boolean expression that returns true if the collection x contains the object y
    }
    public static Planta[] ordena (List x){ // x is a List of Plantas
        Planta[] plts = new Planta[x.size()];   // x.size() is a method that returns the number of elements in the list x
        for (int i = 0; i < plts.length; i++){  // plts.length is a property that returns the number of elements in the array plts
            plts[i] = (Planta)x.get(i); // x.get(i) is a method that returns the element at index i in the list x
        }
        for (int i = 0; i < x.size(); i++){ // x.size() is a method that returns the number of elements in the list x
            for (int j = 0; j < x.size(); j++){ //
                if (plts[i].getTamanho() > plts[j].getTamanho()){   // plts[i].getTamanho() is a method that returns the tamanho of the Planta at index i in the array plts
                    Planta aux = plts[i];   // aux is a Planta
                    plts[i] = plts[j];
                    plts[j] = aux;
                }
            }
        }
        return plts;   // return the array plts
    }

    public static Map retornaDados(Set conjuntoPlantas){    // conjuntoPlantas is a Set of Strings
        Map m = new HashMap(); // m is a Map of Strings to Plantas
        Iterator it = conjuntoPlantas.iterator();   // it is an Iterator of Strings
        while (it.hasNext()){
           String[] strP = it.next().toString().split("#");     // it.next() is a method that returns the next element in the iterator i while .split is a method that returns an array of Strings that are the substrings of the String
                                                                    // strP that are delimited by the character #
           Planta p = null;
           if (strP[3].equals("Briofita")){
               p = new Briofita(strP[0]);
               p.setNome(strP[1]);
               p.setTamanho(Double.parseDouble(strP[2]));
           } else {
               p = new Pteridofita(strP[0]);
               p.setNome(strP[1]);
               p.setTamanho(Double.parseDouble(strP[2]));
           }
           m.put(strP[0], p); // m.put(strP[0], p) is a method that associates the key strP[0] with the value p in the map m
        }
        return m;
    }
}







