import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree<T, L> implements GeneralMap<T, L>{
    Map<T, L> map = new TreeMap<T, L>();
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
    //codigo obtenido de https://www.geeksforgeeks.org/how-to-sort-a-treemap-by-value-in-java/
    public void sortByValue(){ 
        int monstruo = 0;
        int hechizo = 0;
        int trampa = 0;
        
        // Calling the method valueSort 
        Map sortedMap = valueSort(map); 
  
        // Get a set of the entries on the sorted map 
        Set set = sortedMap.entrySet(); 
  
        // Get an iterator 
        Iterator i = set.iterator(); 
  
        // Display elements 
        while (i.hasNext()) { 
            
            Map.Entry mp = (Map.Entry)i.next(); 
            System.out.print("Nombre: " + mp.getKey() + " | Tipo: "); 
            System.out.println(mp.getValue()); 
            if(mp.getValue().equals("Monstruo")){
                monstruo++;
            }else if(mp.getValue().equals("Hechizo")){
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

    public Map<T, L> valueSort (Map<T, L> map2){ 
        // Static Method with return type Map and 
        // extending comparator class which compares values 
        // associated with two keys 
        Comparator<T> valueComparator = new Comparator<T>() { 
            
                  // return comparison results of values of 
                  // two keys 
                  public int compare(T k1, T k2) 
                  { 
                      int comp = ((String) map2.get(k1)).compareTo((String) map2.get(k2)); 
                      if (comp == 0) 
                          return 1; 
                      else
                          return comp; 
                  } 
            
              }; 
        
        // SortedMap created using the comparator 
        Map<T, L> sorted = new TreeMap<T, L>(valueComparator); 
        
        sorted.putAll(map2); 
        
        return sorted; 
    } 

    public void readOrden(){
        // Calling the method valueSort 
        Map sortedMap = valueSort(map); 
  
        // Get a set of the entries on the sorted map 
        Set set = sortedMap.entrySet(); 
  
        // Get an iterator 
        Iterator i = set.iterator(); 
  
        // Display elements 
        while (i.hasNext()) { 
            
            Map.Entry mp = (Map.Entry)i.next(); 
            System.out.print("Nombre: " + mp.getKey() + " | Tipo: "); 
            System.out.println(mp.getValue());
        } 
    }
    
}
