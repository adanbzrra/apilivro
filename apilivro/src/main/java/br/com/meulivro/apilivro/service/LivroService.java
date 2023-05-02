package br.com.meulivro.apilivro.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import br.com.meulivro.apilivro.models.Livro;

public interface LivroService {

	// Inclui um novo livro no banco de dados 

	Livro incluir(Livro livro) throws ServiceException ;

	// Altera um livro no banco de dados

	Livro alterar(Livro livro) throws ServiceException ;

	// Obtém o livro correspondente ao identificador informado.

	Livro buscarPorId(int id) throws ServiceException ;

	// Busca o livro correspondente ao seu número ISBN

	Livro buscarPorIsbn(String isbn) throws ServiceException ;

	// Consulta os livros

	List<Livro> burcarLivros() throws ServiceException;
	} 