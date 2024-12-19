
import java.util.ArrayList;
import java.util.List;

public class Material {
  private String codigo;
  private int gramasPorCm;
  private boolean polido;
  private List<Item> itens = new ArrayList<Item>();
  
  public Material(String cod, int gPorc, boolean pol) {
    this.codigo = cod;
    this.gramasPorCm = gPorc;
    this.polido = pol;
  }
  
public String getCodigo() {
	return codigo;
}
public int getGramasPorCm() {
	return gramasPorCm;
}
public boolean getPolido() {
	return polido;
}
public List<Item> getItens() {
	return itens;
}

public void adicionaItem(Item i) {
	this.itens.add(i);
}
  
}
