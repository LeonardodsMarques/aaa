
public class Produto {
  private String nome;
  private int preco;
  private int estoque;
  
  public Produto(String n, int p, int e) {
	  this.nome = n;
	  this.preco = p;
	  this.estoque = e;
  }

  public String getNome() {
	return nome;
  }

  public int getPreco() {
	return preco;
  }

  public int getEstoque() {
	return estoque;
  }
  
}//Produto.
