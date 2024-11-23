package granjas.granja.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="granjeros")
public class GranjeroEntidad {

    @Id
    private Integer granjero_id;

    @Column (length = 50,nullable = false)
    private Integer granjero_nombre;

    @Column (length = 50 ,nullable = false)
    private String granjero_telefono;

    @Column (length = 100,nullable = false,unique = true)
    private String granjero_correo;
}
