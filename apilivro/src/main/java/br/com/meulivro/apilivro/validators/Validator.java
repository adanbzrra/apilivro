package br.com.meulivro.apilivro.validators;

import br.com.meulivro.apilivro.validators.exceptions.ValidacaoException;

/**
 * Validador dados.
 *
 * @param <T> Tipo do valor do dado.
 */
public interface Validator<T> {
  /**
   * Valida o dado e levanta uma exceção caso o dado seja inválido.
   *
   * @param nome Identificador do dado
   * @param valor Valor do dado que será validado.
   * @throws ValidacaoException
   */
  void validar(final String nome, final T valor) throws ValidacaoException;

  /**
   * Valida o dado e levanta uma exceção caso o dado seja inválido.
   *
   * @param valor Valor do dado que será validado.
   * @throws ValidacaoException
   */
  void validar(final T valor) throws ValidacaoException;
}

