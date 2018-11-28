package Persistence.Restaurant;

import Persistence.Repository;

import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;

public class RestaurantRepository implements Repository {
    @Override
    public Boolean put(Object o) {
        return null;
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public Collection<Object> findWhere(Predicate<Object> predicate, Comparator<Object> sorter) {
        return null;
    }

    @Override
    public Collection<Object> findWhere(Predicate<Object> predicate) {
        return null;
    }

    @Override
    public Object findOne(Predicate<Object> predicate) {
        return null;
    }

    @Override
    public Object get(int id) {
        return null;
    }
}
