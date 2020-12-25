
package br.com.dio.picpayclone.dto;


public class UsuarioDTO {


    @NotBlank
    private String login;

    private Stirng senha;
    
    private String email;

    private String nomeCompleto;

    private String cpf;

    private LocalDate dataNascimento;

    private String numeroTelefone;

    private Double saldo;




    
}