public class Arvore {
    private No Raiz;



    public Arvore(No raiz) {
        Raiz = raiz;

    }

    public int conatagemNo() {
        No aux = Raiz;
        int contador = 0;
        while (aux != null) {
            if (aux.getDireita() != null) {
                aux = aux.getDireita();
                contador++;
            }
        }

        contador++;
        return contador;
    }
    public void percorrerPreOrdem(){
        No aux = Raiz;
        if (aux == null){


        }

    }

    }

