// Clase Domicilio (versión corregida)

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "residente") // Excluimos 'residente' de la función ToString
@EqualsAndHashCode(exclude = "residente") // Excluimos 'residente' para evitar ciclos o referencias recursivas al calcular equals() y hashCode()
public class Domicilio {
    private String calle;
    private int numero;
    private Persona residente;
}
