package br.com.dio.picpayclone.Controller;


@RestController
@RequestMapping("/transacoes")
public class TransacaoController extends ControllerBase<TransacaoDTO>{


@PostMapping
public ResponseEntity<TransacaoDTO> salvar(@RequestBody @Valid TransacaoDTO  TransacaoDTO){
    TransacaoDTo TransacaoRetornoDTO = transacaoService.processar(TransacaoDTO);
    return responderItemCriadoComURI(transacaoRetornoDTO, uriBuilder, "/transacoes/{codigo}",
     transacaoRetornoDTO.getCodigo());

}


}