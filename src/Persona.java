// Clase Persona (versión corregida)

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Persona {
    private String nombre;
    private int edad;
    private Domicilio domicilio;
}
