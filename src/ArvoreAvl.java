public class ArvoreAvl {
    No raiz;

    int altura(No no) {
        if (no == null) {
            return 0;
        }
        int fatorDeBalanceamento

    }
    No rotacaoDireita(No y){
        No x = y.esquerdo;
        No T2 = x.direito;

        x.direito = y;
        y.esquerdo = T2;

        y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;
        x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;

        return x;}

    No rotacaoEsquerda(No y){
        No y = x.esquerdo;
        No T2 = y.direito;

        y.esquerdo = x;
        x.direito = T2;


        y.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;
        x.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;

        return y;}

    No inserir(No no, int chave){

        if (no == null)
            return new No(chave);

        if (chave < no.chave);
        no.esquerdo = inserir(no.esquerdo, chave);
        else if (chave > no.chave)
            no.direito = inserir(no.direito, chave);
        else
            return no;

        no.altura = 1 + Math.max(altura(no.esquerdo) , altura(no.direito));

        int balanceamento = fatorBalanceamento(no);
        return no;

    }





}
