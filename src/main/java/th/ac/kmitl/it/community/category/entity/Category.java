package th.ac.kmitl.it.community.category.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;
import th.ac.kmitl.it.community.category.constant.CategoryConstant;
import th.ac.kmitl.it.community.core.validation.annotation.IsNotProfane;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = CategoryConstant.TABLE_NAME)
public class Category {
    @Id
    @GeneratedValue
    @Column(name = CategoryConstant.Column.PRIMARY_KEY)
    protected Integer id;

    @Length(min = 4)
    @IsNotProfane
    @Column(name = CategoryConstant.Column.TITLE_EN, length = 64, nullable = false)
    protected String titleEn;

    @Length(min = 4)
    @IsNotProfane
    @Column(name = CategoryConstant.Column.TITLE_TH, length = 64, nullable = false)
    protected String titleTh;

    @CreationTimestamp
    @Column(name = CategoryConstant.Column.CREATED_AT)
    protected Date createdAt;

    @UpdateTimestamp
    @Column(name = CategoryConstant.Column.UPDATED_AT)
    protected Date updatedAt;

    public Category(String titleEn, String titleTh) {
        this.titleEn = titleEn;
        this.titleTh = titleTh;
    }
}
