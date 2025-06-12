public class ArvoreAvl {
    private No raiz;

    private int altura(No no) {
        return (no == null) ? 0 : no.getAltura();
    }

    private int fatorBalanceamento(No no) {
        if (no == null) return 0;
        return altura(no.getEsquerda()) - altura(no.getDireita());
    }

    private No rotacaoDireita(No y) {
        No x = y.getEsquerda();
        No T2 = x.getDireita();

        x.setDireita(y);
        y.setEsquerda(T2);

        y.setAltura(Math.max(altura(y.getEsquerda()), altura(y.getDireita())) + 1);
        x.setAltura(Math.max(altura(x.getEsquerda()), altura(x.getDireita())) + 1);

        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.getDireita();
        No T2 = y.getEsquerda();

        y.setEsquerda(x);
        x.setDireita(T2);

        x.setAltura(Math.max(altura(x.getEsquerda()), altura(x.getDireita())) + 1);
        y.setAltura(Math.max(altura(y.getEsquerda()), altura(y.getDireita())) + 1);

        return y;
    }

    private No inserir(No no, int chave) {
        if (no == null)
            return new No(chave);

        if (chave < no.getChave())
            no.setEsquerda(inserir(no.getEsquerda(), chave));
        else if (chave > no.getChave())
            no.setDireita(inserir(no.getDireita(), chave));
        else
            return no;

        no.setAltura(1 + Math.max(altura(no.getEsquerda()), altura(no.getDireita())));

        int balanceamento = fatorBalanceamento(no);


        if (balanceamento > 1 && chave < no.getEsquerda().getChave())
            return rotacaoDireita(no);


        if (balanceamento < -1 && chave > no.getDireita().getChave())
            return rotacaoEsquerda(no);


        if (balanceamento > 1 && chave > no.getEsquerda().getChave()) {
            no.setEsquerda(rotacaoEsquerda(no.getEsquerda()));
            return rotacaoDireita(no);
        }


        if (balanceamento < -1 && chave < no.getDireita().getChave()) {
            no.setDireita(rotacaoDireita(no.getDireita()));
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public void inserir(int chave) {
        raiz = inserir(raiz, chave);
    }

    public void percorrerEmOrdem() {
        percorrerEmOrdem(raiz);
        System.out.println();
    }

    private void percorrerEmOrdem(No no) {
        if (no != null) {
            percorrerEmOrdem(no.getEsquerda());
            System.out.print(no.getChave() + " ");
            percorrerEmOrdem(no.getDireita());
        }
    }
}
