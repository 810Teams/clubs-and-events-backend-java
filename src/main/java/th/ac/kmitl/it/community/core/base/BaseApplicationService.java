package th.ac.kmitl.it.community.core.base;

import java.util.List;
import java.util.Optional;

public interface BaseApplicationService<T> {
    List<T> findAll();

    Optional<T> findById(Integer id);

    T saveOrUpdate(T obj);

    boolean deleteById(Integer id);
}
