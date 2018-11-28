package Persistence;

import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;

public interface Repository {
    Collection<Object> entities = null;

    Boolean put(Object o);
    void update(Object o);
    Collection<Object> findWhere(Predicate<Object> predicate, Comparator<Object> sorter);
    Collection<Object> findWhere(Predicate<Object> predicate);
    Object findOne(Predicate<Object> predicate);
    Object get(int id);
}
