package br.com.dio.picpayclone.Model;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstrutor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "USUARIOS")
public class UsuarioModel extends EntidadeBase {

    @Column(name = "USU_LOGIN", nullable = false)
    private String login;
   
    @Column (name = "USU_SENHA", nullable = false)
    private String senha;
   
    @Column(name = "USU_EMAIL", nullable = false )
    private Sring email;
   
    @Column (name = "USU_NOME_COMPLETO", nullable = false)
    private String nomeCompleto;
    
    @Column (name = "USU_CPF", nullable = false)
    private String cpf;
   
    @Column(name ="USU_DATA_NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;
    
    @Column(name = "USU_NUMERO_TELEFONE", nullable = false)
    private String numeroTelefone;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.MERGE, orphanRemoval = true )
    // fetch controla a carga de dados -- cascade é atualização e exclusão da tabela
    // orphanRemoval  é caso excluir o model principal apagar informações que são vinculadas a ele
    private List<CartaoCredito> cartoesCredito;

    @Column(name = "USU_SALDO", nullable = false)
    private Double saldo;

    @Column(name = "USU_ATIVO", nullable = false)
    private Boolean ativo;



    



    
}