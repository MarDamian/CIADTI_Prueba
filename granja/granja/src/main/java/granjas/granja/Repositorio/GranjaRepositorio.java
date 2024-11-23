package granjas.granja.Repositorio;

import granjas.granja.Entidad.GranjaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GranjaRepositorio extends JpaRepository<GranjaEntidad, Integer> {
}
