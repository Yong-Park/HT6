import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedMap<T, L> implements GeneralMap<T, L>{
    public Map<T, L> map = new LinkedHashMap<T, L>();

    /**
     * Agrega al mapa
     * @param e Llave
     * @param i Valor
     */
    //para agregar al map
    public void put(T e, L i){
        map.put(e, i);
    }

    /**
     * Verifica si el parametro existe en el mapa
     * @param e
     * @return String
     */
    public String contain(T e){
        if(map.containsKey(e)){
            String s = map.get(e).toString();
            return s;
        }
        return "No existe esta carta";
    }

    /**
     * Imprime todas las cartas, su tipo y cantidad
     */
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

    /**
     * Ordena las cartas por su tipo
     * Obtenido de https://www.benchresources.net/java-how-to-sort-linkedhashmap-by-its-values/
     */
    public void sortByValue(){
        int monstruo = 0;
        int hechizo = 0;
        int trampa = 0;
        // 1. get entrySet from LinkedHashMap object
        Set<Map.Entry<T, L>> companyFounderSet = map.entrySet();

        // 2. convert LinkedHashMap to List of Map.Entry
        List<Map.Entry<T, L>> companyFounderListEntry = new ArrayList<Map.Entry<T, L>>(companyFounderSet);

        // 3. sort list of entries using Collections class'
        // utility method sort(ls, cmptr)
        Collections.sort(companyFounderListEntry,
                new Comparator<Map.Entry<T, L>>() {

                    @Override
                    public int compare(Entry<T, L> es1, Entry<T, L> es2) {
                        return ((String) es1.getValue()).compareTo((String) es2.getValue());
                    }
                });

        // 4. clear original LinkedHashMap
        map.clear();
        // 5. iterating list and storing in LinkedHahsMap
        for(Entry<T, L> mapordenado : companyFounderListEntry){
            map.put(mapordenado.getKey(), mapordenado.getValue());
        }
        for(Map.Entry<T, L> lhmap : map.entrySet()){
            System.out.println("Nombre : "  + lhmap.getKey() + " | Tipo : "  + lhmap.getValue());
            if(lhmap.getValue().equals("Monstruo")){
                monstruo++;
            }else if(lhmap.getValue().equals("Hechizo")){
                hechizo++;
            }else{
                trampa ++;
            }
        }
        System.out.println("Cantidad total de monstruos: " + monstruo);
        System.out.println("Cantidad total de hechizos: " + hechizo);
        System.out.println("Cantidad total de trampas: " + trampa);
    }

    /**
     * Imprime las cartas en el orden que esten
     */
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

    /**
     * Imprime las cartas en orden
     */
    public void readOrden(){
        // 1. get entrySet from LinkedHashMap object
        Set<Map.Entry<T, L>> companyFounderSet = map.entrySet();

        // 2. convert LinkedHashMap to List of Map.Entry
        List<Map.Entry<T, L>> companyFounderListEntry = new ArrayList<Map.Entry<T, L>>(companyFounderSet);

        // 3. sort list of entries using Collections class'
        // utility method sort(ls, cmptr)
        Collections.sort(companyFounderListEntry,
                new Comparator<Map.Entry<T, L>>() {

                    @Override
                    public int compare(Entry<T, L> es1, Entry<T, L> es2) {
                        return ((String) es1.getValue()).compareTo((String) es2.getValue());
                    }
                });

        // 4. clear original LinkedHashMap
        map.clear();

        // 5. iterating list and storing in LinkedHahsMap
        for(Entry<T, L> mapordenado : companyFounderListEntry){
            map.put(mapordenado.getKey(), mapordenado.getValue());
        }
        for(Map.Entry<T, L> lhmap : map.entrySet()){
            System.out.println("Nombre : "  + lhmap.getKey() + " | Tipo : "  + lhmap.getValue());
        }
    }

}