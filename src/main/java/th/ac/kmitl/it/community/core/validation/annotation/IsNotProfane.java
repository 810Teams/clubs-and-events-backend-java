package th.ac.kmitl.it.community.core.validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import th.ac.kmitl.it.community.core.validation.validator.IsNotProfaneValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IsNotProfaneValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsNotProfane {
    String message() default "Target string contains profanity.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
