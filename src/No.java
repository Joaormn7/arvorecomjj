public class No {
    private String conteudo;
    private No direita;
    private No esquerda;


    public No(String conteudo, No direita, No esquerda) {
        this.conteudo = conteudo;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
}
