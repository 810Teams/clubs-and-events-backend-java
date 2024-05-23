package th.ac.kmitl.it.community.core.base;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import th.ac.kmitl.it.community.core.exception.ObjectNotFoundException;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@AllArgsConstructor
public abstract class BaseApplicationController<T> {
    protected final BaseApplicationService<T> service;

    @SuppressWarnings("unchecked")
    private Class<T> getObjectType() {
        // Retrieves T.class which is originally not possible
        // Source: https://stackoverflow.com/questions/11158912/how-to-get-the-class-of-a-field-of-type-t
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @GetMapping
    public ResponseEntity<List<T>> list() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> retrieve(@PathVariable Integer id) {
        if (service.findById(id).isEmpty()) {
            throw new ObjectNotFoundException(id);
        }
        return new ResponseEntity<>(service.findById(id).get(), HttpStatus.OK);
    }
}
