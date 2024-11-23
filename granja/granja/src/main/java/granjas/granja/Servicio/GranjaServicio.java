package granjas.granja.Servicio;


import granjas.granja.Entidad.GranjaEntidad;

import java.util.List;


public interface GranjaServicio {

    public List<GranjaEntidad> obtenerGranjas ();

    public GranjaEntidad crearGranja(GranjaEntidad granjaEntidad);

    public GranjaEntidad actualizarGranja (GranjaEntidad granjaEntidad, Integer granja_id);

    public void eliminarGranja(Integer granja_id);
}
