package br.com.dio.picpayclone.Model;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstrutor
@EqualsAndHashCode(callSuper = false)
@Entity
public class CartaoCredito  extends EntidadeBase{

  @Column(name = "CC_NUMERO", nullable = false)
  private String numero;

  @Enumerated(EnumType.STRING)
  @Column(name = "CC_Bandeira", nullable = false)
  private BandeiraCartao bandeira;

  @Column(name= "CC_TOKEN")
  private String numeroToken;

  @ManyToOne(cascade = { Cascadetype.MERGE})
  @JoinColumn (name = "CC_USUARIO_ID", nullable = false)
  private Usuario Usuario;

    
}