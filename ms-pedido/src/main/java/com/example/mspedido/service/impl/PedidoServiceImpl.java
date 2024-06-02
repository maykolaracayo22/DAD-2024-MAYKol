package com.example.mspedido.service.impl;
import com.example.mspedido.entity.Pedido;
import com.example.mspedido.entity.PedidoDetalle;
import com.example.mspedido.repository.PedidoRepository;
import com.example.mspedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;



    @Override
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }


    @Override
    public Pedido guardar(Pedido pedidos) {
        return pedidoRepository.save(pedidos);
    }


    @Override
    public Pedido actualizar(Pedido pedidos) {
        return pedidoRepository.save(pedidos);
    }


    @Override
    public void eliminarPorId(Integer id) {
        pedidoRepository.deleteById(id);
    }

}
