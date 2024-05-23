package th.ac.kmitl.it.community.core.base;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class BaseApplicationServiceImpl<T> implements BaseApplicationService<T> {
    protected final JpaRepository<T, Integer> repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public T saveOrUpdate(T obj) {
        return repository.saveAndFlush(obj);
    }

    @Override
    public boolean deleteById(Integer id) {
        if (findById(id).isEmpty()) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
