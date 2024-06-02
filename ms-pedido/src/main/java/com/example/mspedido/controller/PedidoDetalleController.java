package com.example.mspedido.controller;

import com.example.mspedido.entity.PedidoDetalle;
import com.example.mspedido.service.PedidoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidodetalle")
public class PedidoDetalleController {

    @Autowired
    private PedidoDetalleService pedidodetalleService;
    @GetMapping
    public ResponseEntity<List<PedidoDetalle>> listar(){
        return ResponseEntity.ok(pedidodetalleService.listar());
    }
    @PostMapping
    public ResponseEntity<PedidoDetalle> guardar(@RequestBody PedidoDetalle pedidodetalle){
        return ResponseEntity.ok(pedidodetalleService.guardar(pedidodetalle));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDetalle> insertPorld(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(pedidodetalleService.listarPorId(id).get());
    }
    @PutMapping
    public ResponseEntity<PedidoDetalle> actualizar(@RequestBody PedidoDetalle pedidodetalle){
        return ResponseEntity.ok(pedidodetalleService.actualizar(pedidodetalle));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<PedidoDetalle>> deleteById(@PathVariable(required = true)Integer id){
        pedidodetalleService.eliminarPorId(id);
        return ResponseEntity.ok(pedidodetalleService.listar());
    }
}
