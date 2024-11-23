package granjas.granja.Servicio.Impl;

import granjas.granja.Entidad.GranjaEntidad;

import granjas.granja.Repositorio.GranjaRepositorio;
import granjas.granja.Servicio.GranjaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GranjaServiceImpl implements GranjaServicio {

    @Autowired
    public GranjaRepositorio granjaRepositorio;

    @Override
    public List<GranjaEntidad> obtenerGranjas() {
        return granjaRepositorio.findAll();
    }

    @Override
    public GranjaEntidad crearGranja(GranjaEntidad granjaEntidad) {

        return granjaRepositorio.save(granjaEntidad);
    }

    @Override
    public GranjaEntidad actualizarGranja(GranjaEntidad granjaEntidad, Integer granja_id) {
        return null;
    }

    /*
        @Override
        public GranjaEntidad actualizarGranja(GranjaEntidad granjaEntidad, Integer granja_id) {
            GranjaEntidad granja = granjaRepositorio.findById(granja_id)
                    .orElseThrow(()->new RuntimeException("No existe"));

            granja.setGranjas_id(granjaEntidad.getGranjas_id());
            granja.setGranjas_nombre(granjaEntidad.getGranjas_nombre());
            granja.setGranjas_estado(granjaEntidad.getGranjas_estado());
            granja.setGranjas_nregistro(granjaEntidad.getGranjas_nregistro());
            granja.setGranjas_ubicacion(granjaEntidad.getGranjas_ubicacion());
            return granjaRepositorio.save(granja);
        }
    */
    @Override
    public void eliminarGranja(Integer granja_id) {
        granjaRepositorio.findById(granja_id)
                .orElseThrow(()->new RuntimeException("No existe"));

        granjaRepositorio.deleteById(granja_id);
    }
}
