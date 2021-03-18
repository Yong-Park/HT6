import java.util.HashMap;
public class Hash<T, L> implements GeneralMap<T, L>{
    HashMap<T, L> map = new HashMap<T,L>();

    //para agregar al map
    public void put(T e, L i){
        map.put(e, i);
    }
}
