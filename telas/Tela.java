package telas;

import dominio.*;

public class Tela {
    public void imprimeProduto(Produto produto, Material material) {
        System.out.printf("Nome\tTamanho\tMaterial\t\tg/cm\tCusto/cm\tPeso\tCusto\n");
        for (Item item : produto.getItens()) {
            if (item.getMaterial().equals(material)) {
                String nomeMaterial = (material instanceof Ferro) ? "Ferro" : "Alumínio";
                String polido = material.getPolido() ? "polido" : "não polido";

                System.out.printf("%s\t%d\t%s-%s %s\t%d\t%d\t%d\t%d\n",
                        item.getNome(),
                        item.getTamanho(),
                        material.getCodigo(),
                        nomeMaterial,
                        polido,
                        material.getGramasPorCm(),
                        material.custoPorCm(),
                        item.peso(),
                        item.custo());
            }
        }
    }

    public void imprimeMateriais(List<Material> materiais) {
        System.out.printf("Código\tMaterial\tPolido\tg/cm\n");
        for (Material material : materiais) {
            String nomeMaterial = (material instanceof Ferro) ? "Ferro" : "Alumínio";
            String polido = material.getPolido() ? "Sim" : "Não";

            System.out.printf("%s\t%s\t%s\t%d\n",
                    material.getCodigo(),
                    nomeMaterial,
                    polido,
                    material.getGramasPorCm());
        }
    }
}