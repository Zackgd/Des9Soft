package com.peso.elBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "unidad_medida")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UnidadMedida extends Base{

    @NotNull
    @Column(length = 255)
    private String denominacion;

    @NotNull
    @Column(length = 25)
    private String abreviatura;

    @NotNull
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "UnidadMedida_id")
    private List<ArticuloInsumo> articuloInsumos = new ArrayList<>();
}