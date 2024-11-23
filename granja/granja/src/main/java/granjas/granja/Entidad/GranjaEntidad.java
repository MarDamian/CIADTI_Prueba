package granjas.granja.Entidad;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name="granjas")
public class GranjaEntidad {
    @Id
    private Integer granjas_id;

    @Column(length = 50,nullable = false)
    private Integer granjas_nombre;

    @Column (length = 50 ,nullable = false)
    private String granjas_estado;

    @Column (length = 100,nullable = false,unique = true)
    private Integer granjas_nregistro;

    @Column (length = 50 ,nullable = false)
    private String granjas_ubicacion;



}
