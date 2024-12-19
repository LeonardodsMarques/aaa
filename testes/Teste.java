package testes;

import dominio.*;
import telas.Tela;

import java.util.ArrayList;
import java.util.List;

public class TestaMateriais {
    public static void main(String[] args) {
        // Questão 2
        Material ferro1 = new Ferro("F1", 1200, true);
        Material ferro2 = new Ferro("F2", 1300, false);
        Material aluminio1 = new Aluminio("A1", 600, true);
        Material aluminio2 = new Aluminio("A2", 700, false);

        List<Material> materiais = new ArrayList<>();
        materiais.add(ferro1);
        materiais.add(ferro2);
        materiais.add(aluminio1);
        materiais.add(aluminio2);

        // Questão 3
        Item lado1 = new Item("Lado 1", 3, ferro1);
        Item lado2 = new Item("Lado 2", 3, ferro2);
        Item lado3 = new Item("Lado 3", 2, aluminio1);
        Item lado4 = new Item("Lado 4", 2, aluminio2);
        Item porta1 = new Item("Porta 1", 1, aluminio1);
        Item janela1 = new Item("Janela 1", 1, ferro1);

        Produto casa = new Produto("Casa");
        casa.adicionaItem(lado1);
        casa.adicionaItem(lado2);
        casa.adicionaItem(lado3);
        casa.adicionaItem(lado4);
        casa.adicionaItem(porta1);
        casa.adicionaItem(janela1);

        Tela tela = new Tela();

        // Questão 4
        tela.imprimeMateriais(materiais);

        // Questão 5
        tela.imprimeProduto(casa, ferro1);

        // Questão 6
        Estrutura estrutura = new Estrutura("Estrutura Casa");
        estrutura.adicionaItem(lado1);
        estrutura.adicionaItem(lado2);
        System.out.printf("Peso Total: %d\n", estrutura.pesoTotal());
        System.out.printf("Custo Total: %d\n", estrutura.custoTotal());
    }
}