package com.example.mspedido.controller;

import com.example.mspedido.entity.Pedido;
import com.example.mspedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @GetMapping
    public ResponseEntity<List<Pedido>> listar(){
        return ResponseEntity.ok(pedidoService.listar());
    }
    @PostMapping
    public ResponseEntity<Pedido> guardar(@RequestBody Pedido pedido){
        return ResponseEntity.ok(pedidoService.guardar(pedido));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> insertPorld(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(pedidoService.listarPorId(id).get());
    }
    @PutMapping
    public ResponseEntity<Pedido> actualizar(@RequestBody Pedido pedido){
        return ResponseEntity.ok(pedidoService.actualizar(pedido));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Pedido>> deleteById(@PathVariable(required = true)Integer id){
        pedidoService.eliminarPorId(id);
        return ResponseEntity.ok(pedidoService.listar());
    }
}
