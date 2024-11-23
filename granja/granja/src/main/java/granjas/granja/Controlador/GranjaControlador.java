package granjas.granja.Controlador;

import granjas.granja.Entidad.GranjaEntidad;
import granjas.granja.Servicio.GranjaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/granja")
public class GranjaControlador {

    @Autowired
    public GranjaServicio granjaServicio;

    @GetMapping
    public List<GranjaEntidad> obtenerGranjas(){
        return  granjaServicio.obtenerGranjas();
    }

    @PostMapping("/crear")
    public ResponseEntity<GranjaEntidad> crearGranja(@RequestBody GranjaEntidad granjaEntidad){
        granjaServicio.crearGranja(granjaEntidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(granjaEntidad);
    }

    @PutMapping ("/{granja_id}")
    public  ResponseEntity<GranjaEntidad> actualizarGranja (@RequestBody GranjaEntidad granjaEntidad,@PathVariable(value = "granja_id") Integer granja_id){
        granjaServicio.actualizarGranja(granjaEntidad,granja_id);
        return ResponseEntity.status((HttpStatus.ACCEPTED)).body(granjaEntidad);
    }

    @DeleteMapping ("/{granja_id}")
    public ResponseEntity<?> eliminarGranja(@PathVariable(value = "granja_id") Integer granja_id){
        granjaServicio.eliminarGranja(granja_id);
        return ResponseEntity.status((HttpStatus.ACCEPTED)).body("Elminado");
    }

}
