package cgg.thymeleafproj.thyme.validations;

import java.util.logging.Logger;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ImageNameValidator implements ConstraintValidator<ImageName, String> {

    private Logger l1 = Logger.getLogger(ImageNameValidator.class.getName());

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        l1.info("message from invalid" + value);

        if (value.isBlank()) {
            return false;

        }
        return true;
    }

}
