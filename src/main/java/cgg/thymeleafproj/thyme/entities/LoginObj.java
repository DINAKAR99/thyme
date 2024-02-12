package cgg.thymeleafproj.thyme.entities;

import cgg.thymeleafproj.thyme.validations.ImageName;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginObj {

    @NotEmpty(message = "user cant be empty")
    @Size(min = 3, max = 20, message = "should be btwn 3 and 20")
    public String name;
    // @Pattern(regexp = "/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/",
    // message = "invalid message")
    public String email;
    @AssertTrue(message = "must agree t and c")
    public boolean agreed;
    @ImageName
    public String imageName;
}
