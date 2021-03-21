import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Tree<T, L> implements GeneralMap<T, L>{
    TreeMap<T, L> map = new TreeMap<T, L>();
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
