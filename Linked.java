import java.util.LinkedHashMap;

public class Linked<T, L> implements GeneralMap<T, L>{
    LinkedHashMap<T, L> map = new LinkedHashMap<T, L>();
    public void put(T e, L i){
        map.put(e, i);
    }
}
