package granjas.granja.Servicio.Impl;

import granjas.granja.Entidad.GranjeroEntidad;
import granjas.granja.Repositorio.GranjeroRepositorio;
import granjas.granja.Servicio.GranjeroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GranjeroServiceImpl implements GranjeroServicio {

    @Autowired
    public GranjeroRepositorio granjeroRepositorio;

    @Override
    public List<GranjeroEntidad> obtenerGranjeros() {
        return granjeroRepositorio.findAll();
    }

    @Override
    public GranjeroEntidad crearGranjero(GranjeroEntidad granjeroEntidad) {
        return granjeroRepositorio.save(granjeroEntidad);
    }

    @Override
    public GranjeroEntidad actualizarGranjero(GranjeroEntidad granjeroEntidad, Integer granjero_id) {
        return null;
    }

    /*
    @Override
    public GranjeroEntidad actualizarGranjero(GranjeroEntidad granjeroEntidad, Integer granjero_id) {
        GranjeroEntidad granjero = granjeroRepositorio.findById(granjero_id)
                .orElseThrow(()->new RuntimeException("No existe"));
        granjero.setGranjero_id(granjeroEntidad.getGranjero_id());
        granjero.setGranjero_nombre(granjeroEntidad.getGranjero_nombre());
        granjero.setGranjero_telefono(granjeroEntidad.getGranjero_telefono());
        granjero.setGranjero_correo(granjeroEntidad.getGranjero_correo());
        return granjeroRepositorio.save(granjero);
    }
*/
    @Override
    public void eliminarGranjero(Integer granjero_id) {
        granjeroRepositorio.findById(granjero_id)
                .orElseThrow(()->new RuntimeException("No existe"));
        granjeroRepositorio.deleteById(granjero_id);
    }
}
