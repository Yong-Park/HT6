import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedList;

public class Hash<T, L> implements GeneralMap<T, L>{
    Map<T, L> map = new HashMap<T,L>();

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
    //codigo obtenido de https://www.javatpoint.com/how-to-sort-hashmap-by-value#:~:text=In%20Java%2C%20sorting%20HashMap%20by,convert%20Set%20into%20the%20List.
    public void sortByValue(){ 
        int monstruo = 0;
        int hechizo = 0;
        int trampa = 0;
        //convert HashMap into List   
        List<Entry<T, L>> list = new LinkedList<Entry<T, L>>(map.entrySet());  
        //sorting the list elements  
        Collections.sort(list, new Comparator<Entry<T, L>>()   {  
            public int compare(Entry<T, L> o1, Entry<T, L> o2){   
                return ((String) o1.getValue()).compareTo((String)o2.getValue());    
            }  
        });  
        for (Entry<T, L> entry : list){  
            System.out.println("Nombre: " + entry.getKey() +" | Tipo: " + entry.getValue());   
            if(entry.getValue().equals("Monstruo")){
                monstruo++;
            }else if(entry.getValue().equals("Hechizo")){
                hechizo++;
            }else{
                trampa ++;
            }
        }     
        System.out.println("Cantidad total de monstruos: " + monstruo);
        System.out.println("Cantidad total de hechizos: " + hechizo);
        System.out.println("Cantidad total de trampas: " + trampa); 
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

    public void readOrden(){
        //convert HashMap into List   
        List<Entry<T, L>> list = new LinkedList<Entry<T, L>>(map.entrySet());  
        //sorting the list elements  
        Collections.sort(list, new Comparator<Entry<T, L>>()   {  
            public int compare(Entry<T, L> o1, Entry<T, L> o2){   
                return ((String) o1.getValue()).compareTo((String)o2.getValue());    
            }  
        });  
        for (Entry<T, L> entry : list){  
            System.out.println("Nombre: " + entry.getKey() +" | Tipo: " + entry.getValue());   
        }  
    }
}
