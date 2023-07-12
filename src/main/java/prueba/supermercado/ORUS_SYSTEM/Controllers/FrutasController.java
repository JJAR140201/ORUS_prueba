package prueba.supermercado.ORUS_SYSTEM.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prueba.supermercado.ORUS_SYSTEM.Exception.ResourceNotFoundException;
import prueba.supermercado.ORUS_SYSTEM.Model.Frutas;
import prueba.supermercado.ORUS_SYSTEM.Repository.FrutaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200/")
public class FrutasController {
    @Autowired
    private FrutaRepository frutaRepository;

    @GetMapping("/frutas")
    public List<Frutas> listarFrutas(){
        return frutaRepository.findAll();
    }

    @PostMapping("/frutas")
    public Frutas guardarFrutas(@RequestBody Frutas frutas){
        return frutaRepository.save(frutas);
    }

    @GetMapping("/frutas/{id}")
    public ResponseEntity<Frutas> obtenerFrutasPorId(@PathVariable Long id){
        Frutas frutas = frutaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Existe la fruta" + id));
        return ResponseEntity.ok(frutas);
    }

    @PutMapping("/frutas/{id}")
    public ResponseEntity<Frutas> actualizarFrutas(@PathVariable Long id, @RequestBody Frutas frutaDetalle){
        Frutas frutas = frutaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Existe la fruta" + id));
        frutas.setTipo(frutaDetalle.getTipo());
        frutas.setCantidad(frutaDetalle.getCantidad());
        frutas.setPrecio(frutaDetalle.getPrecio());

        Frutas frutaActualizada = frutaRepository.save(frutas);
        return ResponseEntity.ok(frutaActualizada);
    }
}
