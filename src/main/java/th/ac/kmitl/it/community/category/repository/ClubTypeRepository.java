package th.ac.kmitl.it.community.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.kmitl.it.community.category.entity.ClubType;

@Repository
public interface ClubTypeRepository extends JpaRepository<ClubType, Integer> {
}
