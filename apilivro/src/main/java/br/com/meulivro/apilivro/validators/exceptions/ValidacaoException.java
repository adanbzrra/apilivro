package br.com.meulivro.apilivro.validators.exceptions;

import br.com.meulivro.apilivro.enums.TipoCodigoErro;

public class ValidacaoException extends Exception {

	  private static final long serialVersionUID = -4725938539313046316L;

	  private final TipoCodigoErro codigoErro;

	  public ValidacaoException(String message) {
	    this(message, TipoCodigoErro.VALOR_INVALIDO);
	  }

	  public ValidacaoException(String message, TipoCodigoErro codigoErro) {
	    super(message);
	    this.codigoErro = codigoErro;
	  }

	  public TipoCodigoErro getCodigoErro() {
	    return codigoErro;
	  }
}
