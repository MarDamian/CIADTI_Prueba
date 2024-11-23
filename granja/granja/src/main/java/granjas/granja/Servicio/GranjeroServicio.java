package granjas.granja.Servicio;

import granjas.granja.Entidad.GranjeroEntidad;

import java.util.List;

public interface GranjeroServicio {

    public List<GranjeroEntidad> obtenerGranjeros ();

    public GranjeroEntidad crearGranjero(GranjeroEntidad granjeroEntidad);

    public GranjeroEntidad actualizarGranjero (GranjeroEntidad granjeroEntidad, Integer granjero_id);

    public void eliminarGranjero(Integer granjero_id);

}
