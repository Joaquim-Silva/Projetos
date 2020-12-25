package br.com.dio.picpayclone.dto;

import jdk.jfr.DataAmount;
import jdk.jfr.internal.instrument.JIInstrumentationTarget;

@Data
@JsonInclude(Include.NON_NULL)
public class TransacaoDTO {

    @NotBlank
    private String codigo;

    @NotNull
    private UsuarioDTO origem;

    @NotNull
    private UsuarioDTO destino;

    @notNull
    private LocalDateTime dataHora;

    @NotNull
    private Double valor;

    private CartaoCreditoDTO cartaoCredito;

    private Boolean isCartaoCredito = false;

}