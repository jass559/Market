package com.jass.market.persistence.entity;


import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private BigInteger celular;
    private String direccion;

    @Column(name="correo_electronico")
    private String correo;

    @OneToMany(mappedBy = "clientes")
    private List<Compra> compras;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public BigInteger getCelular() {
        return celular;
    }

    public void setCelular(BigInteger celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
