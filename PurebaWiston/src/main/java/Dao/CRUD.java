package Dao;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface CRUD<T> {

    public void create(T t);

    Collection<T> getAll() throws IOException;

    int update(T t) throws IOException;

    boolean delete(T t) throws IOException;
    
}
