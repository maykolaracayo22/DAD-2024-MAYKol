package com.example.mscatalogo.service.impl;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.repository.CategoriaRepositorio;
import com.example.mscatalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Categoria> lista(){ return categoriaRepositorio.findAll(); }

    @Override
    public Categoria guardar(Categoria categoria) { return  categoriaRepositorio.save(categoria);}

    @Override
    public Optional<Categoria> listarPorId(Integer id) {
        return categoriaRepositorio.findById(id);
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        categoriaRepositorio.deleteById(id);
    }

}
