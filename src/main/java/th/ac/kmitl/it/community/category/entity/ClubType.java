package th.ac.kmitl.it.community.category.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ClubType extends Category {
    public ClubType(String titleEn, String titleTh) {
        super(titleEn, titleTh);
    }
}
