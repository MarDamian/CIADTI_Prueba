package granjas.granja.Repositorio;

import granjas.granja.Entidad.GranjeroEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GranjeroRepositorio extends JpaRepository<GranjeroEntidad,Integer> {

}
