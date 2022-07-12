package loginSteps;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDataTable {
    String user;
    String pass;
    String nombre, apellido, correo, ciudad, direccion, pais;
    Integer telefono, codigoPostal;
}
