# apilivro
Desenvolvimento de uma API com Spring para testar validações com Spring Boot Validation.

O isbn ou “International Standart Book Numbers”. Ele
é composto por 17 dígitos com hífens. é utilizado para
identificar os livros numericamente. Essa identificação
permite a idividualização da publicação.

## Testes de validação

### Teste de ISBN inválido:
- Contendo letras
- Com tamanho menor que 13 dígitos
- Com tamanho maior que 13 dígitos
- Vazio
- Nulo
- Com 13 dígitos sem hífens
- Com 13 dígitos com hífens
- Com 10 dígitos com hífens

### ISBN válido:
- 978-65-89999-01-3