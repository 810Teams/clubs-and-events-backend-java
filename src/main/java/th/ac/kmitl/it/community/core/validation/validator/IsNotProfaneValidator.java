package th.ac.kmitl.it.community.core.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import th.ac.kmitl.it.community.core.validation.annotation.IsNotProfane;

import java.util.Arrays;
import java.util.List;

public class IsNotProfaneValidator implements ConstraintValidator<IsNotProfane, String> {
    @Override
    public boolean isValid(String message, ConstraintValidatorContext constraintValidatorContext) {
        // TODO: Implements actual profane validator
        List<String> profaneWords = Arrays.asList("fuck", "shit", "damn", "cunt", "bitch");
        for (String word : profaneWords) {
            if (message.contains(word)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void initialize(IsNotProfane constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
