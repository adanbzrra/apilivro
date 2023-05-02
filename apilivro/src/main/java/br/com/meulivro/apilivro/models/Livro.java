package br.com.meulivro.apilivro.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Livros")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LIVRO")
	private int id;
	
	@Column(name = "ISBN")
	private String isbn;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "ANO")
	private String ano;
}
