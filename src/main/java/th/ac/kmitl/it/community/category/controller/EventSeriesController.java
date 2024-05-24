package th.ac.kmitl.it.community.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.community.category.entity.EventSeries;
import th.ac.kmitl.it.community.core.base.BaseApplicationController;
import th.ac.kmitl.it.community.core.base.BaseApplicationService;

@RestController
@RequestMapping("/api/category/event-series")
public class EventSeriesController extends BaseApplicationController<EventSeries> {
    @Autowired
    public EventSeriesController(BaseApplicationService<EventSeries> service) {
        super(service);
    }
}
