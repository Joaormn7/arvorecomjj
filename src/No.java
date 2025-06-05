public class No {
    private String conteudo;
    private No direita;
    private No esquerda;
    private int fatorbalanceamento;
    private int altura, chave;


    No(int valor){
        chave = valor;
        altura = 1;
    }
    public No(String conteudo, No direita, No esquerda, int balanceamento) {
        this.conteudo = conteudo;
        this.direita = direita;
        this.esquerda = esquerda;
        this.fatorbalanceamento = 0;
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

    public int getBalanceamento() {
        return fatorbalanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.fatorbalanceamento = balanceamento;
    }
}
