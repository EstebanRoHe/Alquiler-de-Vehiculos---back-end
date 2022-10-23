package com.cr.ac.una.proyecto.Models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "log")
public class Log implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_log;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "metodo")
    private String metodo;

    public Log() {
    }

    public Log(Long id_log, Date fecha, String metodo) {
        this.id_log = id_log;
        this.fecha = fecha;
        this.metodo = metodo;
    }

    public Long getId_log() {
        return id_log;
    }

    public void setId_log(Long id_log) {
        this.id_log = id_log;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}