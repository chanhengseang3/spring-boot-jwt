package murraco.dto;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import murraco.model.AppUserRole;

@Data
@NoArgsConstructor
public class UserDataDTO {

  @Schema(description = "Username")
  private String username;
  @Schema(description = "Email")
  private String email;
  @Schema(description = "Password")
  private String password;
  @Schema(description = "User roles")
  List<AppUserRole> appUserRoles;

}
