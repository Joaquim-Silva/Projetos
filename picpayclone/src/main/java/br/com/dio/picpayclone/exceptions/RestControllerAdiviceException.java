package br.com.dio.picpayclone.exceptions;


@RestControllerAdvice
public class RestControllerAdiviceException {

    @Autowired
    private MessageSource messageSource;

    @ResponseStatus (code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler ( MethodArgumentNotValidException.class)
    public List <ErrorDTO> handle(MethodArgumentNotValidExcepition exception) {
        List<ErroDTO> dto = new ArryList<>();

        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        fieldErros.stream().forEach(e->{
            String mensagem = messageSource.getMessage(e, LocaleContextHolder.getLocale());
            ErrorDTO erro = new ErrorDTO(e.getField(), mensagem);
            dto.add(erro);

        });
        return dto;
    }

    
}