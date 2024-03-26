package part01.iterator;

public interface Iterator<T> {
    boolean hasNext();

    T current();

    void next();

}
