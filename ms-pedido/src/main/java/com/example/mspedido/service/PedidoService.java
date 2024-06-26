package com.example.mspedido.service;
import com.example.mspedido.entity.Pedido;

import java.util.List;
import java.util.Optional;
public interface PedidoService {

    public List<Pedido> listar();
    public Pedido guardar(Pedido pedidos);
    public Pedido actualizar(Pedido pedidos);
    public Optional<Pedido> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
