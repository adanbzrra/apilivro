package br.com.meulivro.apilivro.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meulivro.apilivro.models.Livro;
import br.com.meulivro.apilivro.service.LivroService;
import br.com.meulivro.apilivro.validators.exceptions.ValidacaoException;

@RestController
@RequestMapping("livro")
public class LivroResources {
	
	@Autowired
	private LivroService livroService;
	
	@PostMapping
	public ResponseEntity<?> incluir(@RequestBody final Livro livro){
		
		try {
			livroService.incluir(livro);
			
			if (!livro.getIsbn().matches("^(?:(?=.{17}$)97[89][-](?:[0-9]+[-]){2}[0-9]+[-][0-9])$")) {
				   throw new ValidacaoException("ISBN inválido, e fora do padrão: 978-x-xxx-xxxx-x");
				}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(livro);

		}catch(ValidacaoException ex){
			
			String mensagemErro = "Erro de validação: " + ex.getMessage();
		    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensagemErro);
		
		}catch(Exception ex){
			
			String mensagemErro = "Erro interno no servidor." + ex.getMessage();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagemErro);
		}	
	}
}
