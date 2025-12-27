package az.edu.itbrains.ecommerce.dtos.auth;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    @Size(min = 3, max = 20, message = "Name must be min 3 max 20 symbols.")
    private String name;
    @Size(min = 3, max = 20, message = "Name must be min 3 max 20 symbols.")
    private String surname;
    @Email(message = "Email must be valid.")
    private String email;
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")
    private String password;
    @NotBlank(message = "Confirm password cannot be empty.")
    private String passwordConfirm;
    @AssertTrue(message = "Passwords do not match.")
    public boolean isPasswordMatching() {
        return password != null && password.equals(passwordConfirm);
    }
}
