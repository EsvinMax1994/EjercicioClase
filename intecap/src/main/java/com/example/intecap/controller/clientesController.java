package com.example.intecap.controller;

/*import java.util.Optional;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.intecap.models.clientesModel;
/*import com.example.intecap.repository.clienteRepository;*/
import com.example.intecap.service.clientesService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/*import org.springframework.web.bind.annotation.PutMapping;*/
import org.springframework.web.bind.annotation.RequestBody;

@RestController
// http://localhost:8080/clientes/listar
@RequestMapping("/clientes")
@CrossOrigin

public class clientesController {

    @Autowired
    private clientesService clientesService;

    @GetMapping("/listar")
    public Iterable<clientesModel> getClientes() {
        return this.clientesService.findAll();
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> saveClientes(@RequestBody clientesModel entity) {
        try {
            this.clientesService.save(entity);
            return ResponseEntity.ok("Cliente guardado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error en el servidor");
        }

    }

    @DeleteMapping("/eliminar/{idCliente}")
    public ResponseEntity<String> deleteClientes(@PathVariable int idCliente) {
        try {
            this.clientesService.deleteById(idCliente);
            return ResponseEntity.ok("Cliente eliminado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error en el servidor");
        }

    }

    /*@PutMapping("/{id}")
    public ResponseEntity<clientesModel> updateClasificacion(@PathVariable int idCliente,
            @RequestBody clientesModel entity) {
        Optional<clientesModel> this.clientesService.findById(idCliente);
        if (this.clientesService.isPresent()) {
            clientesModel existingClientes = this.clientesService.get(idCliente);
            existingClientes.setNombre(entity.getNombre());
            return ResponseEntity.ok(this.clientesService.save(existingClientes));
        }
        return ResponseEntity.notFound().build();
    }*/

}
