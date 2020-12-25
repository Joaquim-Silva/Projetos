package br.com.dio.picpayclone.Model;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstrutor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "TRANSACOES")
public class Transacao extends EntidadeBase {

    @Column(name = "TR_CODIGO", nullable = false)
    private String codigo;

    @ManyToOne(cascade = { CascadeType.MERGE})
    @JoinColumn(name = "TR_USUARIO_ORIGEM", nullable = false)
    private Usuario origem;

    
    @ManyToOne(cascade = { CascadeType.MERGE}, fech = FetchType.EAGER)
    @JoinColumn(name = "TR_USUARIO_DESTINO", nullable = false)
    private Usuario destino;

    @Column(name = "TR_DATA_HORA", nullable = false)
    private LocalDateTime dataHora;

    @Column(name = "TR_VALOR",nullable = false)
    private Double valor;
}