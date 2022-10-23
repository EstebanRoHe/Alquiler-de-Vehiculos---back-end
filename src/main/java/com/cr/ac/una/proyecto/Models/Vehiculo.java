package com.cr.ac.una.proyecto.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Vehiculo;
    @Column(name = "placa", nullable = false)
    private String placa;
    @OneToOne()
    @JoinColumn(name = "tipo_vehiculo")
    private Tipo_Vehiculo tipo_vehiculo;



    public Tipo_Vehiculo getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(Tipo_Vehiculo tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public Vehiculo(Long id_Vehiculo, String placa, Tipo_Vehiculo tipo_vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
        this.placa = placa;
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public Vehiculo() {
    }

    public Long getId_Vehiculo() {
        return id_Vehiculo;
    }

    public void setId_Vehiculo(Long id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
