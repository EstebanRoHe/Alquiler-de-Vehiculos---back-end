package com.cr.ac.una.proyecto.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Tipo_Vehiculo")
public class Tipo_Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Tipo_Vehiculo;

    @Column(name = "descripsion", nullable = false)
    private String descripsion;

    public Tipo_Vehiculo(Long id_Tipo_Vehiculo, String descripsion) {
        this.id_Tipo_Vehiculo = id_Tipo_Vehiculo;
        this.descripsion = descripsion;
    }

    public Tipo_Vehiculo() {
    }

    public Long getId_Tipo_Vehiculo() {
        return id_Tipo_Vehiculo;
    }

    public void setId_Tipo_Vehiculo(Long id_Tipo_Vehiculo) {
        this.id_Tipo_Vehiculo = id_Tipo_Vehiculo;
    }

    public String getDescripsion() {
        return descripsion;
    }

    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }
}
