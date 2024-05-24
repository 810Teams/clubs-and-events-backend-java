package th.ac.kmitl.it.community.category.service.impl;

import org.springframework.stereotype.Service;
import th.ac.kmitl.it.community.category.entity.EventType;
import th.ac.kmitl.it.community.category.repository.EventTypeRepository;
import th.ac.kmitl.it.community.category.service.EventTypeService;
import th.ac.kmitl.it.community.core.base.BaseApplicationServiceImpl;

@Service
public class EventTypeServiceImpl extends BaseApplicationServiceImpl<EventType> implements EventTypeService {
    public EventTypeServiceImpl(EventTypeRepository repository) {
        super(repository);
    }
}
