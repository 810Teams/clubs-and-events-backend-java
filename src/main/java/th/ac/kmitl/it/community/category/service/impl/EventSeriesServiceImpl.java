package th.ac.kmitl.it.community.category.service.impl;

import org.springframework.stereotype.Service;
import th.ac.kmitl.it.community.category.entity.EventSeries;
import th.ac.kmitl.it.community.category.repository.EventSeriesRepository;
import th.ac.kmitl.it.community.category.service.EventSeriesService;
import th.ac.kmitl.it.community.core.base.BaseApplicationServiceImpl;

@Service
public class EventSeriesServiceImpl extends BaseApplicationServiceImpl<EventSeries> implements EventSeriesService {
    public EventSeriesServiceImpl(EventSeriesRepository repository) {
        super(repository);
    }
}
