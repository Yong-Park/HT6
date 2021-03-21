import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;  

public class LinkedMap<T, L> implements GeneralMap<T, L>{
    LinkedHashMap<T, L> map = new LinkedHashMap<T, L>();
    
    //para agregar al map
    public void put(T e, L i){
        map.put(e, i);
    }

    public String contain(T e){
        if(map.containsKey(e)){
            String s = map.get(e).toString();
            return s;
        }
        return "No existe esta carta";
    }

    public void nombrecantidad(){
        int monstruo = 0;
        int hechizo = 0;
        int trampa = 0;
        for (Map.Entry<T, L> mapElement : map.entrySet()) { 
  
            //encontrar el key
            T key = mapElement.getKey(); 
            // encontrar el valor 
            L value = mapElement.getValue(); 
            if(value.equals("Monstruo")){
                monstruo++;
            }else if(value.equals("Hechizo")){
                hechizo++;
            }else{
                trampa ++;
            }
            // print the key : value pair 
            System.out.println("Carta: " + key + "| Tipo: " + value); 
        }
        //mostrar la cantidad total de cada tipo de carta que tiene
        System.out.println("Esto esta en orden por tipo");
        System.out.println("Cantidad total de monstruos: " + monstruo);
        System.out.println("Cantidad total de hechizos: " + hechizo);
        System.out.println("Cantidad total de trampas: " + trampa);
    }

    public void sortByValue(){ 
        /*Comparator valueComparator = new Comparator() {
            public int compare(String k1, String k2) {
             String v1 = map.get(k1);
             String v2 = map.get(k2);
             int compare = v1.compareTo(v2);
             if (compare == 0) {
              return 1;
             } else {
              return compare;
             }*/
    }


    public void read(){
        for (Map.Entry<T, L> mapElement : map.entrySet()) { 
  
            //encontrar el key
            T key = mapElement.getKey(); 
            // encontrar el valor 
            L value = mapElement.getValue(); 
            
            // print the key : value pair 
            System.out.println("Carta: " + key + "| Tipo: " + value); 
        }
    }
        
}
