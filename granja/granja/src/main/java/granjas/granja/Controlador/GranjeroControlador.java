package granjas.granja.Controlador;

import granjas.granja.Entidad.GranjeroEntidad;
import granjas.granja.Servicio.GranjeroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/granjero")
public class GranjeroControlador {

    @Autowired
    public GranjeroServicio granjeroServicio;

    @GetMapping
    public List<GranjeroEntidad> obtenerGranjeros(){
        return  granjeroServicio.obtenerGranjeros();
    }

    @PostMapping ("/crear")
    public ResponseEntity<GranjeroEntidad> crearGranjero(@RequestBody GranjeroEntidad granjeroEntidad){
        granjeroServicio.crearGranjero(granjeroEntidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(granjeroEntidad);
    }

    @PutMapping ("/{granjero_id}")
    public  ResponseEntity<GranjeroEntidad> actualizarGranjero (@RequestBody GranjeroEntidad granjeroEntidad,@PathVariable(value = "granjero_id") Integer granjero_id){
        granjeroServicio.actualizarGranjero(granjeroEntidad,granjero_id);
        return ResponseEntity.status((HttpStatus.ACCEPTED)).body(granjeroEntidad);
    }

    @DeleteMapping ("/{granjero_id}")
    public ResponseEntity<?> eliminarGranjero (@PathVariable(value = "granjero_id") Integer granjero_id){
        granjeroServicio.eliminarGranjero(granjero_id);
        return ResponseEntity.status((HttpStatus.ACCEPTED)).body("Elminado");
    }

}
