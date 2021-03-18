import java.util.TreeMap;

public class Tree<T, L> implements GeneralMap<T, L>{
    TreeMap<T, L> map = new TreeMap<T, L>();

    public void put(T e, L i){
        map.put(e, i);
    }
}
