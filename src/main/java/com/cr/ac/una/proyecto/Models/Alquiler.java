package com.cr.ac.una.proyecto.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "Alquiler")
public class Alquiler implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Alquiler;

    @ManyToOne
    @JoinColumn(name = "alquiler")
    private Persona personas;

    @ManyToOne
    @JoinColumn(name = "alquilerv")
    private Vehiculo vehiculos;
    @JoinColumn(name = "fecha")
    private String fecha;

    public Alquiler(Long id_Alquiler, Persona personas, Vehiculo vehiculos, String fecha) {
        this.id_Alquiler = id_Alquiler;
        this.personas = personas;
        this.vehiculos = vehiculos;
        this.fecha = fecha;
    }

    public Alquiler() {
    }

    public Long getId_Alquiler() {
        return id_Alquiler;
    }

    public void setId_Alquiler(Long id_Alquiler) {
        this.id_Alquiler = id_Alquiler;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    public Vehiculo getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
