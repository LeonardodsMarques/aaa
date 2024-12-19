package dominio;

import java.util.ArrayList;
import java.util.List;

public class Estrutura {
    private String nome;
    private List<Item> itens;

    public Estrutura(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionaItem(Item item) {
        if (item != null) {
            this.itens.add(item);
        }
    }

    public List<Item> getItens() {
        return this.itens;
    }

    public int pesoTotal() {
        int total = 0;
        for (Item item : this.itens) {
            total += item.peso();
        }
        return total;
    }

    public int custoTotal() {
        int total = 0;
        for (Item item : this.itens) {
            total += item.custo();
        }
        return total;
    }
}