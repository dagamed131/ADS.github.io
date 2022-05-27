import java.util.*;


public class MyGraph<T> {
    private boolean bidirectional;
    private Map<T, Vertex<T>> map;
    T type;

    public MyGraph() {
        this(false);
    }

    public MyGraph(boolean bidirectional) {
        this.bidirectional = bidirectional;
        map = new HashMap<>();
    }

    public void addVertex(T vertex) {
        map.put(vertex, new Vertex<T>(vertex));
    }

    public int getVerticesCount() {
        return map.size();
    }

    public boolean hasVertex(T v) {
        return map.containsKey(v);
    }
    public Iterable<T> List(T v) {
        if (!hasVertex(v)) return null;
        return map.get(v).List();
    }
}
