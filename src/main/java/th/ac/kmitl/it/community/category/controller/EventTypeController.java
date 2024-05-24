package th.ac.kmitl.it.community.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.community.category.entity.EventType;
import th.ac.kmitl.it.community.category.service.EventTypeService;
import th.ac.kmitl.it.community.core.base.BaseApplicationController;

@RestController
@RequestMapping("/api/category/event-type")
public class EventTypeController extends BaseApplicationController<EventType> {
    @Autowired
    public EventTypeController(EventTypeService service) {
        super(service);
    }
}
