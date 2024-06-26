package com.example.mspedido.service.impl;
import com.example.mspedido.entity.PedidoDetalle;
import com.example.mspedido.repository.PedidoDetalleRepository;
import com.example.mspedido.service.PedidoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PedidoDetalleServiceImpl implements PedidoDetalleService {

    @Autowired
    private PedidoDetalleRepository pedidoDetalleRepository;


    @Override
    public List<PedidoDetalle> listar() {
        return pedidoDetalleRepository.findAll();
    }


    @Override
    public PedidoDetalle guardar(PedidoDetalle pedidodetalle) {
        return pedidoDetalleRepository.save(pedidodetalle);
    }


    @Override
    public PedidoDetalle actualizar(PedidoDetalle pedidodetalle) {
        return pedidoDetalleRepository.save(pedidodetalle);
    }


    @Override
    public Optional<PedidoDetalle> listarPorId(Integer id) {
        return pedidoDetalleRepository.findById(id);
    }


    @Override
    public void eliminarPorId(Integer id) {
        pedidoDetalleRepository.deleteById(id);
    }
}
