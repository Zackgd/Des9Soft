package com.peso.elBuenSabor.entities;

import com.peso.elBuenSabor.enums.FormaPago;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Factura extends Base{

    @NotNull
    @Column(name = "fecha_facturacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFacturacion;

   // @Column(name = "mp_payment_id")
   // private Long mpPaymentId;

    //@Column(name = "mp_merchant_order_id")
    //private Long mpMerchantOrderId;

    //@Column(name = "mp_preference_id")
    //private String mpPreferenceId;

    //@Column(name = "mp_payment_type")
    //private String mpPaymentType;

   // @NotNull
    //private FormaPago formaPago;
//agregue esto
   @OneToOne
   @JoinColumn(name = "id_mp_datos")
   private MPDatos mpDatos;
    @NotNull
    @Column(name = "total_venta", precision = 10, scale = 2)
    private BigDecimal totalVenta;

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

}
