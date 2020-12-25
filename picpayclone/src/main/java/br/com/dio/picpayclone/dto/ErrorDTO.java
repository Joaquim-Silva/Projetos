package br.com.dio.picpayclone.dto;

@Data
@AllArgsCoinstrutor
@JsonIncluse(Incluse.NON_NULL)

public class ErrorDTO {
private String campo;
private String mensagem;
    
}