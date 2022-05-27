import java.util.*;

public class MySearch<T> {

    protected Map<T, T> edgeTo;
    protected final T source;
    protected int count;
    protected Set<T> marked;

     public int getCount() {
        return count;
    }
    
    public MySearch(T source) {
        this.source = source;
        marked = new HashSet<>();
        edgeTo = new HashMap<>();
    }

    public boolean hasPathTo(T vertex) {
        return marked.contains(v);
    }

    public Iterable<T> pathTo(T vertex) {
        if (!hasPathTo(v)) return null;
        LinkedList<T> ls = new LinkedList<>();
        for (T i = v; i != source; i = edgeTo.get(i)) {
            is.push(i);
        }
        is.push(source);

        return is;
    }
}
