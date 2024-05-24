package th.ac.kmitl.it.community.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.community.category.entity.ClubType;
import th.ac.kmitl.it.community.category.service.ClubTypeService;
import th.ac.kmitl.it.community.core.base.BaseApplicationController;

@RestController
@RequestMapping("/api/category/club-type")
public class ClubTypeController extends BaseApplicationController<ClubType> {
    @Autowired
    public ClubTypeController(ClubTypeService service) {
        super(service);
    }
}
