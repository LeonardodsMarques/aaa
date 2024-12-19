
public class Item {
  private String nome;
  private int tamanho;
  private Produto produto;
	
	public Item(String n, int t, Produto p) {
	  this.nome = n;
	  this.tamanho = t;
	  this.produto = p;
	}

	public String getNome() {
		return nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	public Produto getProduto() {
		return produto;
	}

}//Item.
