/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EjercicioPractico2_CesarArroyoViquez.service.impl;

import com.example.EjercicioPractico2_CesarArroyoViquez.domain.Empleados;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.EjercicioPractico2_CesarArroyoViquez.Dao.EmpleadosDao;
import com.example.EjercicioPractico2_CesarArroyoViquez.service.EmpleadosService;

@Service
public class EmpleadosServiceimpl implements EmpleadosService {

    @Autowired
    private EmpleadosDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleados> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Empleados getCategoria(Empleados categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Empleados categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Empleados categoria) {
        categoriaDao.delete(categoria);
    }
}
