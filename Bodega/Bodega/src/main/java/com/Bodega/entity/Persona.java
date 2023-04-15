package com.Bodega.entity;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    @Schema(name = "id", example = "5", required = true)
    private Integer id;

    @Column(name = "Nombre")
    @Schema(name = "nombre", example = "Ivan", required = false)
    private String nombre;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Edad")
    private int edad;

    @Column(name = "id_Depo")
    private int idDepo;

    @Column(name = "Email")
    private String email;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String direccion, int edad, int idDepo, String email) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.idDepo = idDepo;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdDepo() {
        return idDepo;
    }

    public void setIdDepo(int idDepo) {
        this.idDepo = idDepo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                ", idDepo=" + idDepo +
                ", email='" + email + '\'' +
                '}';
    }
}
