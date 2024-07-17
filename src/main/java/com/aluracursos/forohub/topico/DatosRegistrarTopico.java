package com.aluracursos.forohub.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistrarTopico(
        @NotBlank
        String nombre,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje
) {
}
