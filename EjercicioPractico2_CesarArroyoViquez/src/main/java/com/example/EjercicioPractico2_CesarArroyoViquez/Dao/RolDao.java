/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.EjercicioPractico2_CesarArroyoViquez.Dao;

import com.example.EjercicioPractico2_CesarArroyoViquez.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author cesar
 */
public interface RolDao extends JpaRepository <Rol,Long> {
    
}
