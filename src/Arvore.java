import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    private No Raiz;



    public Arvore(No raiz) {
        Raiz = raiz;

    }

    public int conatagemNo(No node) {
        if(node==null) return 0;
        return 1 + conatagemNo(node.getEsquerda()) + conatagemNo(node.getDireita());
    }

    public void percorrerPreOrdem(No node){
       if(node != null){
           System.out.println(node.getConteudo()+" ");
           percorrerPreOrdem(node.getEsquerda());
           percorrerPreOrdem(node.getDireita());
       }
    }
    public void percorrerEmOrdem(No node) {
        if (node != null) {
            percorrerEmOrdem(node.getEsquerda());
            System.out.println(node.getConteudo() + " ");
            percorrerEmOrdem(node.getDireita());
        }
    }
        public void percorrerPosOrdem(No node) {
            if(node != null){
                percorrerPosOrdem(node.getEsquerda());
                percorrerPosOrdem(node.getDireita());
                System.out.println(node.getConteudo()+" ");
            }
        }

    public void buscaEmNivel() {
        if (Raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(Raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.getConteudo() + " ");

            if (atual.getEsquerda() != null) fila.add(atual.getEsquerda());
            if (atual.getDireita() != null) fila.add(atual.getDireita());
        }
    }
    //grande kleytão eterno
    public int conatagemNoRecursivo() {
    int contador = 0;
    No aux = this.Raiz;
    if (aux.getDireita() != null){
        contador++;
    }

    }

        return 0;
    }


}


