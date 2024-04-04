package com.api.rest.springboot.webflux.documents;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id;
    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotNull
    private Integer edad;

    @NotNull Double sueldo;

    private String foto;

}
