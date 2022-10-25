package com.cr.ac.una.proyecto.Models;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    @Column(name = "identificacion", nullable=false)
    private int identificacion;
    @Column(name = "nombre", nullable=false)
    private String nombre;

    public Persona(Long id_persona, int identificacion, String nombre) {
        this.id_persona = id_persona;
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
