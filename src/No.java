public class No {
    private int conteudo;
    private int altura;
    private No esquerda;
    private No direita;

    public No(int conteudo) {
        this.conteudo = conteudo;
        this.altura = 1; // altura começa em 1 (se for AVL, por exemplo)
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public int getChave() {
        return conteudo;
    }
}
