package prueba.supermercado.ORUS_SYSTEM.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prueba.supermercado.ORUS_SYSTEM.Exception.ResourceNotFoundException;
import prueba.supermercado.ORUS_SYSTEM.Model.Pedidos;
import prueba.supermercado.ORUS_SYSTEM.Repository.PedidosRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200/")
public class PedidosController {
    @Autowired
    private PedidosRepository pedidosRepository;

    @GetMapping("/pedidos")
    public List<Pedidos> listarPedidos() { return pedidosRepository.findAll();}

    @PostMapping("/pedidos")
    public Pedidos guardarPedidos(@RequestBody Pedidos pedidos){ return pedidosRepository.save(pedidos);}

    @GetMapping("/pedidos/{id}")
    public ResponseEntity<Pedidos> obtenerPedidosPorId(@PathVariable Long id){
        Pedidos pedidos = pedidosRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No exite el pedido" + id));
        return ResponseEntity.ok(pedidos);
    }

    @PutMapping("/pedidos/{id}")
    public ResponseEntity<Pedidos> actualizarFrutas(@PathVariable Long id, @RequestBody Pedidos pedidosDetalle){
        Pedidos pedidos = pedidosRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Existe la fruta" + id));
        pedidos.setListaFrutas(pedidosDetalle.getListaFrutas());
        pedidos.setValorTotal(pedidosDetalle.getValorTotal());

        Pedidos pedidoActualizada = pedidosRepository.save(pedidos);
        return ResponseEntity.ok(pedidoActualizada);
    }
}
