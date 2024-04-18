/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EjercicioPractico2_CesarArroyoViquez.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author cesar
 */
@Data
@Entity
@Table(name = "categoria")

public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_categoria")
    List<Producto> productos;

    public Empleados() {
    }

    public Empleados(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;

    }
}
