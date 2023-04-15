package com.Bodega.responses;

import io.swagger.v3.oas.annotations.media.Schema;

public class Persona404 {
    @Schema(name = "mensaje", example = "La persona que estas buscando no existe en la base de datos", required = false)
    private String mensaje;

    public Persona404(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
