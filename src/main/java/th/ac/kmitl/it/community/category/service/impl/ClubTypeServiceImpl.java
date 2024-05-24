package th.ac.kmitl.it.community.category.service.impl;

import org.springframework.stereotype.Service;
import th.ac.kmitl.it.community.category.entity.ClubType;
import th.ac.kmitl.it.community.category.repository.ClubTypeRepository;
import th.ac.kmitl.it.community.category.service.ClubTypeService;
import th.ac.kmitl.it.community.core.base.BaseApplicationServiceImpl;

@Service
public class ClubTypeServiceImpl extends BaseApplicationServiceImpl<ClubType> implements ClubTypeService {
    public ClubTypeServiceImpl(ClubTypeRepository repository) {
        super(repository);
    }
}
